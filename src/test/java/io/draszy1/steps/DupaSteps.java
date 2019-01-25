package io.draszy1.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.draszy1.pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DupaSteps {

    private WebDriver driver;
    private GooglePage googlePage;

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("^Google page$")
    public void the_google_home_page() {
        googlePage.navigateTo();
    }

    @When("^I search for dupa$")
    public void search_for_dupa() {
        googlePage.searchForWord("dupa");
    }

    @Then("^Wikipedia about dupa is found on the first place$")
    public void the_home_page_navigation_is_available() {
        googlePage.checkWikiResult();
    }
}
