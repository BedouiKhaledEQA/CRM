package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.CalenderTestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CalenderTestSteps extends Base {
   CalenderTestPage calenderTestPage;

    @And("User click on add  TitleCal")
    public void User_click_on_add_new_event(){
        calenderTestPage = new CalenderTestPage();
        calenderTestPage.Performcalender1();

    }
    @And("User fill the titleCal as {string} and select event date and the event category and click on save")
    public void User_fill_the_title_as_and_select_event_date_and_the_event_category_and_click_on_save(String title){
        calenderTestPage.Performcalender2(title);

    }

    @When("TitleCal should be added")
    public void Event_should_be_added()  {

        calenderTestPage.PerformcalenderDisplayed();
    }
}
