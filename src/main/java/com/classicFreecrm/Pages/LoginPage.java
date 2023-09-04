package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement Username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement Login;

    public HomePage PerformLogin(String name, String pass) {
        Username.sendKeys(name);
        password.sendKeys(pass);
        Login.click();
        return new HomePage();


    }
}
