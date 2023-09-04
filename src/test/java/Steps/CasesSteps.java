package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.CasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CasesSteps extends Base {
    CasesPage casesPage;
    @And("User click on add new case")
    public void User_click_on_add_new_case(){
        casesPage =new CasesPage();
        casesPage.Performcase();

    }
    @And("User fill the title case as {string} and click on save")
    public void User_fill_the_title_case_as_and_click_on_save(String Titlecase){
        casesPage.PerformNewcase(Titlecase);



    }

    @When("New case should be added")
    public void New_case_should_be_added(){
        casesPage.PerformcaseDisplay();


    }
}
