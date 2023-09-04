package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.DealPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DealSteps extends Base {
    DealPage dealPage;
    @And("User click on add new deal")
    public void User_click_on_add_new_deal(){
        dealPage = new DealPage();
        dealPage.Performadddeal();

    }
    @And("User fill the tile as {string} and click on save")
    public void User_fill_the_tile_as_and_click_on_save(String DealTitle){
        dealPage.PerformaddnewDeal(DealTitle);
    }
    @When("New Deal should be added")
    public void New_Deal_should_be_added(){
        dealPage.PerformDealDIsp();


    }
}
