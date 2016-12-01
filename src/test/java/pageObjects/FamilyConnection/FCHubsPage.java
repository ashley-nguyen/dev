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
    @FindBy(how = How.CSS, using = ".masthead__logo-image")
    public static WebElement imgLogo;
    @FindBy(how = How.CSS, using = ".fc-button.hub-beta-bar__survey-button")
    public static WebElement buttonFeedback;
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar")
    public static WebElement navTabs;
    @FindBy(how = How.CSS, using = ".fc-tooltip.fc-tooltip--above.hub-tooltip.hub-tooltip--favorite " +
            "div.hub-tooltip__next.ng-binding")
    public static WebElement linkNextFirstDialog;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.introService.isVisible('scattergrams')\"] span.fc-tooltip__title")
    public static WebElement labelScattergramsDialog;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.introService.isVisible('scattergrams')\"] " +
            "div.hub-tooltip__next.ng-binding")
    public static WebElement linkNextSecondDialog;
    @FindBy(how = How.CSS, using = ".fc-tooltip.fc-tooltip--below.hub-tooltip.hub-tooltip--feedback " +
            "div.hub-tooltip__next.ng-binding")
    public static WebElement linkDoneThirdDialog;
    @FindBy(how = How.CSS, using = ".masthead__address a")
    public static WebElement linkURLIdentifierModule;
    @FindBy(how = How.CSS, using = ".fc-dropdown__item.masthead-dropdown-menu__item.ng-scope")
    public static WebElement buttonRequestInfo;
    @FindBy(how = How.CSS, using = ".apply-online.fc-button.ng-scope")
    public static WebElement buttonApplyOnline;
    @FindBy(how = How.CSS, using = ".fc-button.masthead-dropdown-menu__button[ng-class=\"{ 'fc-button--primary' : " +
            "vm.expandLearnMore }\"]")
    public static WebElement buttonLearnMore;
    @FindBy(how = How.CSS, using = ".fc-dropdown.fc-dropdown--columns.fc-dropdown--with-header.learn-more-dropdown." +
            "fc-dropdown--active li:nth-of-type(3) a")
    public static WebElement linklearnMoreEvents;
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
    @FindBy(how = How.CSS, using = ".contacts__mail.ng-binding")
    public static WebElement appMailingAddress;
    @FindBy(how = How.CSS, using = ".contacts__admissions.ng-binding")
    public static WebElement contactInfoAdmissions;
    @FindBy(how = How.CSS, using = ".fc-grid__row.fc-grid__row--md-end.quick-facts-row" +
            "[ng-show=\"vm.profile.displayUrl\"] a")
    public static WebElement quickFactsWebsite;
    @FindBy(how = How.CSS, using = ".summary-profile__body.fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-6 " +
            "div:nth-of-type(3) div.ng-binding")
    public static WebElement quickFactsSchoolType;
    @FindBy(how = How.CSS, using = ".summary-profile__body.fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-6 " +
            "div:nth-of-type(4) div.ng-binding")
    public static WebElement quickFactsUndergradEnroll;
    @FindBy(how = How.CSS, using = ".summary-profile__body.fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-6 " +
            "div:nth-of-type(5) div.ng-binding")
    public static WebElement quickFactsStudentFacultyRatio;
    @FindBy(how = How.CSS, using = ".summary-profile__body.fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-6 " +
            "div:nth-of-type(6) div.ng-binding")
    public static WebElement quickFactsReligion;
    @FindBy(how = How.CSS, using = ".summary-profile__body.fc-grid__col.fc-grid__col--xs-12.fc-grid__col--md-6 " +
            "div:nth-of-type(7) div.ng-binding")
    public static WebElement quickFactsCampusSurr;
    @FindBy(how = How.CSS, using = ".hub-data-pod--money.hub-data-pod--overview.ng-binding")
    public static WebElement labelAvgNetPrice;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.gradRate\"] div.hub-data-pod--overview")
    public static WebElement labelGradRate;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.acceptRate\"] div.hub-data-pod--overview")
    public static WebElement labelAcceptanceRate;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Communicate')]")
    public static WebElement buttonCommunicate;
    @FindBy(how = How.ID, using = "hubsWebtourImage17")
    public static WebElement webTourLastImage;
    @FindBy(how = How.CSS, using = ".hub-data-pod--overview.hub-data-pod--number.ng-binding")
    public static WebElement labelOverlapsNumber;
    @FindBy(how = How.CSS, using = ".fc-button.fc-button--size-small.fc-button--medium-teal")
    public static WebElement buttonOverlapsLearnMore;
    @FindBy(how = How.CSS, using = "div.masthead__heart.ng-scope svg")
    public static WebElement buttonAddToCollegesImThinkingAbout;
    @FindBy(how = How.CSS, using = "svg[class=\"fc-icon masthead__heart--full\"]")
    public static WebElement buttonAddToCollegesImThinkingAboutFull;
    @FindBy(how = How.CSS, using = ".fc-tooltip__content.ng-scope")
    public static WebElement tooltipHeartIcon;

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }
}



