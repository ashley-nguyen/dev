package stepDefs.Student;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import actions.Student.Search.Search.Student_SearchAction;
import actions.Student.Search.Search.Student_SearchVerify;
import org.openqa.selenium.*;
import actions.Login.LoginAction;

import static org.junit.Assert.assertEquals;

/**
 * Created by csackrider on 9/23/2015.
 */
public class Student_StepDefs {
    public static WebDriver driver;

   // private static String strBaseURL = "https://succeed-internal.naviance.com";


    @Then("^their student record will be displayed$")
    public void their_student_record_will_be_displayed() throws Throwable {

        Student_SearchVerify.verifyStudentData("952-1532 Sodales Road");
        Student_SearchVerify.verifyStudentData("hs1-38966076");

    }

    @Given("^I am logged into naviance ()as (\\w+)$")
    public void I_am_logged_into_naviance_as_user(String user) throws Throwable {
        //Hooks.driver.get(strBaseURL);
        LoginAction.DoLogin("etcs", user, "testtest");

        //NOTE: THIS WILL BE REFINED LATER.  JUST NEED TO GET IT GOING FOR NOW.
    }
    // used in scenario outline
    @When("^I search for (\\w+, \\w+) using the global search field$")
    public void I_search_for_student_using_the_global_search_field(String student) throws Throwable {

        Student_SearchAction.searchStudent(student);
    }

    @Then("^their student (.*) will be displayed$")
    public void their_student_data_will_be_displayed(String data) throws Throwable {

        Student_SearchVerify.verifyStudentData(data);

    }




    //USAGE: When I search for "Aisner, Cathy" using the global search field
    @When("^I search for \"([^\"]*)\" using the global search field$")
    public void I_search_for_using_the_global_search_field(String strStudent) throws Throwable {

        Student_SearchAction.searchStudent(strStudent);
    }
}
