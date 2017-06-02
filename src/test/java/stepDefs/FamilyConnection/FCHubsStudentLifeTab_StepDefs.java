package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsStudentLifeTab;
import cucumber.api.java.en.And;
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

    @Then("^The percentage for each Ethnic Group in Ethnicity Data is contained in the following table$")
    public void thePercentageForEachEthnicGroupInEthnicityDataIsContainedInTheFollowingTable(List<String> ethnicGroupsPercent) throws Throwable {
        FCHubsStudentLifeTab.VerifyEthnicGroupPercentage(ethnicGroupsPercent);
    }

    @Then("^The Total Students number should be \"([^\"]*)\" in Gender Data$")
    public void The_Total_Students_number_should_be_in_Gender_Data(String totalStudentsGender) throws Throwable {
        FCHubsStudentLifeTab.VerifyTotalStudentsGenderData(totalStudentsGender);
    }

    @Then("^The percentage for each gender in Gender Data is as follows:$")
    public void The_percentage_for_each_gender_in_Gender_Data_is_as_follows(List<String> genderPercentageList) throws Throwable {
        FCHubsStudentLifeTab.VerifyGenderPercentage(genderPercentageList);
    }

    @Then("^The Total Students number should be \"([^\"]*)\" in Age$")
    public void The_Total_Students_number_should_be_in_Age(String totalStudentsAge) throws Throwable {
        FCHubsStudentLifeTab.VerifyTotalStudentsAge(totalStudentsAge);
    }

    @Then("^The percentage for each age group in Age is as follows:$")
    public void thePercentageForEachAgeGroupInAgeIsAsFollows(List<String> agePercentagesList) throws Throwable {
        FCHubsStudentLifeTab.VerifyAgePercentage(agePercentagesList);
    }

    @When("^I open the \"([^\"]*)\" tab in Student Organizations and Services$")
    public void I_open_the_tab_in_Student_Organizations_and_Services(String sectionName) throws Throwable {
        FCHubsStudentLifeTab.ClickSectionInStudentOrgServ(sectionName);
    }

    @Then("^The following Available Organizations are displayed:$")
    public void The_following_Available_Organizations_are_displayed(List<String> studentOrgs) throws Throwable {
        FCHubsStudentLifeTab.VerifyStudentOrganizations(studentOrgs);
    }

    @And("^I open the \"([^\"]*)\" section in Athletics$")
    public void I_open_the_section_in_Athletics(String sectionName) throws Throwable {
        FCHubsStudentLifeTab.ClickSectionInAthletics(sectionName);
    }

    @Then("^The following \"([^\"]*)\" sports should be displayed:$")
    public void theFollowingSportsShouldBeDisplayed(String gender, List<String> sports) throws Throwable {
        FCHubsStudentLifeTab.VerifySportsInAthletics(gender, sports);
    }

    @Then("^The \"([^\"]*)\" should be \"([^\"]*)\" in Housing Information$")
    public void The_Should_Be_In_Housing_Information(String hiLabel, String hiValue) throws Throwable {
        FCHubsStudentLifeTab.VerifyHousingInformation(hiLabel,hiValue);
    }

    @Then("^I should be redirected to Housing Information in Student Life$")
    public void I_should_be_redirected_to_Housing_Information_in_Student_Life() throws Throwable {
        FCHubsStudentLifeTab.VerifyHousingInformationLabel();
    }

    @Then("^The quantity of fraternities and sororities in Greek Life tab is as follows:$")
    public void the_quantity_of_fraternities_and_sororities_in_Greek_Life_tab_is_as_follows(List<String> fratAndSorList) throws Throwable {
        FCHubsStudentLifeTab.verifyFraternitiesAndSororities(fratAndSorList);
    }

    @Then("^The available services in Services tab are as follows:$")
    public void the_available_services_in_services_tab_are_as_follows(List<String> servicesList) throws Throwable {
        FCHubsStudentLifeTab.verifyAvailableServices(servicesList);
    }

    @Then("^The location and type of all the computing resources should be displayed in Computing Resources as follows:$")
    public void location_and_type_of_all_the_computing_resources_should_be_displayed_in_Computing_Resources_as_follows
            (List<String> computingResourcesList) throws Throwable {
        FCHubsStudentLifeTab.verifyComputingResources(computingResourcesList);
    }
}