package stepDefs.AlumniTracker;
import actions.Setup.AlumniTracker;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static actions.Setup.SSO.GoToSetup;

/**
 * Created by franksejas on 1/12/2016.
 */
public class AlumniTracker_StepDefs {

    @When("^I go to the Alumni Tracker$")
    public void i_go_to_alumnitracker() throws Throwable {
        GoToSetup();
        AlumniTracker.NavigateToAlumniTracker();
    }

    @Then("^I verify fatal error in the page$")
    public void i_verify_fatal_error_in_the_page() throws Throwable {
        AlumniTracker.verifyFatalErrorAlumniTracker();
    }

    @When("^I go to Prepare an alumni profile file for \"(.*)\"$")
    public void i_go_to_prepare_an_alumni_profile_file(String school) throws Throwable {
        AlumniTracker.clickOnSchoolSelected(school);
        GoToSetup();
        AlumniTracker.NavigateToAlumniTracker();
        AlumniTracker.verifyFatalErrorAlumniTracker();
        AlumniTracker.ClickOnPrepareAnAlumniProfilesFile();
        AlumniTracker.ClickOnPrepareAlumniFiles();
        AlumniTracker.ClickOnCheckBoxClassYear();
        AlumniTracker.ClickOnSendFile();
    }

    @When("^I go to Prepare Alumni Files$")
    public void i_go_to_prepare_alumni_files() throws Throwable {
        AlumniTracker.ClickOnPrepareAlumniFiles();
    }

    @Then("^the Alumni Tracker page is showed successfully$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        AlumniTracker.verifyFatalErrorAlumniTracker();
    }

    @Then("^I click on selected \"(.*)\" link$")
    public void i_see_a_fatal_error_in_the_page(String school) throws Throwable {
        AlumniTracker.clickOnSchoolSelected(school);
    }




}