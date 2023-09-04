package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage(){PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//td[@class='logo_text']")
    WebElement LogoD;
    public void PerformHomepage(){
        driver.switchTo().frame("mainpanel");
        Assert.assertTrue((LogoD).isDisplayed());
    }
}
