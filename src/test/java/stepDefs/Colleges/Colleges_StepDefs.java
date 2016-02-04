package stepDefs.Colleges;

import actions.Colleges.CollegeAction;
import actions.Colleges.CollegeVerify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/27/2016.
 */
public class Colleges_StepDefs {

    @When("^I add prospective colleges$")
    public void i_add_prospective_colleges() throws Throwable {
        CollegeAction.ClickOnCollegesTab();
        CollegeAction.ClickOnAddProspectiveColleges();
    }

    @When("^I enter to School Site$")
    public void i_enter_to_school_site() throws Throwable {
        CollegeAction.ClickOnSchoolSiteLink();
    }

    @When("^I enter to Active Applications$")
    public void i_enter_to_active_applications() throws Throwable {
        CollegeAction.ClickOnCollegesTab();
        CollegeAction.ClickOnActiveApplicationsLink();
    }

    @Then("^I should not see errors in prospective college$")
     public void i_should_not_see_errors_in_assessments() throws Throwable {
        CollegeVerify.verifyNoErrorsInProspectiveCollege();
    }

    @Then("^I should not see errors in active applications$")
    public void i_should_not_see_errors_in_active_applications() throws Throwable {
        CollegeVerify.verifyNoErrorsInActiveApplications();
    }

    @When("^I click on view past visits$")
    public void i_click_on_view_past_visits() throws Throwable {
        CollegeAction.ClickOnViewPastVisitsLink();
    }

}