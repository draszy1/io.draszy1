package io.draszy1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class DupaSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("^Google page$")
    public void the_Symbiote_home_page() throws Throwable {
        driver.get("https://google.pl");
        assertThat(driver.getTitle()).isEqualTo("Google");
    }

    @When("^I search for dupa$")
    public void search_for_dupa() throws Throwable {
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Search']"));
        searchInput.sendKeys("dupa");

        WebElement button = driver.findElement(By.name("btnK"));
        button.submit();
    }

    @Then("^Wikipedia about dupa is found on the first place$")
    public void the_home_page_navigation_is_available() throws Throwable {
        WebElement output = driver.findElements(By.cssSelector("cite[class='iUh30']")).get(0);
        assertThat(output.getText()).contains("wiki");
    }
}
