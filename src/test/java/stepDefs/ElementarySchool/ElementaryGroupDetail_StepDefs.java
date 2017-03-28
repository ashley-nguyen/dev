package stepDefs.ElementarySchool;

import actions.Dashboard.Dashboard;
import actions.ElementarySchool.ElementaryAssignALessonSequence;
import actions.ElementarySchool.ElementaryGroupDetail;
import actions.ElementarySchool.ElementaryProductPage;
import actions.Students.Groups;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by sahara.navia on 3/24/17.
 */
public class ElementaryGroupDetail_StepDefs {
    public static String lessonSequence ="Grade K Lessons";

    // Get Group Name to share with another scenario
    public static String getEmptyGroupName() {
        return emptyGroupName;
    }
    // Get Group Code to share with another scenario
    public static String getEmptyGroupCode() {
        return emptyGroupCode;
    }

    private static String emptyGroupName;
    private static String emptyGroupCode;

    @When("^I create an empty student group \"([^\"]*)\" with code \"([^\"]*)\" and assign it to Elementary with instructor \"([^\"]*)\"$")
    public void iCreateAnEmptyGroupAndAssignItToElementary(String groupName, String groupCode, String instructorName) throws Throwable
    {
        emptyGroupName = groupName;
        emptyGroupCode = groupCode;

        // Add Student Group
        Groups.ClickGroupsLink();
        Groups.AddStudentGroup(groupCode, groupName);

        // Navigate to Elementary School/Assign A Lesson Sequence
        Dashboard.NavigateToHome();
        ElementaryProductPage.clickElementarySchoolLink();
        ElementaryProductPage.clickAssignALessonSequenceLink();

        // Assign a lesson sequence to a group
        ElementaryAssignALessonSequence.assignLessonSequence(lessonSequence, instructorName, groupName);

        //Verify the groups are displayed on product page
       ElementaryProductPage.verifyAssignedLessonSequenceToAGroup(groupName, instructorName, lessonSequence);

        // Open the group
        ElementaryProductPage.openElementaryGroup(groupName);
    }

    @Then("^The a message should be displayed on group detail page$")
    public void theAMessageShouldBeDisplayedOnGroupDetailPage(List<String> message) throws Throwable {
        // Verify the Students tab is not present in group detail page for empty groups
        ElementaryGroupDetail.verifyStudentsTableForEmptyElementaryGroup();

        // Verify message is displayed on Students tan when the group does not have members
        ElementaryGroupDetail.verifyStudentsMessageForEmptyGroup(message);

        // Delete Group from Elementary
        ElementaryProductPage.clickElementarySchoolLink();
        String groupName = getEmptyGroupName();
        ElementaryProductPage.deleteElementaryGroup(groupName, lessonSequence);

        // Delete the group from Student Groups
        String groupCode = getEmptyGroupCode();
        Groups.ClickGroupsLink();
        Groups.deleteStudentGroup(groupCode);
    }
}
