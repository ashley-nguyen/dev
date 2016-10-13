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
    @FindBy(how = How.CSS, using = ".nvd3.nv-wrap.nv-pie.nv-chart-782 g g text.student-life-donut-middle")
    public static WebElement labelTotalStudentsAgeData;
    @FindBy(how = How.CSS, using = ".student-life-housing-information__header.fc-grid__col.fc-grid__col--xs-12.fc-" +
            "grid__col--sm-7.fc-grid__col--md-12 h2")
    public static WebElement labelHousingInformation;

    public FCHubsStudentLifeTabPage(WebDriver driver) {
        super(driver);
    }
}



