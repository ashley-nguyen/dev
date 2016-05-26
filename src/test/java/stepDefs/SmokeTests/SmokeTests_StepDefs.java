package stepDefs.SmokeTests;

import actions.District.DistrictNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by csackrider on 11/6/2015.
 */
public class SmokeTests_StepDefs {

    public static WebDriver driver;

    @When("^I go to Naviance District Administration$")
    public void I_go_to_Naviance_District_Administration() throws Throwable {

        DistrictNav.goToDistrictAdministration();

    }

    @When("^I edit my profile$")
    public void I_edit_my_profile(DataTable MyAccount) throws Throwable {

        //go to my account
        DistrictNav.goToAdminFunction("My Account");
        //click edit profile
        DistrictNav.editProfile(MyAccount);

    }
}
