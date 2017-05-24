package stepDefs.Curriculum;

import actions.Curriculum.OpenCurriculum;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by nipamsharma on 5/5/17.
 */
public class OpenCurriculumStepDef {


    @When("^I am on Naviance Home Page$")
    public void i_am_on_Naviance_Home_Page() throws Throwable {

        //throw new PendingException();
        System.out.println("Start Test");
        OpenCurriculum.is_the_home_page();
    }


    @Then("^I should navigate to Curriculum page$")
    public void i_should_navigate_to_Curriculum_page() throws Throwable {


        OpenCurriculum.navigate_to_curriculum();
        OpenCurriculum.check_header_content();


    }
}
