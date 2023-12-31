package com.opencart.pageobjects;

import com.opencart.managers.ScrollManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    public LoginPage(WebDriver driver){super(driver);
    }

    @FindBy(xpath = "(//input[@id='input-email'])[1]")
    private WebElement usernameInput;
    @FindBy(xpath = "(//input[@id='input-password'])[1]")
    private WebElement passwordInput;
    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
    private WebElement loginBtn;

    public void fillInTheLoginForm(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        ScrollManager.scrollToTheElement(loginBtn);
        loginBtn.click();
    }


}