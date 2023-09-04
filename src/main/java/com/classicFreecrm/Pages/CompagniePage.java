package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompagniePage extends Base {
    public CompagniePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Companies')]")
    WebElement CompanieB;
    @FindBy(xpath = "//*[contains(text(),'New Company')]")
    WebElement NewCompagnieB;
    @FindBy(xpath = "//input[@name='company_name']")
    WebElement Title;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement NewComDIsp;

    public void PerformaddnewCompagnie(){
        driver.switchTo().frame("mainpanel");
        Actions actions =new Actions(driver);
        actions.moveToElement(CompanieB).perform();
        NewCompagnieB.click();



    }
    public void PerformaddnewCompanie2(String Titre){
        Title.sendKeys(Titre);
        SaveB.click();


    }
    public void PerformaddnewCompanieDIsplay(){
        Assert.assertTrue((NewComDIsp).isDisplayed());



    }
}
