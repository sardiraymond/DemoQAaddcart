//package com.juaracoding.selenium;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FirstSelenium {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver_mac_arm64/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/text-box");
//        driver.manage().window().maximize();
//        System.out.println("maximize Browser");
//        System.out.println("Delay 3 seconds");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
//        System.out.println("Get Url");
//        driver.quit();
//        System.out.println("Quit Browser");
//    }
//}