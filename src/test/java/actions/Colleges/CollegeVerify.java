package actions.Colleges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;
import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/25/2015.
 */
public class CollegeVerify {

    public static WebDriver driver;


    public static void verifyCollegeSearchResult(String strText) throws InterruptedException {
        driver = Hooks.driver;
        //System.out.println(driver.getPageSource());
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("contents")));
        assertTrue("text not found: "+ strText,driver.getPageSource().contains(strText));


    }
}
