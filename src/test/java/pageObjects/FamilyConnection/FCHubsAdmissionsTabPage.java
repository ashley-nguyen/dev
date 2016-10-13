package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

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
    @FindBy(how = How.ID, using = "application-info-deadlines")
    public static WebElement labelApplicationInformation;

    public FCHubsAdmissionsTabPage(WebDriver driver) {
        super(driver);
    }
}



