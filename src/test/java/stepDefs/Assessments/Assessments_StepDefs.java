package stepDefs.Assessments;

import actions.Assessments.Assessments;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/14/2016.
 */
public class Assessments_StepDefs {

    @When("^I click on Assessments tab$")
    public void i_click_on_assessments_tab() throws Throwable {
        Assessments.ClickOnAssessments();
    }

    @Then("^I should not see errors in Assessments$")
    public void i_should_not_see_errors_in_assessments() throws Throwable {
        Assessments.ClickOnAssessments();
        Assessments.verifyAssessment();
    }
}