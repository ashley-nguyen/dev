package actions.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegesPage;
import stepDefs.Hooks;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab {
    public static WebDriver driver;

    public static void ClickCollegeMatchLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        FCCollegesPage.lnkCollegeMatch.click();
    }
}