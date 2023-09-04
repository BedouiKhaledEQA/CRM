package com.classicFreecrm;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props = new Properties();
    public Base(){

        try {File file =new File("src/main/java/com/classicFreecrm/Properities/Config.properities");
            FileInputStream fis =new FileInputStream(file);
            props.load(fis);

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void Luncher(){
        if(props.getProperty("browser").equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(chromeOptions);}
        else if (props.getProperty("browser").equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(props.getProperty("url"));

    }
}
