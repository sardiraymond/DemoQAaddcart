package com.juaracoding.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RecruitHRM {
    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass
    public void Setup() {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
        System.out.println("Open Page Add Candidate");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("maximize browser");
        //precondition
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test
    public void addcandidate() {
        delay(2);
        //Step Action
        driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("raymond");
        driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("M");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sardi");
        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).sendKeys("ASD");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("raymond@yopmail.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys("08123123123");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/sardiraymond/Desktop");
        driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("hahaha");
        driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2023-02-25");
        driver.findElement(By.xpath("//textarea[@placeholder='Type here']")).sendKeys("hai");
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
        driver.findElement(By.xpath("///button[@type='submit']")).click();

    }

    @AfterClass
    public void quitbrowser() {
        delay(2);
        driver.quit();
        System.out.println("Quit Browser");

    }
    static void delay(int detik) {
        System.out.println("Delay seconds");
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Get Url");
    }

}
