package io.draszy1;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class DupaSteps {
    @Given("^Google page$")
    public void the_Symbiote_home_page() throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.pl");
        assertEquals("Google", driver.getTitle());
        driver.quit();
    }

    @When("^I search for dupa$")
    public void logging_in_as_an_admin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Wikipedia about dupa is found$")
    public void the_home_page_navigation_is_available() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
