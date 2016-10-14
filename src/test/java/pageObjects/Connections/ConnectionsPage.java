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

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[1]/a/img")
    public static WebElement lnkActiveMatch;

    @FindBy(how = How.ID, using = "cluetip-inner")
    public static WebElement idSubActiveMatch;

    @FindBy(how = How.LINK_TEXT, using = "Select and Update Optional Features")
    public static WebElement linkFCconfiguration;

    @FindBy(how = How.LINK_TEXT, using = "letters of recommendation")
    public static WebElement lnkLettersOfRecommendation;

    @FindBy(how = How.CLASS_NAME, using = "no-recommendations-header")
    public static WebElement textDefaultMessage;

    @FindBy(how = How.LINK_TEXT, using = "Add Request")
    public static WebElement addRequestButton;

    @FindBy(how = How.XPATH, using = "//select[@class='fc-select fc-select--full-bleed ng-pristine ng-untouched ng-valid ng-empty']")
    public static WebElement divSelectTeacher;

    @FindBy(how = How.XPATH, using = "//input[@class='fc-checkbox']")
    public static WebElement divSelectCollege;

    @FindBy(how = How.XPATH, using = "//input[@name='applications']")
    public static WebElement divSelectOptionCollege;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/recommendations-container/div/ng-view/recommendations-list/table/tbody/tr[1]/td[5]/div[12]/svg")
    public static WebElement erase;

    @FindBy(how = How.XPATH, using = "//button[@class='fc-button fc-button--primary']")
    public static WebElement divSaveButton;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-binding']")
    public static WebElement lnkSuccessMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='recommendations-list__cancel ng-scope']")
    public static WebElement divCancelButton;

    @FindBy(how = How.CLASS_NAME, using = "recommendations-list__cancel-prompt-confirm")
    public static WebElement divConfirmCancelButton;

    @FindBy(how = How.CLASS_NAME, using = "recommendations-list__cancel--disabled")
    public static WebElement divDisabledCancelIcon;


    public ConnectionsPage(WebDriver driver) {
        super(driver);
    }
}
