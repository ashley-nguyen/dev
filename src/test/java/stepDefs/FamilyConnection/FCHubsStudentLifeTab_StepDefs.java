package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsAdmissionsTab;
import actions.FamilyConnection.FCHubsStudentLifeTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 8/01/2016.
 */
public class FCHubsStudentLifeTab_StepDefs {
    public static WebDriver driver;

    @Then("^The School Size should be \"([^\"]*)\"$")
    public void The_School_Size_should_be(String schoolSize) throws Throwable {
        FCHubsStudentLifeTab.VerifySchoolSize(schoolSize);
    }

    @Then("^The \"([^\"]*)\" number is \"([^\"]*)\" in School Size$")
    public void The_number_is_in_School_Size(String sectionName, String number) throws Throwable {
        FCHubsStudentLifeTab.VerifySchoolSizeDetail(sectionName, number);
    }

    @Then("^The \"([^\"]*)\" should be \"([^\"]*)\" in Student Life Top Bar$")
    public void The_should_be_in_Student_Life_Top_Bar(String sectionName, String value) throws Throwable {
        FCHubsStudentLifeTab.VerifyStudentLifeTopBarValues(sectionName, value);
    }

    @Then("^The Total Students number should be \"([^\"]*)\" in Ethnicity Data$")
    public void The_Total_Students_number_should_be_in_Ethnicity_Data(String totalStudents) throws Throwable {
        FCHubsStudentLifeTab.VerifyTotalStudentsEthnicityData(totalStudents);
    }

    @Then("^The percentage for \"([^\"]*)\" is \"([^\"]*)\" in Ethnicity Data$")
    public void The_percentage_for_is(String ethnicGroup, String value) throws Throwable {
        FCHubsStudentLifeTab.VerifyEthnicGroupPercentage(ethnicGroup, value);
    }

    @Then("^The Total Students number should be \"([^\"]*)\" in Gender Data$")
    public void The_Total_Students_number_should_be_in_Gender_Data(String totalStudentsGender) throws Throwable {
        FCHubsStudentLifeTab.VerifyTotalStudentsGenderData(totalStudentsGender);
    }

    @Then("^The percentage for \"([^\"]*)\" is \"([^\"]*)\" in Gender Data$")
    public void The_percentage_for_is_in_Gender_Data(String gender, String value) throws Throwable {
        FCHubsStudentLifeTab.VerifyGenderPercentage(gender, value);
    }

    @Then("^The Total Students number should be \"([^\"]*)\" in Age$")
    public void The_Total_Students_number_should_be_in_Age(String totalStudentsAge) throws Throwable {
        FCHubsStudentLifeTab.VerifyTotalStudentsAge(totalStudentsAge);
    }

    @Then("^The percentage for \"([^\"]*)\" is \"([^\"]*)\" in Age$")
    public void The_percentage_for_is_in_Age(String ageGroup, String value) throws Throwable {
        FCHubsStudentLifeTab.VerifyAgePercentage(ageGroup, value);
    }

    @Then("^The \"([^\"]*)\" should be \"([^\"]*)\" in Housing Information$")
    public void The_Should_Be_In_Housing_Information(String hiLabel, String hiValue) throws Throwable {
        FCHubsStudentLifeTab.VerifyHousingInformation(hiLabel,hiValue);


    }
}