package actions.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Setup.SetupPage;
import stepDefs.Hooks;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by fsejas on 07/20/2016.
 */
public class DataImport {

    public static WebDriver driver;
    private static String CHROME_STUDENT_FILE_IMPORT = "/Files/";

    public static void NavigateToDataImport() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SetupPage.lnkDataImport.click();
    }

    public static void ClickOnNewStudentRecords() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SetupPage.lnkAddNewStudentRecords.click();
    }

    public static void ClickOnChooseFileButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SetupPage.btnChooseFile.click();
    }

    public static void WriteFileNameToImportStudent(String filename) throws InterruptedException, AWTException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        File filePathStudentImport = new File(Hooks.class.getResource(CHROME_STUDENT_FILE_IMPORT + filename).getFile());
        driver.switchTo().activeElement().sendKeys(filePathStudentImport.toString());
        driver.switchTo().activeElement();
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=uploadFile]")));
        SetupPage.btnContinue.click();

        List<WebElement> ref = driver.findElements(By.name("selected_field[]"));
        System.out.println("reference dropdowns " + ref.size());
        Select select;

        select = new Select(ref.get(0));
        select.selectByVisibleText("Student ID (required)");

        select = new Select(ref.get(5));
        select.selectByVisibleText("First name");

        select = new Select(ref.get(7));
        select.selectByVisibleText("Last name (required)");

        select = new Select(ref.get(9));
        select.selectByVisibleText("Class Year (4 digit) (required)");


        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[value=Continue]")));
        SetupPage.btnContinueDataImport.click();
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=submitMapping]")));
        SetupPage.btnContinueMatchFields.click();

    }
}

