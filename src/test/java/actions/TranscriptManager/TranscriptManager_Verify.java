package actions.TranscriptManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.TranscriptManager.TranscriptManagerPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManager_Verify {
    public static WebDriver driver;

    public static void verifyTranscriptManager() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("img[src=\"../../images/transcripts/transcripts_requests_tab_on.gif\"]")).click();
    }

    public static void SelectRequestForm(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("consent")));
        Select select = new Select(TranscriptManagerPage.selClass);
        select.selectByVisibleText(item);
        TranscriptManagerPage.formNameTable.isDisplayed();
    }

    public static void verifyStudentTranscriptManager() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("img[src=\"../../images/transcripts/transcripts_students_tab_on.gif\"]")).click();
    }

    public static void SelectStudentRequestForm(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("grids")));
        Select select = new Select(TranscriptManagerPage.selClass);
        select.selectByVisibleText(item);
        TranscriptManagerPage.formNameStudent.isDisplayed();
    }
}
