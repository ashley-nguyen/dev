package stepDefs.Curriculum;

import actions.Curriculum.Curriculum_Action;
import actions.Curriculum.Curriculum_Verify;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Curriculum.CurriculumPage;

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

    @Then("I click the Students dropdown$")
    public void iclickthestudentsdropdown() throws Throwable {
        Curriculum_Action.studentsdropdown();

    }

    @When("In the Students dropdown I click Classes$")
    public void inthestudentsdropdowniclickclasses() throws Throwable {
        Curriculum_Action.navtoclasses();

    }


    @Then("^I will see the Classes page$")
    public void iwillseetheclassespage() throws Throwable {
        Curriculum_Verify.verifyclassespage("+ Add Class");
    }

    @Then("^I will see the Activity page$")
    public void iwillseetheactivitypage() throws Throwable {
        Curriculum_Verify.verifyactivitypage("View Plans");
    }

    @And("^In the Students dropdown I click Activity$")
    public void iclickactivity() throws Throwable {
        Curriculum_Action.navtoactivity();
    }

    @When("In the students dropdown I click Progress$")
    public void inthestudentsdropdowniclickprogress() throws Throwable {
        Curriculum_Action.navtoprogress();

    }

    @Then("^I will see the Progress page$")
    public void iwillseetheprogresspage() throws Throwable {
        Curriculum_Verify.verifyprogresspage("spacious");

    }

    @When("I click the Explore Themes button")
    public void IClickExploreThemes() throws Throwable {
        Curriculum_Action.NavToThemes();
    }

    @Then("^I will see the Our Themes page$")
    public void ISeeOurThemes() throws Throwable {
        Curriculum_Verify.VerifyOurThemesPage("Explore Self Discovery");
    }

    @Given("I Navigate to the Scope and Sequence page$")
    public void inavtoscopeandsequence() throws Throwable {
        Curriculum_Action.NavToScopeAndSequence();
    }

    @When("I select 6th grade lesson sequence")
    public void ISelect6thGrade() throws Throwable {
        Curriculum_Action.SixthGrade();
    }

    @And("Click go to level")
    public void ClickGoToLevel() throws Throwable {
        Curriculum_Action.ClickGoToLevel();

    }

    @Then("I will see the 6th grade lesson sequence")
    public void VerifyGrade6() throws Throwable {
        Curriculum_Verify.VerifyGrade6("Grade 6");

    }

    @When("I select 7th grade lesson sequence")
    public void ISelect7thGrade() throws Throwable {
        Curriculum_Action.SeventhGrade();
    }

    @Then("I will see the 7th grade lesson sequence")
    public void VerifyGrade7() throws Throwable {
        Curriculum_Verify.VerifyGrade7("Grade 7");

    }

    @When("I select 8th grade lesson sequence")
    public void ISelect8thGrade() throws Throwable {
        Curriculum_Action.EigthGrade();
    }

    @Then("I will see the 8th grade lesson sequence")
    public void VerifyGrade8() throws Throwable {
        Curriculum_Verify.VerifyGrade8("Grade 8");
    }

    @When("I select 9th grade lesson sequence")
    public void ISelect9thGrade() throws Throwable {
        Curriculum_Action.NinthGrade();
    }
    @Then("I will see the 9th grade lesson sequence")
    public void VerifyGrade9() throws Throwable {
        Curriculum_Verify.VerifyGrade9("Grade 9");
    }
    @When("I select 10th grade lesson sequence")
    public void ISelect10thGrade() throws Throwable {
        Curriculum_Action.TenthGrade();
    }
    @Then("I will see the 10th grade lesson sequence")
    public void VerifyGrade10() throws Throwable {
        Curriculum_Verify.VerifyGrade10("Grade 10");

    }

    @When("I select 11th grade lesson sequence")
    public void ISelect11thGrade() throws Throwable {
        Curriculum_Action.EleventhGrade();
    }
    @Then("I will see the 11th grade lesson sequence")
    public void VerifyGrade11() throws Throwable {
        Curriculum_Verify.VerifyGrade11("Grade 11");
    }
    @When("I select 12th grade lesson sequence")
    public void ISelect12thGrade() throws Throwable {
        Curriculum_Action.TwelfthGrade();
    }
    @Then("I will see the 12th grade lesson sequence")
    public void VerifyGrade12() throws Throwable {
        Curriculum_Verify.VerifyGrade12("Grade 12");
    }

    @When("I select Self Discovery theme")
    public void SelectSelfDiscovery() throws Throwable {
        Curriculum_Action.ClickSelfDiscovery();
    }

    @Then("I will see the Self Discovery lessons")
    public void VerifySelfDiscovery() throws Throwable {
        Curriculum_Verify.VerifySelfDiscovery("Self Discovery");
    }
    @When("I select Success Skills theme")
    public void SelectSuccessSkills() throws Throwable {
        Curriculum_Action.ClickSuccessSkills();
    }

    @Then("I will see the Success Skills lessons")
    public void VerifySuccessSkills() throws Throwable {
        Curriculum_Verify.VerifySuccessSkills("Success Skills");
    }
    @When("I select Support Networks theme")
    public void SelectSupportNetworks() throws Throwable {
        Curriculum_Action.ClickSupportNetworks();

    }
    @Then("I will see the Support Networks lessons")
    public void VerifySupportNetworks() throws Throwable {
        Curriculum_Verify.VerifySupportNetworks("Support Network");
    }
    @When("I select College Planning theme")
    public void SelectCollegePlanning() throws Throwable {
        Curriculum_Action.ClickCollegePlanning();
    }
    @Then("I will see the College Planning lessons")
    public void VerifyCollegePlanning() throws Throwable {
        Curriculum_Verify.VerifyCollegePlanning("College Planning");
    }
    @When("I select Career Planning theme")
    public void SelectCareerPlanning() throws Throwable {
        Curriculum_Action.ClickCareerPlanning();
    }
    @Then("I will see the Career Planning lessons")
    public void VerifyCareerPlanning() throws Throwable {
        Curriculum_Verify.VerifyCareerPlanning("Career Planning");
    }

    @When("I select Financial Planning theme")
    public void SelectFinancialPlanning() throws Throwable {
        Curriculum_Action.ClickFinancialPlanning();
    }

    @Then("I will see the Financial Planning lessons")
    public void VerifyFinancialPlanning() throws Throwable {
        Curriculum_Verify.VerifyFinancialPlanning("Financial Planning");
    }


}
