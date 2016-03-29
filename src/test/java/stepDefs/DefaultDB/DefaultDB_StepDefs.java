package stepDefs.DefaultDB;

import actions.DefaultDB.DefaultDB_Action;
import actions.DefaultDB.DefaultDB_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/20/2016.
 */
public class DefaultDB_StepDefs {

    @When("^I verify that home page is displayed without errors$")
    public void i_verify_that_home_page_is_displayed_without_errors() throws Throwable {

        DefaultDB_Verify.verifyHomePage();
    }

    @When("^I go to the Courses$")
    public void i_go_to_courses() throws Throwable {
        Thread.sleep(3000);
        DefaultDB_Action.NavigateToCourses();
    }

    @Then("^I verify the Course Catalog page$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        DefaultDB_Verify.verifyCourseCatalog();
    }
}