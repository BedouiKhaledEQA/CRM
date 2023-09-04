package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Base {
    public ContactPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(text(),'Contacts')]")
    WebElement MainContact;
    @FindBy(xpath = "//*[contains(text(),'New Contact')]")
    WebElement NewCOntactB;
    @FindBy(xpath = "//input[@name='first_name']")
    WebElement Firstname;
    @FindBy(xpath = "//input[@name='surname']")
    WebElement Lastname;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement COntactDIsp;


    public void PerformNewCOntact(){
        driver.switchTo().frame("mainpanel");
        Actions actions =new Actions(driver);
        actions.moveToElement(MainContact).perform();
        NewCOntactB.click();

    }
    public void PerformAddnewContact(String FN,String LN){
        Firstname.sendKeys(FN);
        Lastname.sendKeys(LN);
        SaveB.click();


    }
    public void PerformAdDisplay(){
        Assert.assertTrue((COntactDIsp).isDisplayed());


    }
        }
