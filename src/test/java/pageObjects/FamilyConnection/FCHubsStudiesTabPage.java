package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 7/19/2016.
 */
public class FCHubsStudiesTabPage extends BaseClass {
    @FindBy(how = How.ID, using = "studies-programs__search-input")
    public static WebElement textBoxSearch;
    @FindBy(how = How.CSS, using = ".hub-data-pod--ratio.hub-data-pod--studies.ng-binding")
    public static WebElement labelStuFacRatio;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.studentRetention\"] div.hub-data-pod--studies.ng-binding")
    public static WebElement labelStuRetention;
    @FindBy(how = How.CSS, using = "div[ng-class=\"{'hub-data-pod--with-data-age': vm.dataAgePerItem}\"]" +
            "[ng-if=\"vm.gradRate\"] div.hub-data-pod--studies.ng-binding")
    public static WebElement labelGradRate;
    @FindBy(how = How.XPATH, using = "//li[contains(text(), 'All')]")
    public static WebElement buttonMajorsOfferedAll;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(2)")
    public static WebElement buttonMajorsOfferedAssociates;
    @FindBy(how = How.XPATH, using = "//ul[@class = 'studies-programs__filter-list']/li[contains(text(), 'Bachelors')]")
    public static WebElement buttonMajorsOfferedBachelors;
    @FindBy(how = How.XPATH, using = "//ul[@class = 'studies-programs__filter-list']/li[contains(text(), 'Masters')]")
    public static WebElement buttonMajorsOfferedMasters;
    @FindBy(how = How.XPATH, using = "//ul[@class = 'studies-programs__filter-list']/li[contains(text(), 'Doctoral')]")
    public static WebElement buttonMajorsOfferedDoctoral;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(6)")
    public static WebElement buttonMajorsOfferedCertificate;
    @FindBy(how = How.XPATH, using = "//ul[@class = 'studies-programs__filter-list']/li[contains(text(), 'Graduate Certificate')]")
    public static WebElement buttonMajorsOfferedGradCertificate;
    @FindBy(how = How.CSS, using = "li.studies-programs__filter-item.ng-binding.ng-scope.studies-programs__filter-item" +
            "--active")
    public static WebElement buttonAllDegreeOfferings;
    @FindBy(how = How.CSS, using = "div[ng-class=\"{'hub-data-pod--with-data-age': vm.dataAgePerItem}\"]" +
            "[ng-if=\"vm.gradRate\"] svg")
    public static WebElement infoIconGradRate;
    @FindBy(how = How.CSS, using = "svg.fc-icon.hubs-info-tooltip__close-icon")
    public static WebElement infoTooltipCloseIcon;
    @FindBy(how = How.CSS, using = "span.hubs-info-tooltip-container")
    public static WebElement tooltipGradRateContainerInt;
    @FindBy(how = How.CSS, using = "span.fc-tooltip.hubs-info-tooltip.ng-scope")
    public static WebElement tooltipGradRateContainerProd;
    @FindBy(how = How.CSS, using = "div.data-age-row.data-age-row--twilight.ng-binding.ng-scope")
    public static WebElement dateLabelStudyOptions;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.studentFacultyRatio\"] div:nth-of-type(4)")
    public static WebElement dateLabelStudentFacultyRatio;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.studentRetention\"] div:nth-of-type(4)")
    public static WebElement dateLabelStudentRetention;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.hubsTabs.getActive() === 'Studies'\"] div.studies-overview" +
            ".fc-grid__row.fc-grid__row--xs-center div[ng-if=\"vm.gradRate\"] div[ng-if=\"vm.dataAgePerItem\"]")
    public static WebElement dateLabelGraduationRate;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.profile.friendlyDegrees.length > 0\"] " +
            "div[ng-if=\"vm.dataAgePerItem\"]")
    public static WebElement dateLabelDegreesOffered;
    @FindBy(how = How.CSS, using = "div.hubs-section__content.fc-grid__row.studies-popular div[ng-if=\"vm.dataAge\"]")
    public static WebElement dateLabelTopAreasOfStudy;
    @FindBy(how = How.CSS, using = "div.studies-programs.hubs-section.fc-grid__row.fc-grid__row--xs-center" +
            ".ng-scope div.studies-programs__content + div")
    public static WebElement dateLabelMajorsOffered;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.getSchoolSize()\"] +div +div a")
    public static WebElement getDirectionsLinkDistanceFromHS;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.profile.demographics.percentLiveOnCampus > 0\"] a")
    public static WebElement learnMoreAboutHousingLinkPercentOfStuLivingInCampus;

    public static String listDegreesOffered = "div[ng-if=\"vm.profile.friendlyDegrees.length > 0\"] " +
            "div.hub-data-pod--degree.ng-binding.ng-scope";
    public static String listTopAreasOfStudy = "div.hubs-section__content.fc-grid__row.studies-popular " +
            "div[ng-repeat=\"popularArea in vm.popularAreasOfStudy\"] h5";

    public FCHubsStudiesTabPage(WebDriver driver) {
        super(driver);
    }
}



