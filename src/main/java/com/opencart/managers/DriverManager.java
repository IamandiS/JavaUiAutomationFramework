package com.opencart.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    private static DriverManager instance;
    private WebDriver driver;
    private DriverManager(){
       String webDriverType = "Chrome";
        switch (webDriverType.toUpperCase()){
            case "CHROME": {
                ChromeOptions handlingSSL = new ChromeOptions();
                handlingSSL.addArguments("--ignore-certificate-errors");

                //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
                handlingSSL.setAcceptInsecureCerts(true);

                //Creating instance of Chrome driver by passing reference of ChromeOptions object
                driver = new ChromeDriver(handlingSSL);

                System.out.println("The Chrome Driver is initiated!");
            }
                break;
            case "EDGE":{

                driver = new EdgeDriver();
                System.out.println("The Edge Driver is initiated!");
            }
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                System.out.println("The Firefox Driver is initiated!");
                break;

            case "SAFARI":
                driver = new SafariDriver();
                System.out.println("The Safari Driver is initiated!");
                break;
            default:
                System.out.println("There is not defined such a driver: " + webDriverType);
        }
    }

    public static DriverManager getInstance(){
        if(instance == null){
            instance = new DriverManager();
        }
        return instance;
    }
    public  WebDriver getDriver(){
        return driver;
    }
}
