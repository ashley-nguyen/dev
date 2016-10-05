package stepDefs.Colleges;

import actions.Colleges.College;

import actions.Login.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/27/2016.
 */
public class Colleges_StepDefs {

    @When("^I add prospective colleges$")
    public void i_add_prospective_colleges() throws Throwable {
        College.ClickOnCollegesTab();
        College.ClickOnAddProspectiveColleges();
    }

    @When("^I click on Colleges tab$")
    public void i_click_on_colleges_tab() throws Throwable {
        College.ClickOnCollegesTab();
    }

    @When("^I enter to School Site$")
    public void i_enter_to_school_site() throws Throwable {
        College.ClickOnSchoolSiteLink();
    }

    @When("^I enter to Active Applications$")
    public void i_enter_to_active_applications() throws Throwable {
        College.ClickOnCollegesTab();
        College.ClickOnActiveApplicationsLink();
    }

    @Then("^I should not see errors in prospective college$")
     public void i_should_not_see_errors_in_assessments() throws Throwable {
        College.ClickOnCollegesTab();
        College.ClickOnAddProspectiveColleges();
        College.verifyNoErrorsInProspectiveCollege();
    }

    @Then("^I should not see errors in college pick using \"(.*)\"$")
    public void i_should_not_see_errors_in_active_applications(String url) throws Throwable {
        Login.GoToUrl(url);
        College.verifyNoErrorsInCollegePick();
    }

    @When("^I go to view past visits$")
    public void i_go_to_view_past_visits() throws Throwable {
        College.ClickOnSchoolSiteLink();
        College.ClickOnViewPastVisitsLink();
    }

    @Then("^I can toggle class year (.*)$")
    public void I_can_toggle_class_year(String strClassYear) throws Throwable {

        College.SelectClassYear(strClassYear);

    }
}