package actions.Connections;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/28/2016.
 */
public class ConnectionsVerify {

    public static void verifyNoErrorsInCheckStatusEmail() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("ContextHeader")).getText();
        assertTrue("Error Verification!", dataVerification.contains("E-mail Message History"));
    }

    public static void verifyNoErrorsInFamilyConnection() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("table-heading")).getText();
        assertTrue("Error Verification!", dataVerification.contains("Family Connection"));
    }
}