package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsAdmissionsTab;
import actions.FamilyConnection.FCHubsStudentLifeTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 8/01/2016.
 */
public class FCHubsStudentLifeTab_StepDefs {
    public static WebDriver driver;

    @Then("^The School Size should be \"([^\"]*)\"$")
    public void The_School_Size_should_be(String schoolSize) throws Throwable {
        FCHubsStudentLifeTab.VerifySchoolSize(schoolSize);
    }

    @Then("^The \"([^\"]*)\" number is \"([^\"]*)\" in School Size$")
    public void The_number_is_in_School_Size(String sectionName, String number) throws Throwable {
        FCHubsStudentLifeTab.VerifySchoolSizeDetail(sectionName, number);
    }

    @Then("^The \"([^\"]*)\" should be \"([^\"]*)\" in Student Life Top Bar$")
    public void The_should_be_in_Student_Life_Top_Bar(String sectionName, String value) throws Throwable {
        FCHubsStudentLifeTab.VerifyStudentLifeTopBarValues(sectionName, value);
    }
}