package actions.FamilyConnection;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/13/2015.
 */
public class FCAboutMe {

    public static void verifySurvey(String strSurvey) throws InterruptedException {


        try {
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'" + strSurvey + "')]")));
            WebElement lnkSurvey = Hooks.driver.findElement(By.xpath("//a[contains(text(),'" + strSurvey + "')]"));
            assertTrue("survey link not displayed", lnkSurvey.isDisplayed());
            if (lnkSurvey.isDisplayed()) {//if the survey link is there then follow it to the survey page
                lnkSurvey.click();
                new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2]/h1")));
                WebElement h1Survey = Hooks.driver.findElement(By.xpath("//div[2]/h1"));
                assertTrue("Survey text not found on survey screen", h1Survey.getText().toUpperCase().trim().contains(strSurvey.toUpperCase().trim()));
            }

        } catch (NoSuchElementException e) {
            throw new AssertionFailedError("!!!!!" + strSurvey + " survey link not found!!!!!");
        } catch (WebDriverException e) {
            throw new AssertionFailedError("!!!!!" + strSurvey + " survey link not found!!!!!");
        }
    }

}
