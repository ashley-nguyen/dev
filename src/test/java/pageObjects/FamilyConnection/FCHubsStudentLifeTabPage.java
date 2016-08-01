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
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'SCHOOL SIZE')]/../div[contains(@class, 'hub-data-pod--overview')]")
    public static WebElement labelSchoolSizeOverview;

    public FCHubsStudentLifeTabPage(WebDriver driver) {
        super(driver);
    }
}



