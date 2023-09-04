package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.CompagniePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CompagnieSteps extends Base {
    CompagniePage compagniePage;
    @And("User click on add new compagnie")
    public void User_click_on_add_new_compagnie()  {
        compagniePage =new CompagniePage();
        compagniePage.PerformaddnewCompagnie();


    }
    @And("User fill the title as {string} and click on save")
    public void User_fill_the_title_as_and_click_on_save(String Titre){
        compagniePage.PerformaddnewCompanie2(Titre);


    }
    @When("New compagnie should be added")
    public void New_compagnie_should_be_added(){
        compagniePage.PerformaddnewCompanieDIsplay();


    }
}
