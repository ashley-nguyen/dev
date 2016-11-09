package pageObjects.Connections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 12/22/2015.
 */
public class ConnectionsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Connections")
    public static WebElement lnkConnections;

    @FindBy(how = How.LINK_TEXT, using = "E-mail")
    public static WebElement lnkEmail;

    @FindBy(how = How.LINK_TEXT, using = "Check status and view history of emails sent")
    public static WebElement lnkCheckStatusEmailSent;

    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement lnkEnterSchoolSite;

    @FindBy(how = How.LINK_TEXT, using = "Family Connection")
    public static WebElement lnkFamilyConnection;

    @FindBy(how = How.CSS, using = "html > body > div:nth-of-type(1) > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > table > tbody > tr:nth-of-type(3) > td > table > tbody > tr > td > table > tbody > tr:nth-of-type(5) > td > table:nth-of-type(3) > tbody > tr:nth-of-type(9) > td:nth-of-type(1) > a > img")
    public static WebElement lnkActiveMatch;

    @FindBy(how = How.ID, using = "cluetip-inner")
    public static WebElement idSubActiveMatch;

    @FindBy(how = How.LINK_TEXT, using = "Select and Update Optional Features")
    public static WebElement linkFCconfiguration;

    @FindBy(how = How.LINK_TEXT, using = "letters of recommendation")
    public static WebElement lnkLettersOfRecommendation;

    @FindBy(how = How.CLASS_NAME, using = "ng-binding")
    public static WebElement textDefaultMessage;

    @FindBy(how = How.LINK_TEXT, using = "Add Request")
    public static WebElement addRequestButton;

    @FindBy(how = How.CSS, using = "select.fc-select.fc-select--full-bleed.ng-pristine.ng-untouched.ng-valid.ng-empty")
    public static WebElement divSelectTeacher;

    @FindBy(how = How.CSS, using = "input.fc-checkbox")
    public static WebElement divSelectCollege;

    @FindBy(how = How.CSS, using = "input[name=applications]")
    public static WebElement divSelectOptionCollege;

    @FindBy(how = How.CSS, using = "button.fc-button.fc-button--primary")
    public static WebElement divSaveButton;

    @FindBy(how = How.CSS, using = "div.recommendations-list__cancel.ng-scope")
    public static WebElement divCancelButton;

    @FindBy(how = How.CLASS_NAME, using = "recommendations-list__cancel-prompt-confirm")
    public static WebElement divConfirmCancelButton;

    @FindBy(how = How.CLASS_NAME, using = "recommendations-list__cancel--disabled")
    public static WebElement divDisabledCancelIcon;

    @FindBy(how = How.CSS, using = "#activematch_events_on-9")
    public static WebElement activeMatchEvents;

    @FindBy(how = How.CLASS_NAME, using = "ContextHeader")
    public static WebElement classHeaderName;

    @FindBy(how = How.CLASS_NAME, using = "table-heading")
    public static WebElement classTableHeading;

    @FindBy(how = How.CLASS_NAME, using = "table-recommendations-list__status")
    public static WebElement classRecommendationList;

    @FindBy(how = How.CSS, using = "#active-match-events-modal > div:nth-of-type(3) > div")
    public static WebElement agreeButton;

    @FindBy(how = How.CSS, using = "body > div > div > div > div > recommendations-container > div > div > ng-view > recommendations-list > table > tbody > tr:nth-child(3) > td > div")
    public static WebElement cancelMessage;

    @FindBy(how = How.CSS, using = ".fc-tooltip__content")
    public static WebElement cancelToolTipMessage;

    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }
}
