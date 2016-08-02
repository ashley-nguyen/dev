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
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'SCHOOL SIZE')]/../div[contains(@class, " +
            "'hub-data-pod--overview')]")
    public static WebElement labelSchoolSizeOverview;
    @FindBy(how = How.XPATH, using = "//nvd3[@id = 'ethnicData']/*[name()='svg']/*[name()='g']/*[name()='g']" +
            "/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='g']" +
            "/*[name()='text' and @class='student-life-donut-middle']")
    public static WebElement labelTotalStudentsEthnicityData;
    @FindBy(how = How.XPATH, using = "//nvd3[@id = 'genderData']/*[name()='svg']/*[name()='g']/*[name()='g']" +
            "/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='g']" +
            "/*[name()='text' and @class='student-life-donut-middle']")
    public static WebElement labelTotalStudentsGenderData;
    @FindBy(how = How.XPATH, using = "//nvd3[@id = 'ageData']/*[name()='svg']/*[name()='g']/*[name()='g']" +
            "/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='text' and " +
            "@class='student-life-donut-middle']")
    public static WebElement labelTotalStudentsAgeData;

    public FCHubsStudentLifeTabPage(WebDriver driver) {
        super(driver);
    }
}



