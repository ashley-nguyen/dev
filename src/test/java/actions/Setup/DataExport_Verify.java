package actions.Setup;

import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 01/29/2016.
 */
public class DataExport_Verify {
    public static WebDriver driver;

    public static void verifyDataExport(String strText) throws InterruptedException {
        driver = Hooks.driver;
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));
    }
}
