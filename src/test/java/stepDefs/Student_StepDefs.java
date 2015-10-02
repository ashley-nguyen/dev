package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by csackrider on 9/23/2015.
 */
public class Student_StepDefs {
    public static WebDriver driver;

    private static String strBaseURL = "https://succeed-internal.naviance.com";


    @Then("^their student record will be displayed$")
    public void their_student_record_will_be_displayed() throws Throwable {

        Student.verifyStudentData("952-1532 Sodales Road");
        Student.verifyStudentData("hs1-38966076");

    }

    @Given("^I am logged into naviance ()as (\\w+)$")
    public void I_am_logged_into_naviance_as_user(String user) throws Throwable {
        //Hooks.driver.get(strBaseURL);
        Login.DoLogin("etcs", user, "testtest");

        //NOTE: THIS WILL BE REFINED LATER.  JUST NEED TO GET IT GOING FOR NOW.
    }

    @When("^I search for (\\w+, \\w+) using the global search field$")
    public void I_search_for_student_using_the_global_search_field(String student) throws Throwable {

        Student.searchStudent(student);
    }

    @Then("^their student (.*) will be displayed$")
    public void their_student_data_will_be_displayed(String data) throws Throwable {

        Student.verifyStudentData(data);

    }


    @Given("^I am logged into naviance (.*) as (.*) with (.*)$")
    public void I_am_logged_into_naviance_account_as_user_with_password(String account, String user, String pass) throws Throwable {
        Login.DoLogin(account, user, pass);
    }

    @And("^I enter AP test scores (.*) (.*) (.*) (.*)$")
    public void I_enter_AP_test_scores_testtype_score_year_grade(String testtype, String score, String year, String grade) throws Throwable {
        Student.etnerAPTestScores(testtype, score, year, grade);

    }

    @Then("^their AP test scores will be displayed (.*) (.*) (.*) (.*)$")
    public void their_AP_test_scores_will_be_displayed_testtype_score_year_grade(String testtype, String score, String year, String grade) throws Throwable {

        Student.verifyAPTestScores(testtype, score, year, grade);
        Student.removeAPTestScores(testtype);

    }


}
