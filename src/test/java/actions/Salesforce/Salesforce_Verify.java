package actions.Salesforce;

import org.openqa.selenium.By;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/20/2016.
 */
public class Salesforce_Verify {

    public static void verifyAPICall() throws InterruptedException {
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[2]/div/h3"))); //TODO: Needs refactor about Xpath paths
        String dataverification = Hooks.driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[2]/div/h3")).getText();
        assertTrue("Verify Data!", dataverification.contains("Confirmation"));
    }
}
