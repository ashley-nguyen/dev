package stepDefs.Matching;

import actions.Colleges.Visits;
import actions.Matching.CommunityNotification;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Dayasagar on 5/20/2017.
 */
public class CommunityNotification_StepDefs {

    CommunityNotification comNotify = new CommunityNotification();
    Visits visits = new Visits();

    @When("^There are no new activities in Community$")
    public void there_are_no_changes_in_Community() throws Throwable {
    //wip_integration
    }

    @Then("^I should not See a red dot overlaying on top of Community icon in Realtime\\.$")
    public void i_should_not_See_a_red_dot_overlaying_on_top_of_Profile_icon_in_Realtime() throws Throwable {
        comNotify.verifyCommunityNotificationIcon("present");
    }

    @When("^There are any new activities in Community$")
    public void there_are_any_changes_in_Community() throws Throwable {
    //wip_integration
    }

    @Then("^I See a red dot overlaying on top of Community icon in Realtime\\.$")
    public void i_See_a_red_dot_overlaying_on_top_of_Profile_icon_in_Realtime() throws Throwable {
        comNotify.verifyCommunityNotificationIcon("notPresent");
    }
}
