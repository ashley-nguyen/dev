package actions.Course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Course Catalog")));
//        CoursePage.CourseCatalog.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Course Catalog")));
        CoursePage.HighSchoolCourseCatalog.click();
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Courses")));
//        CoursePage.HighSchoolCoursesTab.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Advanced Computer Science")));
        CoursePage.AdvancedComputerScience.click();
    }

    public static void ClickOnEconomics() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
//        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Course Catalog")));
//        CoursePage.CourseCatalog.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Course Catalog")));
        CoursePage.HighSchoolCourseCatalog.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Subjects")));
        CoursePage.HighSchoolSubjetcsTab.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Economics")));
        CoursePage.EconomicsLnk.click();
    }

    public static void ClickOnRecommendations() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        CoursePage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("recommendations")));
        CoursePage.lnkRecommendations.click();
    }
}
