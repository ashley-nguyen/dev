package actions.TranscriptManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.TranscriptManager.TranscriptManagerPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManager_Action {
    public static WebDriver driver;

    public static void NavigateToTranscriptManager() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        TranscriptManagerPage.School.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Transcript Request Manager")));
        TranscriptManagerPage.lnkTranscriptManager.click();
    }
}
