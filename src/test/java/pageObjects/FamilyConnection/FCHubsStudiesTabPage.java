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
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(1)")
    public static WebElement buttonMajorsOfferedAll;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(2)")
    public static WebElement buttonMajorsOfferedAssociates;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(3)")
    public static WebElement buttonMajorsOfferedBachelors;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(4)")
    public static WebElement buttonMajorsOfferedMasters;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(5)")
    public static WebElement buttonMajorsOfferedDoctoral;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(6)")
    public static WebElement buttonMajorsOfferedCertificate;
    @FindBy(how = How.CSS, using = ".studies-programs__filter li:nth-of-type(7)")
    public static WebElement buttonMajorsOfferedGradCertificate;

    public static String listDegreesOffered = "div[ng-if=\"vm.profile.friendlyDegrees.length > 0\"] " +
            "div.hub-data-pod--degree.ng-binding.ng-scope";

    public FCHubsStudiesTabPage(WebDriver driver) {
        super(driver);
    }
}



