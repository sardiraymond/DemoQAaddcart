package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class TesLogin {
    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass
    public void Setup() {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        System.out.println("Get Url");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void validlogin(String username, String password) {
        delay(2);
        login("Admin","Admin123");
        String dashboardtxt = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(dashboardtxt,"Dashboard");
        System.out.println("sukses login oranghrm");
    }

        @Test (priority = 2)
        public void invalidlogin() {
            delay(2);
            String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
            driver.get(url);
            System.out.println("Get Url");
            driver.manage().window().maximize();
            login("Admin","admin");
            String Alert = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
            Assert.assertEquals(Alert,"Invalid credentials");
            System.out.println("Alert Invalid credentials");
        }


        @AfterClass
            public void quitbrowser() {
                delay(5);
                driver.quit();
                System.out.println("Quit Browser");

            }
        static void delay(int detik) {
            System.out.println("Delay 5 seconds");
            try {
                Thread.sleep(detik * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Get Url");
        }

        void login(String username, String password) {           //membuat metode login karna berulang
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

