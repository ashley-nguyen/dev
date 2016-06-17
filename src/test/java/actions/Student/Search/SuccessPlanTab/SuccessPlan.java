package actions.Student.Search.SuccessPlanTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.SuccessPlanTab.SuccessPlanTabPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 06/15/2016.
 */
public class SuccessPlan {

    public static WebDriver driver;

    public static void ClickOnSuccessPlanTab() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.tabSuccessPlan)).click();
    }

    public static void ClickOnAddCustomTask() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.lnkAddCustomTask)).click();
    }

    public static void ClickOnAssignSchoolTasks() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.lnkAssignSchoolTasks)).click();
    }

    public static void ClickOnAssignDistrictTasks() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.lnkAssignDistrictTasks)).click();
    }

    public static void ClickOnSaveButton() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.btnSave)).click();
        Thread.sleep(9000);
    }

    public static void ClickOnSendReminder() throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SuccessPlanTabPage.chbSendReminder)).click();
    }

    public static void WriteInDueDate(String dueDate) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        SuccessPlanTabPage.txtDueDate.sendKeys(dueDate);
    }

    public static void WriteInNewTask(String dueDate) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        SuccessPlanTabPage.txtNewTask.sendKeys(dueDate);
    }

    public static void verifyTaskCreated(String taskName) throws InterruptedException {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        String dataVerification = SuccessPlanTabPage.tableTaskList.getText();
        assertTrue("Error Verification of task creation!", dataVerification.contains(taskName));
    }

    public static void SelectAvailableTask(String item) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 300);
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(SuccessPlanTabPage.divTask));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
        SuccessPlanTabPage.btnAdd.click();
        SuccessPlanTabPage.btnAssignSave.click();
    }

    public static void SelectAvailableDistrictTask(String item) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SuccessPlanTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 300);
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(SuccessPlanTabPage.divDistrictTask));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
        SuccessPlanTabPage.btnDistrictAdd.click();
        SuccessPlanTabPage.btnDistrictAssignSave.click();
    }
}
