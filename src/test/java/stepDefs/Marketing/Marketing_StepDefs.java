package stepDefs.Marketing;

import actions.Marketing.Marketing;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/15/2016.
 */
public class Marketing_StepDefs {

    @When("^I navigate to Naviance$")
    public void i_navigate_to() throws Throwable {

        Marketing.NavigateToUrl();
    }

    @When("^I logout$")
    public void i_logout() throws Throwable {

        Marketing.Logout();
    }

    @When("^I go to school site$")
    public void i_go_to_school_site() throws Throwable {

        Marketing.NavigateToSchool();
    }

    @When("^I see the image that is displayed in the login screen$")
    public void i_see_the_image_loaded() throws Throwable {

        Marketing.verifyImageInLogin();
    }

    @When("^I see the banner for marketplace$")
    public void i_see_the_banner_for_marketplace() throws Throwable {

        Marketing.verifyBanner();
    }

}