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
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Click this heart to add a school to your')]" +
            "/div[contains(text(), 'Next')]")
    public static WebElement linkNextFirstDialog;
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'How I compare')]/div[contains(text(), 'Next')]")
    public static WebElement linkNextSecondDialog;
    @FindBy(how = How.XPATH, using = "//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start " +
            "fc-grid__row--xs-middle']/div/div/a")
    public static WebElement linkURLIdentifierModule;

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }
}



