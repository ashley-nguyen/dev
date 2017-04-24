package pageObjects.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/15/2016.
 */
public class FCHubsCostsTabPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".costs-summary__statement-header.fc-grid__col.fc-grid__col--core-width h1")
    public static WebElement costModuleLabel;
    @FindBy(how = How.CSS, using = "div [ng-if=\"vm.tuition.gradsMonthlyLoanAmountPaid\"] " +
            "div.hub-data-pod--money.hub-data-pod--overview.ng-binding")
    public static WebElement labelTypicalMonthlyLoanPayment;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--lime.ng-binding")
    public static WebElement InStateTuitionandFeeforThisCollege;
    @FindBy(how = How.CSS, using = "div[ng-style=\"{'height': vm.getPercentTopInState(true)}\"] span")
    public static WebElement InStateTuitionFeesForAverageNavianceColleges;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--sky.ng-binding")
    public static WebElement OutofStateInStateTuitionFeesForThisCollegeInt;
    @FindBy(how = How.CSS, using = "div.fc-grid__col.costs-tuition-graph__column.costs-tuition-graph__column-inset" +
            ".costs-tuition-graph__bar.ng-scope span")
    public static WebElement OutofStateInStateTuitionFeesForAverageNavianceCollegesInt;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--sky.ng-binding")
    public static WebElement OutofStateInStateTuitionFeesForThisCollegeProd;
    @FindBy(how = How.CSS, using = "div.fc-grid__col.costs-tuition-graph_column.costs-tuition-graph_column-inset" +
            ".costs-tuition-graph__bar.ng-scope[ng-if=\"vm.displayOutOfStateData()\"] span")
    public static WebElement OutofStateInStateTuitionFeesForAverageNavianceCollegesProd;
    @FindBy(how = How.CSS, using = ".fc-grid__row.costs-tuition-button.fc-button[ng-class=" +
            "\"{'costs-tuition-button--active': vm.showTuition }\"]")
    public static WebElement Tuition;
    @FindBy(how = How.CSS, using = "li[ng-click=\"vm.displayFees()\"]")
    public static WebElement TotalFees;
    @FindBy(how = How.CSS, using = "li[ng-click=\"vm.displayTuitionPerHour()\"]")
    public static WebElement TuitionPerCreditHour;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--lime.ng-binding")
    public static WebElement TuitionPerCreditHourThisCollege;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--grey.ng-binding")
    public static WebElement TuitionPerCreditHourAverageNavianceCollege;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--lime.ng-binding")
    public static WebElement RoomAndBoardThisCollege;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--grey.ng-binding")
    public static WebElement RoomAndBoardAverageNavianceCollege;
    @FindBy(how = How.CSS, using = "li[ng-click=\"vm.displayRoomAndBoard()\"]")
    public static WebElement RoomAndBoard;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--xs-center.admissions div[ng-if=\"vm.averageNetPrices." +
            "length > 0\"] div.hub-data-pod--money.hub-data-pod--overview.ng-binding")
    public static WebElement labelCostsTabAvgNetPrice;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--xs-center.admissions div[ng-if=\"vm.typeOfAid\"] " +
            "div.hub-data-pod--percent")
    public static WebElement labelCostsTabRecGrantAid;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--xs-center.admissions div[ng-if=\"vm.averageNetPrices" +
            ".length > 0\"] div.hub-data-pod__data-age.ng-binding")
    public static WebElement labelAvgNetPriceDate;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--xs-center.admissions div[ng-if=\"vm.typeOfAid\"] " +
            "div.hub-data-pod__data-age")
    public static WebElement labelRecGrantAidDate;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--xs-center.admissions div[ng-if=\"vm.typeOfAid\"] " +
            "div.hub-data-pod__data-age")
    public static WebElement labelTypicalMonthlyLoanPaymentDate;

    public static String incomeDropDownString = "select.costs-selector.ng-pristine.ng-valid.ng-not-empty" +
            "[ng-selected=\"vm.myProfileCost.cost\"]";
    public static String aidDropDownString = "select[ng-model=\"vm.typeOfAid\"]";

    public FCHubsCostsTabPage(WebDriver driver) { super(driver);    }
}



