package com.cucumber.junit.steps;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OpenPageStepdefs {

    private WebDriver driver;
    private DriverManager driverManager = new DriverManager();

    private BasePage basePage = new BasePage();

    @Given("I am an anonymous customer with clear cookies")
    public void clearCookies() {
        driver = driverManager.setupDriver();
        driver.manage().deleteAllCookies();
    }

    @And("I open the {string}")
    public void openThePage(String url) {
        driver.get(url);
    }

    @Then("I am redirected to a {string}")
    public void verifyUserIsAtCorrectPage(String pageTitle) {
        Assert.assertEquals("User is at wrong page!", BasePage.getExpectedUrlTitle(pageTitle),
                driver.getCurrentUrl().toString());
    }

    @And("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}
