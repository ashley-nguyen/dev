package stepDefs.ElementarySchool;

import actions.Dashboard.Dashboard;
import actions.ElementarySchool.*;
import actions.Student.Search.Search.Student_Search;
import actions.Students.AddStudents;
import actions.Students.DeleteStudent;
import actions.Students.Groups;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Header.SchoolPageHeader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by sahara.navia on 2/16/17.
 */
public class ElementarySchoolSmoke_StepDefs {

    // Get Student Name to share with another scenario
    public static String getStudentName() {
        return studentName;
    }

    private static String studentName;

    @When("^I navigate to Naviance Elementary School$")
    public void iNavigateToNavianceElementarySchool() throws Throwable
    {
        ElementaryProductPage.clickElementarySchoolLink();
    }

    @Then("^I am able to navigate through the Elementary options links$")
    public void iAmAbleToNavigateThroughTheElementaryOptionsLinks() throws Throwable {
        ElementaryProductPage.verifyElementaryProductPage();
        ElementaryProductPage.clickViewAllLessonPlansLink();
        ElementaryViewAllLessonPlans.verifyViewAllLessonPlansPage();
        ElementaryProductPage.clickAssignALessonSequenceLink();
        ElementaryAssignALessonSequence.verifyAssignALessonSequencePage();
        ElementaryProductPage.clickSchoolActivityLink();
        ElementarySchoolActivity.verifySchoolActivityPage();

    }
    @When("^I created a new student (.*), (.*), (.*), (.*), (.*), (.*), (.*) and Elementary group (.*), (.*) and (.*)$")
    public void CreateNewStudentAssignStudentGroupAndAssignLessonSequence(String studentLastName,
                                                                          String studentFirstName, String studentClassYear,
                                                                          String studentGender, String studentId,
                                                                          String studentFCUserName, String studentFCPassword,
                                                                          String studentGroup, String lessonSequence,
                                                                          String instructorName) throws Throwable{

        LinkedHashMap<String, String> studentInfo = new LinkedHashMap<String, String>();
        studentInfo.put("studentFirstName", studentFirstName);
        studentInfo.put("studentLastName", studentLastName);
        studentInfo.put("studentGender", studentGender);
        studentInfo.put("studentId", studentId);
        studentInfo.put("studentClassYear", studentClassYear);
        List<String> studentToAssign = new ArrayList<>();
        studentToAssign.add(studentLastName +", "+ studentFirstName);
        studentName = studentLastName +", "+ studentFirstName;

        if(!Student_Search.doesStudentExist(studentName, "name"))
        {
            // Verify if the student was already added
            SchoolPageHeader.lnkHeaderStudents.click();


            // Navigate to Add Students
            AddStudents.ClickAddStudentsLink();

            // Add New Students
            AddStudents.AddStudents(studentInfo);
            AddStudents.RegisterStudentToFamilyConnection(studentFCUserName, studentFCPassword);
        }

        // Add Student Group
        Groups.ClickGroupsLink();
        if(Groups.doesStudentGroupExist(studentGroup)) {
            Groups.deleteStudentGroup(studentGroup);
        }
        Groups.AddStudentGroup(studentGroup, studentGroup);

        // Assign Students to the Group
        Groups.AssignStudentsToAGroup(studentToAssign, studentGroup, studentClassYear);

        // Navigate to Elementary School/Assign A Lesson Sequence
        Dashboard.NavigateToHome();
        ElementaryProductPage.clickElementarySchoolLink();
        ElementaryProductPage.clickAssignALessonSequenceLink();

        // Assign a lesson sequence to a group
        ElementaryAssignALessonSequence.assignLessonSequence(lessonSequence, instructorName, studentGroup);

    }

    @Then("^The new ELEM group (.*) instructor (.*) and lesson sequence (.*) is listed on product page$")
    public void NewELEMGroupIsListedOnProductPage(String studentGroup, String instructorName, String lessonSequence) throws Throwable {
        //Verify the groups are displayed on product page
        ElementaryProductPage.verifyAssignedLessonSequenceToAGroup(studentGroup, instructorName, lessonSequence);

        // Verify group information displayed in Elementary groups table
        ElementaryProductPage.verifyGroupInformation(studentGroup, instructorName, lessonSequence);

        // Open the group
        ElementaryProductPage.openElementaryGroup(studentGroup);

        // verify the info of the group in group detail page
        ElementaryGroupDetail.verifyGroupInGroupDetailPage(studentGroup, instructorName, lessonSequence);

    }

    @When("^I navigate to Naviance Elementary School and delete (.*) group, (.*) and (.*) from product page$")
    public void iNavigateToNavianceElementarySchoolAndDeleteGroupFromProductPage(String studentGroup, String lessonSequence,
                                                                                 String instructorName) throws Throwable {
        // Navigate to Elementary School
        ElementaryProductPage.clickElementarySchoolLink();

        // Filter product page by instructor name and lesson sequence
        ElementaryProductPage.filterElementaryProductPage(instructorName, lessonSequence);

        // Delete the group
        ElementaryProductPage.deleteElementaryGroup(studentGroup, lessonSequence);
    }

    @Then("^The group should not be displayed anymore in the product page (.*) and reappear in the Assign page$")
    public void theGroupShouldNotBeDisplayedAnymoreInTheProductPageAndReappearInTheAssignPage(String studentGroup) throws Throwable {
        ElementaryProductPage.verifyGroupIsNotDisplayedInProductPage(studentGroup);
        ElementaryProductPage.clickAssignALessonSequenceLink();
        ElementaryAssignALessonSequence.verifyGroupIsDisplayedInTheSearchField( studentGroup);

        // Delete Student Group
        Groups.ClickGroupsLink();
        Groups.deleteStudentGroup(studentGroup);

        // Delete Student
        String studentName = getStudentName();
        DeleteStudent.deleteStudent(studentName, "name");
    }

    @And("^The student (.*), (.*), (.*), (.*) is displayed on Students tab$")
    public void theStudentIsDisplayedOnStudentsTab(String studentLastName, String studentFirstName, String studentClassYear,
                                                   String studentId) throws Throwable {
        String studentName = studentLastName +", "+ studentFirstName;

        // Verify the Students tab in group detail page
        ElementaryGroupDetail.verifyStudentsTableElementaryGroupDetail();

        // Verify Students displayed on the table
        ElementaryGroupDetail.verifyStudentsDisplayedOnStudentsTab(studentName, studentClassYear, studentId);
    }
}
