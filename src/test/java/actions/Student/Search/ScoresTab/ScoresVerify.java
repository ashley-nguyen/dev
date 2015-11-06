package actions.Student.Search.ScoresTab;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class ScoresVerify {

    public static void verifyAPTestScores(String testtype, String score, String year, String grade)throws Throwable {
        try {
            //WAIT FOR THE SAVE AND RETURN TO THE SCORES TAB
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("test scores")));

            String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
            assertTrue("Text not found!", bodyText.contains(testtype));
            assertTrue("Text not found!", bodyText.contains(score));
            assertTrue("Text not found!", bodyText.contains(year));
            assertTrue("Text not found!", bodyText.contains(grade));
        }

        catch (WebDriverException e)
        {e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }
}
