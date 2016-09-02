package stepDefs.Login;

import actions.Student.Search.Search.Student_Search;
import actions.eDocs.eDocsGeneral;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by jbarnard on 12/9/2015.
 * Updated by FrankSejas on 07/27/2016.
 */
public class eDocsStepDefs {
    @Given("^I am accessing the \"([^\"]*)\" edocs tab$")
    public void I_am_accessing_the_edocs_tab(String strStudentID) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
    }

    @Then("I click on Prepare link")
    public void I_click_on_prepare_link() throws Throwable {
        eDocsGeneral.ClickOnPrepareLink();
    }

    @Then("I click on Add button")
    public void I_click_on_add_button() throws Throwable {
        eDocsGeneral.ClickOnAddButton();
    }

    @Then("I click on Add Counselor button")
    public void I_click_on_add_counselor_button() throws Throwable {
        eDocsGeneral.ClickOnAddCounselorButton();
    }

    @Then("I click on Replace button")
    public void I_click_on_replace_button() throws Throwable {
        eDocsGeneral.ClickOnReplaceButton();
    }

    @Then("I click on Upload a File button")
    public void I_click_on_Upload_a_file_button() throws Throwable {
        eDocsGeneral.ClickOnUploadAFileButton();
    }

    @Then("I select \"([^\"]*)\" from Application")
    public void I_select_application(String application) throws Throwable {
        eDocsGeneral.SelectApplication(application);
    }

    @Then("I select \"([^\"]*)\" from Type")
    public void I_select_type(String type) throws Throwable {
        eDocsGeneral.SelectType(type);
    }

    @Then("I click on Browse button")
    public void I_click_on_browse_button() throws Throwable {
        eDocsGeneral.ClickOnBrowseButton();
    }

    @Then("I write the \"([^\"]*)\" file path")
    public void I_write_the_file_path(String filename) throws Throwable {
        eDocsGeneral.WritePathFile(filename);
    }

    @Then("^I will see \"([^\"]*)\"$")
    public void I_will_see(String strtext) throws Throwable {
        eDocsGeneral.verifytext(strtext);
    }

    @Then("^I will verify \"([^\"]*)\" for LORs$")
    public void I_will_verify_lors(String strtext) throws Throwable {
        eDocsGeneral.verifyLorsText(strtext);
    }

    @Then("^I will verify \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void I_will_verify_fields_for_lors(String type, String author, String size, String action) throws Throwable {
        eDocsGeneral.verifyLorsFieldsText(type, author, size, action);
    }

    @Then("^I will verify \"([^\"]*)\" in buttons for LORs$")
    public void I_will_verify_text_for_buttons(String strtext) throws Throwable {
        eDocsGeneral.verifyButtons(strtext);
    }

    @Then("^I will verify \"([^\"]*)\" file big message$")
    public void I_will_verify_file_big_message(String strtext) throws Throwable {
        eDocsGeneral.verifyFileBigMessage(strtext);
    }

    @Then("^I will verify \"([^\"]*)\" incorrect format message$")
    public void I_will_verify_incorrect_format_message(String strtext) throws Throwable {
        eDocsGeneral.verifyIncorrectFormatMessage(strtext);
    }

    @Given("^I will verify the mail was delivered with \"([^\"]*)\" subject$")
    public void i_will_verify_the_mail_was_delivered(String subject) throws Throwable {
        eDocsGeneral.VerifyEmailDelivered(subject);
    }

    @Given("^I can reply email directly with \"([^\"]*)\" and \"([^\"]*)\" password$")
    public void i_reply_email_directly(String email, String password) throws Throwable {
        eDocsGeneral.ReplyEmailDirectly(email, password);
    }
}
