package stepDefs;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 10/7/2015.
 */
public class Survey {


    public static void verifySurvey(String strSurvey) throws InterruptedException {


        try
        {
            WebElement lnkSurvey = Hooks.driver.findElement(By.xpath("//a[contains(text(),'"+ strSurvey +"')]"));
            assertTrue("survey link not displayed",lnkSurvey.isDisplayed());
            if (lnkSurvey.isDisplayed())
            {//if the survey link is there then follow it to the survey page
                lnkSurvey.click();

                WebElement h1Survey = Hooks.driver.findElement(By.xpath("//div[2]/h1"));
                assertTrue("Survey text not found on survey screen", h1Survey.getText().toUpperCase().trim().contains(strSurvey.toUpperCase().trim()));
            }

        }
        catch (NoSuchElementException e)
        {
            throw new AssertionFailedError(strSurvey+" survey link not found");
        }
        catch (WebDriverException e)
        {
            throw new AssertionFailedError(strSurvey+" survey link not found");
        }



    }//end verifysurvey
}
