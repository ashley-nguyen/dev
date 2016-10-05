package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCGoogleMaps;
import actions.FamilyConnection.FCHubs;
import actions.FamilyConnection.FCHubsCostsTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCHubsCostsTabPage;
import stepDefs.Hooks;

import java.util.List;

/**
 * Created by jorgemaguina on 9/5/2016.
 */
public class FCHubsCostsTab_StepDefs {
    public static WebDriver driver;

    @Then("^Average Total Cost should be \"([^\"]*)\" when the income is \"([^\"]*)\" in Costs Top Bar$")
    public void Average_Total_Cost_should_be_when_the_income_is_in_Costs_Top_Bar(String avgTotalCost, String income) throws Throwable {
        FCHubsCostsTab.VerifyStudentFacultyRatioStudiesCostsTopBar(income, avgTotalCost);
    }

    @Then("^% Aid should be \"([^\"]*)\" when the Type of Aid is \"([^\"]*)\"$")
    public void Aid_should_be_when_the_Type_Of_Aid_is(String aidPercent, String typeOfAid) throws Throwable {
        FCHubsCostsTab.VerifyAidPercent(aidPercent, typeOfAid);
    }

    @Then("^Typical Monthly Loan Payment is \"([^\"]*)\" in the Costs top bar$")
    public void Typical_Monthly_Loan_Payment_is_in_the_Costs_top_bar(String loanPayment) throws Throwable {
        FCHubsCostsTab.VerifyTipicalMonthlyLoanPayment(loanPayment);
    }

    @Then("^The text \"([^\"]*)\" should be displayed under the following sections in Costs Top Bar:$")
    public void The_text_should_be_displayed_under_the_following_sections_in_Costs_Top_Bar(String dateLabel, List<String> sections) throws Throwable {
        FCHubsCostsTab.VerifyDateLabelsInCostsTopBar(dateLabel, sections);
    }

    @Then("^The following Average Net Cost values should be correct for each income level:$")
    public void The_following_Average_Net_Cost_values_should_be_correct_for_each_income_level(List<String> incomesAvgNetCost) throws Throwable {
        FCHubsCostsTab.VerifyAvgNetCostList(incomesAvgNetCost);
    }

    @Then("^Tuition and Fee for this college is \"([^\"]*)\" And AverageNavianceColleges is \"([^\"]*)\"  displayed$")
    public void tuitionAndFee_For_ThisCollegeIs_And_AverageNavianceColleges_Is_Displayed(String thisCollege, String averageNavianceColleges) throws Throwable {
        FCHubsCostsTab.VerifyInStateTuitionAndFees(thisCollege,averageNavianceColleges);

    }


    @Then("^Out of State Tuition and Fee for ThisCollege \"([^\"]*)\" and AverageNavianceColleges \"([^\"]*)\" is displayed$")
    public void outOfState_TuitionAndFee_For_ThisCollegeis_And_AverageNavianceColleges_Is_Displayed(String outStateThisCollege, String outStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyOutStateTuitionAndFees(outStateThisCollege,outStateAverageNavianceCollege);

    }

    @When("^Click on link Tuition$")
    public void clickOnLinkTuition() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.Tuition.click();
    }

    @Then("^Display In-State tuition for This College \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_InState_Tuition_For_ThisCollege_And_AverageNavianceColleges_Is(String tuitionInStateThisCollege, String tutionInStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyInStateTutionForThisColleg(tuitionInStateThisCollege, tutionInStateAverageNavianceCollege);
    }

    @Then("^Display Out of state tuition for ThisCollege \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_OutOfState_Tuition_For_ThisCollege_And_AverageNavianceColleges_Is(String tuitionOutStateThisCollege, String tuitionOutStateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyOutStateTutionForAverageNavianceCollege(tuitionOutStateThisCollege,tuitionOutStateAverageNavianceCollege);

    }

    @When("^Click on link Total Fees$")
    public void clickOnLinkTotalFees() throws Throwable {
          driver = Hooks.driver;
          PageFactory.initElements(driver, FCHubsCostsTabPage.class);
          FCHubsCostsTabPage.TotalFees.click();
    }

    @Then("^Display In state Total Fee for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_InState_TotalFee_For_ThisCollegeIs_And_AverageNavianceCollegesIs(String totalfeesinstateThisCollege, String totalfeesinstateAverageNavianceCollege) throws Throwable {
     FCHubsCostsTab.VerifyInStateTotalFeesForThisCollege(totalfeesinstateThisCollege,totalfeesinstateAverageNavianceCollege);

    }


    @Then("^Display Out of State Total Fees for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_OutOfState_TotalFees_ForThisCollegeIs_And_AverageNavianceCollegesIs(String totalfeesoutstateThisCollege, String totalfeesoutstateAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.verifyOutStateTotalFeesThisCollege(totalfeesoutstateThisCollege,totalfeesoutstateAverageNavianceCollege);
    }

    @When("^Click on link Tuition Per Credit Hour$")
    public void clickOnLinkTuitionPerCreditHour() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.TuitionPerCreditHour.click();

    }


    @Then("^Display Tuition Per Credit Hour for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges is \"([^\"]*)\"$")
    public void display_TuitionPerCreditHour_ForThisCollegeIs_And_AverageNavianceCollegesIs(String creditperhourThisCollege, String creditperhourAverageNavianceCollege) throws Throwable {
        FCHubsCostsTab.VerifyTuitionPerCreditHour(creditperhourThisCollege,creditperhourAverageNavianceCollege);
    }

    @When("^Click on link Room and Board$")
    public void clickOnLinkRoomAndBoard() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.RoomAndBoard.click();
    }

    @Then("^Display Room and Board Amount for ThisCollege is \"([^\"]*)\" and AverageNavianceColleges \"([^\"]*)\"$")
    public void display_RoomAndBoardAmount_ForThisCollegeIs_And_AverageNavianceColleges(String roomandboardThisCollege, String roomandboardAverageNavianceCollege) throws Throwable {
       FCHubsCostsTab.VerifyRoomAndBoard(roomandboardThisCollege,roomandboardAverageNavianceCollege);
    }
}

