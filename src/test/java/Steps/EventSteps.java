package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.EventPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EventSteps extends Base {
    EventPage eventPage;

    @And("User click on add new event")
    public void User_click_on_add_new_event(){
        eventPage =new EventPage();
        eventPage.PerformAddnewEvent();

    }
    @And("User fill the title as {string} and select event date and the event category and click on save")
    public void User_fill_the_title_as_and_select_event_date_and_the_event_category_and_click_on_save(String title){
        eventPage.PerformAddnewEvent2(title);

    }

    @When("Event should be added")
    public void Event_should_be_added()  {
        eventPage.PerformEventDisplayed();
    }
}
