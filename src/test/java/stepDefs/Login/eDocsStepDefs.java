package stepDefs.Login;

import actions.Student.Search.Search.Student_Search;
import actions.eDocs.eDocsGeneral;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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

    @When("^I use \"([^\"]*)\" and delete document in eDocs$")
    public void I_delete_document_in_edocs(String strStudentID) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnDeleteButton();
//        eDocsGeneral.ClickOnDeleteDocumentButton();
    }

    @When("^I use \"([^\"]*)\" under application selecting \"(.*)\" and \"(.*)\" with \"([^\"]*)\"$")
    public void I_use_student_under_application_for_letter_recommendation_verifying_text(String strStudentID,  String application, String type, String filename) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnAddButton();
        if (filename == "FillTooBigPDF.pdf")
        {
            eDocsGeneral.ClickOnUploadAFileButton();
        }
        eDocsGeneral.ClickOnUploadAFileButton();
        eDocsGeneral.SelectApplication(application);
        eDocsGeneral.SelectType(type);
        eDocsGeneral.ClickOnBrowseButton();
        eDocsGeneral.WritePathFile(filename);
    }

    @When("^I use \"([^\"]*)\" under application for counselor documents selecting \"(.*)\" and \"(.*)\" with \"([^\"]*)\"$")
    public void I_use_student_under_application_for_counselor_documents_verifying_text(String strStudentID,  String application, String type, String filename) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnAddCounselorButton();
        if (filename == "FillTooBigPDF.pdf")
        {
            eDocsGeneral.ClickOnUploadAFileButton();
        }
        eDocsGeneral.ClickOnUploadAFileButton();
        eDocsGeneral.SelectApplication(application);
        eDocsGeneral.SelectType(type);
        eDocsGeneral.ClickOnBrowseButton();
        eDocsGeneral.WritePathFile(filename);
    }

    @When("^I use \"([^\"]*)\" under transcript selecting \"(.*)\" with \"([^\"]*)\"$")
    public void I_use_transcript_under_application_for_letter_recommendation_verifying_text(String strStudentID,  String type, String filename) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnTranscriptAddButton();
        eDocsGeneral.ClickOnUploadAFileButton();
        eDocsGeneral.SelectType(type);
        eDocsGeneral.ClickOnTranscriptBrowseButton();
        eDocsGeneral.WritePathFile(filename);
    }


    @Given("^I expand all under application for the \"([^\"]*)\" in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_expand_all_under_application(String strStudentID, String application, String type, String filename) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnReplaceButton();
        eDocsGeneral.ClickOnUploadAFileButton();
        eDocsGeneral.SelectApplication(application);
        eDocsGeneral.SelectType(type);
        eDocsGeneral.ClickOnBrowseButton();
        eDocsGeneral.WritePathFile(filename);
        eDocsGeneral.ClickOnSendLink();
        eDocsGeneral.ClickOnExpandAllButton();
    }

    @Given("^I expand all under application to replace the \"([^\"]*)\" in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_expand_all_under_application_to_replace(String strStudentID, String application, String type, String filename) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
        eDocsGeneral.ClickOnReplaceButton();
        eDocsGeneral.ClickOnUploadAFileButton();
        eDocsGeneral.ClickOnBrowseButton();
        eDocsGeneral.WritePathFile(filename);
        eDocsGeneral.ClickOnSendLink();
        eDocsGeneral.ClickOnExpandAllButton();
    }


    @Given("^I expand all button action for the \"([^\"]*)\"$")
    public void I_expand_all_button_action(String strStudentID) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnSendLink();
        eDocsGeneral.ClickOnExpandAllButton();
    }


    @Then("I click on Prepare link")
    public void I_click_on_prepare_link() throws Throwable {
        eDocsGeneral.ClickOnPrepareLink();
    }


    @When("I go to Prepare Link with \"([^\"]*)\"")
    public void  I_go_to_Prepare_Link(String strStudentID) throws Throwable {
        Student_Search.studentRosterSearch(strStudentID, "id");
        eDocsGeneral.NavtoEdocsStudentTab();
        eDocsGeneral.ClickOnPrepareLink();
    }



    @Then("I click on Send link")
    public void I_click_on_send_link() throws Throwable {
        eDocsGeneral.ClickOnSendLink();
    }

    @Then("I click on Expand All button")
    public void I_click_on_expand_all_button() throws Throwable {
        eDocsGeneral.ClickOnExpandAllButton();
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

    @Then("I click on Delete button")
    public void I_click_on_delete_button() throws Throwable {
        eDocsGeneral.ClickOnDeleteButton();
    }

    @Then("I click on Delete Document button")
    public void I_click_on_delete_document_button() throws Throwable {
        eDocsGeneral.ClickOnDeleteDocumentButton();
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

    @Then("^I will verify \"([^\"]*)\" with \"([^\"]*)\" messages for LORs$")
    public void I_will_verify_messagelors(String strtext, String strMessage) throws Throwable {
        eDocsGeneral.verifyLorsMessagesText(strtext, strMessage);
    }

    @Then("^I will verify \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void I_will_verify_fields_for_lors(String type, String author, String size, String action) throws Throwable {
        eDocsGeneral.verifyLorsFieldsText(type, author, size, action);
    }

    @Then("^I will verify \"([^\"]*)\" available document$")
    public void I_will_verify_available_document(String type) throws Throwable {
        eDocsGeneral.verifyAvailableDocument(type);
    }

    @Then("^I will verify \"([^\"]*)\" information and \"([^\"]*)\" action$")
    public void I_will_verify_information_and_action(String info, String action) throws Throwable {
        eDocsGeneral.verifyInformation(info, action);
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
