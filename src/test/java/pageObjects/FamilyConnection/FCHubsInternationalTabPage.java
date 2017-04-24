package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 4/6/2017.
 */
public class FCHubsInternationalTabPage extends BaseClass {
    @FindBy(how = How.CSS, using = "div.hub-data-pod--international.hub-data-pod--number.hub-data-pod--international" +
            "--deadline.ng-binding")
    public static WebElement labelDeadlineIntTopBar;
    @FindBy(how = How.CSS, using = "a[ng-click=\"vm.utilityService.scrollToTab('Admissions', " +
            "'application-info-deadlines')\"]")
    public static WebElement linkSeeAllDeadlines;

    public static String intFeesIntTopbarLocator = "span.hub-data-pod--international.hub-data-pod--international--" +
            "left.hub-data-pod--international--money.ng-binding.ng-scope";
    public static String intTestReqIntTopBarLocator = "span.hub-data-pod--international__req.hub-data-pod--" +
            "international--right.hub-data-pod--international--little";
    public static String intAppIntTopBarLocator = "span.hub-data-pod--international__req.hub-data-pod--international" +
            "--left.hub-data-pod--international--medium.ng-binding";
    public static String intQualificationsLocator = "div[ng-show=\"vm.hasQualifications\"] div.international__" +
            "qualifications--row:not([aria-hidden=\"true\"]) div.international__qualifications--right";
    public static String intTestScoresRowsLocator = "div[ng-repeat=\"score in vm.scores\"]";

    @FindBy(how = How.CSS, using = ".profile__close.ng-scope")
    public static WebElement intstudentProfilecloselink;

    @FindBy(how = How.CSS, using = "div[ng-repeat=\"profile in vm.studentProfiles\"] h4")
    public static WebElement internationalheaderToLocateProfile;

    public FCHubsInternationalTabPage(WebDriver driver) {
        super(driver);
    }
}


