package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverInstance {
    protected WebDriver driver;

    @BeforeClass
    public void initDriverInstance() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Quang Chien/wdm/drivers/drivers/chromedriver/win64/128.0.6613.137/chromedriver-win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriverInstance() {
        if (driver != null) {
            driver.quit();
        }
    }
}