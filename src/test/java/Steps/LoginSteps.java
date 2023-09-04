package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.HomePage;
import com.classicFreecrm.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Base {
    LoginPage loginPage;
    HomePage homePage;
    @Given("User open the browser")
    public void User_open_the_browser(){

        Luncher();
    }
    @Then("User fill the email as {string}and {string} and click on login")
    public void User_fill_the_email_as_and_and_click_on_login(String username, String password)  {
        loginPage = new LoginPage();
        homePage=loginPage.PerformLogin(username,password);

    }
    @When("User should navigate at the home page")
    public void User_should_navigate_at_the_home_page(){
        homePage = new HomePage();
        homePage.PerformHomepage();

    }
    @And("Error message")
    public void Error_message(){

        System.out.println("Error");
    }
}
