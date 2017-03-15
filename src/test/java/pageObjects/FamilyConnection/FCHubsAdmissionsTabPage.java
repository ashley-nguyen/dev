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
    public static WebElement linkShowMoreScattergramsInt;
    @FindBy(how = How.CSS, using = "truncated-text[text=\"::vm.scattergramDisclaimer\"] a")
    public static WebElement linkShowMoreScattergramsProd;
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
    @FindBy(how = How.CSS, using = "h4.scattergrams-legend__title")
    public static WebElement keySectionScattergramsTitle;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.student.scattergramsSettings.graphDisclaimer\"] span")
    public static WebElement textBoxDescriptionScattergrams;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.isTruncated && vm.isExpanded\"]")
    public static WebElement textBoxDescriptionScattergramsExpanded;
    @FindBy(how = How.CSS, using = "img.background-loader__content")
    public static WebElement imageScattergrams;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Scattergrams\"] svg")
    public static WebElement infoIconScattergrams;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Scattergrams\"] + span svg")
    public static WebElement buttonXTooltipScattergrams;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Scattergrams\"] + span")
    public static WebElement tooltipContainerScattergrams;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Acceptance Rate\"] + span svg")
    public static WebElement buttonXTooltipAceptanceRate;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about Acceptance Rate\"] + span")
    public static WebElement tooltipContainerAcceptanceRate;
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
    @FindBy(how = How.CSS, using = "div.hub-data-pod.fc-grid__col--xs-12.fc-grid__col--sm-6.fc-grid__col--md-3" +
            ".fc-grid__col--lg-3.ng-scope[ng-if=\"vm.acceptRate\"] svg")
    public static WebElement infoIconAcceptanceRate;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(3) span.application-stats__total.ng-binding")
    public static WebElement totalApplicantsBeforePastYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(3) div.application-stats__subheader" +
            ".application-stats__subheader--left.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsAcceptedBeforePastYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.showApplicationStats\"] div[ng-repeat=\"years in " +
            "vm.applicationStats | orderBy:'year':true\"]:nth-of-type(3) div.application-stats__subheader" +
            ".application-stats__subheader--right.fc-grid__col.fc-grid__col--xs-6.ng-binding")
    public static WebElement studentsEnrolledBeforePastYear;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.requirementLists.length > 0\"] h2")
    public static WebElement applicationRequirementsTitle;
    @FindBy(how = How.CSS, using = "span[ng-show=\"vm.subPsat && vm.scattergramTestType == '1'\"] " +
            "svg[ng-click=\"vm.toggleTooltip($event)\"]")
    public static WebElement scattergramsPSATInfoIconInt;
    @FindBy(how = How.CSS, using = "span[ng-show=\"vm.subPsat && vm.scattergramTestType == '1'\"] svg")
    public static WebElement scattergramsPSATInfoIconProd;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about You vs Students at your school’s SAT\"] + span svg")
    public static WebElement buttonXTooltipScattergramsPSATInt;
    @FindBy(how = How.CSS, using = "span[title=\"Click to learn more about \"] + span svg")
    public static WebElement buttonXTooltipScattergramsPSATProd;

    public static String listDeadlinesLocator = ".admissions-information__deadline-item.ng-scope";
    public static String comparingDropDownLocator = "select[ng-model=\"vm.scattergramGpaType\"]";
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
    public static String admissionsContactInfoList = "div.admissions-information__contact-admission span";

    public FCHubsAdmissionsTabPage(WebDriver driver) {
        super(driver);
    }
}



