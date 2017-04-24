package actions.ElementarySchool;

import static org.junit.Assert.assertTrue;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import reusableComponents.TableComponent;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * Verify Lesson Plans table
     * @param expectedLessonsData Lesson Plans
     */
    public static void verifyLessonPlansTableData(List<List<String>> expectedLessonsData)
    {
        List<String> actualLessonsData = TableComponent.getRowValues(ElementaryPage.locatorElementaryGroupTable);
        String title, objective, grade, theme, duration;
        String expectedTitle, expectedObj, expectedGrade, expectedTheme, expectedDuration;
        assertTrue("The number of Lesson Plans is Not correct",
                   (expectedLessonsData.size() - 1) == actualLessonsData.size());
        for(int i=0; i<actualLessonsData.size(); i++) {
            //Split the row by Break-line
            String[] line = StringUtils.split(actualLessonsData.get(i), "\r\n");
            title = line[0]; objective = line[1]; grade = line[3]; theme = line[5]; duration = line[7];
            Boolean flag = false;

            //Iterate the expected lesson data and compare with the current one
            for (int j = 0; j < expectedLessonsData.size(); j++) {
                expectedTitle = expectedLessonsData.get(j).get(0);
                expectedObj = expectedLessonsData.get(j).get(1);
                expectedGrade = expectedLessonsData.get(j).get(2);
                expectedTheme = expectedLessonsData.get(j).get(3);
                expectedDuration = expectedLessonsData.get(j).get(4);
                    if (expectedTitle.compareTo(title) == 0)
                    {
                        flag = true;
                        assertTrue("Lesson title is Not correct '" + expectedTitle +"'", title.contains(expectedTitle));
                        assertTrue("Lesson objective is Not correct '" + expectedObj +"'", objective.contains(expectedObj));
                        assertTrue("Lesson grade is Not correct '" + expectedGrade +"'", grade.contains(expectedGrade));
                        assertTrue("Lesson theme is Not correct '" + expectedTheme +"'", theme.contains(expectedTheme));
                        assertTrue("Lesson duration is Not correct '" + expectedDuration +"'", duration.contains(expectedDuration));
                        break;
                    }
            }
            assertTrue("Lesson '" + title + "' is not displayed in the table", flag);
        }

    }
}
