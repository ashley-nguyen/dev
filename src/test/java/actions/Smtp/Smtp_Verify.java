package actions.Smtp;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/19/2016.
 */
public class Smtp_Verify {

    public static void verifyEmail(String newUser) throws InterruptedException {
        String pageVerification = Hooks.driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/table")).getText();
        assertTrue("Error Verification!", !pageVerification.contains("Fatal error"));
        assertTrue("Verify Data!", pageVerification.contains(newUser));
    }
}
