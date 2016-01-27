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

    @Then("^I should not see errors in prospective college$")
    public void i_should_not_see_errors_in_assessments() throws Throwable {
        CollegeVerify.verifyNoErrorsInProspectiveCollege();
    }
}