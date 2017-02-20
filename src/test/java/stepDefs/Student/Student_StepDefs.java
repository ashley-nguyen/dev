package stepDefs.Student;

import actions.Colleges.College;
import actions.Login.Login;
import actions.Student.Search.GeneralTab.Student_General;
import actions.Student.Search.ScoresTab.Scores;
import actions.Student.Search.Search.Student_Search;
import actions.eDocs.eDocsGeneral;
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

    @Then("^their student record will be displayed$")
    public void their_student_record_will_be_displayed() throws Throwable {

        Student_Search.verifyStudentData("952-1532 Sodales Road");
        Student_Search.verifyStudentData("hs1-38966076");

    }

    @Given("^I am logged into naviance ()as (\\w+)$")
    public void I_am_logged_into_naviance_as_user(String user) throws Throwable {
        //Hooks.driver.get(strBaseURL);
        Login.DoLogin("etcs", user, "testtest");

        //NOTE: THIS WILL BE REFINED LATER.  JUST NEED TO GET IT GOING FOR NOW.
    }

    // used in scenario outline
    @When("^I search for (.*) using the global search field$")
    public void I_search_for_student_using_the_global_search_field(String student) throws Throwable {

        Student_Search.searchStudent(student);
    }

    @When("^I search for (\\w+, \\w+) and enter PSAT scores (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void I_search_for_student_and_enter_psat_scores(String student, String strEvReading, String strReading, String strWriting, String strMathematicsScore, String strMathTest, String strTotalScore, String strMonth, String strYear, String strGrade) throws Throwable {

        Student_Search.searchStudent(student);
        Scores.enterPSATTestScores(strEvReading, strReading, strWriting, strMathematicsScore, strMathTest, strTotalScore, strMonth, strYear, strGrade);
    }

    @When("^I search for (\\w+, \\w+) and enter legacy PSAT scores (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void I_search_for_student_and_enter_legacy_psat_scores(String student, String strCritialReading, String strMath, String strWriting, String strTotal, String strMonth, String strYear, String strGrade) throws Throwable {

        Student_Search.searchStudent(student);
        Scores.enterPSATLegacyTestScores(strCritialReading, strMath, strWriting, strTotal, strMonth, strYear, strGrade);
    }

    @Then("^their student (.*) will be displayed$")
    public void their_student_data_will_be_displayed(String data) throws Throwable {

        Student_Search.verifyStudentData(data);

    }

    @When("^I add a request with \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void I_add_a_request_with_teacher_and_application(String student, String teacher, String application) throws Throwable {
        Student_Search.searchStudent(student);
        College.ClickOnCollegesTab();
        College.SelectTeacher(teacher);
        College.SelectApplication(application);
        College.ClickOnAddRequestButton();
    }

    @When("^I add a student request with \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void I_add_a_student_request_with_teacher_and_application(String student, String teacher, String application) throws Throwable {

        Student_Search.searchStudent(student);
        College.ClickOnCollegesTab();
        College.SelectTeacher(teacher);
        College.SelectApplication(application);
        College.ClickOnAddRequestButton();
    }

    @When("^I add a teacher request with \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void I_add_a_request_with_student_teacher_and_application(String student, String teacher, String application) throws Throwable {
        Student_Search.searchStudent(student);
        College.ClickOnCollegesTab();
        College.SelectTeacher(teacher);
        College.SelectApplication(application);
        College.ClickOnAddRequestButton();
    }

    @When("^I verify the number of LORs (.*) message$")
    public void I_verify_the_number_of_LORs(String message) throws Throwable {
        College.verifyLORsMessage(message);
    }


    //USAGE: When I search for "Aisner, Cathy" using the global search field
    @When("^I search for \"([^\"]*)\" using the global search field$")
    public void I_search_for_using_the_global_search_field(String strStudent) throws Throwable {

        Student_Search.searchStudent(strStudent);
    }

    @When("^I access with \"([^\"]*)\" to another member staff$")
    public void I_access_to_another_member_staff(String strStudentID) throws Throwable {
        Student_Search.searchStudent(strStudentID);
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
    }

    @When("^I search for \"([^\"]*)\" using \"([^\"]*)\" the student roster search$")
    public void I_search_for_using_the_student_roster_search(String strStudent, String strSearchBy) throws Throwable {

        Student_Search.studentRosterSearch(strStudent, strSearchBy);
    }

    @When("^I link to \"([^\"]*)\" with \"([^\"]*)\" to \"([^\"]*)\"$")
    public void I_link_to_parent(String strStudent, String strSearchBy, String strParent) throws Throwable {

        Student_Search.studentRosterSearch(strStudent, strSearchBy);
        Student_General.linkParent(strParent);
    }

    @When("^I will verify that \"([^\"]*)\" with \"([^\"]*)\" were linked$")
    public void I_verify_link(String strData, String strParent) throws Throwable {
        Student_General.verifyParent(strData);
        Student_General.verifyParent(strParent);
        Student_General.unlinkParent();
    }



    @And("^I link the parent \"([^\"]*)\" to the current student$")
    public void I_link_the_parent_to_the_current_student(String strParent) throws Throwable {
        Student_General.linkParent(strParent);
    }

    @Then("^I should see \"([^\"]*)\" on the Student Summary Form$")
    public void I_should_see_on_the_Student_Summary_Form(String strData) throws Throwable {

        Student_General.verifyParent(strData);
    }

    @Then("^I unlink parent$")
    public void I_unlink_parent() throws Throwable {

        Student_General.unlinkParent();
    }
}
