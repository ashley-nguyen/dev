package stepDefs.Reports;

import actions.Reports.Reports;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by franksejas on 1/13/2016.
 */
public class Reports_StepDefs {

    @When("^I go to the Reports$")
    public void i_go_to_reports() throws Throwable {
        Reports.NavigateToReports();
        Reports.ClickOnCustomizeLink();
        Reports.ClickOnViewReportButton();
    }

    @Then("^I verify report page$")
    public void i_see_a_fatal_error_in_the_page() throws Throwable {
        Reports.verifyReports();
    }

    @Then("^I verify usage report page$")
    public void i_verify_usage_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyUsageReports();
    }

    @Then("^I verify planning report page$")
    public void i_verify_planning_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyPlanningReports();
    }

    @Then("^I verify outcome report page$")
    public void i_verify_outcome_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyOutcomeReports();
    }

    @Then("^I verify scholarship report page$")
    public void i_verify_scholarship_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyScholarshipReports();
    }

    @Then("^I verify college report page$")
    public void i_verify_college_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyCollegeReports();
    }

    @Then("^I verify \"(.*)\" report page$")
    public void i_verify_reports(String report) throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyReports(report);
    }

    @Then("^I verify course \"(.*)\" report page$")
    public void i_verify_course_reports(String CourseReport) throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyCourseReporting(CourseReport);

    }

    @Then("^I verify scholarship \"(.*)\" report page$")
    public void i_verify_scholarship_reports(String ScholarshipReports) throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyScholarshipReporting(ScholarshipReports);

    }


    @Then("^I verify score report page$")
    public void i_verify_score_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyScoreReports();
    }

    @Then("^I verify course report page$")
    public void i_verify_course_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyCourseReports();
    }

    @Then("^I verify CTE report page$")
    public void i_verify_CTE_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyCTEReports();
    }

    @Then("^I verify planner report page$")
    public void i_verify_planner_report() throws Throwable {
        Reports.NavigateToReports();
        Reports.verifyPlannerReports();
    }
}