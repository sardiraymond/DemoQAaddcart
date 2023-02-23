package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://demoqa.com/select-menu";
        driver.get(url);
        System.out.println("Get Url : " + url);
        driver.manage().window().maximize();
        System.out.println("maximize Browser");

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title page" + title);

        WebElement selectColor = driver.findElement(By.id("oldselectmenu"));
        Select Color = new Select(selectColor);
        Color.selectByIndex(9);
        Color.selectByValue("10");
        Color.selectByVisibleText("black");
        System.out.println("Test Select");
        System.out.println("=== Delay 3 Second ===");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");
    }
}
