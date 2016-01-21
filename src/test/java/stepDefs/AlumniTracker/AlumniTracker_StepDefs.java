package stepDefs.AlumniTracker;
import actions.Setup.AlumniTracker_Action;
import actions.Setup.AlumniTracker_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO_Action.GoToSetup;

/**
 * Created by franksejas on 1/12/2016.
 */
public class AlumniTracker_StepDefs {

    @When("^I go to the Alumni Tracker$")
    public void i_go_to_alumnitracker() throws Throwable {
        GoToSetup();
        AlumniTracker_Action.NavigateToAlumniTracker();
    }

    @Then("^I verify fatal error in the page$")
    public void i_verify_fatal_error_in_the_page() throws Throwable {
        AlumniTracker_Verify.verifyFatalErrorAlumniTracker();
    }

    @When("^I go to Prepare an alumni profile file$")
    public void i_go_to_prepare_an_alumni_profile_file() throws Throwable {
        AlumniTracker_Action.ClickOnPrepareAnAlumniProfilesFile();
        AlumniTracker_Action.ClickOnSendFile();
    }

    @When("^I go to Prepare Alumni Files$")
    public void i_go_to_prepare_alumni_files() throws Throwable {
        AlumniTracker_Action.ClickOnPrepareAlumniFiles();
    }

    @Then("^the Alumni Tracker page is showed successfully$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        AlumniTracker_Verify.verifyFatalErrorAlumniTracker();
    }
}