package stepDefs.Student;

import actions.Login.Login;
import actions.Student.Search.GeneralTab.Student_General_Action;
import actions.Student.Search.GeneralTab.Student_General_Verify;
import actions.Student.Search.Search.Student_SearchAction;
import actions.Student.Search.Search.Student_SearchVerify;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

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
        Login.DoLogin("etcs", user, "testtest");

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


    @When("^I search for \"([^\"]*)\" using \"([^\"]*)\" the student roster search$")
    public void I_search_for_using_the_student_roster_search(String strStudent, String strSearchBy) throws Throwable {

        Student_SearchAction.studentRosterSearch(strStudent, strSearchBy);


    }

    @And("^I link the parent \"([^\"]*)\" to the current student$")
    public void I_link_the_parent_to_the_current_student(String strParent) throws Throwable {

        Student_General_Action.linkParent(strParent);

    }

    @Then("^I should see \"([^\"]*)\" on the Student Summary Form$")
    public void I_should_see_on_the_Student_Summary_Form(String strData) throws Throwable {

        Student_General_Verify.verifyParent(strData);
    }
}
