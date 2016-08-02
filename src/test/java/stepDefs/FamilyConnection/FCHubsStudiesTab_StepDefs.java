package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import actions.FamilyConnection.FCHubsStudiesTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 5/31/2016.
 *  click on Next on FirstTutorial dialog - Created by Mandeep 06/08/2016
 */
public class FCHubsStudiesTab_StepDefs {
    public static WebDriver driver;

    @Then("^The Student Faculty Ratio should be \"([^\"]*)\" data in Studies Top Bar$")
    public void The_Student_Faculty_Ratio_should_be_data_in_Studies_Top_Bar(String studentFacultyRatio)
            throws Throwable {
        FCHubsStudiesTab.VerifyStudentFacultyRatioStudiesTopBar(studentFacultyRatio);
    }

    @Then("^The Student Retention should be \"([^\"]*)\" in Studies Top Bar$")
    public void The_Student_Retention_should_be_in_Studies_Top_Bar(String studentRetention) throws Throwable {
        FCHubsStudiesTab.VerifyStudentRetentionStudiesTopBar(studentRetention);
    }

    @Then("^The Graduation Rate should be \"([^\"]*)\" in Studies Top Bar$")
    public void The_Graduation_Rate_should_be_in_Studies_Top_Bar(String graduationRate) throws Throwable {
        FCHubsStudiesTab.VerifyGraduationRateStudiesTopBar(graduationRate);
    }

    @Then("^The Degrees offered are displayed with correct data in Studies Top bar:$")
    public void The_Degrees_offered_are_displayed_with_correct_data_in_Studies_Top_bar(List<String> degreesOffered) throws Throwable {
        FCHubsStudiesTab.VerifyDegreesOfferedStudiesTopBar(degreesOffered);
    }

    @Then("^The Top Areas of Study should be displayed with the following values:$")
    public void The_Top_Areas_of_Study_should_be_displayed_with_the_following_values(List<String> areasOfStudy) throws Throwable {
        FCHubsStudiesTab.VerifyTopAreasOfStudy(areasOfStudy);
    }

    @When("^I search for a program \"([^\"]*)\"$")
    public void I_search_for_a_program(String searchText) throws Throwable {
        FCHubsStudiesTab.EnterSearchStringMajorsOffered(searchText);
    }

    @Then("^The displayed programs should be:$")
    public void The_displayed_programs_should_be(List<String> programs) throws Throwable {
        FCHubsStudiesTab.VerifyProgramsList(programs);
    }

    @When("^I click \"([^\"]*)\" in Majors Offered$")
    public void I_click_All_in_Majors_Offered(String degree) throws Throwable {
        FCHubsStudiesTab.ClickDegreesMajorsOffered(degree);
    }

    @When("^I click \"([^\"]*)\" in the Majors Offered list$")
    public void I_click_in_the_Majors_Offered_list(String program) throws Throwable {
        FCHubsStudiesTab.ClickProgramInMajorsOfferedList(program);
    }

    @Then("^The Study Option \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void The_Study_Option_should_be(String studyOption, String studyOptionAvailability) throws Throwable {
        FCHubsStudiesTab.VerifyStudyOptions(studyOption, studyOptionAvailability);
    }
}