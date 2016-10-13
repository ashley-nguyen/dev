package stepDefs.ManageRolesAndRights;

import actions.ManageRolesAndRights.ManageRolesAndRights;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static actions.Setup.SSO.GoToSetup;

/**
 * Created by Frank Sejas on 08/02/2016.
 */
public class ManageRolesAndRights_StepDefs {

    public static WebDriver driver;

    @Given("^I go to Manage Roles and Rights$")
    public void I_go_to_manage_roles_and_rights() throws Throwable {
        GoToSetup();
        ManageRolesAndRights.ClickOnUserAdminLink();
        ManageRolesAndRights.ClickOnManageRolesAndRightsLink();
    }

    @When("^I configure permissions for teacher$")
    public void I_configure_permissions_for_teacher() throws Throwable {
        GoToSetup();
        ManageRolesAndRights.ClickOnUserAdminLink();
        ManageRolesAndRights.ClickOnManageRolesAndRightsLink();
        ManageRolesAndRights.ClickOnManageLink();
        ManageRolesAndRights.ClickOnModifyPermissionsLink();
        ManageRolesAndRights.CheckViewAllTeacherRecForms();
        ManageRolesAndRights.CheckPrepareMyTeacherRecForms();
        ManageRolesAndRights.ClickOnSubmitButton();
    }



    @When("^I click on manage link$")
    public void I_click_on_manage_link() throws Throwable {
        ManageRolesAndRights.ClickOnManageLink();
    }

    @When("^I click on Modify Permissions link$")
    public void I_click_on_modify_permissions_link() throws Throwable {
        ManageRolesAndRights.ClickOnModifyPermissionsLink();
    }

    @When("^I check View all Teacher rec. forms$")
    public void I_check_view_all_teacher_rec_forms() throws Throwable {
        ManageRolesAndRights.CheckViewAllTeacherRecForms();
    }


    @When("^I check Prepare my teacher rec. forms$")
    public void I_check_prepare_my_teacher_rec_forms() throws Throwable {
        ManageRolesAndRights.CheckPrepareMyTeacherRecForms();
    }


    @When("^I click on Submit button$")
    public void I_click_on_submit_button() throws Throwable {
        ManageRolesAndRights.ClickOnSubmitButton();
    }

    @When("^I move to Teacher Documents$")
    public void I_move_to_teacher_documents() throws Throwable {
        GoToSetup();
        ManageRolesAndRights.ClickOnUserAdminLink();
        ManageRolesAndRights.ClickOnManageRolesAndRightsLink();
        ManageRolesAndRights.ClickOnManageLink();
        ManageRolesAndRights.ClickOnModifyPermissionsLink();
        ManageRolesAndRights.CheckViewAllTeacherRecForms();
        ManageRolesAndRights.CheckPrepareMyTeacherRecForms();
        ManageRolesAndRights.ClickOnSubmitButton();
    }

    @When("^I verify that Confirmation \"(.*)\" message is displayed$")
    public void I_verify_that_confirmation_is_displayed(String message) throws Throwable {
        ManageRolesAndRights.VerifyConfirmationMessage(message);
    }


}
