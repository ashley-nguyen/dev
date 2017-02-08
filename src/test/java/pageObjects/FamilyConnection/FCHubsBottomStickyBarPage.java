package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/15/2016.
 */
public class FCHubsBottomStickyBarPage extends BaseClass {
    @FindBy(how = How.CSS, using = "a.fc-button.fc-button--ghost-light.hub-links-bar__button:nth-of-type(1) span")
    public static WebElement buttonNumberImThinkingAbout;
    @FindBy(how = How.CSS, using = "a.fc-button.fc-button--ghost-light.hub-links-bar__button:nth-of-type(2) span")
    public static WebElement buttonNumberImApplyingTo;
    @FindBy(how = How.CSS, using = "a.fc-button.fc-button--ghost-light.hub-links-bar__button:nth-of-type(3) span")
    public static WebElement buttonNumberRecommendedEvents;
    @FindBy(how = How.CSS, using = "a.fc-button.fc-button--ghost-light.hub-links-bar__button:nth-of-type(4) span")
    public static WebElement buttonNumberUpcomingVisits;
    @FindBy(how = How.CSS, using = "div.hub-links-bar__search-container input:nth-of-type(2)")
    public static WebElement searchForACollegeTextBox;
    @FindBy(how = How.CSS, using = "div.hub-links-bar__search-container input:nth-of-type(1)")
    public static WebElement searchForACollegeTextBox1;

    public static String searchResultsListStickyBar = "ul.dropdown-menu.ng-isolate-scope li a";

    public FCHubsBottomStickyBarPage(WebDriver driver) {
        super(driver);
    }
}