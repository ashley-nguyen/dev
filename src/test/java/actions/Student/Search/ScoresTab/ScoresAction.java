package actions.Student.Search.ScoresTab;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.Student.ScoresTab.StudentScoresTabPage;
import stepDefs.Hooks;

import java.util.NoSuchElementException;

/**
 * Created by csackrider on 11/6/2015.
 */
public class ScoresAction {

    public static WebDriver driver;


    public static void etnerAPTestScores(String testtype, String score, String year, String grade)throws Throwable
    {
    driver = Hooks.driver;
    PageFactory.initElements(driver, StudentScoresTabPage.class);

    try {

        StudentScoresTabPage.lnkaddeditscores.click();

        StudentScoresTabPage.ddlTestType.sendKeys(testtype);

        StudentScoresTabPage.txtscore.sendKeys(score);

        StudentScoresTabPage.ddlyear.sendKeys(year);

        StudentScoresTabPage.ddlgrade.sendKeys(grade);

        StudentScoresTabPage.btnUpdateScores.click();
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

}//end ap test score enter

    public static void removeAPTestScores(String testtype)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);

        StudentScoresTabPage.lnkaddeditscores.click();

        StudentScoresTabPage.chkDelete.click();

        StudentScoresTabPage.btnUpdateScores.click();

    }


}
