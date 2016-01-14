package actions.Assessments;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/14/2016.
 */
public class Assessments_Verify {

    public static void verifyAssessment() throws InterruptedException {
        String dataVerification = Hooks.driver.findElement(By.className("student-assessments")).getText();
        assertTrue("Error Verification!", !dataVerification.contains("Whoops, looks like something went wrong."));
    }
}
