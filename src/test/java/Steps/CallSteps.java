package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.CallPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class CallSteps extends Base {
    CallPage callPage;
    public CallSteps(){
        this.callPage=new CallPage();

    }

    @And("User click on add new call")
    public void User_click_on_add_new_call(){
        //callPage =new CallPage();
        callPage.PerformCall1();


    }
    @And("User fill the deal from research as {string} and click on save")
    public void User_fill_the_deal_from_research_and_click_on_save(String search)  {
        callPage.Performcall2(search);


    }

    @When("New call should be added")
    public void New_call_should_be_added(){
        callPage.Performcall3();


    }
}
