package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 8/15/2016.
 */
public class FCHubsProfilesTabPage extends BaseClass {
    @FindBy(how = How.CSS, using = ".profile__close.ng-scope")
    public static WebElement buttonCloseInProfile;

    public FCHubsProfilesTabPage(WebDriver driver) {
        super(driver);
    }
}