package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsAdmissionsTab;
import actions.FamilyConnection.FCHubsBottomStickyBar;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsBottomStickyBar_StepDefs {
    public static WebDriver driver;
    @When("^I take note of the number in the \"([^\"]*)\" button$")
    public void I_take_note_of_the_number_in_the_button(String buttonLabel) throws Throwable {
        FCHubsBottomStickyBar.saveValueFromButtonStickyBar(buttonLabel);
    }

    @And("^I open the \"([^\"]*)\" list using the corresponding button in the bottom sticky bar$")
    public void I_open_the_list_using_the_corresponding_button_in_the_bottom_sticky_bar(String buttonName) throws Throwable {
        FCHubsBottomStickyBar.clickStickyBarButton(buttonName);
    }

    @Then("^The number of colleges in \"([^\"]*)\" list should equal the number in the button in the Bottom Sticky Bar$")
    public void the_number_of_colleges_in_list_should_equal_the_number_in_the_button_in_the_Bottom_Sticky_Bar(String listName) throws Throwable {
        FCHubsBottomStickyBar.verifyListFromStickyBar(listName);
    }
}