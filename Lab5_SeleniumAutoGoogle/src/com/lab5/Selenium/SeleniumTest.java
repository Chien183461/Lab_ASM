/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lab5.Selenium;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author Administrator
 */
public class SeleniumTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        //set 15s to load page complete
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.get("https://www.google.com.vn/");
        driver.manage().window().maximize();
        
        
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.click();
        searchbox.clear();
        searchbox.sendKeys("selenium");
        searchbox.sendKeys(Keys.RETURN);
        
        driver.close();
        
        //driver.quit();
    }
    
}
