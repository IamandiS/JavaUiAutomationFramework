package com.opencart.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

    public static void main(String[] args) throws InterruptedException {

        //Create instance of ChromeOptions Class
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.addArguments("--ignore-certificate-errors");

        //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
        handlingSSL.setAcceptInsecureCerts(true);

        //Creating instance of Chrome driver by passing reference of ChromeOptions object
        WebDriver driver = new ChromeDriver(handlingSSL);

        //Launching the URL
        driver.get("https://andreisecuqa.host/");
        Thread.sleep(5000);
        System.out.println("The page title is : " +driver.getTitle());
        driver.quit();
    }

}


