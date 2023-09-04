package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesPage extends Base {
    public CasesPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Cases')]")
    WebElement Maincase;
    @FindBy(xpath = "//*[contains(text(),'New Case')]")
    WebElement Newcase;
    @FindBy(xpath = "//input[@name='title']")
    WebElement CaseTIle;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement  SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement casekDIsp;

    public void Performcase(){
        driver.switchTo().frame("mainpanel");
        Actions actions =new Actions(driver);
        actions.moveToElement(Maincase).perform();
        Newcase.click();

    }
    public void PerformNewcase(String Titre){
        CaseTIle.sendKeys(Titre);
        SaveB.click();


    }
    public void PerformcaseDisplay(){
        Assert.assertTrue((casekDIsp).isDisplayed());


    }
}


