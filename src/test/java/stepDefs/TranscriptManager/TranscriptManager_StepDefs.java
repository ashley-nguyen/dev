package stepDefs.TranscriptManager;

import actions.TranscriptManager.TranscriptManager_Action;
import actions.TranscriptManager.TranscriptManager_Verify;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManager_StepDefs {

    @When("^I go to Transcript Manager$")
    public void i_go_to_application_manager() throws Throwable {

        TranscriptManager_Action.NavigateToTranscriptManager();
    }

    @Then("^I will see data in Transcript Manager selecting \"(.*)\"")
    public void i_will_see_data_in_transcript_manager(String item) throws Throwable {
        TranscriptManager_Verify.verifyTranscriptManager();
        TranscriptManager_Verify.SelectRequestForm(item);
        TranscriptManager_Verify.verifyStudentTranscriptManager();
        TranscriptManager_Verify.SelectStudentRequestForm(item);
    }
}