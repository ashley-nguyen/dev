package actions.TeacherRecommmendations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.TeacherRecommendation.TeacherRecommendationsPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 06/21/2016.
 */
public class TeacherRecommendations {
    public static WebDriver driver;

    public static void ClickOnTeacherRecommendationsLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.lnkTeacherRecommendations)).click();
    }

    public static void ClickOnRequestsTab() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.tabRequests)).click();
    }

    public static void ClickOnSettingsTab() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.tabSettings)).click();
    }

    public static void ClickOnSummaryTab() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.tabSummary)).click();
    }

    public static void ClickOnRecommendationRequestsDoNotRequireApprovalRadioButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.rbRecommendationDoNotRequireApproval));
        Boolean dataVerification = TeacherRecommendationsPage.rbRecommendationDoNotRequireApproval.isDisplayed();
        assertTrue("Requests was not displayed!", dataVerification);    }

    public static void SelectGradeClass(String grade) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("class")));
        Select select = new Select(TeacherRecommendationsPage.selClass);
        select.selectByVisibleText(grade);
//        Thread.sleep(9999999);
        TeacherRecommendationsPage.formNameTable.isDisplayed();
    }

    public static void SelectGradeClassRange(String grade) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(TeacherRecommendationsPage.selStartYear);
        select.selectByVisibleText(grade);
    }

    public static void SelectGradeToClassRange(String grade) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(TeacherRecommendationsPage.selEndYear);
        select.selectByVisibleText(grade);
    }

    public static void ClickShowMeGoButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.btnGo)).click();
    }

    public static void SelectShowMeOptions(String item) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("status")));
        Select select = new Select(TeacherRecommendationsPage.selList);
        select.selectByVisibleText(item);
        TeacherRecommendationsPage.formNameTable.isDisplayed();
    }

    public static void ClickOnSaveSettingButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.btn_save_setting)).click();
    }

    public static void ClickOnGoSummaryButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.btn_go_summary)).click();
    }

    public static void VerifySuccessRequestCreationAction() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TeacherRecommendationsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TeacherRecommendationsPage.tableId));
        Boolean dataVerification = TeacherRecommendationsPage.tableId.isDisplayed();
        assertTrue("Requests was not displayed!", dataVerification);
    }
}
