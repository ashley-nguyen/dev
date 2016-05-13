package stepDefs.Course;

import actions.Course.Course_Action;
import actions.Course.Course_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/25/2016.
 */
public class Course_StepDefs {

    @When("^I click on Advanced Computer Science$")
    public void i_click_on_advanced_computer_science() throws Throwable {
        Course_Action.ClickOnAdvancedComputerScienceCourse();
    }

    @When("^I click on Economics$")
    public void i_click_on_economics() throws Throwable {
        Course_Action.ClickOnEconomics();
    }

    @Then("^I verify the Advanced Computer Science contents$")
    public void i_verify_the_advanced_computer_science_contents() throws Throwable {
        Course_Verify.verifyAdvancedComputerScienceContents();
    }

    @Then("^I verify the Economics contents$")
    public void i_verify_the_economics_contents() throws Throwable {
        Thread.sleep(3000);
        Course_Verify.verifyEconomicsContents();
    }

    @When("^I navigate to Recommendations$")
    public void i_navigate_to_recommendations() throws Throwable {
        Course_Action.ClickOnRecommendations();
    }

    @Then("^I verify the Recommendation not show errors$")
    public void i_verify_the_recommendations_not_show_errors() throws Throwable {
        Thread.sleep(3000);
        Course_Verify.verifyRecommendationsNotShowErrors();
    }
}