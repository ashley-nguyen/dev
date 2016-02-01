package stepDefs.JournalDashboard;

import actions.JournalDashboard.JournalDashboard_Action;
import actions.JournalDashboard.JournalDashboard_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 2/01/2016.
 */
public class JournalDashboard_StepDefs {

    @When("^I go to Journal Dashboard$")
    public void i_go_to_application_manager() throws Throwable {

        JournalDashboard_Action.NavigateToJournalDashboard();
    }

    @Then("^I will see data in Journal Dashboard")
    public void i_will_see_data_in_journal_dashboard() throws Throwable {
        JournalDashboard_Verify.verifyJournalDashboard();
    }
}