package stepDefs;




import actions.FamilyConnection.FCHubsInternationalWebLinksTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FamilyConnection.FCHubsInternationalWebLinksTabPage;

/**
 * Created by mbhangu on 5/1/2017.
 */
    public class FCHubs_InternationalWebLinks_StepDefs {
    @When("^I open International school 'Communicate' link Request Information$")
    public void I_open_Int_Communication_Link() throws Throwable {
        FCHubsInternationalWebLinksTab.ClickIntCommunicate();
        FCHubsInternationalWebLinksTab.IntRequestInformationLink();
    }

    @When("^I open International 'Learn More' link Admission Requirements$")
    public void i_Open_International_LearnMore_Link() throws Throwable {
        FCHubsInternationalWebLinksTab.ClickIntLearnMoreButton();
        FCHubsInternationalWebLinksTab.ClickIntLearnMoreAdmissionsLink();
    }

    @Then("^I should see the international URL for \"([^\"]*)\" open in new page$")
    public void i_Should_See_The_International_URL_For_Open_In_New_Page(String IntSite) throws Throwable {
       FCHubsInternationalWebLinksTab.VerifyAdmissionsRequirementsURLContainsText(IntSite);
    }
}
