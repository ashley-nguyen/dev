package stepDefs.Dashboard;

import actions.Dashboard.DashboardAction;
import actions.Dashboard.DashboardVerify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 12/22/2015.
 */
public class Dashboard_StepDefs {

    @When("^I go to the Planner dashboard$")
    public void i_go_to_planner_dashboard() throws Throwable {

        DashboardAction.NavigateToDashboard();
    }

    @Then("^I will see data in recent updates$")
    public void i_will_see_data_in_recent_updates() throws Throwable {
        DashboardVerify.verifyDashboard();
    }
}