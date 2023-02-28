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
//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

    @BeforeClass
    public void Setup() {
//      System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
//      WebDriver driver = new ChromeDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        System.out.println("Get Url");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    public void validlogin() {
        delay(2);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
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
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

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
    }
