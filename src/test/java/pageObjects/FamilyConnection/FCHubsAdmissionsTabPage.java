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
    @FindBy(how = How.CSS, using = "a.truncated-text__expand")
    public static WebElement linkShowMoreScattergrams;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.isTruncated && vm.isExpanded\"] a")
    public static WebElement linkShowLessScattergrams;
    @FindBy(how = How.CSS, using = "span[ng-click=\"vm.togglePrerequisiteCoursesSort('name')\"]")
    public static WebElement linkCourseNameHeader;
    @FindBy(how = How.CSS, using = "span[ng-click=\"vm.togglePrerequisiteCoursesSort('yearsRequired')\"]")
    public static WebElement linkYearsRequiredHeader;
    @FindBy(how = How.CSS, using = "span[ng-click=\"vm.togglePrerequisiteCoursesSort('yearsRecommended')\"]")
    public static WebElement linkYearsRecommendedHeader;
    @FindBy(how = How.CSS, using = "div.fc-grid__col.fc-grid__col--xs-12.scattergrams-legend")
    public static WebElement keySectionScattergrams;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.isTruncated && !vm.isExpanded\"]")
    public static WebElement textBoxDescriptionScattergrams;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.isTruncated && vm.isExpanded\"]")
    public static WebElement textBoxDescriptionScattergramsExpanded;
    @FindBy(how = How.CSS, using = "img.background-loader__content")
    public static WebElement imageScattergrams;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Scattergrams\"] svg")
    public static WebElement infoIconScattergrams;
    @FindBy(how = How.CSS, using = "svg.fc-icon.hubs-info-tooltip__close-icon")
    public static WebElement buttonXTooltipScattergrams;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.informationTabs.getActive() == 'fees'\"] a")
    public static WebElement linkLearnMoreFees;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(1) span.application-stats__total.ng-binding")
    public static WebElement totalApplicantsCurrentYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(1) div.application-stats__subheader" +
            ".application-stats__subheader--left.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsAcceptedCurrentYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(1) div.application-stats__subheader" +
            ".application-stats__subheader--right.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsEnrolledCurrentYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(2) span.application-stats__total.ng-binding")
    public static WebElement totalApplicantsPastYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(2) div.application-stats__subheader" +
            ".application-stats__subheader--left.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsAcceptedPastYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(2) div.application-stats__subheader" +
            ".application-stats__subheader--right.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsEnrolledPastYear;

    public static String listDeadlinesLocator = ".admissions-information__deadline-item.ng-scope";
    public static String comparingDropDownLocator = "select[ng-if=\"vm.student.scattergramsSettings.allowGpaToggle\"]";
    public static String vsDropDownLocator = "select[ng-model=\"vm.scattergramTestType\"]";
    public static String courseNamesLocator = "tr[ng-repeat=\"course in vm.prerequisiteCourses\"] td:nth-of-type(1)";
    public static String yearsRequiredLocator = "tr[ng-repeat=\"course in vm.prerequisiteCourses\"] td:nth-of-type(2)";
    public static String yearsRecommendedLocator = "tr[ng-repeat=\"course in vm.prerequisiteCourses\"] td:nth-of-type(3)";
    public static String importantPoliciesListLocator = "div.admissions-policies__container dl dd";
    public static String freshmanFeesListLocator = "div.admissions-fees__item-container dl dd";
    public static String transferFeesListLocator = "div.fc-grid__col--xs-12.fc-grid__col--sm-4.admissions-fees" +
            ":nth-of-type(2) div dl dd";
    public static String internationalFeesListLocator = "div.fc-grid__col--xs-12.fc-grid__col--sm-4.admissions-fees" +
            ":nth-of-type(3) div dl dd";

    public FCHubsAdmissionsTabPage(WebDriver driver) {
        super(driver);
    }
}



