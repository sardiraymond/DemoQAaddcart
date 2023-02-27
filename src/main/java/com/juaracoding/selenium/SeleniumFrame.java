package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeleniumFrame {
    public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");
                WebDriver driver = new ChromeDriver();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                String url = "https://demoqa.com/modal-dialogs";
                driver.get(url);
                driver.manage().window().maximize();
                System.out.println("maximize Browser");

                String title = driver.findElement(By.className("main-header")).getText();
                System.out.println("title page" +title);

//                //Text sample page didalam Frame
//                WebElement frameSamplePage = driver.findElement(By.id("frame1"));
//                driver.switchTo().frame(frameSamplePage);
//
//                //Text Sample page
//                String txtFrame = driver.findElement(By.id("sampleHeading")).getText();
//                System.out.println(txtFrame);
//
//                //keluar dari Frame
//                driver.switchTo().defaultContent();
//                String descFrame = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText();
                        //*[@id=\"framesWrapper\"]/div[1]/*[@id=\"framesWrapper\"]/div[2]""
//                System.out.println(descFrame);

                js.executeScript("window.scrollBy(0,700)");
                driver.findElement(By.xpath("//span[normalize-space()='Modal Dialogs']")).click();
                    System.out.println("Modal Dialogs Clicked");

                driver.findElement(By.id("showSmallModal")).click();
                String TitleModalSmall = driver.findElement(By.xpath("//button[@id='showSmallModal']")).getText();
                    System.out.println(TitleModalSmall);
                String TitleBodyModal = driver.findElement(By.xpath("///div[@class='modal-body']")).getText();
                    System.out.println(TitleBodyModal);
                String Close = driver.findElement(By.xpath("//button[@id='closeSmallModal']")).getText();
                    System.out.println(Close);

//              System.out.println(button);



                    try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                driver.quit();
                System.out.println("Quit Browser");

    }
}