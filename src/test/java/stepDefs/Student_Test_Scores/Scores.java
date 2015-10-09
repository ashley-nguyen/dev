package stepDefs.Student_Test_Scores;

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
 * Created by csackrider on 10/9/2015.
 */
public class Scores {


    public static void etnerAPTestScores(String testtype, String score, String year, String grade)throws Throwable
    {
        try {
            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
            lnkaddeditscores.click();

            WebElement ddlTestType = Hooks.driver.findElement(By.name("ap_id[1]"));
            ddlTestType.sendKeys(testtype);

            WebElement txtscore = Hooks.driver.findElement(By.name("ap_score[1]"));
            txtscore.sendKeys(score);

            WebElement ddlyear = Hooks.driver.findElement(By.name("ap_year[1]"));
            ddlyear.sendKeys(year);

            WebElement ddlgrade = Hooks.driver.findElement(By.name("ap_grade[1]"));
            ddlgrade.sendKeys(grade);


            WebElement btnUpdateScores = Hooks.driver.findElement(By.xpath("//input[@name='updateScores']"));
            btnUpdateScores.click();
            //btnUpdateScores.submit();
        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }
        catch (WebDriverException e)
        {e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }

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

    public static void removeAPTestScores(String testtype)
    {
        WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
        lnkaddeditscores.click();

        WebElement chkDelete = Hooks.driver.findElement(By.partialLinkText("delete_ap[0]"));
        chkDelete.click();

        WebElement btnUpdate = Hooks.driver.findElement(By.name("updateScores"));
        btnUpdate.click();

    }


    public static void verifyLegacyACTScores(String strEnglish, String strMath, String strReading, String strScience, String strWritSub, String strCombEngWri, String strComposite, String strDate, String strGrade)throws Throwable
    {
        try {
            WebElement tabScores = Hooks.driver.findElement(By.linkText("Scores"));
            tabScores.click();

            //TO BE COMPLETED LATER WHEN THE TABLE ROWS ARE NAMED


        }
        catch (WebDriverException e)
        {
            throw new AssertionFailedError("!!!!! ACT legacy score not found !!!!!");
        }


    }

}
