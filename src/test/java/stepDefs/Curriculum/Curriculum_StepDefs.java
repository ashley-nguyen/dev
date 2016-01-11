package stepDefs.Curriculum;

import actions.Curriculum.Curriculum_Action;
import actions.Curriculum.Curriculum_Verify;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by csackrider on 12/10/2015.
 */
public class Curriculum_StepDefs {
    @When("^I SSO into Curriculum as a counselor$")
    public void I_SSO_into_Curriculum_as_a_counselor() throws Throwable {
        Curriculum_Action.SSOtocurriculum();
    }

    @Then("^I will see the Scope and Sequence page$")
    public void iWillSeeTheScopeAndSequencePage() throws Throwable {
        Curriculum_Verify.verifycurriculumhomepage("SCOPE AND SEQUENCE");

    }
}
