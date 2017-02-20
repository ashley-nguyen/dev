package stepDefs.AssignAndManage;

import actions.AssignAndManage.AssignAndManage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Dayasagar on 24 Jan 2017
 */
public class AssignAndManage_StepDefs {
    AssignAndManage assignAndManage = new AssignAndManage();

    @When("^I go to the Planner Assign And Manage$")
    public void i_go_to_the_Planner_Assign_And_Manage() throws Throwable {
        assignAndManage.NavigateToAssignAndManage();
    }

    @Then("^I will verify Assign and Manage Page$")
    public void i_will_verify_Assign_and_Manage_Page() throws Throwable {
        assignAndManage.verifyAssignAndManagePage();
    }

}