package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestForm {
    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 1)
    public void testUrl() {
        delay(3);
        //Step Action
        String url = "https://demoqa.com/text-box";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("maximize Browser");
        String titleheader = driver.getTitle();
        System.out.println("Title Header : "+titleheader);
        //Step Validasi atau Verifikasi
        Assert.assertEquals(titleheader,"DEMOQA");
    }

    @Test (priority = 2)
    public void testformidentity(){
        delay(1);
        driver.findElement(By.id("userName")).sendKeys("raymondsardi");
        driver.findElement(By.id("userEmail")).sendKeys( "raymond@yopmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys( "Tangerang selatan");
        driver.findElement(By.id("permanentAddress")).sendKeys( "Tangerang Selatan");
        driver.findElement(By.id("submit")).click();
        //Scroll by Pixel (vertical)
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.id("submit")).click();

    }

    @AfterClass
    public void quitbrowser() {
        delay(3);
        driver.quit();
        System.out.println("Quit Browser");

    }

    static void delay(int detik){
        System.out.println("Delay 5 seconds");
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Get Url");

    }
}



