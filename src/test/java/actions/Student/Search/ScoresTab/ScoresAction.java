package actions.Student.Search.ScoresTab;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.*;
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


    public static void etnerASPIRETestScores(String subject, String grade, String score)throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);

        try {

            StudentScoresTabPage.lnkaddeditscores.click();

            //WebElement defined here instead of page object due to the subject param.
            WebElement txtsubject = Hooks.driver.findElement(By.id("aspire[1][" + subject + "]"));
            txtsubject.sendKeys(score);
            txtsubject.sendKeys(Keys.TAB);


            StudentScoresTabPage.cboGrade.sendKeys(grade);
            StudentScoresTabPage.cboGrade.sendKeys(Keys.TAB);

        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }//end enter ASPIRE scores

    public static void enterPSATTestScores(String strEvReading, String strReading, String strWriting, String strMathematicsScore, String strMathTest, String strTotalScore, String strMonth, String strYear, String strGrade)throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);

        try {
            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
            lnkaddeditscores.click();


            StudentScoresTabPage.txtEvReadWrit.sendKeys(strEvReading);
            StudentScoresTabPage.txtEvReadWrit.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtReading.sendKeys(strReading);
            StudentScoresTabPage.txtReading.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtWriting.sendKeys(strWriting);
            StudentScoresTabPage.txtWriting.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtMathematics.sendKeys(strMathematicsScore);
            StudentScoresTabPage.txtMathematics.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtMath.sendKeys(strMathTest);
            StudentScoresTabPage.txtMath.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtTotalScore.sendKeys(strTotalScore);
            StudentScoresTabPage.txtTotalScore.sendKeys(Keys.TAB);


            StudentScoresTabPage.selMonth.sendKeys(strMonth);


            StudentScoresTabPage.selYear.sendKeys(strYear);


            StudentScoresTabPage.selGrade.sendKeys(strGrade);


            //WebElement btnUpdate = Hooks.driver.findElement((By.name("updateScores")));
            //btnUpdate.sendKeys(Keys.ENTER);

            //new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("test scores")));


        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }
        catch (UnhandledAlertException e)
        {
            //do nothing here
        }
    }// end enter PSAT scores


    public static void enterPSATLegacyTestScores(String strCritialReading, String strMath, String strWriting, String strTotalScore, String strMonth, String strYear, String strGrade)throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);

        try {


            StudentScoresTabPage.lnkaddeditscores.click();

            StudentScoresTabPage.txtCritalReading.sendKeys(strCritialReading);
            StudentScoresTabPage.txtCritalReading.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtPSATLegacyMath.sendKeys(strMath);
            StudentScoresTabPage.txtPSATLegacyMath.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtPSATLegacyWriting.sendKeys(strWriting);
            StudentScoresTabPage.txtPSATLegacyWriting.sendKeys(Keys.TAB);


            StudentScoresTabPage.txtTotal.sendKeys(strTotalScore);
            StudentScoresTabPage.txtTotal.sendKeys(Keys.TAB);


            StudentScoresTabPage.selPSATLegacyMonth.sendKeys(strMonth);


            StudentScoresTabPage.selPSATLegacyyear.sendKeys(strYear);


            StudentScoresTabPage.selPSATLegacyGrade.sendKeys(strGrade);

        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }
        catch (UnhandledAlertException e)
        {
            //do nothing here
        }
    }//end psat legacy enter scores

}
