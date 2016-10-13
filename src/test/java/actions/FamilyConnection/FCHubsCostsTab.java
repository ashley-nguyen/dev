package actions.FamilyConnection;

import cucumber.api.java.en.Then;
import gherkin.lexer.Pa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.FamilyConnection.FCHubsCostsTabPage;
import stepDefs.Hooks;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 9/5/2016.
 */
public class FCHubsCostsTab {
    public static WebDriver driver;

    public static void VerifyStudentFacultyRatioStudiesCostsTopBar(String income, String avgTotalCost) {
        driver = Hooks.driver;
        Select incomeDropDown = new Select(driver.findElement(By.xpath("//span[contains(text(), 'Income')]" +
                "/following-sibling::select[1]")));
        incomeDropDown.selectByVisibleText(income);
        assertTrue("The Average Total Cost is not correct", driver.findElement(By.xpath("//span[contains(text(), " +
                "'Income')]/ancestor::div/div[contains(text(), '" + avgTotalCost + "')]")).isDisplayed());
    }

    public static void VerifyAidPercent(String aidPercent, String typeOfAid) {
        driver = Hooks.driver;
        Select typeOfAidDropDown = new Select(driver.findElement(By.xpath(" //span[contains(text(), 'Type of Aid')]" +
                "/following-sibling::select[1]")));
        typeOfAidDropDown.selectByVisibleText(typeOfAid);
        assertTrue("The Aid Percent is not correct", driver.findElement(By.xpath("//span[contains(text(), " +
                "'Type of Aid')]/ancestor::div/div[contains(text(), '" + aidPercent + "')]")).isDisplayed());
    }

    public static void VerifyTipicalMonthlyLoanPayment(String loanPayment) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        System.out.println("aqui " + FCHubsCostsTabPage.labelTypicalMonthlyLoanPayment.getText());
        assertTrue("The Typical Monthly Loan Payment number is not correct",
                FCHubsCostsTabPage.labelTypicalMonthlyLoanPayment.getText().equals(loanPayment));
    }

    public static void VerifyDateLabelsInCostsTopBar(String dateLabel, List<String> sections) {
        driver = Hooks.driver;
        boolean result = false;
        for (int i = 0; i < sections.size(); i++) {
            if (driver.findElement(
                    By.xpath("//div[text() = '" + sections.get(i) + "']/../div[text() = '" + dateLabel + "']")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The date label is not present or it displays incorrect data", result);
    }

    public static void VerifyAvgNetCostList(List<String> incomesAvgNetCost) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < incomesAvgNetCost.size(); i++) {
            String[] listElement = incomesAvgNetCost.get(i).split(";");
            if(driver.findElement(By.xpath("//div[@class = 'fc-grid__col fc-grid__col--xs-12 fc-grid__col--md-5']" +
                    "/div/div[contains(text(), '" + listElement[0] + "')]" +
                    "/following::div[1]")).getText().equals(listElement[1])) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The Average Net Cost for the income level is incorrect", result);
    }

    public static void VerifyInStateTuitionAndFees(String thisCollege, String averageNavianceColleges) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        boolean TuitionandFeeInStatevalueThisCollege = false;
        boolean TuitionandFeeInStateValueAverageNavianceCollege = false;
        boolean InStateTuitionAndFees = false;

        if (FCHubsCostsTabPage.InStateTuitionandFeeforThisCollege.getText().equals(thisCollege)) {
            TuitionandFeeInStatevalueThisCollege = true;
        }

        if (FCHubsCostsTabPage.OutofStateTuitionFeesForAverageNavianceColleges.getText().equals(averageNavianceColleges)) {
            TuitionandFeeInStateValueAverageNavianceCollege = true;
        }
        if (TuitionandFeeInStatevalueThisCollege == true && TuitionandFeeInStateValueAverageNavianceCollege == true)

        {
            InStateTuitionAndFees = true;
        }

            assertTrue(" In State Tuition and Fee for This College and Average Naviance College is not correct", InStateTuitionAndFees);
        }

    public static void VerifyOutStateTuitionAndFees(String outStateThisCollege, String outStateAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean TuitionandFeeOutStatevalueThisCollege = false;
        boolean TuitionandFeeOutStateValueAverageNavianceCollege = false;
        boolean OutStateTuitionaAndFees = false;

        if (FCHubsCostsTabPage.OutofStateInStateTuitionFeesForThisCollege.getText().equals(outStateThisCollege));
        {
            TuitionandFeeOutStatevalueThisCollege = true;

        }

        if (FCHubsCostsTabPage.OutofStateInStateTuitionFeesForAverageNavianceColleges.getText().equals(outStateAverageNavianceCollege))

        {
             TuitionandFeeOutStateValueAverageNavianceCollege = true;
        }
         if (TuitionandFeeOutStatevalueThisCollege == true && TuitionandFeeOutStateValueAverageNavianceCollege == true)
         {
               OutStateTuitionaAndFees = true;
         }
            assertTrue(" Out State Tuition Fee for this college and Average Naviance College is not correct", OutStateTuitionaAndFees);
    }

    public static void VerifyInStateTutionForThisColleg(String tuitionInStateThisCollege, String tutionInStateAverageNavianceCollege)
    {
        driver =  Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean Tuition_InStateThisCollege = false;
        boolean Tuition_InStateAverageNavianceCollege = false;
        boolean InStateTuition = false;

        if (FCHubsCostsTabPage.InStateTuitionandFeeforThisCollege.getText().equals(tuitionInStateThisCollege));
        {
            Tuition_InStateThisCollege = true;

        }
        if (FCHubsCostsTabPage.InStateTuitionAverageNavianceCollege.getText().equals(tutionInStateAverageNavianceCollege))
        {
            Tuition_InStateAverageNavianceCollege = true;
        }
        if (Tuition_InStateThisCollege == true && Tuition_InStateAverageNavianceCollege == true);
        {
            InStateTuition = true;
        }
        assertTrue("In State Tuition for This College and Average Naviance College is not correct", InStateTuition);
    }

    public static void VerifyOutStateTutionForAverageNavianceCollege(String tuitionOutStateThisCollege, String tuitionOutStateAverageNavianceCollege)
    {
         driver = Hooks.driver;
         PageFactory.initElements(driver,FCHubsCostsTabPage.class);
         boolean Tuition_OutStateThisCollege = false;
         boolean Tuition_OutStateAverageNavianceCollege = false;
         boolean OutStateTuition = false;

        if(FCHubsCostsTabPage.OutStateTuitionThisCollege.getText().equals(tuitionOutStateThisCollege))
        {
            Tuition_OutStateThisCollege = true;
        }

        if (FCHubsCostsTabPage.OutStateTuitionAverageNavianceCollege.getText().equals(tuitionOutStateAverageNavianceCollege))
        {
            Tuition_OutStateThisCollege = true;
        }

        if(Tuition_OutStateThisCollege == true && Tuition_OutStateAverageNavianceCollege == true )
        {
             OutStateTuition = true;
        }
        assertTrue("Out State Tuition for This College and Average Naviance College is not correct", OutStateTuition);
    }

    public static void VerifyInStateTotalFeesForThisCollege(String totalfeesinstateThisCollege, String totalfeesinstateAverageNavianceCollege) {

        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean TotalFees_InStateThisCollege = false;
        boolean TotalFees_InStateAverageNavianceCollege = false;
        boolean InStateTotalFees = false;

        if(FCHubsCostsTabPage.InStateTotalFeesforThisCollege.getText().equals(totalfeesinstateThisCollege))
        {
            TotalFees_InStateThisCollege = true;
        }
        if (FCHubsCostsTabPage.InStateTotalFeesAverageNavianceCollege.getText().equals(totalfeesinstateAverageNavianceCollege))
        {
            TotalFees_InStateAverageNavianceCollege = true;

        }
        if (TotalFees_InStateThisCollege == true && TotalFees_InStateAverageNavianceCollege == true)
        {
            InStateTotalFees = true;
        }
    }

    public static void verifyOutStateTotalFeesThisCollege(String totalfeesoutstateThisCollege, String totalfeesoutstateAverageNavianceCollege) {
        driver= Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean TotalFees_OutStateThisCollege = false;
        boolean TotalFees_OutStateAverageNavianceCollege = false;
        boolean OutStateTotalFees = false;

        if (FCHubsCostsTabPage.OutStateTotalFeesforThisCollege.getText().equals(totalfeesoutstateThisCollege))
        {
            TotalFees_OutStateThisCollege = true;
        }

        if (FCHubsCostsTabPage.OutStateTotalFeesforAverageNavianceCollege.getText().equals(totalfeesoutstateAverageNavianceCollege))
        {
            TotalFees_OutStateAverageNavianceCollege = true;
        }

        if (TotalFees_OutStateThisCollege == true && TotalFees_OutStateAverageNavianceCollege == true)
        {
            OutStateTotalFees = true;
        }
    }


    public static void VerifyTuitionPerCreditHour(String creditperhourThisCollege, String creditperhourAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean TuitionPerCreditHour_ThisCollege = false;
        boolean TuitionPerCreditHour_AverageNavianceCollege = false;
        boolean TuitionPerCreditHour = false;

        if (FCHubsCostsTabPage.TuitionPerCreditHourThisCollege.getText().equals(creditperhourThisCollege));
        {
            TuitionPerCreditHour_ThisCollege = true;
        }

        if (FCHubsCostsTabPage.TuitionPerCreditHourAverageNavianceCollege.getText().equals(creditperhourAverageNavianceCollege));
        {
            TuitionPerCreditHour_AverageNavianceCollege = true;
        }

        if(TuitionPerCreditHour_ThisCollege == true && TuitionPerCreditHour_AverageNavianceCollege == true)
        {
            TuitionPerCreditHour = true;
        }
    }

    public static void VerifyRoomAndBoard(String roomandboardThisCollege, String roomandboardAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        boolean RoomAndBoard_ThisCollege = false;
        boolean RoomAndBaord_AverageNavinaceCollege = false;
        boolean RoomAndBoard = false;

        if (FCHubsCostsTabPage.RoomAndBoardThisCollege.getText().equals(roomandboardThisCollege));
        {
            RoomAndBoard_ThisCollege = true;
        }

        if (FCHubsCostsTabPage.RoomAndBoardAverageNavianceCollege.getText().equals(roomandboardAverageNavianceCollege))
        {
            RoomAndBaord_AverageNavinaceCollege = true;
        }

        if (RoomAndBoard_ThisCollege == true && RoomAndBaord_AverageNavinaceCollege == true)
        {
            RoomAndBoard = true;
        }
    }
}
