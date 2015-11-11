package stepDefs.SmokeTests;

import org.openqa.selenium.WebDriver;

import actions.District.DistrictNavAction;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

/**
 * Created by csackrider on 11/6/2015.
 */
public class SmokeTests_StepDefs {

    public static WebDriver driver;

    @When("^I go to Naviance District Administration$")
    public void I_go_to_Naviance_District_Administration() throws Throwable {

        DistrictNavAction.goToDistrictAdministration();

    }

    @When("^I edit my profile$")
    public void I_edit_my_profile(DataTable MyAccount) throws Throwable {

        //go to district administration
        DistrictNavAction.goToDistrictAdministration();
        //go to my account
        DistrictNavAction.goToAdminFunction("My Account");
        //click edit profile
        DistrictNavAction.editProfile(MyAccount);

    }
}
