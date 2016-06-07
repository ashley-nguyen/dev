package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(windows.get(windows.size() - 1));
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("//span[@class='title-text']")));
        WebElement overallDesignList = driver.findElement(By.xpath("//div[@class='answer-option-cell']" +
                "/div/label/span[contains(text(), '" + overallDesign + "')]"));
        overallDesignList.click();
        WebElement howUsefulInfoList = driver.findElement(By.xpath("//div[@class='answer-option-cell']" +
                "/div/label/span[contains(text(), '" + howUsefulInfo + "')]"));
        howUsefulInfoList.click();
        WebElement greadeList = driver.findElement(By.xpath("//div[@class='answer-option-cell']" +
                "/div/label/span[contains(text(), '" + grade + "')]"));
        greadeList.click();
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