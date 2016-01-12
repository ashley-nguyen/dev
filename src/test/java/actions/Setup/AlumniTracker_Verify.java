package actions.Setup;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 01/12/2016.
 */
public class AlumniTracker_Verify {

    public static void verifyFatalErrorAlumniTracker() throws InterruptedException {
        String dataverification = Hooks.driver.findElement(By.id("wizard-activity")).getText(); //TODO: Detect the Id of the page
        assertTrue("Fatal Error Verification!", !dataverification.contains("Fatal Error"));
    }
}
