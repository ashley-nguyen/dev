package actions.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Setup.SetupPage;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by fsejas on 1/29/2016.
 */
public class DataExport {

    public static WebDriver driver;

    public static void NavigateToDataExport() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        SetupPage.lnkDataExport.click();
    }

    public static void verifyDataExport(String strText) throws InterruptedException {
        driver = Hooks.driver;
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }
}

