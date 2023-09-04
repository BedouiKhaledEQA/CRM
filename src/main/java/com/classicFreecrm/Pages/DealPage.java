package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealPage extends Base {
    public DealPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Deals')]")
    WebElement mainDeal;
    @FindBy(xpath = "//*[contains(text(),'New Deal')]")
    WebElement NewDEalB;
    @FindBy(xpath = "//input[@name='title']")
    WebElement DealTitle;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement Dealadded;

    public void Performadddeal(){
        driver.switchTo().frame("mainpanel");
        Actions actions = new Actions(driver);
        actions.moveToElement(mainDeal).perform();
        NewDEalB.click();


    }
    public void PerformaddnewDeal(String TITRE){
        DealTitle.sendKeys(TITRE);
        SaveB.click();


    }
    public void PerformDealDIsp(){
        Assert.assertTrue((Dealadded).isDisplayed());

    }
}
