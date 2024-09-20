package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import java.io.File;

public class CaptureScreenshot {
    static String imageName = null;

    public static void takeScreenshot(WebDriver driver, String name) {
        try {
            imageName = name + ".png";

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);

            File destiny = new File("C:/Users/Quang Chien/IdeaProjects/JavaSeleniumEx/ASSIGNMENT_2_SELENIUM/screenshots" + imageName);
            FileHandler.copy(source, destiny);

            takeScreenshotToReport();
        } catch (Exception ex) {
            System.out.println("Đã xảy ra lỗi khi chụp màn hình!");
            ex.printStackTrace();
        }
    }

    public static void takeScreenshotToReport() {
        try {
            System.setProperty("org.uncommons.reportng.escape-output", "false");
            File source = new File("C:/Users/Quang Chien/IdeaProjects/JavaSeleniumEx/ASSIGNMENT_2_SELENIUM/screenshots" + imageName);
            String imagePath = source.getAbsolutePath();

            // Thêm ảnh vào báo cáo sử dụng Reporter.log và thẻ HTML <img>
            Reporter.log("<a href=\"" + imagePath + "\">" + "<img src=\"" + imagePath + "\" width='800' height='600' /></a>");
        } catch (Exception ex) {
            System.out.println("Đã xảy ra lỗi khi chụp màn hình!");
            ex.printStackTrace();
        }
    }
}