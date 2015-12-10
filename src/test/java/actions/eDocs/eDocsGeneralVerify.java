package actions.eDocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsGeneralVerify {
    public static WebDriver driver;

    public static void verifytext (String strData) throws Throwable {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));

    }
}
