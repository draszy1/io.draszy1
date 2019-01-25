package io.draszy1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get("https://google.pl");
        assertThat(driver.getTitle()).isEqualTo("Google");
    }

    public void searchForWord(String word) {
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Search']"));
        searchInput.sendKeys(word);

        WebElement button = driver.findElement(By.name("btnK"));
        button.submit();
    }

    public void checkWikiResult() {
        WebElement output = driver.findElements(By.cssSelector("cite[class='iUh30']")).get(0);
        assertThat(output.getText()).contains("wiki");
    }
}
