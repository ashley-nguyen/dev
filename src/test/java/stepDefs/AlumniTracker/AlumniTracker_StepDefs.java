package stepDefs.AlumniTracker;
import actions.Setup.AlumniTracker_Action;
import actions.Setup.AlumniTracker_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Created by franksejas on 1/12/2016.
 */
public class AlumniTracker_StepDefs {

    @When("^I go to the Alumni Tracker$")
    public void i_go_to_alumnitracker() throws Throwable {
        AlumniTracker_Action.NavigateToAlumniTracker();
    }

    @Then("^I verify fatal error in the page$")
    public void i_verify_fatal_error_in_the_page() throws Throwable {
        AlumniTracker_Verify.verifyFatalErrorAlumniTracker();
    }

    @When("^I go to Prepare an alumni profile file$")
    public void i_go_to_prepare_an_alumni_profile_file() throws Throwable {
        AlumniTracker_Action.ClickOnPrepareAnAlumniProfilesFile();
    }

    @When("^I go to Prepare Alumni Files$")
    public void i_go_to_prepare_alumni_files() throws Throwable {
        AlumniTracker_Action.ClickOnPrepareAlumniFiles();
    }

    @When("^I click on Send File$")
    public void i_click_on_send_file() throws Throwable {
        AlumniTracker_Action.ClickOnSendFile();
    }

    @Then("^I see a fatal error in the page$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        AlumniTracker_Verify.verifyFatalErrorAlumniTracker();
    }
}