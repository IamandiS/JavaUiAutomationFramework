package com.opencart;

import com.opencart.managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getInstance().getDriver();

        String currentWindowName = driver.getWindowHandle();

        // New Window Code
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://andreisecuqa.host/index.php?route=product/category&language=en-gb&path=34_44");
        Thread.sleep(5000);

        WebElement myAccountIcon = driver.findElement(By.xpath("(//i[@class='fa fa-user'])[1]"));
        myAccountIcon.click();
        WebElement registerOption = driver.findElement(By.xpath("(//a[normalize-space()='Register'])[1]"));
        registerOption.click();
        System.out.println(driver.getCurrentUrl());

        WebElement firstNameInput = driver.findElement(By.id("input-firstname"));

        firstNameInput.sendKeys("Sergiu");

        WebElement lastNameInput = driver.findElement(By.cssSelector("#input-lastname"));

        lastNameInput.sendKeys("Iamandi");

        WebElement emaiInput = driver.findElement(By.cssSelector("#input-email"));

        emaiInput.sendKeys("WWW@WWW.WW");

        WebElement phoneInput = driver.findElement(By.cssSelector("#input-telephone"));

        phoneInput.sendKeys("0123456789");

        WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));

        passwordInput.sendKeys("Password123");

        WebElement confirmPasswordInput = driver.findElement(By.cssSelector("#input-confirm"));

        confirmPasswordInput.sendKeys("Password123");

        WebElement termsAndConditionCheckbox = driver.findElement(By.xpath("//input[@name='agree']"));

        termsAndConditionCheckbox.click();

        WebElement registerBtn = driver.findElement(By.xpath("//input[@value='Continue']"));

        registerBtn.click();

        Thread.sleep(5000);
        System.out.println(driver.getTitle());


        driver.close();

        driver.switchTo().window(currentWindowName);
        driver.get("https://www.youtube.com/watch?v=_MaKJdOiRZA");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

        driver.quit();

        System.out.println("The execution is over ok");









    }
}