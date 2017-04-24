package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsInternationalTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 4/6/2017.
 */
public class FCHubsInternationalTab_StepDefs {
    public static WebDriver driver;

    @Then("^The International Application Deadline should be \"([^\"]*)\" in the International Top Bar$")
    public void the_international_application_deadline_should_be_in_the_international_top_bar(String deadline) throws Throwable {
        FCHubsInternationalTab.verifyDeadlineIntTopBar(deadline);
    }

    @Then("^The International Fees should be the following in International Top bar:$")
    public void the_international_fees_should_be_the_following_in_international_top_bar(List<String> feesList) throws Throwable {
        FCHubsInternationalTab.verifyIntFeesIntTopBar(feesList);
    }

    @Then("^The International Test Requirements should be the following in International Top bar:$")
    public void the_international_test_requirements_should_be_the_following_in_international_top_bar(List<String> intTestReqList) throws Throwable {
        FCHubsInternationalTab.verifyIntTestReq(intTestReqList);
    }

    @Then("^The International Applications should be the following in International Top bar:$")
    public void the_international_applications_should_be_the_following_in_international_top_bar(List<String> intAppList) throws Throwable {
        FCHubsInternationalTab.verifyIntAppIntTopBar(intAppList);
    }

    @When("^I open the link \"([^\"]*)\" in International Top Bar$")
    public void I_open_the_link_in_International_Top_Bar(String linkText) throws Throwable {
        FCHubsInternationalTab.clickLinkIntTopBar(linkText);
    }

    @Then("^I should see each International Qualification with a correct value:$")
    public void I_should_see_each_International_Qualification_with_a_correct_value(List<String> intQualificationsList) throws Throwable {
        FCHubsInternationalTab.verifyIntQualifications(intQualificationsList);
    }

    @Then("^I should see each international test score with a corresponding value:$")
    public void I_should_see_each_international_test_score_with_a_corresponding_value(List<String> testScoresList) throws Throwable {
        FCHubsInternationalTab.verifyTestScores(testScoresList);
    }

    @When("^I expand the International Profile with name \"([^\"]*)\"$")
    public void i_Expand_The_International_Profile_With_Name(String intstudentProfile) throws Throwable {
        FCHubsInternationalTab.clickInternationalStudentProfileDetails(intstudentProfile);
    }

    @Then("^I should see the details of the International profile$")
    public void i_Should_See_The_Details_Of_The_International_Profile() throws Throwable {
        FCHubsInternationalTab.verifyInternationalStudentProfileDetails();
    }

    @And("^I close the International profile$")
    public void i_Close_The_International_Profile() throws Throwable {
        FCHubsInternationalTab.ClickXonInternationalProfile();
    }

    @Then("^The International profile with name \"([^\"]*)\" should be collapsed$")
    public void the_International_Profile_With_Name_Should_Be_Collapsed(String internationalProfileName) throws Throwable {
        FCHubsInternationalTab.verifyInternationalStudentProfileDetailsCollapsed(internationalProfileName);

    }
}