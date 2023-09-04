package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "Steps",plugin = {"pretty","html:target/report.html","json:target/report.json"},monochrome = true,tags = "@Call")
public class TestRunner {
}
