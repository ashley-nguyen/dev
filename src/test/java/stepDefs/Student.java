package stepDefs;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 9/22/2015.
 */
public class Student {

    public static void searchStudent(String strStudent)throws Throwable
    {
        try {
            //CLICK THE SEARCH ICON
            WebElement lnkStudentSearch = Hooks.driver.findElement(By.id("search-for-student"));
            lnkStudentSearch.click();
            //ENTER STUDENT NAME
            WebElement searchbox = Hooks.driver.findElement(By.id("student-search-prototype"));
            searchbox.sendKeys(strStudent);
            //CLICK ON STUDENT NAME AFTER WAITING FOR IT TO APPEAR FROM TYPED IN TEXT
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-active-menuitem']/span[1]/strong")));
            WebElement studentname = Hooks.driver.findElement(By.xpath("//*[@id='ui-active-menuitem']/span[1]/strong"));
            studentname.click();
        }
        catch (NoSuchElementException e)
        {
            throw new AssertionFailedError("!!!!! student " +strStudent +" not found !!!!!");
        }
        catch (WebDriverException e)
        {
            throw new AssertionFailedError("!!!!! student " +strStudent +" not found !!!!!");
        }

    }


    public static void verifyStudentData(String strData)throws Throwable
    {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains(strData));

    }

    public static void etnerAPTestScores(String testtype, String score, String year, String grade)throws Throwable
    {
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

        WebElement btnUpdate = Hooks.driver.findElement(By.name("updateScores"));
        btnUpdate.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("test scores")));

    }

    public static void verifyAPTestScores(String testtype, String score, String year, String grade)throws Throwable {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains(testtype));
        assertTrue("Text not found!", bodyText.contains(score));
        assertTrue("Text not found!", bodyText.contains(year));
        assertTrue("Text not found!", bodyText.contains(grade));

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
        catch (NoSuchElementException e)
        {
            throw new AssertionFailedError("!!!!! ACT legacy score not found !!!!!");
        }
        catch (WebDriverException e)
        {
            throw new AssertionFailedError("!!!!! ACT legacy score not found !!!!!");
        }

    }
}



