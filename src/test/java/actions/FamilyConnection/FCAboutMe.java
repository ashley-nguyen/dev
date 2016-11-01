package actions.FamilyConnection;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCAboutMePage;
import stepDefs.Hooks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/13/2015.
 */
public class FCAboutMe {
    public static WebDriver driver;

    public static void verifySurvey(String strSurvey) throws InterruptedException {

        try {
            driver = Hooks.driver;
            PageFactory.initElements(driver, FCAboutMePage.class);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'" + strSurvey + "')]")));
            WebElement lnkSurvey = Hooks.driver.findElement(By.xpath("//a[contains(text(),'" + strSurvey + "')]"));
            assertTrue("survey link not displayed", lnkSurvey.isDisplayed());
            if (lnkSurvey.isDisplayed()) {//if the survey link is there then follow it to the survey page
                lnkSurvey.click();
                new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2]/h1")));
                boolean textVerification = FCAboutMePage.txtSurvey.getText().toUpperCase().trim().contains(strSurvey.toUpperCase().trim());
                assertTrue("Survey text not found on survey screen", textVerification);
            }

        } catch (NoSuchElementException e) {
            throw new AssertionFailedError("!!!!!" + strSurvey + " survey link not found!!!!!");
        } catch (WebDriverException e) {
            throw new AssertionFailedError("!!!!!" + strSurvey + " survey link not found!!!!!");
        }
    }

}
