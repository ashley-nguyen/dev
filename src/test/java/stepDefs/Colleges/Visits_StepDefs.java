package stepDefs.Colleges;

import actions.Colleges.College;
import actions.Colleges.Visits;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Colleges.VisitsPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dayasagar on 4/20/2017.
 */
public class Visits_StepDefs {

    Visits visits = new Visits();

    @Given("^I go to Visits Page$")
    public void i_go_to_Visits_Page() throws Throwable {
        College.ClickOnSchoolSiteLink();
        visits.goToVisits();
    }

    @When("^I click on \"(.*?)\" link in Visit page$")
    public void i_click_on_link_in_Visit_page(String link) throws Throwable {

        visits.clickOnAddVisitLink();

    }

    @When("^I enter the following details :$")
    public void i_enter_the_following_details(DataTable table) throws Throwable {

       visits.enterVisitDetails(table);

    }


    @When("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String text) throws Throwable {

        visits.clickButton(text);

    }

    @Then("^I should see a new entry in the Scheduled College Visits list with below details:$")
    public void i_should_see_a_new_entry_in_the_Scheduled_College_Visits_list_with_below_details(DataTable table) throws Throwable {
        visits.verifyAddedVisit(table);

    }

    @When("^I click on \"(.*?)\" link of first visit from the list$")
    public void i_click_on_link_of_first_visit_from_the_list(String action) throws Throwable {

        visits.clickOnVisitActionByIndex(action, 1);

    }

    @When("^I update the following fields with new values:$")
    public void i_update_the_following_fields_with_new_values(DataTable table) throws Throwable {

        visits.updateVisitDetails(table);

    }

    @Then("^I see the updated details as below in first visit from the list:$")
    public void i_see_the_updated_details_as_below_in_first_visit_from_the_list(DataTable table) throws Throwable {

        visits.verifyUpdatedVisit(table, 1);

    }

    @Then("^I must see all the scheduled vists along with details like Representative, Date, Time, Registrations and Registrarion Status$")
    public void i_must_see_all_the_scheduled_vists_along_with_details_like_Representative_Date_Time_Registrations_and_Registrarion_Status() throws Throwable {
        visits.viewHeadingOfVisitTable();
    }

    @Then("^I also see view, edit and delete links on each visit$")
    public void i_also_see_view_edit_and_delete_links_on_each_visit() throws Throwable {
        visits.verifyViewEditupdateLinkPresent();
    }

    @When("^I click on \"(.*?)\" link of First visit from the list and I Click on \"(.*?)\" button$")
    public void i_click_on_link_of_First_visit_from_the_list_and_I_Click_on_button(String arg1, String arg2) throws Throwable {
        visits.clickOnDelLinkOfFirstVisit();
    }

    @Then("^I should no longer see that entry in the Scheduled College Visits list$")
    public void i_should_no_longer_see_that_entry_in_the_Scheduled_College_Visits_list() throws Throwable {
        visits.verifyDeletedVisitNotPresent();
    }

}