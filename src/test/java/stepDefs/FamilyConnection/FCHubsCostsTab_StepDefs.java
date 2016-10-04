package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCGoogleMaps;
import actions.FamilyConnection.FCHubs;
import actions.FamilyConnection.FCHubsCostsTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

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
}

