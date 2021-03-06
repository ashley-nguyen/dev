package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/01/2016.
 */
public class FCHubsStudentLifeTabPage extends BaseClass {
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.getSchoolSize()\"] div.hub-data-pod--overview.student-life-tab-" +
            "topbar-text.student-life-tab-topbar-text--small.ng-binding")
    public static WebElement labelSchoolSizeOverview;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.ethnicityData.length > 0\"] text.student-life-donut-middle")
    public static WebElement labelTotalStudentsEthnicityData;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.genderData.length > 0\"] g text.student-life-donut-middle")
    public static WebElement labelTotalStudentsGenderData;
    @FindBy(how = How.CSS, using = "#ageData text.student-life-donut-middle")
    public static WebElement labelTotalStudentsAgeData;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__header.fc-grid__col.fc-grid__col--xs-12.fc-" +
            "grid__col--sm-7.fc-grid__col--md-12 h2")
    public static WebElement labelHousingInformation;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.profile.nearestMajorCity\"] div.student-life-tab-topbar-text")
    public static WebElement labelNearestCity;
    @FindBy(how = How.CSS, using = ".student-life-tab-topbar-text.hub-data-pod--overview.ng-binding:not" +
            "(.student-life-tab-topbar-text--small)")
    public static WebElement labelDistanceFromYourHighSchool;
    @FindBy(how = How.CSS, using = "div[ng-if=\"vm.profile.demographics.percentLiveOnCampus > 0\"] " +
            "div.student-life-tab-topbar-percent")
    public static WebElement labelPercentOfStudentsLivingOnCampus;
    @FindBy(how = How.CSS, using = ".student-body-gender-chart.fc-grid__col--lg-6.fc-grid__col--xs-12 " +
            "div.student-body-legend--snugged div:nth-of-type(1) div.student-body-legend__key-stats")
    public static WebElement labelGenderDataPercentMale;
    @FindBy(how = How.CSS, using = ".student-body-gender-chart.fc-grid__col--lg-6.fc-grid__col--xs-12 " +
            "div.student-body-legend--snugged div:nth-of-type(2) div.student-body-legend__key-stats")
    public static WebElement labelGenderDataPercentFemale;
    @FindBy(how = How.CSS, using = ".student-body-chart.student-body-age-chart.fc-grid__col--lg-6.fc-grid__col--xs-12 " +
            "div:nth-of-type(3) div.student-body-legend__key.ng-scope:nth-of-type(1) div.student-body-legend__key-stats")
    public static WebElement labelAgeDataUnder24;
    @FindBy(how = How.CSS, using = ".student-body-chart.student-body-age-chart.fc-grid__col--lg-6.fc-grid__col--xs-12 " +
            "div:nth-of-type(3) div.student-body-legend__key.ng-scope:nth-of-type(2) div.student-body-legend__key-stats")
    public static WebElement labelAgeDataOver24;
    @FindBy(how = How.CSS, using = ".fc-tabs__labels span:nth-of-type(1)")
    public static WebElement buttonOrgAndServOrganizations;
    @FindBy(how = How.CSS, using = ".fc-tabs__labels span:nth-of-type(2)")
    public static WebElement buttonOrgAndServAthletics;
    @FindBy(how = How.CSS, using = ".fc-tabs__labels span:nth-of-type(4)")
    public static WebElement buttonOrgAndServGreekLife;
    @FindBy(how = How.CSS, using = ".fc-tabs__labels span:nth-of-type(5)")
    public static WebElement buttonOrgAndServServices;
    @FindBy(how = How.CSS, using = ".fc-tabs__labels span:nth-of-type(6)")
    public static WebElement buttonOrgAndServCompResources;
    @FindBy(how = How.CSS, using = ".student-life__athletics__nav-buttons span:nth-of-type(1)")
    public static WebElement buttonAthleticsMen;
    @FindBy(how = How.CSS, using = ".student-life__athletics__nav-buttons span:nth-of-type(2)")
    public static WebElement buttonAthleticsWomen;
    @FindBy(how = How.CSS, using = ".student-life__athletics__nav-buttons span:nth-of-type(3)")
    public static WebElement buttonAthleticsCoEd;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(1) dd")
    public static WebElement labelHousingInfoCapacityValue;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(2) dd")
    public static WebElement labelHousingInfoPercentOnCampusValue;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(3) dd")
    public static WebElement labelHousingInfoFreshmenOnCampusValue;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(4) dd")
    public static WebElement labelHousingInfoSophomoresOnCampusValue;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(5) dd")
    public static WebElement labelHousingInfoJuniorsOnCampusValue;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__data.fc-grid__col.fc-grid__col--xs-7" +
            ".fc-grid__col--md-6 dl:nth-of-type(6) dd")
    public static WebElement labelHousingInfoSeniorsOnCampusValue;

    public FCHubsStudentLifeTabPage(WebDriver driver) {
        super(driver);
    }
}



