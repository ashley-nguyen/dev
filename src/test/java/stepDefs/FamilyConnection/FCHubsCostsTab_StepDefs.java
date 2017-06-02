package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCHubsCostsTab;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by jorgemaguina on 9/5/2016.
 */
public class FCHubsCostsTab_StepDefs {
    public static WebDriver driver;

    @Then("^Average Total Cost should correspond to the income in Costs Top Bar as follows:$")
    public void average_total_cost_should_correspond_to_the_income_in_costs_top_bar_as_follows
            (List<String> incomeAvgTotalCostList) throws Throwable {
        FCHubsCostsTab.VerifyStudentFacultyRatioStudiesCostsTopBar(incomeAvgTotalCostList);
    }

    @Then("^% Aid should correspond to the type of aid as follows:$")
    public void aid_should_correspond_to_the_type_of_aid_as_follows(List<String> aidList) throws Throwable {
        FCHubsCostsTab.VerifyAidPercent(aidList);
    }

    @Then("^Typical Monthly Loan Payment is \"([^\"]*)\" in the Costs top bar$")
    public void Typical_Monthly_Loan_Payment_is_in_the_Costs_top_bar(String loanPayment) throws Throwable {
        FCHubsCostsTab.VerifyTipicalMonthlyLoanPayment(loanPayment);
    }

    @Then("^The date text should be displayed under the following sections in Costs Top Bar:$")
    public void The_date_text_should_be_displayed_under_the_following_sections_in_Costs_Top_Bar(List<String> sections)
            throws Throwable {
        FCHubsCostsTab.VerifyDateLabelsInCostsTopBar(sections);
    }

    @Then("^The following Average Net Cost values should be correct for each income level:$")
    public void The_following_Average_Net_Cost_values_should_be_correct_for_each_income_level
            (List<String> incomesAvgNetCost) throws Throwable {
        FCHubsCostsTab.VerifyAvgNetCostList(incomesAvgNetCost);
    }

    @Then("^Tuition and Fee for this college is \"([^\"]*)\" And AverageNavianceColleges is \"([^\"]*)\"  displayed$")
    public void tuitionAndFee_For_ThisCollegeIs_And_AverageNavianceColleges_Is_Displayed
            (String thisCollege, String averageNavianceColleges) throws Throwable {
        FCHubsCostsTab.VerifyInStateTuitionAndFees(thisCollege,averageNavianceColleges);
    }

    @Then("^Out of State Tuition and Fee for ThisCollege \"([^\"]*)\" and AverageNavianceColleges \"([^\"]*)\" is displayed$")
    public void outOfState_TuitionAndFee_For_ThisCollegeis_And_AverageNavianceColleges_Is_Displayed
            (String outStateThisCollege, String outStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyOutStateTuitionAndFees(outStateThisCollege,outStateAverageNavianceCollege);
    }

    @When("^I open Tuition$")
    public void I_open_tuition() throws Throwable {
        FCHubsCostsTab.ClickTuition();
    }

    @Then("^Display In-State tuition for This College \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_InState_Tuition_For_ThisCollege_And_AverageNavianceColleges_Is
            (String tuitionInStateThisCollege, String tutionInStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyInStateTuitionAndFees(tuitionInStateThisCollege, tutionInStateAverageNavianceCollege);
    }

    @Then("^Display Out of state tuition for ThisCollege \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_OutOfState_Tuition_For_ThisCollege_And_AverageNavianceColleges_Is
            (String tuitionOutStateThisCollege, String tuitionOutStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyOutStateTuitionAndFees(tuitionOutStateThisCollege,tuitionOutStateAverageNavianceCollege);
    }

    @When("^I open Total Fees$")
    public void I_open_Total_Fees() throws Throwable {
        FCHubsCostsTab.ClickTotalFees();
    }

    @Then("^Display In state Total Fee for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_InState_TotalFee_For_ThisCollegeIs_And_AverageNavianceCollegesIs
            (String totalfeesinstateThisCollege, String totalfeesinstateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyInStateTuitionAndFees(totalfeesinstateThisCollege,totalfeesinstateAverageNavianceCollege);
    }

    @Then("^Display Out of State Total Fees for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_OutOfState_TotalFees_ForThisCollegeIs_And_AverageNavianceCollegesIs
            (String totalfeesoutstateThisCollege, String totalfeesoutstateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyOutStateTuitionAndFees(totalfeesoutstateThisCollege,totalfeesoutstateAverageNavianceCollege);
    }

    @When("^I open Tuition Per Credit Hour$")
    public void I_open_tuition_Per_Credit_Hour() throws Throwable {
        FCHubsCostsTab.ClickTuitionPerCreditHour();
    }

    @Then("^Display Tuition Per Credit Hour for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_TuitionPerCreditHour_ForThisCollegeIs_And_AverageNavianceCollegesIs
            (String creditperhourThisCollege, String creditperhourAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyTuitionPerCreditHour(creditperhourThisCollege,creditperhourAverageNavianceCollege);
    }

    @When("^I open Room and Board$")
    public void I_open_Room_and_Board() throws Throwable {
        FCHubsCostsTab.ClickRoomAndBoard();
    }

    @Then("^Display Room and Board Amount for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges \"([^\"]*)\"$")
    public void display_RoomAndBoardAmount_ForThisCollegeIs_And_AverageNavianceColleges
            (String roomandboardThisCollege, String roomandboardAverageNavianceCollege) throws Throwable {
       FCHubsCostsTab.VerifyRoomAndBoard(roomandboardThisCollege,roomandboardAverageNavianceCollege);
    }
}

