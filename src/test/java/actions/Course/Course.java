package actions.Course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Course.CoursePage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/25/2016.
 */
public class Course {
    public static WebDriver driver;

    public static void ClickOnAdvancedComputerScienceCourse() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("High School Course Catalog")));
        CoursePage.HighSchoolCourseCatalog.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Advanced Computer Science")));
        CoursePage.AdvancedComputerScience.click();
    }

    public static void ClickOnEconomics() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        CoursePage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("recommendations")));
        CoursePage.lnkRecommendations.click();
    }

    public static void verifyAdvancedComputerScienceContents() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("desc")));
        String courseName = CoursePage.txtCourseName.getText();
        String courseID = CoursePage.txtCourseId.getText();
        String subjectArea =  CoursePage.subjectArea.getText();
        String credits = CoursePage.txtCredits.getText();
        String gradeLevels = CoursePage.txtGradeLevels.getText();
        String status = CoursePage.txtStatus.getText();
        String description = CoursePage.txtDescription.getText();
        String stateID = CoursePage.txtStateId.getText();
        String instructionalLevel = CoursePage.txtInstructionalLevel.getText();
        String cteCourse = CoursePage.txtCteCourse.getText();
        String techPrepCourse = CoursePage.techPrepCourse.getText();
        String coursePrerequisites = CoursePage.txtCoursePrerequisites.getText();
        String courseCoRequisites = CoursePage.txtCourseCoRequisites.getText();
        assertTrue("Course Name Verification!", courseName.contains("Course Name"));
        assertTrue("Course ID", courseID.contains("Course ID"));
        assertTrue("Subject Area", subjectArea.contains("Subject Area"));
        assertTrue("Credits", credits.contains("Credits"));
        assertTrue("Grade Levels", gradeLevels.contains("Grade Levels"));
        assertTrue("Status", status.contains("Status"));
        assertTrue("Description", description.contains("Description"));
        assertTrue("State ID", stateID.contains("State ID"));
        assertTrue("Instructional Level", instructionalLevel.contains("Instructional Level"));
        assertTrue("CTE Course", cteCourse.contains("CTE Course"));
        assertTrue("Tech Prep Course", techPrepCourse.contains("Tech Prep Course"));
        assertTrue("Course Prerequisites", coursePrerequisites.contains("Course Prerequisites"));
        assertTrue("Course Co Requisites", courseCoRequisites.contains("Course Co-requisites"));
    }

    public static void verifyEconomicsContents() throws InterruptedException {
        String name = CoursePage.txtName.getText();
        String nameData = CoursePage.txtNameData.getText();
        String standardCategory = CoursePage.txtStandardCategory.getText();
        String standardCategoryData = CoursePage.txtStandardCategoryData.getText();
        assertTrue("Name", name.contains("Name"));
        assertTrue("Economics", nameData.contains("Economics"));
        assertTrue("Standard Category", standardCategory.contains("Standard Category"));
        assertTrue("Social Sciences", standardCategoryData.contains("Social Sciences"));
    }

    public static void verifyRecommendationsNotShowErrors() throws InterruptedException {
        String recommendationsContents = CoursePage.txtRecommendations.getText();
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("Recommend Students For A Course"));
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("View Current Recommended Courses"));
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("Select a course"));
    }
}
