package actions.DefaultDB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DefaultDB.DefaultDBPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/20/2016.
 */
public class DefaultDB_Action {
    public static WebDriver driver;

    public static void  NavigateToCourses() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DefaultDBPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        DefaultDBPage.Courses.click();
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Course Catalog")));
//        DefaultDBPage.CourseCatalog.click();
    }
}
