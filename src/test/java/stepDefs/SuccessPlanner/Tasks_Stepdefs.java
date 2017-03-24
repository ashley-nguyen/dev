package stepDefs.SuccessPlanner;

import actions.SuccessPlanner.Tasks;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sangeetha.munuswamy on 2/20/2017.
 */
public class Tasks_Stepdefs {

  Tasks tasks = new Tasks();
    @When("^I go to the Planner Tasks$")
    public void i_go_to_the_Planner_Tasks() throws Throwable {
        tasks.NavigateToTasks();
    }

    @Then("^I will verify Tasks Page$")
    public void i_will_verify_tasks_Page() throws Throwable {
        tasks.verifyTasksPage();
    }

}
