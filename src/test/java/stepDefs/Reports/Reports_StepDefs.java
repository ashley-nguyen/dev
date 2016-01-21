package stepDefs.Reports;

import actions.Reports.Reports_Action;
import actions.Reports.Reports_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/13/2016.
 */
public class Reports_StepDefs {

    @When("^I go to the Reports$")
    public void i_go_to_reports() throws Throwable {
        Reports_Action.NavigateToReports();
        Reports_Action.ClickOnCustomizeLink();
        Reports_Action.ClickOnViewReportButton();
    }

    @Then("^I verify report page$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        Reports_Verify.verifyReports();
    }
}