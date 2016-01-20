package actions.Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/20/2016.
 */
public class Salesforce_Verify {

    public static void verifyAPICall() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td"))); //TODO: Needs refactor about Xpath paths
        String dataverification = Hooks.driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td")).getText();
        String verifyNoErrors = Hooks.driver.findElement(By.id("/html/body/div[1]/table/tbody/tr[1]/td[2]/table")).getText();
        assertTrue("Error Verification!", !verifyNoErrors.contains("Fatal Error"));
        assertTrue("Verify Data!", dataverification.contains("Confirmation"));
    }
}
