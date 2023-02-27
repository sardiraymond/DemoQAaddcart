package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week3test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://shop.demoqa.com/my-account/";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("maximize Browser");

        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("raymond@yopmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Raymond123##.");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // tambahkan produk ke add to cart
        driver.get("https://shop.demoqa.com/product/black-tee/");
        WebElement addToCartButton = driver.findElement(By.name("add-to_cart"));
        addToCartButton.click();


        driver.quit();
        System.out.println("Quit Browser");
    }
}
