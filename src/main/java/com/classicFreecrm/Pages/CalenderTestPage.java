package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderTestPage extends Base {
    public CalenderTestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    WebElement Calender;
    @FindBy(xpath = "//*[contains(text(),'New Event')]")
    WebElement NewEvent;
    @FindBy(xpath = "//input[@name='title']")
    WebElement Title;
    @FindBy(xpath = "//input[@name='start']")
    WebElement Date;
    @FindBy(xpath = "//*[contains(text(),'KB90 Bed')]")
    WebElement ASS;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
    WebElement ASSC;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement Disp;
    public void Performcalender1() {
        driver.switchTo().frame("mainpanel");
        Actions actions = new Actions(driver);
        actions.moveToElement(Calender).perform();
        NewEvent.click();

    }
    public void Performcalender2(String Titre){
        Title.sendKeys(Titre);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','26-Feb-2023 22:13"+"');",Date);
        ASS.click();
        ASSC.click();
        SaveB.click();}

    public void PerformcalenderDisplayed() {

        Assert.assertTrue((Disp).isDisplayed());

    }


}
