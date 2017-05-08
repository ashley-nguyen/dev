package stepDefs.Curriculum;

import actions.Curriculum.OpenCurriculum;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

/**
 * Created by nipamsharma on 5/5/17.
 */
public class OpenCurriculumStepDef {


    OpenCurriculum opencurriculumsteps;


    @Given("^I am on Naviance Home Page$")
    public void i_am_on_Naviance_Home_Page() throws Throwable {

        throw new PendingException();

        //opencurriculumsteps.is_the_home_page();
    }

    @When("^I click on Curriculum link$")
    public void i_click_on_Curriculum_link() throws Throwable {

        throw new PendingException();

        //opencurriculumsteps.navigate_to_curriculum();
    }

    @Then("^I should navigate to Curriculum page$")
    public void i_should_navigate_to_Curriculum_page() throws Throwable {


        throw new PendingException();

        //opencurriculumsteps.check_header_content();
    }
}
