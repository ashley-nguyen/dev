package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by mbhangu on 12/13/2016.
 */
public class FCCollegeEventsPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".fc-grid__col--xs >strong")
    public static WebElement labelCollegeEventsTitle;
    @FindBy(how = How.CSS, using = ".fc-fieldset__legend")
    public static WebElement CollegeEventsDetailsSignUpHere;
    @FindBy(how = How.CSS, using = ".fc-button--primary")
    public static WebElement clickSignUpButton;
    @FindBy(how = How.CSS, using = "[ng-switch-when=\"REGISTERED\"]:not(.event-summary__status) h2:not([ng-if=\"vm.userCanSeeSignup\"])")
    public static WebElement labelConfirmationMessage;

    @FindBy(how = How.CSS, using = ".event-summary__title.ng-binding")
    public static WebElement buttonSignUponCollegeEvents;

    @FindBy(how = How.CSS, using = ".event-summary__status-column span.fc-button.fc-button--call-to-action.ng-binding")
    public static WebElement SignUpforCollegeEvent;

    @FindBy(how = How.CSS, using = "a[href='#/']")
    public static WebElement linkReturntoAllEvents;

    @FindBy(how = How.CSS, using = ".fc-button.fc-button--ghost-light.fc-button--size-small")
    public static WebElement recommendedEvents;

    @FindBy(how = How.CSS, using = ".fc-info-tag.fc-info-tag--recommended.ng-scope")
    public static WebElement verifyRecommendedEventsText;

    @FindBy(how = How.CSS, using = "div#main-content div:nth-of-type(1).block div.block-r ul:nth-of-type(1) a")
    public static WebElement UpcomingCollegeEvents;

    @FindBy(how = How.CSS, using = ".fc-button.fc-button--primary[ng-click=\"vm.toggleForm()\"]")
    public static WebElement eventsMoreOptions;

    @FindBy(how = How.CSS, using = "div.search-form__fields.search-form__fields--open div.fc-central-content > strong")
    public static WebElement VerifyFindEventsByOptionsText;

    @FindBy(how = How.CSS, using = "select[ng-change='vm.updateZip()']")
    public static WebElement selectDistanceandEnterZipCodeValue;

    @FindBy(how = How.CSS, using = "[ng-required=\"vm.isZipRequired()\"]")
    public static WebElement eventsTextBoxForZipCode;

    @FindBy(how = How.CSS, using = ".fc-button.fc-button--primary")
    public static WebElement clickShowResults;

    @FindBy(how = How.CSS, using = "h3")
    public static WebElement verifyFilteredEventsData;

    @FindBy(how = How.CSS, using = ".fc-tooltip__close.fc-tooltip__close--event-message svg")
    public static WebElement closeEventToolTip;

    public static String eventsList = "h3";

    @FindBy(how = How.CSS, using = ".fc-main-nav__tab.fc-main-nav__tab--active")
    public static WebElement oldCollegesTab;
    @FindBy(how = How.CSS, using = "div.events-list event-summary:nth-of-type(1) label")
    public static WebElement firstEventRecommendedLabel;

    public static String eventsListLocator = ".events-list event-summary";

    public FCCollegeEventsPage(WebDriver driver) {
        super(driver);
    }
}

