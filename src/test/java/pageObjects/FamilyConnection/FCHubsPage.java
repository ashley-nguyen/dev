package pageObjects.FamilyConnection;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

import java.util.List;

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
    @FindBy(how = How.CSS, using = "div[ng-click=\"vm.introService.nextItem('compare')\"]")
    public static WebElement linkNextThirdDialog;
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
            "fc-dropdown--active li:nth-of-type(5) a")
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
    @FindBy(how = How.CSS, using = ".tabs.hubs-top-tabs-bar span:nth-of-type(7)")
    public static WebElement tabInternational;
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
    @FindBy(how = How.CSS, using = "div.contacts__mail.ng-binding")
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
    @FindBy(how = How.CSS, using = "a[ng-if=\"vm.hubsEventsCollegesLink\"]")
    public static WebElement buttonRecommendedEvents;
    @FindBy(how = How.CSS, using = "div.masthead__heart.ng-scope svg")
    public static WebElement buttonAddToCollegesImThinkingAbout;
    @FindBy(how = How.CSS, using = "svg[class=\"fc-icon masthead__heart--full\"]")
    public static WebElement buttonAddToCollegesImThinkingAboutFull;
    @FindBy(how = How.CSS, using = ".fc-tooltip__content.ng-scope")
    public static WebElement tooltipHeartIcon;
    @FindBy(how = How.CSS, using = "div.bottom.bottom--gpa div:nth-of-type(2) span")
    public static WebElement labelGPAValue;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.showCompareSat === true\"] span.ng-binding.score")
    public static WebElement labelSATValue;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.showCompareAct === true\"] span.ng-binding.score")
    public static WebElement labelACTValue;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.gpaAvg\"] span:not(.ng-hide)")
    public static WebElement labelAvgGPAValue;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.showCompareSat === true\"] div.bottom div:nth-of-type(3)")
    public static WebElement labelAvgSATValue;
    @FindBy(how = How.CSS, using = "div[ng-show=\"vm.showCompareAct === true\"] div.bottom:nth-of-type(2) " +
            "div:nth-of-type(3)")
    public static WebElement labelAvgACTValue;
    @FindBy(how = How.CSS, using = "div.gauge-container.fc-grid__col--md-2.fc-grid__col--sm-2.fc-grid__col--xs-6:nth-" +
            "of-type(4) div.ng-binding + span")
    public static WebElement labelOverallAvgConclusionText;
    @FindBy(how = How.CSS, using = "div[ng-show=\"!(vm.studentAct > 0)\"]")
    public static WebElement labelACTQuestionMark;
    @FindBy(how = How.CSS, using = "div[ng-show=\"!(vm.studentScores.concordedSat > 0)\"]")
    public static WebElement labelSATQuestionMark;
    @FindBy(how = How.CSS, using = "div.compare__button-container-bottom.fc-grid__row.fc-grid__row--xs-center div")
    public static WebElement buttonCompareMeWithAllAcceptedApplicants;
    @FindBy(how = How.CSS, using = "h2.ng-binding span[ng-show=\"vm.compareToggleState == 'college'\"]")
    public static WebElement labelAllStudents;
    @FindBy(how = How.CSS, using = "h2.ng-binding span[ng-show=\"vm.compareToggleState == 'peers'\"]")
    public static WebElement labelOtherStudentsFromHS;
    @FindBy(how = How.CSS, using = "div.fc-grid__col--md-9.fc-grid__col--xs-12 div.gauge-container:nth-of-type(1) " +
            "div.ng-binding:not([ng-show=\"vm.otherScores.gpaStatistics.average\"])")
    public static WebElement labelScoreQualificationGPA;
    @FindBy(how = How.CSS, using = "div.fc-grid__col--md-9.fc-grid__col--xs-12 div.gauge-container:nth-of-type(2) " +
            "div.ng-binding:not([ng-show=\"vm.otherScores.satStatistics.average\"])")
    public static WebElement labelScoreQualificationSAT;
    @FindBy(how = How.CSS, using = "div.fc-grid__col--md-9.fc-grid__col--xs-12 div.gauge-container:nth-of-type(3) " +
            "div.ng-binding:not([ng-show=\"vm.otherScores.actStatistics.average\"])")
    public static WebElement labelScoreQualificationACT;
    @FindBy(how = How.CSS, using = "div.fc-grid__col--md-9.fc-grid__col--xs-12 div.gauge-container:nth-of-type(4) " +
            "div.ng-binding")
    public static WebElement labelScoreQualificationOverallAvg;
    @FindBy(how = How.CSS, using = ".compareNotes.fc-grid__row.fc-grid__row--xs-center")
    public static WebElement labelCompareMeSectionNotes;
    @FindBy(how = How.CSS, using = "h2.college-comments__header")
    public static WebElement labelCounselorCommentsTitle;
    @FindBy(how = How.CSS, using = "h2.college-comments__header")
    public static WebElement visitRegistrationSuccessMsg;
    @FindBy(how = How.CSS, using = "div.fc-alert.fc-alert--warning")
    public static WebElement visitRegistrationCancelMsg;
    @FindBy(how = How.CSS, using = ".fc-button.fc-button--ghost-light.hub-links-bar__button:nth-of-type(1)")
    public static WebElement buttonImThinkingAboutStickybar;
    @FindBy(how = How.CSS, using = "a[ng-click=\"vm.addToList()\"]")
    public static WebElement buttonAddToCollegesImThinkingAboutPinkBar;
    @FindBy(how = How.CSS, using = ".fc-main-nav__tab-list li:nth-of-type(3) a")
    public static WebElement tabCollegesTopBar;
    @FindBy(how = How.CSS, using = "tbody tr:nth-of-type(1) td span")
    public static WebElement firstCollegeVisitsRegisterButton;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.averageNetPrices.length > 0\"] svg")
    public static WebElement infoIconAvgNetPrice;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.gradRate\"] svg")
    public static WebElement infoIconGradRatePrice;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.acceptRate\"] svg")
    public static WebElement infoIconAcceptanceRatePrice;
    @FindBy(how = How.CSS, using = "svg.fc-icon.hubs-info-tooltip__close-icon")
    public static WebElement tooltipCloseIcon;
    @FindBy(how = How.CSS, using = "span.compare__description--tooltip-flex svg")
    public static WebElement infoIconCompareMeDescription;
    @FindBy(how = How.CSS, using = "div.bottom.bottom--gpa span.range.ng-binding svg")
    public static WebElement infoIconCompareMeGPA;
    @FindBy(how = How.CSS, using = "span[ng-show=\"vm.compareToggleState == 'college' && vm.gpaLo && vm.gpaHi\"] svg")
    public static WebElement infoIconCompareMeSAT;
    @FindBy(how = How.CSS, using = "span[ng-show=\"vm.compareToggleState == 'college' && vm.otherScores.actStatistics" +
            ".low && vm.otherScores.actStatistics.high\"] svg")
    public static WebElement infoIconCompareMeACT;


    public static String URLimThinkingAboutList = "https://connection-int.dev.naviance.com/family-connection" +
            "/colleges/application/consideration";
    public static String incomeDropDownLocator = "select";

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }
}



