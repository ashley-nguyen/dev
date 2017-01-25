package stepDefs.Tasks;

import actions.Tasks.Tasks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by M1020406 on 1/24/2017.
 */
public class Tasks_StepDefs {
    @When("^I go to the Planner Tasks$")
    public void i_go_to_the_Planner_Tasks() throws Throwable {
        Tasks.NavigateToTasks();
    }

    @Then("^I should see the Task Library$")
    public void i_should_see_the_Task_Library() throws Throwable {
        Tasks.verifyTaskLibrary();
    }
}
