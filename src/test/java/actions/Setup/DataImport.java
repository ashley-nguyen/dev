package actions.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Setup.SetupPage;
import stepDefs.Hooks;

import java.awt.*;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by fsejas on 07/20/2016.
 */
public class DataImport {

    public static WebDriver driver;
    private static String CHROME_STUDENT_FILE_IMPORT = "/Files/studentExportTest.csv";

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

    public static void WriteFileNameToImportStudent() throws InterruptedException, AWTException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        File filePathStudentImport = new File(Hooks.class.getResource(CHROME_STUDENT_FILE_IMPORT).getFile());
        System.out.println("File path" + filePathStudentImport);
       //
        driver.switchTo().activeElement().sendKeys(filePathStudentImport.toString());
        driver.switchTo().activeElement();
        SetupPage.btnContinue.click();
        SetupPage.btnContinueDataImport.click();
        SetupPage.btnContinueMatchFields.click();
    }
}
