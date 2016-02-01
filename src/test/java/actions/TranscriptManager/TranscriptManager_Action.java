package actions.TranscriptManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
        TranscriptManagerPage.School.click();
        TranscriptManagerPage.lnkTranscriptManager.click();
    }
}
