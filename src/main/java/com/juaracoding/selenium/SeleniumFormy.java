package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class SeleniumFormy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("maximize Browser");

        //Isi Form
        driver.findElement(By.id("first-name")).sendKeys("Raymond");
        driver.findElement(By.id("last-name")).sendKeys("Sardi");
        driver.findElement(By.id("job-title")).sendKeys("Quality Assurance");

        //Radiobutton (HighSchool, College, GradSchool)
        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        WebElement radiobutton2 = driver.findElement(By.id("radio-button-2"));
        WebElement radiobutton3 = driver.findElement(By.id("radio-button-3"));
        radiobutton2.click();

        //jeniskelamin
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox2.click();
        System.out.println("Choose Female");

        //YearOfExperience
        WebElement Dropdown = driver.findElement(By.id("select-menu"));
        Select menu = new Select(Dropdown);
        menu.selectByIndex(0);
        menu.selectByIndex(1);
        menu.selectByIndex(2);
        System.out.println("Options 1, 2, and 3 are selected.");
//        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[0]"));
//        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[1]"));
//        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]"));
//        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[4]"));

        //Date
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();
        WebElement feb2023 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]"));
        feb2023.click();

        //Submit button
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();




        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
        System.out.println("Quit Browser");

    }
}
