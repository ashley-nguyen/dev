package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(FCHubsCostsTabPage.labelCostsTabAvgNetPrice));
        Select incomeDropDown = new Select(driver.findElement(By.cssSelector("select.costs-selector.ng-pristine" +
                ".ng-valid.ng-not-empty[ng-selected=\"vm.myProfileCost.cost\"]")));
        incomeDropDown.selectByVisibleText(income);
        assertTrue("The Average Total Cost is not correct", FCHubsCostsTabPage.labelCostsTabAvgNetPrice.getText()
                .equals(avgTotalCost));
    }

    public static void VerifyAidPercent(String aidPercent, String typeOfAid) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        Select typeOfAidDropDown = new Select(driver.findElement(By.cssSelector("select[ng-model=\"vm.typeOfAid\"]")));
        typeOfAidDropDown.selectByVisibleText(typeOfAid);
        assertTrue("The Aid Percent is not correct", FCHubsCostsTabPage.labelCostsTabRecGrantAid.getText()
                .equals(aidPercent));
    }

    public static void VerifyTipicalMonthlyLoanPayment(String loanPayment) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        assertTrue("The Typical Monthly Loan Payment number is not correct",
                FCHubsCostsTabPage.labelTypicalMonthlyLoanPayment.getText().equals(loanPayment));
    }

    public static void VerifyDateLabelsInCostsTopBar(List<String> sectionsAndDates) {
        driver = Hooks.driver;
        boolean result = false;
        WebElement dateElement = null;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        for (int i = 0; i < sectionsAndDates.size(); i++) {
            String [] sectionAndDateElement = sectionsAndDates.get(i).split(";");
            switch (sectionAndDateElement[0]) {
                case "Average Total Cost": dateElement = FCHubsCostsTabPage.labelAvgNetPriceDate;
                    break;
                case "% Receiving Grant Aid": dateElement = FCHubsCostsTabPage.labelRecGrantAidDate;
                    break;
                case "Typical Monthly Loan Payment": dateElement = FCHubsCostsTabPage.labelTypicalMonthlyLoanPaymentDate;
                    break;
            }
            if (dateElement.getText().equals(sectionAndDateElement[1])) {
                result = true;
            }
        }
        assertTrue("The date label is not present or it displays incorrect data", result);
    }

    public static void VerifyAvgNetCostList(List<String> incomesAvgNetCost) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < incomesAvgNetCost.size(); i++) {
            String[] listElement = incomesAvgNetCost.get(i).split(";");
            if(driver.findElement(By.cssSelector(".fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-5 div.ng-scope" +
                    ":nth-of-type(" + (i + 2) + ") div.costs-summary__specs")).getText().equals(listElement[0])) {
                if (driver.findElement(By.cssSelector(".fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-5 div.ng-scope" +
                        ":nth-of-type(" + (i + 2) + ") div.costs-summary__specs + div")).getText().equals(listElement[1])) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        assertTrue("The Average Net Cost for the income level is incorrect", result);
    }

    public static void VerifyInStateTuitionAndFees(String thisCollege, String averageNavianceColleges) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        boolean tuitionAndFeesInStateValueThisCollege = false;
        boolean tuitionAndFeesInStateValueAverageNavianceCollege = false;
        boolean inStateTuitionAndFees = false;

        if (FCHubsCostsTabPage.InStateTuitionandFeeforThisCollege.getText().equals(thisCollege)) {
            tuitionAndFeesInStateValueThisCollege = true;
        }

        if (FCHubsCostsTabPage.InStateTuitionFeesForAverageNavianceColleges.getText().equals(averageNavianceColleges)) {
            tuitionAndFeesInStateValueAverageNavianceCollege = true;
        }

        if (tuitionAndFeesInStateValueThisCollege && tuitionAndFeesInStateValueAverageNavianceCollege) {
            inStateTuitionAndFees = true;
        }

        assertTrue(" In State Tuition and Fee for This College and Average Naviance College is not correct",
                inStateTuitionAndFees);
    }

    public static void VerifyOutStateTuitionAndFees(String outStateThisCollege, String outStateAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean tuitionAndFeesOutStateValueThisCollege = false;
        boolean tuitionAndFeesOutStateValueAverageNavianceCollege = false;
        boolean outStateTuitionaAndFees = false;

        if (FCHubsCostsTabPage.OutofStateInStateTuitionFeesForThisCollege.getText().equals(outStateThisCollege)) {
            tuitionAndFeesOutStateValueThisCollege = true;
        }

        if (FCHubsCostsTabPage.OutofStateInStateTuitionFeesForAverageNavianceColleges.getText()
                .equals(outStateAverageNavianceCollege)) {
            tuitionAndFeesOutStateValueAverageNavianceCollege = true;
        }

        if (tuitionAndFeesOutStateValueThisCollege && tuitionAndFeesOutStateValueAverageNavianceCollege) {
            outStateTuitionaAndFees = true;
        }
        assertTrue(" Out State Tuition Fee for this college and Average Naviance College is not correct",
                outStateTuitionaAndFees);
    }


    public static void VerifyTuitionPerCreditHour(String creditperhourThisCollege, String creditperhourAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        boolean TuitionPerCreditHour_ThisCollege = false;
        boolean TuitionPerCreditHour_AverageNavianceCollege = false;
        boolean TuitionPerCreditHour = false;

        if (FCHubsCostsTabPage.TuitionPerCreditHourThisCollege.getText().equals(creditperhourThisCollege)) {
            TuitionPerCreditHour_ThisCollege = true;
        }

        if (FCHubsCostsTabPage.TuitionPerCreditHourAverageNavianceCollege.getText()
                .equals(creditperhourAverageNavianceCollege)) {
            TuitionPerCreditHour_AverageNavianceCollege = true;
        }

        if(TuitionPerCreditHour_ThisCollege && TuitionPerCreditHour_AverageNavianceCollege) {
            TuitionPerCreditHour = true;
        }
        assertTrue("The tuition per credit hour is not correct", TuitionPerCreditHour);
    }

    public static void VerifyRoomAndBoard(String roomandboardThisCollege, String roomandboardAverageNavianceCollege) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        boolean RoomAndBoard_ThisCollege = false;
        boolean RoomAndBaord_AverageNavinaceCollege = false;
        boolean RoomAndBoard = false;

        if (FCHubsCostsTabPage.RoomAndBoardThisCollege.getText().equals(roomandboardThisCollege)) {
            RoomAndBoard_ThisCollege = true;
        }

        if (FCHubsCostsTabPage.RoomAndBoardAverageNavianceCollege.getText().equals(roomandboardAverageNavianceCollege)) {
            RoomAndBaord_AverageNavinaceCollege = true;
        }

        if (RoomAndBoard_ThisCollege && RoomAndBaord_AverageNavinaceCollege)
        {
            RoomAndBoard = true;
        }
        assertTrue("The Room and Board fees are not correct", RoomAndBoard);
    }

    public static void ClickTuition() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.Tuition.click();
    }

    public static void ClickTotalFees() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.TotalFees.click();
    }

    public static void ClickTuitionPerCreditHour() {
        driver = Hooks.driver;
        PageFactory.initElements(driver,FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.TuitionPerCreditHour.click();
    }

    public static void ClickRoomAndBoard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        FCHubsCostsTabPage.RoomAndBoard.click();
    }
}
