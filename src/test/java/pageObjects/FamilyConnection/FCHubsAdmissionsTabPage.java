package pageObjects.FamilyConnection;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

import java.util.List;

/**
 * Created by jorgemaguina on 7/27/2016.
 */
public class FCHubsAdmissionsTabPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".admissions-overview.fc-grid__row.fc-grid__row--xs-center div div div " +
            "div.hub-deadline__month.ng-binding")
    public static WebElement labelMonthRegDecisionDeadline;
    @FindBy(how = How.CSS, using = ".admissions-overview.fc-grid__row.fc-grid__row--xs-center div div div " +
            "div.hub-deadline__day.ng-binding")
    public static WebElement labelDayRegDecisionDeadline;
    @FindBy(how = How.CSS, using = ".hub-data-pod--meter-value.hub-data-pod--meter-value--percent.ng-binding")
    public static WebElement labelAcceptanceRate;
    @FindBy(how = How.CSS, using = ".hub-data-pod--money.hub-data-pod--admissions.ng-binding")
    public static WebElement labelApplicationFees;
    @FindBy(how = How.CSS, using = ".fc-button.fc-button--twilight.ng-binding.ng-scope.fc-button--active")
    public static WebElement buttonAppReqFreshman;
    @FindBy(how = How.CSS, using = ".fc-button-group.fc-button-group--section-switch li:nth-of-type(2)")
    public static WebElement buttonAppReqTransfer;
    @FindBy(how = How.CSS, using = ".fc-button-group.fc-button-group--section-switch li:nth-of-type(3)")
    public static WebElement buttonAppReqInternational;
    @FindBy(how = How.CSS, using = "span[ng-class=\"{'fc-tabs__label--active': vm.informationTabs.getActive() == " +
            "'deadlines'}\"]")
    public static WebElement buttonAppReqDeadlines;
    @FindBy(how = How.CSS, using = "span[ng-class=\"{'fc-tabs__label--active': vm.informationTabs.getActive() == " +
            "'policies'}\"]")
    public static WebElement buttonAppReqImportantPolicies;
    @FindBy(how = How.CSS, using = "span[ng-class=\"{'fc-tabs__label--active': vm.informationTabs.getActive() == " +
            "'fees'}\"]")
    public static WebElement buttonAppReqFees;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.policies.length > 0\"]")
    public static WebElement sectionImportantPolicies;

    public static List<WebElement> listDeadlines = driver.findElements(By.cssSelector(".admissions-information__" +
            "deadline-item.ng-scope"));
    public static String listDeadlinesLocator = ".admissions-information__deadline-item.ng-scope";

    public FCHubsAdmissionsTabPage(WebDriver driver) {
        super(driver);
    }
}



