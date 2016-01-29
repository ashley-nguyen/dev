package actions.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Setup.SetupPage;
import stepDefs.Hooks;

/**
 * Created by fsejas on 1/29/2016.
 */
public class DataExport_Action {

    public static WebDriver driver;

    public static void NavigateToDataExport() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        SetupPage.lnkDataExport.click();
    }
}
