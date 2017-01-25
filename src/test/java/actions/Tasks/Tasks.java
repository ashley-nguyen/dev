package actions.Tasks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Dashboard.DashboardPage;
import pageObjects.Tasks.TasksPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


/**
 * Created by M1020406 on 1/24/2017.
 */
public class Tasks {
    public static WebDriver driver;

    public static void NavigateToTasks() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TasksPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Planner")));
        TasksPage.Planner.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Tasks")));
        TasksPage.Tasks.click();*/

        Actions builder = new Actions(driver);
        builder.moveToElement(TasksPage.Planner).moveToElement(TasksPage.tasksLink).click().perform();

//        Actions builder = new Actions(driver);
//        builder.moveToElement(TasksPage.Planner).perform();
//        builder.moveToElement(TasksPage.Tasks).click().perform();

    }

    public static void verifyTaskLibrary()  {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TasksPage.class);
        Assert.assertTrue("Task Library Legend is not displayed",isTaskLibraryLegendDisplayed());
        Assert.assertTrue("Task Library Table is not displayed",isTaskLibraryTableDisplayed());
        }

    public static boolean isTaskLibraryLegendDisplayed(){
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#course-management-container>fieldset>legend")));
        return TasksPage.taskLibraryLegend.isDisplayed();
    }

    public static boolean isTaskLibraryTableDisplayed(){
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".tablesorter.hoverPoverClose")));
        return TasksPage.taskLibraryTable.isDisplayed();
    }
}
