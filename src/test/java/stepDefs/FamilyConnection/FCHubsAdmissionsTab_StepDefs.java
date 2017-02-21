package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import actions.FamilyConnection.FCHubsAdmissionsTab;
import actions.FamilyConnection.FCHubsStudiesTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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

    @Then("^I should see the Recommended Courses with the following data:$")
    public void I_should_see_the_Recommended_Courses_with_the_following_data(List<String> recommendedCoursesList) throws Throwable {
        FCHubsAdmissionsTab.verifyRecommendedCourses(recommendedCoursesList);
    }

    @When("^I sort data using the \"([^\"]*)\" header$")
    public void I_sort_the_using_the_header(String header) throws Throwable {
        FCHubsAdmissionsTab.clickRecommendedCoursesHeader(header);
    }

    @Then("^The course names are sorted alphabetically$")
    public void the_are_sorted_alphabetically() throws Throwable {
        FCHubsAdmissionsTab.verifyDataIsAlphabeticallySorted();
    }

    @Then("^The \"([^\"]*)\" are sorted from greatest to least$")
    public void theAreSortedFromGreatestToLeast(String dataType) throws Throwable {
        FCHubsAdmissionsTab.verifyYearsDataIsSorted(dataType);
    }

    @Then("^The \"([^\"]*)\" drop down should have the options:$")
    public void the_drop_down_should_have_the_options(String dropDownIdentifier, List<String> dropDownOptions) throws Throwable {
        FCHubsAdmissionsTab.verifyDropDownOptions(dropDownIdentifier, dropDownOptions);
    }

    @Then("^The \"([^\"]*)\" should be displayed in Scattergrams$")
    public void the_should_be_displayed_in_scattergrams(String section) throws Throwable {
        FCHubsAdmissionsTab.verifyScattergramsSection(section);
    }

    @When("^I expand the description using 'Show more' in the Scattergrams description$")
    public void I_expand_the_description_using_show_more_in_the_scattergrams_description() throws Throwable {
        FCHubsAdmissionsTab.clickShowMoreScattergrams();
    }

    @Then("^The Scattergrams description should be expanded$")
    public void the_scattergrams_description_should_be_expanded() throws Throwable {
        FCHubsAdmissionsTab.verifyExpandedDescriptionScattergrams();
    }

    @And("^I collapse the desciption using 'Show less' in the Scattergrams description$")
    public void I_collapse_the_desciption_using_show_less_in_the_scattergrams_description() throws Throwable {
        FCHubsAdmissionsTab.clickShowLessScattergrams();
    }

    @When("^I open the information tooltip using the information icon in Scattergrams$")
    public void I_open_the_information_tooltip_using_the_information_icon_in_scattergrams() throws Throwable {
        FCHubsAdmissionsTab.clickInfoIconScattergrams();
    }

    @Then("^An information tooltip should be displayed$")
    public void an_information_tooltip_should_be_displayed() throws Throwable {
        FCHubsAdmissionsTab.verifyTooltipScattergrams();
    }

    @When("^Close the information tooltip using the x$")
    public void close_the_information_tooltip_using_the_x() throws Throwable {
        FCHubsAdmissionsTab.clickXTooltipScattergrams();
    }

    @Then("^The tooltip should be closed$")
    public void the_tooltip_should_be_closed() throws Throwable {
        FCHubsAdmissionsTab.verifyScattergramsTooltipClosed();
    }

    @Then("^The data for 'Important Policies' should be similar to the table:$")
    public void the_data_for_important_policies_should_be_similar_to_the_table(List<String> policies) throws Throwable {
        FCHubsAdmissionsTab.verifyImportantPolicies(policies);
    }

    @Then("^The fees for \"([^\"]*)\" should be:$")
    public void the_fees_for_should_be(String feesType, List<String> feesList) throws Throwable {
        FCHubsAdmissionsTab.verifyFeesAppInfo(feesType, feesList);
    }

    @When("^I open the link with text \"([^\"]*)\" in Fees$")
    public void I_open_the_link_with_text_in_fees(String linkText) throws Throwable {
        FCHubsAdmissionsTab.clickLinkInFees(linkText);
    }

    @Then("^The applications for the current year should be as follows in Applications from High School:$")
    public void the_applications_for_the_current_year_should_be_as_follows_in_applications_from_High_School
            (List<String> applicationsList) throws Throwable {
        FCHubsAdmissionsTab.verifyApplicationsFromHS(applicationsList);
    }

    @When("^I open the information tooltip clicking the information icon in Acceptance Rate$")
    public void I_open_the_information_tooltip_clicking_the_information_icon_in_Acceptance_Rate() throws Throwable {
        FCHubsAdmissionsTab.clickInfoIconAcceptanceRate();
    }

    @Then("^A tooltip should be displayed in Acceptance Rate$")
    public void a_tooltip_should_be_displayed_in_Acceptance_Rate() throws Throwable {
        FCHubsAdmissionsTab.verifyInfoToolTipAcceptanceRate();
    }

    @Then("^The tooltip in Acceptance Rate should be closed$")
    public void the_tooltip_in_Acceptance_Rate_should_be_closed() throws Throwable {
        FCHubsAdmissionsTab.verifyInfoTooltipAcceptanceRateClosed();
    }

    @Then("^I should see a the admissions contact information as follows:$")
    public void I_should_see_a_the_admissions_contact_information_as_follows(List<String> contactDataList) throws Throwable {
        FCHubsAdmissionsTab.verifyAdmissionsContactInfo(contactDataList);
    }
}