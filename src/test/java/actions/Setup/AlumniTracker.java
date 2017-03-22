package actions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AlumniTracker.AlumniTrackerPage;
import pageObjects.District.DistrictSetupPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by fsejas on 1/12/2016.
 */
public class AlumniTracker {

    public static WebDriver driver;

    public static void NavigateToAlumniTracker() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AlumniTrackerPage.lnkAlumnitracker.click();
    }

    public static void ClickOnPrepareAnAlumniProfilesFile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AlumniTrackerPage.lnkPepareanalumniprofilesfile.click();
    }

    public static void ClickOnPrepareAlumniFiles() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AlumniTrackerPage.lnkPeparealumnifiles.click();
    }

    public static void ClickOnSendFile() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AlumniTrackerPage.lnkSendFile.click();
    }

    public static void ClickOnCheckBoxClassYear() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AlumniTrackerPage.chkboxSelected.click();
    }

    public static void GoToAlumniTrackerOptions() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DistrictSetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DistrictSetupPage.lnkSingleSignInOptions.click();
    }

    public static void verifyFatalErrorAlumniTracker() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("top-nav")));
        String dataVerification = AlumniTrackerPage.txtFatalError.getText();
        assertTrue("Fatal Error Verification!", !dataVerification.contains("Fatal Error"));
    }

    public static void clickOnSchoolSelected(String School) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AlumniTrackerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(School.contains("City"))
        {
            AlumniTrackerPage.lnkSelectedSchoolA.click();
        }

        if(School.contains("City high school"))
        {
            AlumniTrackerPage.lnkSelectedSchoolE.click();
        }
    }
}
