package actions.Curriculum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by ttremblay on 12/10/15.
 */
public class Curriculum_Verify {public static WebDriver driver;


    public static void verifycurriculumhomepage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        System.out.println(driver.getPageSource());


        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}




        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Scope And Sequence")));
        assertTrue("text not found: " + strText, driver.getPageSource().contains(strText));


    }
}
