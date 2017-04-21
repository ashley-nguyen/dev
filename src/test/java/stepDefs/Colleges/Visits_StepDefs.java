package stepDefs.Colleges;

import actions.Colleges.Visits;
import cucumber.api.DataTable;
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

    @When("^I click on \"(.*?)\" link in Visit page$")
    public void i_click_on_link_in_Visit_page(String link) throws Throwable {

        visits.clickOnAddVisitLink();

    }

    @When("^I enter the following details and click on \"(.*?)\" button :$")
    public void i_enter_the_following_details_and_click_on_button(String btn, DataTable table) throws Throwable {

        visits.enterVisitDetails(table);
        visits.addVisit(); // should we pass btn text as String ?

    }

    @Then("^I should see a new entry in the Scheduled College Visits list with below details:$")
    public void i_should_see_a_new_entry_in_the_Scheduled_College_Visits_list_with_below_details(DataTable arg1) throws Throwable {
        //System.out.println(arg1);
        //List<Map<String,String>> data = arg1.asMaps(String.class,String.class);

    }

    @When("^I click on \"(.*?)\" link of First college visit from the list$")
    public void i_click_on_link_of_First_college_visit_from_the_list(String arg1) throws Throwable {

    }

    @When("^I update \"(.*?)\", \"(.*?)\" ,\"(.*?)\" and I Click on \"(.*?)\" button$")
    public void i_update_and_I_Click_on_button(String arg1, String arg2, String arg3, String arg4) throws Throwable {

    }
    @Then("^I see the updated details \"(.*?)\", \"(.*?)\", \"(.*?)\" on the Scheduled College Visits list$")
    public void i_see_the_updated_details_on_the_Scheduled_College_Visits_list(String arg1, String arg2, String arg3) throws Throwable {

    }

    @Then("^I must see all the scheduled vists along with details like Representative, Date, Time, Registrations and Registrarion Status$")public void i_must_see_all_the_scheduled_vists_along_with_details_like_Representative_Date_Time_Registrations_and_Registrarion_Status() throws Throwable {

    }

    @Then("^I also see view, edit and delete links on each visit$")
    public void i_also_see_view_edit_and_delete_links_on_each_visit() throws Throwable {

    }

    @When("^I click on \"(.*?)\" link of First visit from the list and I Click on \"(.*?)\" button$")
    public void i_click_on_link_of_First_visit_from_the_list_and_I_Click_on_button(String arg1, String arg2) throws Throwable {

    }

    @Then("^I should no longer see that entry in the Scheduled College Visits list$")
    public void i_should_no_longer_see_that_entry_in_the_Scheduled_College_Visits_list() throws Throwable {

    }

}