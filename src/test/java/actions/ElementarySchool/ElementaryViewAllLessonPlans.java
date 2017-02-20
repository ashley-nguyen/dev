package actions.ElementarySchool;

import actions.Students.Groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import stepDefs.Hooks;

/**
 * Created by sahara.navia on 2/17/17.
 */
public class ElementaryViewAllLessonPlans {
    public static WebDriver driver;
    public static String gradeFilter = "All Grades,Grade K,Grade 1,Grade 2,Grade 3,Grade 4,Grade 5";
    public static String themeFilter = "All Themes,Opening Activity,Planning and Possibilities,Self Knowledge," +
            "Career Exploration,School and Courses,College Exploration,Affordability,Closing Activity";

    /**
     * Verify View all Lesson Plans Page
     */
    public static void verifyViewAllLessonPlansPage()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        By gradeDropdown = By.cssSelector("select.ns-select:nth-child(2)");
        By themeDropdown = By.cssSelector("select.ns-select:nth-child(4)");
        By locatorElementaryGroupTable = By.cssSelector("table.mt-1-rem > tbody > tr");
        WebElement elementGrade = ElementaryPage.selElementaryGrade;
        WebElement elementTheme = ElementaryPage.selElementaryTheme;

        // Verify Grade and Theme dropdowns
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(gradeDropdown));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(themeDropdown));
        ElementaryProductPage.verifyElementaryFilterValues(elementGrade, gradeFilter);
        ElementaryProductPage.verifyElementaryFilterValues(elementTheme, themeFilter);

        // Verify Lesson Plans table
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(locatorElementaryGroupTable));


    }
}
