package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubs;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

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

    @And("^I click the Feedback Button$")
    public void I_click_the_feedback_button() throws Throwable {
        FCHubs.ClickFeedbackButton();
    }

    @Then("^I should see FirstTutorial dialog$")
    public void I_should_see_firstTutorialDialog() throws Throwable {
        FCHubs.VerifyFirstTutorialDialog();
    }

    @And("^I click on Next on FirstTutorial dialog$")
    public void I_click_next_on_first_tutorial_dialog() throws Throwable {
        FCHubs.ClickNextOnFirstDialog();

    }

    @Then("^I should see SecondTutorial dialog$")
    public void I_should_see_second_tutorial_dialog() throws Throwable {
        FCHubs.VerifySecondTutorialDialog();
    }

    @And("^I click on Next on SecondTutorial dialog$")
    public void I_click_Next_on_second_tutorial_dialog() throws Throwable {
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

    @When("^I click the URL at the side of the logo$")
    public void I_click_the_URL_at_the_side_of_the_logo() throws Throwable {
        FCHubs.ClickURLInIdentifierModule();
    }

    @Then("^I should see the URL for \"([^\"]*)\" open in a new page$")
    public void I_should_see_the_URL_for_open_in_a_new_page(String site) throws Throwable {
        FCHubs.VerifyURLContainsText(site);
    }

    @When("^I click the Request Info button$")
    public void I_click_the_request_info_button() throws Throwable {
        FCHubs.ClickRequestInfoButton();
    }

    @When("^I click the Apply Online button$")
    public void I_click_the_apply_online_button() throws Throwable {
        FCHubs.ClickApplyOnlineButton();
    }

    @When("^I click the 'Learn More' link \"([^\"]*)\"$")
    public void I_click_the_learn_more_link(String link) throws Throwable {
        FCHubs.ClickLearnMoreButton();
        FCHubs.ClickLearnMoreLink(link);
    }

    @When("^I click the right navigation arrow \"([^\"]*)\" times$")
    public void I_click_the_navigation_arrow_times(int numberOfTimes) throws Throwable {
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

    @When("^I click the Web Tour element at position \"([^\"]*)\"$")
    public void iClickTheWebTourElementAtPosition(int elementPosition) throws Throwable {
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

    @And("^I click the 'x' in the modal dialog$")
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
}