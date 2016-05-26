package stepDefs.Curriculum;

import actions.Curriculum.Curriculum;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by csackrider on 12/10/2015.
 */
public class Curriculum_StepDefs {
    @When("^I SSO into Curriculum as a counselor$")
    public void I_SSO_into_Curriculum_as_a_counselor() throws Throwable {
        Curriculum.SSOtocurriculum();
    }

    @Then("^I will see the Scope and Sequence page$")
    public void iWillSeeTheScopeAndSequencePage() throws Throwable {
        Curriculum.verifycurriculumhomepage("SCOPE AND SEQUENCE");
    }

    @Then("I click the Students dropdown$")
    public void iclickthestudentsdropdown() throws Throwable {
        Curriculum.studentsdropdown();

    }

    @When("In the Students dropdown I click Classes$")
    public void inthestudentsdropdowniclickclasses() throws Throwable {
        Curriculum.navtoclasses();

    }


    @Then("^I will see the Classes page$")
    public void iwillseetheclassespage() throws Throwable {
        Curriculum.verifyclassespage("+ Add Class");
    }

    @Then("^I will see the Activity page$")
    public void iwillseetheactivitypage() throws Throwable {
        Curriculum.verifyactivitypage("View Plans");
    }

    @And("^In the Students dropdown I click Activity$")
    public void iclickactivity() throws Throwable {
        Curriculum.navtoactivity();
    }

    @When("In the students dropdown I click Progress$")
    public void inthestudentsdropdowniclickprogress() throws Throwable {
        Curriculum.navtoprogress();

    }

    @Then("^I will see the Progress page$")
    public void iwillseetheprogresspage() throws Throwable {
        Curriculum.verifyprogresspage("spacious");

    }

    @When("I click the Explore Themes button")
    public void IClickExploreThemes() throws Throwable {
        Curriculum.NavToThemes();
    }

    @Then("^I will see the Our Themes page$")
    public void ISeeOurThemes() throws Throwable {
        Curriculum.VerifyOurThemesPage("Explore Self Discovery");
    }

    @Given("I Navigate to the Scope and Sequence page$")
    public void inavtoscopeandsequence() throws Throwable {
        Curriculum.NavToScopeAndSequence();
    }

    @When("I select 6th grade lesson sequence")
    public void ISelect6thGrade() throws Throwable {
        Curriculum.SixthGrade();
    }

    @And("Click go to level")
    public void ClickGoToLevel() throws Throwable {
        Curriculum.ClickGoToLevel();

    }

    @Then("I will see the 6th grade lesson sequence")
    public void VerifyGrade6() throws Throwable {
        Curriculum.VerifyGrade6("Grade 6");

    }

    @When("I select 7th grade lesson sequence")
    public void ISelect7thGrade() throws Throwable {
        Curriculum.SeventhGrade();
    }

    @Then("I will see the 7th grade lesson sequence")
    public void VerifyGrade7() throws Throwable {
        Curriculum.VerifyGrade7("Grade 7");

    }

    @When("I select 8th grade lesson sequence")
    public void ISelect8thGrade() throws Throwable {
        Curriculum.EigthGrade();
    }

    @Then("I will see the 8th grade lesson sequence")
    public void VerifyGrade8() throws Throwable {
        Curriculum.VerifyGrade8("Grade 8");
    }

    @When("I select 9th grade lesson sequence")
    public void ISelect9thGrade() throws Throwable {
        Curriculum.NinthGrade();
    }
    @Then("I will see the 9th grade lesson sequence")
    public void VerifyGrade9() throws Throwable {
        Curriculum.VerifyGrade9("Grade 9");
    }
    @When("I select 10th grade lesson sequence")
    public void ISelect10thGrade() throws Throwable {
        Curriculum.TenthGrade();
    }
    @Then("I will see the 10th grade lesson sequence")
    public void VerifyGrade10() throws Throwable {
        Curriculum.VerifyGrade10("Grade 10");

    }

    @When("I select 11th grade lesson sequence")
    public void ISelect11thGrade() throws Throwable {
        Curriculum.EleventhGrade();
    }
    @Then("I will see the 11th grade lesson sequence")
    public void VerifyGrade11() throws Throwable {
        Curriculum.VerifyGrade11("Grade 11");
    }
    @When("I select 12th grade lesson sequence")
    public void ISelect12thGrade() throws Throwable {
        Curriculum.TwelfthGrade();
    }
    @Then("I will see the 12th grade lesson sequence")
    public void VerifyGrade12() throws Throwable {
        Curriculum.VerifyGrade12("Grade 12");
    }

    @When("I select Self Discovery theme")
    public void SelectSelfDiscovery() throws Throwable {
        Curriculum.ClickSelfDiscovery();
    }

    @Then("I will see the Self Discovery lessons")
    public void VerifySelfDiscovery() throws Throwable {
        Curriculum.VerifySelfDiscovery("Self Discovery");
    }
    @When("I select Success Skills theme")
    public void SelectSuccessSkills() throws Throwable {
        Curriculum.ClickSuccessSkills();
    }

    @Then("I will see the Success Skills lessons")
    public void VerifySuccessSkills() throws Throwable {
        Curriculum.VerifySuccessSkills("Success Skills");
    }
    @When("I select Support Networks theme")
    public void SelectSupportNetworks() throws Throwable {
        Curriculum.ClickSupportNetworks();

    }
    @Then("I will see the Support Networks lessons")
    public void VerifySupportNetworks() throws Throwable {
        Curriculum.VerifySupportNetworks("Support Network");
    }
    @When("I select College Planning theme")
    public void SelectCollegePlanning() throws Throwable {
        Curriculum.ClickCollegePlanning();
    }
    @Then("I will see the College Planning lessons")
    public void VerifyCollegePlanning() throws Throwable {
        Curriculum.VerifyCollegePlanning("College Planning");
    }
    @When("I select Career Planning theme")
    public void SelectCareerPlanning() throws Throwable {
        Curriculum.ClickCareerPlanning();
    }
    @Then("I will see the Career Planning lessons")
    public void VerifyCareerPlanning() throws Throwable {
        Curriculum.VerifyCareerPlanning("Career Planning");
    }

    @When("I select Financial Planning theme")
    public void SelectFinancialPlanning() throws Throwable {
        Curriculum.ClickFinancialPlanning();
    }

    @Then("I will see the Financial Planning lessons")
    public void VerifyFinancialPlanning() throws Throwable {
        Curriculum.VerifyFinancialPlanning("Financial Planning");
    }


}
