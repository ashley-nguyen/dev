package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubsPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//div[@class='hub-beta-bar']/a")
    public static WebElement buttonFeedback;

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }
}