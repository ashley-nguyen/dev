package stepDefs.TranscriptManager;

import actions.TranscriptManager.TranscriptManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManager_StepDefs {

    @When("^I go to Transcript Manager$")
    public void i_go_to_application_manager() throws Throwable {

        TranscriptManager.NavigateToTranscriptManager();
    }

    @Then("^I will see data in Transcript Manager selecting (.*)")
    public void i_will_see_data_in_transcript_manager(String item) throws Throwable {
        TranscriptManager.verifyTranscriptManager();
        TranscriptManager.SelectRequestForm(item);
        TranscriptManager.verifyStudentTranscriptManager();
        TranscriptManager.SelectStudentRequestForm(item);
    }
}