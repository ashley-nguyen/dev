package actions.FamilyConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FamilyConnection.FCHubsPage;
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

    public static void FillSurvey(String overallDesign, String howUsefulInfo, String highSchool, String grade) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCSurveyPage.class);
        int highSchoolYesNo = 0;
        int gradeNumber = 0;
        ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windows.get(windows.size() - 1));
        driver.switchTo().frame("survey-preview");

        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("tr.question-matrix-row-even" +
                ".question-matrix-row-last td:nth-of-type(" + overallDesign + ")")));

        WebElement overallDesignElement = driver.findElement(By.cssSelector("tr.question-matrix-row-even" +
                ".question-matrix-row-last td:nth-of-type(" + overallDesign + ") div input"));
        overallDesignElement.click();


        WebElement howUsefulInfoElement = driver.findElement(By.cssSelector("div[data-qnumber=\"2\"] tr.question-matrix-row-even" +
                ".question-matrix-row-last td:nth-of-type(" + howUsefulInfo + ") div input"));
        howUsefulInfoElement.click();


        if(highSchool.equals("yes")) {
            highSchoolYesNo = 1;
        } else {
            highSchoolYesNo = 2;
        }

        WebElement highSchoolQuestion = driver.findElement(By.cssSelector("div.question-body.clearfix.notranslate div div:nth-of-type("
                + highSchoolYesNo + ")"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", highSchoolQuestion);
        jse.executeScript("scroll(0, 250);");

        highSchoolQuestion.click();

        FCSurveyPage.buttonNext.click();

        switch (grade) {
            case "9th" : gradeNumber = 1;
                break;
            case "10th" : gradeNumber = 2;
                break;
            case  "11th" : gradeNumber = 3;
                break;
            case  "12th" : gradeNumber = 4;
                break;
        }

        driver.findElement(By.cssSelector("div.question-body.clearfix.notranslate div " +
                "div:nth-of-type(" + gradeNumber + ")")).click();

        FCSurveyPage.buttonNext2.click();
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

    public static void clickCloseSurveypreview() {
        driver = Hooks.driver;
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        PageFactory.initElements(driver, FCSurveyPage.class);
        FCSurveyPage.buttonClosePreview.click();
    }
}