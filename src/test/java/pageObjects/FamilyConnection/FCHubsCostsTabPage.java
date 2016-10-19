package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/15/2016.
 */
public class FCHubsCostsTabPage extends BaseClass {
    @FindBy(how = How.ID, using = "cost-module")
    public static WebElement costModuleLabel;
    @FindBy(how = How.CSS, using = "div [ng-if=\"vm.tuition.gradsMonthlyLoanAmountPaid\"] " +
            "div.hub-data-pod--money.hub-data-pod--overview.ng-binding")
    public static WebElement labelTypicalMonthlyLoanPayment;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--lime.ng-binding")
    public static WebElement InStateTuitionandFeeforThisCollege;
    @FindBy(how = How.CSS, using = "div.fc-grid__col.fc-grid__col--xs-12.costs-tuition-graph.ng-scope div:nth-child(2) " +
            "div.costs-tuition-graph__bar__top span")
    public static WebElement OutofStateTuitionFeesForAverageNavianceColleges;
    @FindBy(how = How.CSS, using = ".costs-tuition-graph__costlabel.costs-tuition-graph__costlabel--sky.ng-binding")
    public static WebElement OutofStateInStateTuitionFeesForThisCollege;
    @FindBy(how = How.CSS, using = "div.fc-grid__col.fc-grid__col--xs-12.costs-tuition-graph.ng-scope " +
            "div:nth-child(4) div.costs-tuition-graph__bar__top span")
    public static WebElement OutofStateInStateTuitionFeesForAverageNavianceColleges;
    @FindBy(how = How.CSS, using = ".fc-grid__row.costs-tuition-button.fc-button[ng-class=" +
            "\"{'costs-tuition-button--active': vm.showTuition }\"]")
    public static WebElement Tuition;
    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$16,456']")
    public static WebElement InStateTuitionAverageNavianceCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[@class='costs-tuition-graph__" +
            "costlabel costs-tuition-graph__costlabel--sky ng-binding']")
    public static WebElement OutStateTuitionThisCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$18,834']")
    public static WebElement OutStateTuitionAverageNavianceCollege;

    @FindBy(how = How.XPATH, using = "//ul[@class = 'costs-tuition__buttonGroup']/li[4]")
    public static WebElement TotalFees;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[@class='costs-tuition-graph__" +
            "costlabel costs-tuition-graph__costlabel--lime ng-binding']")
    public static WebElement InStateTotalFeesforThisCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$8,095']")
    public static WebElement InStateTotalFeesAverageNavianceCollege;


    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[@class='costs-tuition-graph__" +
            "costlabel costs-tuition-graph__costlabel--sky ng-binding']")
    public static WebElement OutStateTotalFeesforThisCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$8,140']")
    public static WebElement OutStateTotalFeesforAverageNavianceCollege;

    @FindBy(how = How.XPATH, using = "//ul[@class = 'costs-tuition__buttonGroup']/li[5]")
    public static WebElement TuitionPerCreditHour;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[@class='costs-tuition-graph__" +
            "costlabel costs-tuition-graph__costlabel--lime ng-binding']")
    public static WebElement TuitionPerCreditHourThisCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$615']")
    public static WebElement TuitionPerCreditHourAverageNavianceCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[@class='costs-tuition-graph__" +
            "costlabel costs-tuition-graph__costlabel--lime ng-binding']")
    public static WebElement RoomAndBoardThisCollege;

    @FindBy(how = How.XPATH, using = "//div[@class='costs-tuition-graph__bar__top']/span[text()='$8,864']")
    public static WebElement RoomAndBoardAverageNavianceCollege;

    @FindBy(how = How.XPATH, using = "//ul[@class = 'costs-tuition__buttonGroup']/li[3]")
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


    public FCHubsCostsTabPage(WebDriver driver) { super(driver);    }



}



