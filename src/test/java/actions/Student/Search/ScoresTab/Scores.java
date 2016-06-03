package actions.Student.Search.ScoresTab;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.ScoresTab.StudentScoresTabPage;
import stepDefs.Hooks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class Scores {

    public static WebDriver driver;


    public static void enterAPTestScores(String testtype, String score, String year, String grade) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {

            StudentScoresTabPage.lnkaddeditscores.click();
            StudentScoresTabPage.ddlTestType.sendKeys(testtype);
            StudentScoresTabPage.txtscore.sendKeys(score);
            StudentScoresTabPage.ddlyear.sendKeys(year);
            StudentScoresTabPage.ddlgrade.sendKeys(grade);
            Actions actions = new Actions(driver);
            // this does the same as several different approaches are supposed to do...but this approach works
            actions.clickAndHold(StudentScoresTabPage.btnUpdateScores).release().perform();
            //btnUpdateScores.submit();
        } catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        } catch (WebDriverException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }//end ap test score enter

    public static void removeAPTestScores(String testtype) {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        StudentScoresTabPage.lnkaddeditscores.click();
        //init after getting to the page.
        PageFactory.initElements(driver, StudentScoresTabPage.class);
        StudentScoresTabPage.chkAPDelete.click();
        Actions actions = new Actions(driver);
        // this does the same as several different approaches are supposed to do...but this approach works
        actions.clickAndHold(StudentScoresTabPage.btnUpdateScores).release().perform();
    }


    public static void enterASPIRETestScores(String subject, String grade, String score) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            new WebDriverWait(Hooks.driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.linkText("add/edit scores")));
            StudentScoresTabPage.lnkaddeditscores.click();
            //new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//dd[@class = 'site-container students']")));
            Thread.sleep(3000);
            StudentScoresTabPage.cboGrade.sendKeys(grade);
            StudentScoresTabPage.cboGrade.sendKeys(Keys.TAB);
            //WebElement defined here instead of page object due to the subject param.
            //StudentScoresTabPage.txtSubject.sendKeys(score);
            WebElement txtsubject = Hooks.driver.findElement(By.id("aspire[1][" + subject + "]"));
            txtsubject.sendKeys(score);
            txtsubject.sendKeys(Keys.TAB);
            StudentScoresTabPage.btnUpdate.sendKeys(Keys.TAB);

        } catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }//end enter ASPIRE scores

    public static void enterPSATTestScores(String strEvReading, String strReading, String strWriting, String strMathematicsScore, String strMathTest, String strTotalScore, String strMonth, String strYear, String strGrade) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("add/edit scores")));
            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit scores"));
            lnkaddeditscores.click();
            Thread.sleep(3000);
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
            WebElement btnUpdate = StudentScoresTabPage.btnUpdate;
            Actions actions = new Actions(driver);
            // this does the same as several different approaches are supposed to do...but this approach works
            actions.clickAndHold(btnUpdate).release().perform();
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("test scores")));

        } catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        } catch (UnhandledAlertException e) {
            //do nothing here
        }
    }// end enter PSAT scores


    public static void enterPSATLegacyTestScores(String strCritialReading, String strMath, String strWriting, String strTotalScore, String strMonth, String strYear, String strGrade) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentScoresTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {

            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("add/edit scores")));
            StudentScoresTabPage.lnkaddeditscores.click();
            Thread.sleep(3000);
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
        } catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        } catch (UnhandledAlertException e) {
            //do nothing here
        }
    }//end psat legacy enter scores

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
        //try {
        WebElement warn =
                Hooks.driver.findElement(By.id("aspire_warning_message_1"));
        assertTrue("Expected: " + strMessage + " but the following was displayed insted: " + warn.getText(), warn.getText().contains(strMessage));
        /*} catch (NoSuchElementException e) {
            e.getMessage();
            throw new AssertionFailedError("element not found error");
        }*/

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
