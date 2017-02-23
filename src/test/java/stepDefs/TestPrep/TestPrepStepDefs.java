package stepDefs.TestPrep;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Arrays;

import actions.Dashboard.Dashboard;
import actions.Students.Groups;
import actions.TestPrep.TestPrep;
import actions.Students.AddStudents;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.yecht.Data;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrepStepDefs {

    @Given("^l am landed on Home page of naviance$")
    public void TestPrep() throws Throwable {

     }

    @When("^I access the Naviance TestPrep as a Schoolsiteadmin$")
    public void clickTestPrep() throws Throwable {
        TestPrep.clickTestPrepLink();
    }


    @Then("^I will skip the walkkthrough page if loaded$")
    public void skipWalkThroughPage() throws Throwable {
        TestPrep.skipWalkThroughPage();
    }

    @Given("^I am a Schoolsiteadmin$")
    public void iAmSchoolAdmin() throws Throwable {
    }

    @When("^I have proper credentials$")
    public void iHaveCredentials() throws Throwable {
    }

    @When("^I created a new student (.*), (.*), (.*), (.*), (.*), (.*) and NTP group (.*) with (.*) and (.*)$")
    public void CreateNewStudentAssignStudentGroupAndAssignStudyPrograms(String studentLastName,
                                                                           String studentFirstName, String studentClassYear,
                                                                           String studentGender, String studentFCUserName,
                                                                           String studentFCPassword, String studentGroup,
                                                                           String instructorName, String studyProgram) throws Throwable{
        LinkedHashMap<String, String> studentInfo = new LinkedHashMap<String, String>();
        studentInfo.put("studentFirstName", studentFirstName);
        studentInfo.put("studentLastName", studentLastName);
        studentInfo.put("studentGender", studentGender);
        studentInfo.put("studentClassYear", studentClassYear);
        List<String> studentToAssign = new ArrayList<>();

        // Navigate to Add Students
        AddStudents.ClickAddStudentsLink();
        // Add New Students
        AddStudents.AddStudents(studentInfo);
        AddStudents.RegisterStudentToFamilyConnection(studentFCUserName, studentFCPassword);

        if (!studentGroup.isEmpty())
        {   studentToAssign.add(studentLastName +", "+ studentFirstName);

            // Add Student Group
            Groups.ClickGroupsLink();
            Groups.AddStudentGroup(studentGroup, studentGroup);

            // Assign Students to the Group
            Groups.AssignStudentsToAGroup(studentToAssign, studentGroup, studentClassYear);

            // Navigate to Test Prep
            Dashboard.NavigateToHome();
            TestPrep.clickTestPrepLink();
            TestPrep.skipWalkThroughPage();

            // Assign Study Programs
            TestPrep.AssignStudyPrograms(studyProgram, instructorName, studentGroup);
        }
    }

    @Then("^The new NTP group (.*) instructor (.*) and study programs (.*) is listed on product page$")
    public void NewNTPGroupIsListedOnProductPage(String studentGroup, String instructorName, String studyProgram) throws Throwable {
        if (!studentGroup.isEmpty()) {
            List<String> studyPrograms = Arrays.asList(studyProgram.split("\\s*,\\s*"));
            TestPrep.VerifyAssignedGroup(studentGroup, instructorName, studyPrograms.get(0));
        }
    }

}
