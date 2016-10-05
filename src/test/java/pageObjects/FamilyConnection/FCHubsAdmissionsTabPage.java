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
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Early Action Deadline')]/../div/div[1]")
    public static WebElement labelMonthRegDecisionDeadline;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Early Action Deadline')]/../div/div[2]")
    public static WebElement labelDayRegDecisionDeadline;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Acceptance Rate')]/../div/div/div/div/div/div")
    public static WebElement labelAcceptanceRate;
    @FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Application Fees')]/../div")
    public static WebElement labelApplicationFees;
    @FindBy(how = How.XPATH, using = "//h2[@id = 'application-info-deadlines']")
    public static WebElement labelApplicationInformation;

    public FCHubsAdmissionsTabPage(WebDriver driver) {
        super(driver);
    }
}



