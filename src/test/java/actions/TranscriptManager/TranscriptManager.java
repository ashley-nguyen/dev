package actions.TranscriptManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.TranscriptManager.TranscriptManagerPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by franksejas on 2/01/2016.
 */
public class TranscriptManager {
    public static WebDriver driver;

    public static void NavigateToTranscriptManager() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        TranscriptManagerPage.School.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Transcript Request Manager")));
        TranscriptManagerPage.lnkTranscriptManager.click();
    }

    public static void verifyTranscriptManager() throws InterruptedException {
        TranscriptManagerPage.imgTranscriptManager.click();
    }

    public static void SelectRequestForm(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("class")));
        Select select = new Select(TranscriptManagerPage.selClass);
        select.selectByVisibleText(item);
        TranscriptManagerPage.formNameTable.isDisplayed();
    }

    public static void verifyStudentTranscriptManager() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td.category11 > div > a:nth-child(2) > img")));
        TranscriptManagerPage.imgTranscriptManagerStudents.click();
    }

    public static void SelectStudentRequestForm(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TranscriptManagerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("grids")));
        Select select = new Select(TranscriptManagerPage.selClass);
        select.selectByVisibleText(item);
        TranscriptManagerPage.formNameStudent.isDisplayed();
    }
}
