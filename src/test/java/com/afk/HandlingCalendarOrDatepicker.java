package com.afk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HandlingCalendarOrDatepicker {
    public static void main(String[] args) throws InterruptedException {
        // Setup firefox using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Initialize the FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(1000);

        // Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // Navigate to the target URL
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        Thread.sleep(1000);

        // Click on the datepicker input field
        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(2000);
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement element : allDates) {
            String date = element.getText();
            if (date.equalsIgnoreCase("27")) {
                element.click();
                break;
            }

        }

    }
}
