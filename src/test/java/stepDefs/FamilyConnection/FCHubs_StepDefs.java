package stepDefs.FamilyConnection;

import actions.FamilyConnection.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static actions.FamilyConnection.FCHubs.*;

/**
 * Created by jorgemaguina on 5/31/2016.
 *  click on Next on FirstTutorial dialog - Created by Mandeep 06/08/2016
 */
public class FCHubs_StepDefs {
    public static WebDriver driver;

    @Then("^I should see the Feedback Ribbon$")
    public void I_should_see_the_feedback_ribbon() throws Throwable {
        FCHubs.VerifyFeedbackRibbon();
    }

    @And("^I open the Survey Page$")
    public void I_open_the_survey_page() throws Throwable {
        FCHubs.ClickFeedbackButton();
    }

    @Then("^I should see FirstTutorial dialog$")
    public void I_should_see_firstTutorialDialog() throws Throwable {
        FCHubs.VerifyFirstTutorialDialog();
    }

    @And("^I navigate to Second Tutorial$")
    public void I_navigate_to_second_tutorial() throws Throwable {
        FCHubs.ClickNextOnFirstDialog();
    }

    @Then("^I should see SecondTutorial dialog$")
    public void I_should_see_second_tutorial_dialog() throws Throwable {
        FCHubs.VerifySecondTutorialDialog();
    }

    @And("^I navigate to the Third Tutorial$")
    public void I_navigate_to_the_Third_Tutorial() throws Throwable {
        FCHubs.ClickNextOnFirstDialog();
        FCHubs.ClickNextOnSecondDialog();
    }

    @Then("^I should see ThirdTutorial dialog$")
    public void I_should_see_third_tutorial_dialog() throws Throwable {
        FCHubs.VerifyThirdTutorialDialog();

    }

    @Then("^I should see the Identifier module$")
    public void I_should_see_the_identifier_module() throws Throwable {
        FCHubs.VerifyIdentifierModule();
    }

    @Then("^I should see the logo in the Identifier module$")
    public void I_should_see_the_logo_in_the_identifier_module() throws Throwable {
        FCHubs.VerifyLogoInIdentifierModule();
    }

    @When("^I open the URL at the side of the logo$")
    public void I_open_the_URL_at_the_side_of_the_logo() throws Throwable {
        FCHubs.ClickURLInIdentifierModule();
    }

    @Then("^I should see the URL for \"([^\"]*)\" open in a new page$")
    public void I_should_see_the_URL_for_open_in_a_new_page(String site) throws Throwable {
        FCHubs.VerifyURLContainsText(site);
    }

    @When("^I open the Apply Online button$")
    public void I_open_the_apply_online_button() throws Throwable {
        FCHubs.ClickApplyOnlineButton();
    }

    @When("^I open the 'Learn More' link \"([^\"]*)\"$")
    public void I_open_the_learn_more_link(String link) throws Throwable {
        FCHubs.ClickLearnMoreButton();
        FCHubs.ClickLearnMoreEventsLink(link);
    }

    @When("^I go to the right \"([^\"]*)\" times$")
    public void I_go_to_the_right_times(int numberOfTimes) throws Throwable {
        FCHubs.ClickRightArrow(numberOfTimes);
    }

    @Then("^I should see the last Web Tour element$")
    public void I_should_see_the_last_web_tour_element() throws Throwable {
        FCHubs.VerifyVisibilityOfLastWebTourElement();
    }

    @Then("^I should see a Play button in the YouTube video thumbnail$")
    public void I_should_see_a_play_button_in_the_youtube_video_thumbnail() throws Throwable {
        FCHubs.VerifyVisibilityOfPlayButton();
    }

    @When("^I open the Web Tour element at position \"([^\"]*)\"$")
    public void iOpenTheWebTourElementAtPosition(int elementPosition) throws Throwable {
        FCHubs.ClickWebTourElementAtPosition(elementPosition);
    }

    @Then("^I should see an image in a modal dialog$")
    public void I_should_see_an_image_in_a_modal_dialog() throws Throwable {
        FCHubs.VerifyPresenceOfImageInModal();
    }

    @Then("^I should see content below the image$")
    public void I_should_see_content_below_the_image() throws Throwable {
        FCHubs.VerifyContentBelowImageInModal();
    }

    @And("^I click a link with the text \"([^\"]*)\" in the content of the modal dialog$")
    public void iClickALinkWithTheTextInTheContentOfTheModalDialog(String linkText) throws Throwable {
        FCHubs.ClickLinkInContentInModal(linkText);
    }

    @And("^I close the modal dialog with the 'x' button$")
    public void I_click_the_x_in_the_modal_dialog() throws Throwable {
        FCHubs.ClickXInModalDialog();
    }

    @Then("^The modal dialog should be closed$")
    public void The_modal_dialog_should_be_closed() throws Throwable {
        FCHubs.VerifyModalDialogIsNotDisplayed();
    }

    @Then("^I should see the Navigation Tabs$")
    public void I_should_see_the_navigation_tabs() throws Throwable {
        FCHubs.VerifyNavigationTabs();
    }

    @Then("^The School Name should be \"([^\"]*)\" in Application Mailing Address$")
    public void The_school_name_should_be_in_application_mailing_address(String schoolName) throws Throwable {
        FCHubs.VerifySchoolNameAppMailingAdd(schoolName);
    }

    @Then("^'Attn: Applications' should be displayed in Application Mailing Address$")
    public void Attn_applications_should_be_displayed_in_application_mailing_address() throws Throwable {
        FCHubs.VerifyAttnApplicationsAppMailingAdd();
    }

    @Then("^Address should be \"([^\"]*)\" in Application Mailing Address$")
    public void Address_should_be_in_application_mailing_address(String address) throws Throwable {
        FCHubs.VerifyAddressAppMailingAdd(address);
    }

    @Then("^City should be \"([^\"]*)\" in Application Mailing Address$")
    public void City_should_be_in_application_mailing_address(String city) throws Throwable {
        FCHubs.VerifyCityAppMailingAdd(city);
    }

    @Then("^Zip address should be \"([^\"]*)\" in Application Mailing Address$")
    public void Zip_address_should_be_in_application_mailing_address(String zipAddress) throws Throwable {
        FCHubs.VerifyZipAddressAppMailingAdd(zipAddress);
    }

    @Then("^Phone should be \"([^\"]*)\" in Admissions$")
    public void Phone_should_be_in_admissions(String phone) throws Throwable {
        FCHubs.VerifyPhoneAdmissions(phone);
    }

    @Then("^Fax should be \"([^\"]*)\" in Admissions$")
    public void Fax_should_be_in_admissions(String fax) throws Throwable {
        FCHubs.VerifyFaxAdmissions(fax);
    }

    @Then("^Financial Aid number should be \"([^\"]*)\" in Admissions$")
    public void Financial_aid_number_should_be_in_admissions(String phoneNumber) throws Throwable {
        FCHubs.VerifyFinantialAidNumberAdmissions(phoneNumber);
    }

    @Then("^Email address should be \"([^\"]*)\" in Admissions$")
    public void Email_address_should_be_in_admissions(String email) throws Throwable {
        FCHubs.VerifyEmailAdmissions(email);
    }

    @Then("^Website should be \"([^\"]*)\" in Quick Facts$")
    public void Website_should_be_in_quick_facts(String webSite) throws Throwable {
        FCHubs.VerifyWebsiteQuickFacts(webSite);
    }

    @Then("^School Type is \"([^\"]*)\" in Quick Facts$")
    public void School_Type_is_in_Quick_Facts(String schoolType) throws Throwable {
        FCHubs.VerifySchoolTypeQuickFacts(schoolType);
    }

    @Then("^Undergraduate Enrollment is \"([^\"]*)\" in Quick Facts$")
    public void Undergraduate_Enrollment_is_in_Quick_Facts(String undergraduateEnrollment) throws Throwable {
        FCHubs.VerifyUndergraduateEnrollmentQuickFacts(undergraduateEnrollment);
    }

    @Then("^Student-to-faculty ratio is \"([^\"]*)\" in Quick Facts$")
    public void StudentToFaculty_ratio_is_in_Quick_Facts(String studentFacultyRatio) throws Throwable {
        FCHubs.VerifyStudentToFacultyRatioQuickFacts(studentFacultyRatio);
    }

    @Then("^Religious Affiliation is \"([^\"]*)\" in Quick Facts$")
    public void Religious_Affiliation_is_in_Quick_Facts(String religion) throws Throwable {
        FCHubs.VerifyReligiousAffiliationQuickFacts(religion);
    }

    @Then("^Campus Surroundings is \"([^\"]*)\" in Quick Facts$")
    public void Campus_Surroundings_is_in_Quick_Facts(String surroundings) throws Throwable {
        FCHubs.VerifyCampusSurroundings(surroundings);
    }

    @Then("^Student's \"([^\"]*)\" should be \"([^\"]*)\" in the Score Comparison module$")
    public void Students_should_be_in_the_Score_Comparison_Module(String scoreType, String value) throws Throwable {
        FCHubs.VerifyScoreValuesScoreComp(scoreType, value);
    }

    @Then("^Average \"([^\"]*)\" should be \"([^\"]*)\" with correct values in the Score Comparison module$")
    public void Average_should_be_with_correct_values_in_the_Score_Comparison_Module(String avgScoreType,
                                                                                     String avgValue) throws Throwable {
        FCHubs.VerifyAvgValuesScoreComp(avgScoreType, avgValue);
    }

    @Then("^The score text for \"([^\"]*)\" should be \"([^\"]*)\"$")
    public void The_score_text_for_should_be(String scoreType, String scoreText) throws Throwable {
        FCHubs.VerifyScoreTextScoreComp(scoreType, scoreText);
    }

    @Then("^The Overall Average text should be \"([^\"]*)\" in the Score Comparison module$")
    public void The_Overall_Average_text_should_be_in_the_Score_Comparison_module(String overallAvgText)
            throws Throwable {
        FCHubs.VerifyOverallAverageTextScoreComp(overallAvgText);
    }

    @Then("^A question mark for \"([^\"]*)\" is displayed in the dials that don't have Student's data$")
    public void A_question_mark_for_is_displayed_in_the_dials_that_dont_have_Students_data(String scoreType)
            throws Throwable {
        FCHubs.VerifyQuestionMarkScoreComp(scoreType);
    }

    @Then("^Average Total Cost should be \"([^\"]*)\" when the income is \"([^\"]*)\"$")
    public void Average_Total_Cost_should_be_when_the_income_is(String avgTotalCost, String income) throws Throwable {
        FCHubs.VerifyAvgTotalCostInfoTopBar(income, avgTotalCost);
    }

    @Then("^Graduation Rate should be \"([^\"]*)\" with correct data in the Information Top bar$")
    public void Graduation_Rate_should_be_with_correct_data_in_the_Information_Top_bar(String graduationRate) throws Throwable {
        FCHubs.VerifyGraduationRateInfoTopBar(graduationRate);
    }

    @Then("^Acceptance Rate should be \"([^\"]*)\" with correct data in the Information Top bar$")
    public void Acceptance_Rate_should_be_with_correct_data_in_the_Information_Top_bar(String acceptanceRate) throws Throwable {
        FCHubs.VerifyAcceptanceRateInfoTopBar(acceptanceRate);
    }

    @Then("^The Priority date should be \"([^\"]*)\" \"([^\"]*)\" in the Information Top bar$")
    public void The_Priority_date_should_be_in_the_Information_Top_bar(String month, String day) throws Throwable {
        FCHubs.VerifyPriorityDateInfoTopBar(month, day);
    }

    @Then("^The student's email \"([^\"]*)\" should be present in the Email Field$")
    public void The_students_email_should_be_present_in_the_Email_Field(String email) throws Throwable {
        FCHubs.VerifyEmailInFieldContactForm(email);
    }

    @Then("^The student's phone number \"([^\"]*)\" should be displayed in the Phone Field$")
    public void The_students_phone_number_should_be_displayed_in_the_Phone_Field(String phoneNumber) throws Throwable {
        FCHubs.VerifyPhoneInFieldContactForm(phoneNumber);
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void I_should_see_the_message(String confirmationMessage) throws Throwable {
        FCHubs.VerifyConfirmationMessageContactForm(confirmationMessage);
    }

    @Then("^I should see an error message \"([^\"]*)\"$")
    public void I_should_see_an_error_message(String errorMessage) throws Throwable {
        FCHubs.VerifyConfirmationMessageContactForm(errorMessage);
    }

    @When("^I clear the email field and the phone field in Contact Form$")
    public void I_clear_the_email_field_and_the_phone_field_in_Contact_Form() throws Throwable {
        FCHubs.ClearFieldContactForm("email");
        FCHubs.ClearFieldContactForm("phone");
    }

    @And("^I click on X in FirstTutorial dialog$")
    public void I_Click_On_X_In_FirstTutorialDialog() throws Throwable {
        FCHubs.ClickXInFirstTutorialDialog();

    }

    @Then("^FirstTutorial dialog is closed$")
    public void First_tutorial_Dialog_Is_Closed() throws Throwable {
        FCHubs.VerifyFirstTutorialDialogClosed();
    }

    @And("^I click on X in SecondTutorial dialog$")
    public void I_Click_On_X_In_SecondTutorialDialog() throws Throwable {
        FCHubs.ClickXInSecondTutorialDialog();

    }

    @Then("^SecondTutorial dialog is closed$")
    public void Second_Tutorial_Dialog_Is_Closed() throws Throwable {
        FCHubs.VerifySecondTutorialDialogClosed();
    }
    @When("^I open the Studies tab$")
    public void I_open_the_Studies_tab() throws Throwable {
        FCHubs.ClickStudiesTab();
    }
    @And("^I open the Admissions tab$")
    public void I_open_the_Admissions_Tab() throws Throwable {
        FCHubs.ClickAdmissionsTab();
    }
    @And("^I open the Student Life tab$")
    public void I_open_the_Student_Life_tab() throws Throwable {
        FCHubs.ClickStudentLifeTab();
    }

    @Then("^The URL should contain \"([^\"]*)\"$")
    public void The_URL_should_contain(String urlText) throws Throwable {
        FCHubs.VerifyURLContainsText(urlText);
    }

    @Then("^I should be redirected to the tab \"([^\"]*)\"$")
    public void I_should_be_redirected_to_the_tab(String tabName) throws Throwable {
        FCHubs.VerifyActiveTab(tabName);
    }

    @When("^I open the link \"([^\"]*)\" in the Overview Info Top Bar$")
    public void I_open_the_link_in_the_Overview_Info_Top_Bar(String link) throws Throwable {
        FCHubs.ClickLinkInOverviewInfoTopBar(link);
    }

    @Then("^I should be redirected to the section \"([^\"]*)\" in Costs$")
    public void I_should_be_redirected_to_the_section_in_Costs(String sectionLabel) throws Throwable {
        FCHubs.VerifySectionLabelInCosts(sectionLabel);
    }

    @Then("^I should be redirected to the section \"([^\"]*)\" in Admissions$")
    public void I_should_be_redirected_to_the_section_in_Admissions(String sectionLabel) throws Throwable {
        FCHubs.VerifySectionLabelInAdmissions(sectionLabel);
    }

    @Then("^Google Maps should be opened in a new window$")
    public void Google_Maps_should_be_opened_in_a_new_window() throws Throwable {
        FCGoogleMaps.VerifyGoogleMapsURL();
    }

    @Then("^The text \"([^\"]*)\" should be displayed under the sections in Overview Info Top bar$")
    public void The_text_should_be_displayed_under_the_sections_in_Overview_Info_Top_bar(String text)
            throws Throwable {
        FCHubs.VerifyDateLabelsInOverviewTopBar(text);
    }

    @And("^I open the Costs tab$")
    public void I_open_the_Costs_tab() throws Throwable {
        FCHubs.ClickCostsTab();
    }

    @And("^I open the Profiles tab$")
    public void I_open_the_Profiles_tab() throws Throwable {
        FCHubs.ClickProfilesTab();
    }

    @When("^I open the HUBS page for \"([^\"]*)\"$")
    public void I_open_the_HUBS_page_for(String college) throws Throwable {
        FCDashboard.ClickCollegesTab();
        FCCollegesTab.EnterCollegeToSearch(college);
        FCCollegesTab.ClickGoButton();
        FCCollegesTab.ClickCollegeInCollegeLookup(college);
        FCCollegeView.clickBetaButton();
    }
    @When("^I open 'Communicate' link \"([^\"]*)\"$")
    public void I_open_Communicate_Link(String link) throws Throwable {
        FCHubs.ClickCommunicate();
        FCHubs.Requestinformationlink(link);
    }

    @When("^I send an email with Subject \"([^\"]*)\" and Message \"([^\"]*)\"$")
    public void I_send_an_email_with_subject_and_message(String subject, String message) throws Throwable {
        FCHubs.enterSubjectContactForm(subject);
        FCHubs.enterMessageContactForm(message);
        FCHubs.ClickSendMessageContactForm();
    }

    @And("^I send the email$")
    public void I_send_the_email() throws Throwable {
        FCHubs.ClickSendMessageContactForm();
    }

    @When("^I open the Colleges tab$")
    public void iOpenOnTheCollegesTab() throws Throwable {
        FCDashboard.ClickCollegesTab();
    }

    @When("^I open the college view for \"([^\"]*)\"$")
    public void I_open_the_college_view_for(String college) throws Throwable {
        FCDashboard.ClickCollegesTab();
        FCCollegesTab.EnterCollegeToSearch(college);
        FCCollegesTab.ClickGoButton();
        FCCollegesTab.ClickCollegeInCollegeLookup(college);
    }

    @Then("^Degrees Offered contains the following values:$")
    public void Degrees_Offered_contains_the_following_values(List<String> degrees) throws Throwable {
        FCHubs.VerifyDegreesOfferedQuickFacts(degrees);
    }

    @Then("^The number in overlaps should be the same as the number of colleges in the following json:$")
    public void The_number_in_overlaps_should_be_the_same_as_the_number_of_colleges_in_the_following_json
            (String jsonText) throws Throwable {
        FCHubs.VerifyOverlapsNumber(jsonText);
    }

    @When("^I open the overlaps list in Legacy Family Connection$")
    public void I_open_the_overlaps_list_in_Legacy_Family_Connection() throws Throwable {
        FCHubs.clickLearnMoreOverlaps();
    }

    @Then("^The colleges in the legacy list should be contained in the following json:$")
    public void The_colleges_in_the_legacy_list_should_be_contained_in_the_following_json(String jsonText) throws Throwable {
        FCHubs.verifyJsonContainsColleges(jsonText);
    }

    @Then("^I should see the 'Looking for Scattergrams' tutorial$")
    public void I_should_see_the_looking_for_Scattergrams_tutorial() throws Throwable {
        FCHubs.VerifySecondTutorialDialog();
    }

    @When("^I open Recommended Events from sticky bar$")
    public void I_Open_Recommended_Events_From_Sticky_Bar() throws Throwable {
        FCHubs.clickRecommendedEvents();

    @When("^I add the college to the 'I'm thinking about' list using the heart icon$")
    public void I_add_the_college_to_the_Im_thinking_about_list_using_the_heart_icon() throws Throwable {
        FCHubs.clickWhiteHeartThinkingAboutList();
    }

    @Then("^The heart should change its status to indicate that it is clicked$")
    public void The_heart_should_change_its_status_to_indicate_that_it_is_clicked() throws Throwable {
        FCHubs.verifyHeartStatusClicked();
    }

    @Then("^The college \"([^\"]*)\" should be added to the 'I'm thinking about list'$")
    public void The_college_should_be_aAdded_to_the_Im_thinking_about_list(String college) throws Throwable {
        FCHubs.verifyCollegeAddedtoImThinkingAboutList(college);
    }

    @And("^I remove the college \"([^\"]*)\" from the 'I'm thinking about' list in legacy$")
    public void I_remove_the_college_from_the_Im_thinking_about_list_in_legacy(String college) throws Throwable {
        FCCollegesTab.removeCollegeFromImThinkingAboutListLegacy(college);
    }

    @Given("^The college is added to the 'I'm thinking about' list$")
    public void The_college_is_added_to_the_Im_thinking_about_list() throws Throwable {
        FCHubs.clickWhiteHeartThinkingAboutList();
    }

    @When("^I take the college out of the 'I'm thinking about' list using the heart icon$")
    public void I_take_the_college_out_of_the_Im_thinking_about_list_using_the_heart_icon() throws Throwable {
        FCHubs.clickPinkHeartThinkingAboutList();
    }

    @Then("^The college \"([^\"]*)\" should not be present in the 'I'm thinking about' list$")
    public void The_college_should_not_be_present_in_the_Im_thinking_about_list(String college) throws Throwable {
        FCHubs.verifyCollegeIsNotInImThinkingAboutList(college);
    }

    @When("^I go over the heart icon when it is white$")
    public void I_go_over_the_heart_icon_when_it_is_white() throws Throwable {
        FCHubs.hoverOverWhiteHeart();
    }

    @Then("^I should see a tooltip with the text \"([^\"]*)\"$")
    public void I_should_see_a_tool_tip_with_the_text(String heartTooltipText) throws Throwable {
        FCHubs.verifyHeartTooltip(heartTooltipText);
    }

    @When("^I go over the heart icon when it is pink$")
    public void I_go_over_the_heart_icon_when_it_is_pink() throws Throwable {
        FCHubs.hoverOverPinkHeart();
    }

    @When("^I open the college visit in position \"([^\"]*)\"$")
    public void I_open_the_college_visit_in_position(String position) throws Throwable {
        FCHubs.clickRegisterInCollegeVisit(position);
    }

    @When("^I open the college visit details in position \"([^\"]*)\"$")
    public void iOpenTheCollegeVisitDetailsInPosition(String position) throws Throwable {
        FCHubs.clickDetailsInCollegeVisit(position);
    }
}

