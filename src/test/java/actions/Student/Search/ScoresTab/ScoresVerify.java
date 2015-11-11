package actions.Student.Search.ScoresTab;

import junit.framework.AssertionFailedError;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import stepDefs.Hooks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class ScoresVerify {

    public static void verifyAPTestScores(String testtype, String score, String year, String grade) throws Throwable {
        try {
            //WAIT FOR THE SAVE AND RETURN TO THE SCORES TAB
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("test scores")));

            String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
            assertTrue("Text not found!", bodyText.contains(testtype));
            assertTrue("Text not found!", bodyText.contains(score));
            assertTrue("Text not found!", bodyText.contains(year));
            assertTrue("Text not found!", bodyText.contains(grade));
        } catch (WebDriverException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }


    public static void verifyPSATWarning(String strWarning) throws Throwable {

        try {
            if (strWarning.isEmpty()) {
                strWarning = "none";
            }

            if (!strWarning.toLowerCase().equals("none")) {//if the warning should be displayed
                org.openqa.selenium.Alert alert = Hooks.driver.switchTo().alert();
                // Get the text from the alert
                String alertText = alert.getText();
                alertText = alertText.replace("\n", "");
                alertText = alertText.trim().replaceAll("\\s+", "");
                strWarning = strWarning.trim().replaceAll("\\s+", "");
                assertEquals("The displayed alert '" + alertText + "' does not match expected '" + strWarning + "'", alertText, strWarning);
                // Accept the alert
                alert.accept();
            } else {
                //WebDriverWait wait = new WebDriverWait(Hooks.driver, 2 /*timeout in seconds*/);
                //if(wait.until(ExpectedConditions.alertIsPresent())==null)
                //     System.out.println("alert was not present as expected for PSAT");
                // else
                //     throw new AssertionFailedError("Alert was present for PSAT when it should not be");
            }

        } catch (NoSuchElementException e) {
            e.getMessage();
            //throw new AssertionFailedError("element not found error");
        }
    }


    public static void verifyASPIRETestScoreWarning(String strMessage) throws Throwable {
        try {
            WebElement warn = Hooks.driver.findElement(By.id("aspire_warning_1"));
            assertTrue(warn.getText().contains(strMessage));
        } catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }


    public static void verifyLegacyACTScores(String strEnglish, String strMath, String strReading, String strScience, String strWritSub, String strCombEngWri, String strComposite, String strDate, String strGrade) throws Throwable {
        try {
            WebElement tabScores = Hooks.driver.findElement(By.linkText("Scores"));
            tabScores.click();

            //TO BE COMPLETED LATER WHEN THE TABLE ROWS ARE NAMED


        } catch (WebDriverException e) {
            throw new AssertionFailedError("!!!!! ACT legacy score not found !!!!!");
        }


    }
}
