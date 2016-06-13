package actions.Scores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Scores.ScoresPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 06/09/2016.
 */
public class Scores {
    public static WebDriver driver;
    public static void ClickOnScores() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, ScoresPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Scores")));
        ScoresPage.tabScores.click();
    }

    public static void ClickOnKeyTestScores(String link) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, ScoresPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(link)));
        ScoresPage.lnkKeyTestScores.click();
    }

    public static void ClickOnAddScoreButton() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, ScoresPage.class);
        ScoresPage.btnAddScore.click();
    }

    public static void SelectATest(String test) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(ScoresPage.selClass);
        select.selectByVisibleText(test);

    }

    public static void SelectDateTaken(String date) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(ScoresPage.selClassDate);
        select.selectByVisibleText(date);
    }

    public static void SelectDayTaken(Integer day) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strDayTaken.sendKeys(day.toString());

    }

    public static void SelectYearTaken(Integer year) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strYearTaken.sendKeys(year.toString());
    }

    public static void SelectGradeWhenTaken(String grade) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(ScoresPage.selClassGrade);
        select.selectByVisibleText(grade.toString());
       // Thread.sleep(800000);
    }

    public static void fillEBRWScore(Integer ebrw) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strEBRWScore.sendKeys(ebrw.toString());
    }

    public static void fillReadingTestcore(Integer reading) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strReadingTestScore.sendKeys(reading.toString());
    }

    public static void fillMathematicsTestcore(Integer mathematics) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strMathematicsTestScore.sendKeys(mathematics.toString());
    }

    public static void fillWritingTestcore(Integer writing) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strWritingTestScore.sendKeys(writing.toString());
    }

    public static void fillMathTestcore(Integer math) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strMathTestScore.sendKeys(math.toString());
    }

    public static void fillTotalTestcore(Integer total) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.strTotalTestScore.sendKeys(total.toString());
    }

    public static void clickSaveScores() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ScoresPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.btnSaveScores.click();
    }

    public static void verifyMessages(String message) throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Scores.class);
        if (message.isEmpty()){
            String verifyMessageForTestScore = ScoresPage.txtAddedScoreMessage.getText();
            assertTrue("Error Add Scores Verification!", verifyMessageForTestScore.contains("SAT"));
            }
        else{
            String verifyMessageForTestScore = ScoresPage.txtMessage.getText();
            assertTrue("Error Add Scores Verification!", verifyMessageForTestScore.contains(message));
            }
    }

    public static void clickOnAddEditScores() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Scores.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.lnkAddEditScores.click();
    }

    public static void clickOnTestScores() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Scores.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.lnkTestScores.click();
    }

    public static void clickOnUpdateButton() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Scores.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ScoresPage.lnkUpdateTestScores.click();
    }

    public static void verifyTestScorePageBack() throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Scores.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ScoresPage.lnkAddEditScores));
        String verifyMessageForTestScore = ScoresPage.lnkAddEditScores.getText();
        assertTrue("Error Add/Edit Test Scores does not back!", verifyMessageForTestScore.contains("add/edit scores"));
    }
}
