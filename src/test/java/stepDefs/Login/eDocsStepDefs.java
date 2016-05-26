package stepDefs.Login;

import actions.Student.Search.Search.Student_SearchAction;
import actions.eDocs.eDocsGeneral;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsStepDefs {
    @Given("^I am accessing the \"([^\"]*)\" edocs tab$")
    public void I_am_accessing_the_edocs_tab(String strStudentID) throws Throwable {
        Student_SearchAction.studentRosterSearch(strStudentID,"id");
        eDocsGeneral.NavtoEdocsStudentTab();
    }

    @Then("^I will see \"([^\"]*)\"$")
    public void I_will_see(String strtext) throws Throwable {
        eDocsGeneral.verifytext(strtext);
    }
}
