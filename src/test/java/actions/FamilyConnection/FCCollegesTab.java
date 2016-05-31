package actions.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FamilyConnection.FCCollegesPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab {
    public static WebDriver driver;

    public static void ClickCollegeMatchLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCCollegesPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        FCCollegesPage.lnkCollegeMatch.click();
    }
}