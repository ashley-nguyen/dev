package actions.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Setup.SetupPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by fsejas on 1/29/2016.
 */
public class DataExport {

    public static WebDriver driver;

    public static void NavigateToDataExport() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SetupPage.lnkDataExport.click();
    }

    public static void verifyDataExport(String strText) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }
}

