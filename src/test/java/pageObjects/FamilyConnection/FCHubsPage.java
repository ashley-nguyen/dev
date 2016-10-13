package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubsPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".fc-button.fc-button--ghost.hub-beta-bar__survey-button")
    public static WebElement buttonFeedback;
    @FindBy(how = How.XPATH, using = "//span[@class='fc-tooltip__title'][contains(text(),'Favorite this college')]/../div/div[contains(text(),'Next')]")
    public static WebElement linkNextFirstDialog;
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'How I compare')]/div[contains(text(), 'Next')]")
    public static WebElement linkNextSecondDialog;
    @FindBy(how = How.CSS, using = ".masthead__address a")
    public static WebElement linkURLIdentifierModule;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Request Information')]")
    public static WebElement buttonRequestInfo;
    @FindBy(how = How.CSS, using = ".apply-online.fc-button.ng-scope")
    public static WebElement buttonApplyOnline;
    @FindBy(how = How.CSS, using = ".fc-button.masthead-dropdown-menu__button:not(.fc-button--primary)")
    public static WebElement buttonLearnMore;
    @FindBy(how = How.CSS, using = ".scroll.right")
    public static WebElement buttonRightArrow;
    @FindBy(how = How.CSS, using = ".webtourLightboxClose")
    public static WebElement buttonX;
    @FindBy(how = How.XPATH, using = "//input[@id='subject']")
    public static WebElement textBoxSubjectField;
    @FindBy(how = How.XPATH, using = "//textarea[@name='message']")
    public static WebElement textBoxMessageField;
    @FindBy(how = How.XPATH, using = "//input[@id='sendEmail']")
    public static WebElement buttonSendMail;
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public static WebElement textBoxEmail;
    @FindBy(how = How.XPATH, using = "//input[@id='phone']")
    public static WebElement textBoxPhone;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Favorite this college')]/../span[@role='button']")
    public static WebElement buttonXOnFirstTutorial;
    @FindBy(how = How.XPATH, using ="//span[contains(text(),'Tell us what you think!')]/../span[@role='button']")
    public static WebElement buttonXOnSecondTutorial;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(2)")
    public static WebElement tabStudies;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(4)")
    public static WebElement tabAdmissions;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(3)")
    public static WebElement tabStudentLife;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(5)")
    public static WebElement tabCosts;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(6)")
    public static WebElement tabProfiles;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.averageNetPrices.length > 0\"] div.hub-data-pod__data-age.ng-binding")
    public static WebElement labelDateAvgNetPrice;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.gradRate\"] div.hub-data-pod__data-age.ng-binding")
    public static WebElement labelDateGradRate;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.acceptRate\"] div.hub-data-pod__data-age.ng-binding")
    public static WebElement labelDateAccepRate;
    @FindBy(how = How.CSS, using = ".hub-deadline__month.ng-binding")
    public static WebElement labelOverviewTabDeadlineMonth;
    @FindBy(how = How.CSS, using = ".hub-deadline__day.ng-binding")
    public static WebElement labelOverviewTabDeadlineDay;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Communicate')]")
    public static WebElement buttonCommunicate;

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }

}



