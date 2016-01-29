package actions.Course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Course.CoursePage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/25/2016.
 */
public class Course_Action {
    public static WebDriver driver;

    public static void ClickOnAdvancedComputerScienceCourse() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        CoursePage.Courses.click();
        CoursePage.CourseCatalog.click();
        CoursePage.HighSchoolCourseCatalog.click();
        CoursePage.HighSchoolCoursesTab.click();
        CoursePage.AdvancedComputerScience.click();
    }

    public static void ClickOnEconomics() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        CoursePage.Courses.click();
        CoursePage.CourseCatalog.click();
        CoursePage.HighSchoolCourseCatalog.click();
        CoursePage.HighSchoolSubjetcsTab.click();
        CoursePage.EconomicsLnk.click();
    }

    public static void ClickOnRecommendations() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        CoursePage.lnkEnterSchoolSite.click();
        CoursePage.Courses.click();
        CoursePage.lnkRecommendations.click();
    }
}
