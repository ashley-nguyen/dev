package actions.Setup;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AlumniTracker.AlumniTrackerPage;
import pageObjects.District.DistrictSetupPage;
import stepDefs.Hooks;

/**
 * Created by fsejas on 1/12/2016.
 */
public class AlumniTracker {

    public static WebDriver driver;

    public static void NavigateToAlumniTracker() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        AlumniTrackerPage.lnkAlumnitracker.click();
    }

    public static void ClickOnPrepareAnAlumniProfilesFile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        AlumniTrackerPage.lnkPepareanalumniprofilesfile.click();
    }

    public static void ClickOnPrepareAlumniFiles() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        AlumniTrackerPage.lnkPeparealumnifiles.click();
    }

    public static void ClickOnSendFile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        AlumniTrackerPage.lnkSendFile.click();
    }

    public static void ClickOnCheckBoxClassYear() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        AlumniTrackerPage.chkboxSelected.click();
    }

    public static void GoToAlumniTrackerOptions() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictSetupPage.class);

        DistrictSetupPage.lnkSingleSignInOptions.click();
    }

    public static void verifyFatalErrorAlumniTracker() throws InterruptedException {
        String dataverification = Hooks.driver.findElement(By.className("top-nav")).getText();
        assertTrue("Fatal Error Verification!", !dataverification.contains("Fatal Error"));
    }
}
