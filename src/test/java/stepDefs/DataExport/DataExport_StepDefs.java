package stepDefs.DataExport;

import actions.Setup.DataExport_Action;
import actions.Setup.DataExport_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO_Action.GoToSetup;

/**
 * Created by franksejas on 1/29/2016.
 */
public class DataExport_StepDefs {

    @When("^I go to Data Export$")
    public void i_go_to_alumnitracker() throws Throwable {
        GoToSetup();
        DataExport_Action.NavigateToDataExport();
    }
    @Then("^I should not see errors in data export \"([^\"]*)\"$")
    public void I_should_not_see_errors_in_data_export(String strText) throws Throwable {

        DataExport_Verify.verifyDataExport(strText);

    }}