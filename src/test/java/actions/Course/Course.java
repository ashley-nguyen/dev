package actions.Course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Course.CoursePage;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/25/2016.
 */
public class Course {
    public static WebDriver driver;

    public static void ClickOnAdvancedComputerScienceCourse() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, CoursePage.class);
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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        CoursePage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Courses")));
        CoursePage.Courses.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("recommendations")));
        CoursePage.lnkRecommendations.click();
    }

    public static void verifyAdvancedComputerScienceContents() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("desc")));
        String courseName = Hooks.driver.findElement(By.className("desc")).getText();
        String courseID = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[2]/p")).getText();
        String subjectArea = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[3]/p")).getText();
        String credits = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[4]/p")).getText();
        String gradeLevels = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[5]/p")).getText();
        String status = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[6]/p")).getText();
        String description = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[7]/p")).getText();
        String stateID = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[8]/p")).getText();
        String instructionalLevel = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[9]/p")).getText();
        String cteCourse = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[10]/p")).getText();
        String techPrepCourse = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[11]/p")).getText();
        String coursePrerequisites = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[12]/p")).getText();
        String courseCoRequisites = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[13]/p")).getText();
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
        String name = Hooks.driver.findElement(By.className("desc")).getText();
        String nameData = Hooks.driver.findElement(By.className("data")).getText();
        String standardCategory = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[2]/p")).getText();
        String standardCategoryData = Hooks.driver.findElement(By.xpath("//*[@id=\"main-content-container\"]/ul/li[2]/div")).getText();
        assertTrue("Name", name.contains("Name"));
        assertTrue("Economics", nameData.contains("Economics"));
        assertTrue("Standard Category", standardCategory.contains("Standard Category"));
        assertTrue("Social Sciences", standardCategoryData.contains("Social Sciences"));
    }

    public static void verifyRecommendationsNotShowErrors() throws InterruptedException {
        String recommendationsContents = Hooks.driver.findElement(By.id("content-wrapper")).getText();
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("Recommend Students For A Course"));
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("View Current Recommended Courses"));
        assertTrue("Verify Recommendations Contents", recommendationsContents.contains("Select a course"));
    }
}
