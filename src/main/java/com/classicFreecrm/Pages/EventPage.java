package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage extends Base {
    Actions actions;
    public EventPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    WebElement Calender;
    @FindBy(xpath = "//*[contains(text(),'New Event')]")
    WebElement NewEvent;
    @FindBy(xpath = "//input[@name='title']")
    WebElement Title;
    @FindBy(xpath = "//input[@id='fieldId_start']")
    WebElement Date;
    @FindBy(xpath = "//body[1]/div[6]/table[1]/tbody[1]/tr[5]/td[4]")
    WebElement Date2;
    @FindBy(xpath = "//select[@name='category']")
    WebElement SelectCat;
    @FindBy(xpath = "//option[@value='Opportunity']")
    WebElement category;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement EventDisp;
    @FindBy(xpath = "//*[contains(text(),'KB90 Bed')]")
    WebElement ASS;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement ASSC;
    @FindBy(xpath = "//*[contains(text(),'Home')]")
    WebElement Home;
    @FindBy(xpath = "//*[contains(text(),'View Today')]")
    WebElement ViewToday;
    public void PerformAddnewEvent(){
        driver.switchTo().frame("mainpanel");
        actions = new Actions(driver);
        actions.moveToElement(Calender).perform();
        NewEvent.click();

    }
    public void PerformAddnewEvent2(String Titre){
        Title.sendKeys(Titre);
        JavascriptExecutor js = (JavascriptExecutor) (driver);
        js.executeScript("arguments[0].setAttribute('value','28-Feb-2023 07:32"+"');",Date);
        ASS.click();
        ASSC.click();
        SaveB.click();
    }
    public void PerformEventDisplayed() {
        Assert.assertTrue((EventDisp).isDisplayed());

    }
}
