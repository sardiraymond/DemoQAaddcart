//package com.juaracoding.selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Seleniumlocator {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver_mac_arm64/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String url = "https://demoqa.com/text-box";
//        driver.get(url);
//        driver.manage().window().maximize();
//        System.out.println("maximize Browser");
//
//        //locator;
//        String titlepage = driver.findElement(By.className("main-header")).getText();
//        System.out.println("title page" +titlepage);
//        driver.findElement(By.id("userName")).sendKeys("raymondsardi");
//        driver.findElement(By.id("userEmail")).sendKeys( "raymond@yopmail.com");
//        driver.findElement(By.id("currentAddress")).sendKeys( "ditempat");
//        driver.findElement(By.id("permanentAddress")).sendKeys( "ditempat");
//        driver.findElement(By.id("submit")).click();
//
//        //Scroll by Pixel (vertical)
//        js.executeScript("window.scrollBy(0,500)");
//        driver.findElement(By.id("submit")).click();
//        System.out.println(" Data berhasil Di simpan");
//
//        //Checkbox
//        driver.get("https://demoqa.com/checkbox");
//        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
//        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
//        String result = driver.findElement(By.xpath("//div[@]id='result']")).getText();
//        System.out.println(result);
//
//        //Verify
//        System.out.println("Test Case Result");
//        if(titlepage.equals("text box")){
//            System.out.println("Passed");
//        Else:
//            System.out.println("failed");
//        }
//
//
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