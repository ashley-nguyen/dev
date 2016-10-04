package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsCostsTab;
import actions.FamilyConnection.FCHubsProfilesTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import java.util.List;

/**
 * Created by jorgemaguina on 9/6/2016.
 */
public class FCHubsProfilesTab_StepDefs {
    public static WebDriver driver;

    @When("^I click Read More in the Profile with name \"([^\"]*)\"$")
    public void I_click_Read_More_in_the_Profile_with_name(String profileName) throws Throwable {
        FCHubsProfilesTab.ClickReadMoreInStudentProfile(profileName);
    }

    @Then("^I should see the details of the profile$")
    public void I_should_see_the_details_of_the_profile() throws Throwable {
        FCHubsProfilesTab.VerifyStudentProfileDetails();
    }

    @And("^I click the x button in the profile$")
    public void I_click_the_x_button_in_the_profile() throws Throwable {
        FCHubsProfilesTab.ClickXButtonInProfile();
    }

    @Then("^The profile with name \"([^\"]*)\" should be collapsed$")
    public void The_profile_with_name_should_be_collapsed(String profileName) throws Throwable {
        FCHubsProfilesTab.VerifyStudentProfileDetailsCollapsed(profileName);
    }
}

