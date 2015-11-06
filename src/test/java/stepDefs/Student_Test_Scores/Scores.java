package stepDefs.Student_Test_Scores;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 10/9/2015.
 */
public class Scores {




    public static void etnerASPIRETestScores(String subject, String grade, String score)throws Throwable {
        try {
            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
            lnkaddeditscores.click();

            //WebElement txtsubject = Hooks.driver.findElement(By.xpath("//*[@id='aspire[1]["+subject+"]']"));
            WebElement txtsubject = Hooks.driver.findElement(By.id("aspire[1][" + subject + "]"));
            txtsubject.sendKeys(score);
            txtsubject.sendKeys(Keys.TAB);

            WebElement cboGrade = Hooks.driver.findElement(By.name("aspire[1][grade]"));
            cboGrade.sendKeys(grade);
            cboGrade.sendKeys(Keys.TAB);

        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

    }

    public static void enterPSATTestScores(String strEvReading, String strReading, String strWriting, String strMathematicsScore, String strMathTest, String strTotalScore, String strMonth, String strYear, String strGrade)throws Throwable {
        try {
            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
            lnkaddeditscores.click();

            WebElement txtEvReadWrit = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][ev_based_read_write]']"));
            txtEvReadWrit.sendKeys(strEvReading);
            txtEvReadWrit.sendKeys(Keys.TAB);

            WebElement txtReading = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][reading]']"));
            txtReading.sendKeys(strReading);
            txtReading.sendKeys(Keys.TAB);

            WebElement txtWriting = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][writing]']"));
            txtWriting.sendKeys(strWriting);
            txtWriting.sendKeys(Keys.TAB);

            WebElement txtMathematics = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][mathematics]']"));
            txtMathematics.sendKeys(strMathematicsScore);
            txtMathematics.sendKeys(Keys.TAB);

            WebElement txtMath = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][math]']"));
            txtMath.sendKeys(strMathTest);
            txtMath.sendKeys(Keys.TAB);

            WebElement txtTotalScore = Hooks.driver.findElement(By.xpath("//*[@id='psat[1][total]']"));
            txtTotalScore.sendKeys(strTotalScore);
            txtTotalScore.sendKeys(Keys.TAB);

            WebElement selMonth = Hooks.driver.findElement(By.name("psat[1][month]"));
            selMonth.sendKeys(strMonth);

            WebElement selYear = Hooks.driver.findElement(By.name("psat[1][year]"));
            selYear.sendKeys(strYear);

            WebElement selGrade = Hooks.driver.findElement(By.name("psat[1][grade]"));
            selGrade.sendKeys(strGrade);


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
    }

    public static void enterPSATLegacyTestScores(String strCritialReading, String strMath, String strWriting, String strTotalScore, String strMonth, String strYear, String strGrade)throws Throwable {
        try {

            WebElement lnkaddeditscores = Hooks.driver.findElement(By.partialLinkText("add/edit"));
            lnkaddeditscores.click();

            WebElement txtCritalReading = Hooks.driver.findElement(By.name("psat_verbal[1]"));
            txtCritalReading.sendKeys(strCritialReading);
            txtCritalReading.sendKeys(Keys.TAB);

            WebElement txtMath = Hooks.driver.findElement(By.name("psat_math[1]"));
            txtMath.sendKeys(strMath);
            txtMath.sendKeys(Keys.TAB);

            WebElement txtWriting = Hooks.driver.findElement(By.name("psat_writing[1]"));
            txtWriting.sendKeys(strWriting);
            txtWriting.sendKeys(Keys.TAB);

            WebElement txtTotal = Hooks.driver.findElement(By.name("psat_select[1]"));
            txtTotal.sendKeys(strTotalScore);
            txtTotal.sendKeys(Keys.TAB);

            WebElement selMonth = Hooks.driver.findElement(By.name("psat_month[1]"));
            selMonth.sendKeys(strMonth);

            WebElement selyear = Hooks.driver.findElement(By.name("psat_year[1]"));
            selyear.sendKeys(strYear);

            WebElement selGrade = Hooks.driver.findElement(By.name("psat_grade[1]"));
            selGrade.sendKeys(strGrade);

        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }
        catch (UnhandledAlertException e)
        {
            //do nothing here
        }
    }
    public static void verifyPSATWarning(String strWarning)throws Throwable
    {

        try{
            if (strWarning.isEmpty())
            {strWarning = "none";}

          if (!strWarning.toLowerCase().equals("none"))
          {//if the warning should be displayed
            org.openqa.selenium.Alert alert = Hooks.driver.switchTo().alert();
            // Get the text from the alert
            String alertText = alert.getText();
              alertText = alertText.replace("\n", "");
              alertText = alertText.trim().replaceAll("\\s+", "");
              strWarning = strWarning.trim().replaceAll("\\s+", "");
                      assertEquals("The displayed alert '" + alertText + "' does not match expected '" + strWarning + "'", alertText, strWarning);
            // Accept the alert
              alert.accept();}
            else
          {
              //WebDriverWait wait = new WebDriverWait(Hooks.driver, 2 /*timeout in seconds*/);
              //if(wait.until(ExpectedConditions.alertIsPresent())==null)
             //     System.out.println("alert was not present as expected for PSAT");
             // else
             //     throw new AssertionFailedError("Alert was present for PSAT when it should not be");
          }

        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            //throw new AssertionFailedError("element not found error");
        }
    }



    public static void verifyASPIRETestScoreWarning(String strMessage)throws Throwable {
        try {
            WebElement warn = Hooks.driver.findElement(By.id("aspire_warning_1"));
            assertTrue(warn.getText().contains(strMessage));
        }
        catch (NoSuchElementException e)
        {   e.getMessage();
            throw new AssertionFailedError("element not found error");
        }

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
