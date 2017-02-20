package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegeViewPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".hubsBetaBarButton")
    public static WebElement buttonHubsBeta;
    @FindBy(how = How.CSS, using = ".hubsBetaBarHide")
    public static WebElement buttonXBetaButtonRibbon;
    @FindBy(how = How.CSS, using = "input[name=\"authorize\"]")
    public static WebElement buttonAuthorize;

    public FCCollegeViewPage(WebDriver driver) {
        super(driver);
    }
}