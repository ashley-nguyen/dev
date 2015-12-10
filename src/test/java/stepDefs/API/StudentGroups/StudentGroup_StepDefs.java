package stepDefs.API.StudentGroups;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by priya.chandra on 12/10/15.
 */
public class StudentGroup_StepDefs {
    @Given("^I am an authorized user$")
    public void iAmAnAuthorizedUser() throws Throwable {
    }

    @When("^I add group with the following required details:$")
    public void iAddGroupWithTheFollowingRequiredDetails() throws Throwable {
    }

    @Then("^the group will be created$")
    public void theGroupWillBeCreated() throws Throwable {
    }

    @When("^I add group with group name and no tenant id:$")
    public void iAddGroupWithGroupNameAndNoTenantId() throws Throwable {
    }

    @Then("^the group will not be created$")
    public void theGroupWillNotBeCreated() throws Throwable {
    }

    @When("^I add a group with tenant id and no group name:$")
    public void iAddAGroupWithTenantIdAndNoGroupName() throws Throwable {
    }

    @When("^I add a group with no group name and no tenant id:$")
    public void iAddAGroupWithNoGroupNameAndNoTenantId() throws Throwable {
    }

    @When("^I add a group with group name exceeding the max length and tenant id:$")
    public void iAddAGroupWithGroupNameExceedingTheMaxLengthAndTenantId() throws Throwable {
    }
}
