package stepDefs.Matching;

import actions.Colleges.College;
import actions.Colleges.Visits;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Dayasagar on 5/20/2017.
 */
public class CommunityNotification_StepDefs {

    Visits visits = new Visits();

    @When("^There are no changes in Community$")
    public void there_are_no_changes_in_Community() throws Throwable {
    //wip_integration
    }

    @Then("^I should not See a red dot overlaying on top of Profile icon in Realtime\\.$")
    public void i_should_not_See_a_red_dot_overlaying_on_top_of_Profile_icon_in_Realtime() throws Throwable {
        visits.verifyCommunityNotificationIcon("present");
    }

    @When("^There are any changes in Community$")
    public void there_are_any_changes_in_Community() throws Throwable {
    //wip_integration
    }

    @Then("^I See a red dot overlaying on top of Profile icon in Realtime\\.$")
    public void i_See_a_red_dot_overlaying_on_top_of_Profile_icon_in_Realtime() throws Throwable {
        visits.verifyCommunityNotificationIcon("notPresent");
    }
}
