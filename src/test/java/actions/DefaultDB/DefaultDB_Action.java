package actions.DefaultDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
        DefaultDBPage.Courses.click();
        DefaultDBPage.CourseCatalog.click();
    }
}
