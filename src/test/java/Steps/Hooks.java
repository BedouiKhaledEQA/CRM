package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.classicFreecrm.Base.driver;

public class Hooks {
    @Before
    public void BeforeAllMethode(){
        System.out.println("STARTING TEST");

    }
    @After
    public void AfterALlMethode(Scenario sc){

        final byte[]
                screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                sc.attach(screenshot, "image/png", "image");
                driver.quit();
    }
}
