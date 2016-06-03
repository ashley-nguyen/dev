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
    @FindBy(how = How.XPATH, using = "//a[@class='hubsBetaBarButton']")
    public static WebElement buttonHubsBeta;
    @FindBy(how = How.XPATH, using = "//span[@class='hubsBetaBarHide']")
    public static WebElement buttonXBetaButtonRibbon;

    public FCCollegeViewPage(WebDriver driver) {
        super(driver);
    }
}