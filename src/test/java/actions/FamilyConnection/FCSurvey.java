package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCSurveyPage;
import stepDefs.Hooks;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCSurvey {
    public static WebDriver driver;

    public static void VerifySurveyPage() {
        driver = Hooks.driver;
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        assertTrue("The Survey Page is not displayed", driver.findElement(
                By.xpath("//span[@class='title-text']")).isDisplayed());
    }

    public static void FillSurvey(String overallDesign, String howUsefulInfo, String grade) {
        driver = Hooks.driver;
        int overallDesignOption = 0;
        int howUsefulInfoOption = 0;
        int gradeOption = 0;
        ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windows.get(windows.size() - 1));
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
                (".title-text")));

        switch (overallDesign) {
            case "Great design": overallDesignOption = 1;
                break;
            case "Good design": overallDesignOption = 2;
                break;
            case "Okay design": overallDesignOption = 3;
                break;
            case "Bad design": overallDesignOption = 4;
                break;
            case "Awful design": overallDesignOption = 5;
                break;
        }

        switch (howUsefulInfo) {
            case "Very useful": howUsefulInfoOption = 1;
                break;
            case "Somewhat useful": howUsefulInfoOption = 2;
                break;
            case "Just okay": howUsefulInfoOption = 3;
                break;
            case "Not so useful": howUsefulInfoOption = 4;
                break;
            case "Not at all useful": howUsefulInfoOption = 5;
                break;
        }

        switch (grade) {
            case "9th grade/freshman": gradeOption = 1;
                break;
            case "10th grade/sophomore": gradeOption = 2;
                break;
            case "11th grade/junior": gradeOption = 3;
                break;
            case "12th grade/senior": gradeOption = 4;
                break;
            case "Other (please specify)": gradeOption = 5;
                break;
        }
        WebElement overallDesignList = driver.findElement(By.cssSelector(".questions.clearfix div.question-row.clearfix" +
                ":nth-of-type(1) div.answer-option-cell:nth-of-type(" + overallDesignOption + ") .radio-button-display"));
        overallDesignList.click();
        WebElement howUsefulInfoList = driver.findElement(By.cssSelector(".questions.clearfix div.question-row.clearfix" +
                ":nth-of-type(2) div.answer-option-cell:nth-of-type(" + howUsefulInfoOption + ") .radio-button-display"));
        howUsefulInfoList.click();
        WebElement gradeList = driver.findElement(By.cssSelector(".questions.clearfix div.question-row.clearfix" +
                ":nth-of-type(4) div.answer-option-cell:nth-of-type(" + gradeOption + ") .radio-button-display"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gradeList);
        gradeList.click();
    }

    public static void ClickDoneButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCSurveyPage.class);
        FCSurveyPage.buttonDone.click();
    }

    public static void VerifyCloseSurveyPage() {
        driver = Hooks.driver;
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.close();
        driver.switchTo().window(tabs.get(1));
        assertTrue("It is not possible to close Survey Page", driver.findElement(By.xpath
                ("//div[@class='hub-beta-bar']")).isDisplayed());
    }

    public static void CloseSurveyPage() {
        driver = Hooks.driver;
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        driver.close();
        driver.switchTo().window(tabs.get(1));
    }
}