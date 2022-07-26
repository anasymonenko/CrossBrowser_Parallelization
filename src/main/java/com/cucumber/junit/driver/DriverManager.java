package com.cucumber.junit.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverManager {

    private static final int IMPLICIT_WAIT_TIMEOUT = 10;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    private static final String CHROME_DRIVER_PATH = "src/main/resources/chromedriver.exe";
    private static final String FIREFOX_DRIVER_PATH = "src/main/resources/geckodriver.exe";


    private WebDriver driver;

    public DriverManager() {
    }

    public WebDriver setupDriver() {

        String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FF")) {
            System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, SECONDS);

        return driver;
    }

}

