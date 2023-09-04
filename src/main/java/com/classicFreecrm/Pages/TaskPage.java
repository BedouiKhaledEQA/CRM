package com.classicFreecrm.Pages;

import com.classicFreecrm.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage extends Base {
    Actions actions;
    public TaskPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Tasks')]")
    WebElement MainTask;
    @FindBy(xpath = "//*[contains(text(),'New Task')]")
    WebElement NewTaskB;
    @FindBy(xpath = "//input[@name='title']")
    WebElement TaskTIle;
    @FindBy(xpath = "//img[@id='btnClear']")
    WebElement ClearCalender;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/img[1]")
    WebElement CalenderSelect;
    @FindBy(xpath = "//*[contains(text(),'Today')]")
    WebElement Today;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement  SaveB;
    @FindBy(xpath = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement TaskDIsp;

    public void PerformTask(){
        driver.switchTo().frame("mainpanel");
        actions =new Actions(driver);
        actions.moveToElement(MainTask).perform();
        NewTaskB.click();

    }
    public void PerformNewTask(String Titre){
        TaskTIle.sendKeys(Titre);
        ClearCalender.click();
        CalenderSelect.click();
        actions.moveToElement(Today).perform();
        actions.click();
        SaveB.click();


    }
    public void PerformTaskDisplay(){
        Assert.assertTrue((TaskDIsp).isDisplayed());


    }
}
