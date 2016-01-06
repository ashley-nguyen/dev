package actions.Setup;

import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 1/5/2016.
 */
public class SSO_Verify {

    public static WebDriver driver;

    public static void VerifyPowerSchoolSSO() throws InterruptedException {
        driver = Hooks.driver;
        assertTrue("text not found: PowerSchool SSO - for parents", driver.getPageSource().contains("PowerSchool SSO - for parents"));
    }
}
