package actions.eDocs;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Setup.SetupPage;
import pageObjects.Student.eDocsTab.eDocsTabPage;
import stepDefs.Hooks;

import java.awt.*;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created franksejas on 07/22/2016.
 */
public class eDocsGeneral {
    public static WebDriver driver;
    private static String CHROME_FILE_NAME = "/Files/ReadMe.txt";
    private static String CHROME_FILE_NAME_BIG_SIZE = "/Files/FillTooBigPDF.pdf";
    private static String CHROME_INCORRECT_FORMAT_FILE = "/Files/index.html";


    public static void NavtoEdocsStudentTab() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.tabeDocs.click();
    }

    public static void ClickOnPrepareLink() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.lnkPrepare.click();
    }

    public static void ClickOnAddButton() throws Throwable {
        driver = Hooks.driver;
        Thread.sleep(8008);
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.btnAdd.click();
    }

    public static void ClickOnUploadAFileButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.btnUploadAFile.click();
    }

    public static void SelectApplication(String application) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(eDocsTabPage.selApplication);
        select.selectByVisibleText(application);
    }

    public static void SelectType(String type) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(eDocsTabPage.selType);
        select.selectByVisibleText(type);
        Thread.sleep(8008);
    }

    public static void ClickOnBrowseButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.btnBrowse.click();
        Thread.sleep(8008);
    }


    public static void verifytext (String strData) throws Throwable {
        if (strData.contains("No active applications")) {
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='muted ng-scope']")));
        }
        else {
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(strData)));
        }

        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));
    }

    public static void verifyLorsText (String strData) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='form-checklist condensed ng-scope']")));
        Thread.sleep(8008);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.className("ng-scope"))));
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));
        if(strData.contains("Replace") || strData.contains("Delete") ){
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contents\"]/div[2]/div[2]/div/div[1]/table")));
            String verifyReplaceText = Hooks.driver.findElement(By.xpath("//*[@id=\"contents\"]/div[2]/div[2]/div/div[1]/table")).getText();
            assertTrue("Text not found! "+strData, !verifyReplaceText.contains(strData));
        }
    }

    public static void verifyButtons (String strData) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.className("ng-scope"))));
        if(strData.contains("Replace") || strData.contains("Delete") ){
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contents\"]/div[2]/div[2]/div")));
            String verifyReplaceText = Hooks.driver.findElement(By.xpath("//*[@id=\"contents\"]/div[2]/div[2]/div")).getText();
            assertTrue("Text not found! "+strData, verifyReplaceText.contains(strData));
        }
    }


    public static void verifyFileBigMessage (String strMessage) throws Throwable {
        try{
        By byXpath = By.xpath("//*[contains(text(),'Selected file is more than 500KB')]");
        WebElement myDynamicElement = (new WebDriverWait(driver, 6000))
                .until(ExpectedConditions.presenceOfElementLocated(byXpath));

        } catch (NoSuchElementException e) {
             throw new AssertionFailedError("Upload File filed!!!!!");
         } catch (WebDriverException e) {
             throw new AssertionFailedError("Upload File filed!!!!!");
        }
    }

    public static void verifyIncorrectFormatMessage (String strMessage) throws Throwable {
        try{
            By byXpath = By.xpath("//*[contains(text(),'File type is not supported. Allowed file types')]");
            WebElement myDynamicElement = (new WebDriverWait(driver, 6000))
                    .until(ExpectedConditions.presenceOfElementLocated(byXpath));

        } catch (NoSuchElementException e) {
            throw new AssertionFailedError("Upload File filed!!!!!");
        } catch (WebDriverException e) {
            throw new AssertionFailedError("Upload File filed!!!!!");
        }
    }

    public static void WritePathFile(String filename) throws InterruptedException, AWTException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Filename" + filename);
        if (filename.contains("ReadMe")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_FILE_NAME).getFile());
            System.out.println("File path" + filePathStudentImport);
            driver.switchTo().activeElement().sendKeys(filePathStudentImport.toString());
            driver.switchTo().activeElement();
            SetupPage.btnUploadFile.click();
        }
        if (filename.contains("FillTooBigPDF")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_FILE_NAME_BIG_SIZE).getFile());
            System.out.println("File path" + filePathStudentImport);
            driver.switchTo().activeElement().sendKeys(filePathStudentImport.toString());
            driver.switchTo().activeElement();
            SetupPage.btnUploadFile.click();
        }

        if (filename.contains("index")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_INCORRECT_FORMAT_FILE).getFile());
            System.out.println("File path" + filePathStudentImport);
            driver.switchTo().activeElement().sendKeys(filePathStudentImport.toString());
            driver.switchTo().activeElement();
            SetupPage.btnUploadFile.click();
        }
    }
}
