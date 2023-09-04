package Steps;

import com.classicFreecrm.Base;
import com.classicFreecrm.Pages.TaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TaskSteps extends Base {
    TaskPage taskPage;
    @And("User click on add new Task")
    public void User_click_on_add_new_Task(){
        taskPage = new TaskPage();
        taskPage.PerformTask();

    }
    @And("User fill the Task tile as {string} and click on save")
    public void User_fill_the_Task_tile_as_and_click_on_save(String TitleTask){
        taskPage.PerformNewTask(TitleTask);


    }

    @When("New Task should be added")
    public void New_Task_should_be_added(){
        taskPage.PerformTaskDisplay();


    }
}
