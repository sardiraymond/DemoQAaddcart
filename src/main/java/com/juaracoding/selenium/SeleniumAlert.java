//package com.juaracoding.selenium;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class SeleniumAlert {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String url = "https://demoqa.com/alerts";
//        driver.get(url);
//        driver.manage().window().maximize();
//        System.out.println("maximize Browser");
//
//        String title = driver.findElement(By.className("main-header")).getText();
//        System.out.println("title page" + title);
//        driver.findElement(By.id("alertButton")).click();
//        driver.switchTo().alert().accept();
//        System.out.println("Alert OK Clicked");
//
//        driver.findElement(By.id("timerAlertButton")).click();
//        alert_text = alert.text;
//        alert = new WebDriverWait(driver,10).until(ExpectedConditions(alert.is.present());
//
//
//
//        System.out.println("Delay 3 seconds");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}