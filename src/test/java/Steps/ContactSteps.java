package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.ContactPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ContactSteps extends Base {
    ContactPage contactPage;
    @And("User click on add new contact")
    public void User_click_on_add_new_contact(){
        contactPage =new ContactPage();
        contactPage.PerformNewCOntact();

    }
    @And("User fill the Firstname as {string} and {string} and click on save")
    public void User_fill_the_Firstname_as_and_click_on_save(String Firstname,String Lastname){

        contactPage.PerformAddnewContact(Firstname,Lastname);

    }
    @When("New contact should be added")
    public void New_contact_should_be_added(){
        contactPage.PerformAdDisplay();


    }
}
