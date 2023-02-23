//package com.juaracoding.selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class SeleniumorangHRM {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        driver.get(url);
//        driver.manage().window().maximize();
//        System.out.println("maximize Browser");
//
//        //Locator
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.xpath("//[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//        System.out.println("Button login Clicked");
//
//        driver.get("https://www.google.com");
//        driver.findElement(By.linkText("Gmail")).click();
//
//        System.out.println("Delay 3 seconds");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//        System.out.println("Quit Browser");
//    }
//}