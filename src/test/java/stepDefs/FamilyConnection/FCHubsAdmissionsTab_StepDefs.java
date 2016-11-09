package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsAdmissionsTab;
import actions.FamilyConnection.FCHubsStudiesTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsAdmissionsTab_StepDefs {
    public static WebDriver driver;

    @Then("^The Early Decision Deadline should be \"([^\"]*)\" in Admissions Top bar$")
    public void The_Early_Decision_Deadline_should_be_in_Admissions_Top_Bar(String decisionDeadline) throws Throwable {
        FCHubsAdmissionsTab.VerifyRegularDeadlineDecision(decisionDeadline);
    }

    @Then("^The Acceptance Rate should be \"([^\"]*)\" in Admissions Top Bar$")
    public void The_Acceptance_Rate_should_be_in_Admissions_Top_Bar(String acceptanceRate) throws Throwable {
        FCHubsAdmissionsTab.VerifyAcceptanceRate(acceptanceRate);
    }

    @Then("^Application Fees should be \"([^\"]*)\" in Admissions Top Bar$")
    public void Application_Fees_should_be_in_Admissions_Top_Bar(String applicationFees) throws Throwable {
        FCHubsAdmissionsTab.VerifyApplicationFees(applicationFees);
    }

    @Then("^The Important Policies in Admissions Top Bar should be:$")
    public void The_Important_Policies_in_Admissions_Top_Bar_should_be(List<String> importantPolicies) throws Throwable {
        FCHubsAdmissionsTab.VerifyImportantPolicies(importantPolicies);
    }

    @When("^I open \"([^\"]*)\" in Application Requirements$")
    public void I_open_in_Application_Requirements(String section) throws Throwable {
        FCHubsAdmissionsTab.ClickSectionInAppRequirements(section);
    }

    @Then("^I should see the \"([^\"]*)\" requirements in Application Requirements:$")
    public void I_should_see_the_requirements_in_Application_Requirements(String reqType, List<String> applicationRequirements) throws Throwable {
        FCHubsAdmissionsTab.VerifyApplicationRequirements(reqType, applicationRequirements);
    }

    @When("^I open \"([^\"]*)\" in Application Information$")
    public void I_open_in_Application_Information(String tab) throws Throwable {
        FCHubsAdmissionsTab.ClickApplicationInformationTab(tab);
    }

    @Then("^The deadline with name \"([^\"]*)\" and date \"([^\"]*)\" should be displayed in Application Information$")
    public void the_deadline_with_name_and_date_should_be_displayed_in_Application_Information(String deadlineName, String date) throws Throwable {
        FCHubsAdmissionsTab.VerifyDeadline(deadlineName, date);
    }
}