package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallPage extends Base {
    Actions actions;
    public CallPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Call')]")
    WebElement Maincall;
    @FindBy(xpath = "//*[contains(text(),'New Call')]")
    WebElement Newcall;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[14]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement lookupecall;
    @FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/input[3]")
    WebElement writecall;
    @FindBy(xpath = "//input[@value='Search']")
    WebElement Searchcall;
    @FindBy(xpath = "//body[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
    WebElement SearchResult;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement  SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement callDIsp;
    @FindBy(xpath = "//input[@name='prospect_lookup']")
    WebElement Forcer;

    public void PerformCall1(){
        driver.switchTo().frame("mainpanel");
        actions =new Actions(driver);
        actions.moveToElement(Maincall).perform();
        Newcall.click();


    }
    public void Performcall2(String Search) {


      lookupecall.click();
       String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
           driver.switchTo().window(winHandle);
        }
        writecall.sendKeys(Search);
        Searchcall.click();
        SearchResult.click();
        driver.switchTo().window(winHandleBefore);
        driver.switchTo().frame("mainpanel");
        SaveB.click();


    }
    public void Performcall3(){
        Assert.assertTrue((callDIsp).isDisplayed());


    }
}
