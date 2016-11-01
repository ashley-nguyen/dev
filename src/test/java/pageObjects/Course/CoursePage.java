package pageObjects.Course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/25/2016.
 */
public class CoursePage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Courses")
    public static WebElement Courses;
    @FindBy(how = How.LINK_TEXT, using = "Course Catalog")
    public static WebElement CourseCatalog;
    @FindBy(how = How.LINK_TEXT, using = "High School Course Catalog")
    public static WebElement HighSchoolCourseCatalog;
    @FindBy(how = How.LINK_TEXT, using = "High School Courses")
    public static WebElement HighSchoolCoursesTab;
    @FindBy(how = How.LINK_TEXT, using = "High School Subjects")
    public static WebElement HighSchoolSubjetcsTab;
    @FindBy(how = How.LINK_TEXT, using = "Advanced Computer Science")
    public static WebElement AdvancedComputerScience;
    @FindBy(how = How.LINK_TEXT, using = "Economics")
    public static WebElement EconomicsLnk;
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement lnkEnterSchoolSite;
    @FindBy(how = How.LINK_TEXT, using = "recommendations")
    public static WebElement lnkRecommendations;
    @FindBy(how = How.CLASS_NAME, using = "desc")
    public static WebElement txtCourseName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[2]/p")
    public static WebElement txtCourseId;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[3]/p")
    public static WebElement subjectArea;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[4]/p")
    public static WebElement txtCredits;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[5]/p")
    public static WebElement txtGradeLevels;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[6]/p")
    public static WebElement txtStatus;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[7]/p")
    public static WebElement txtDescription;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[8]/p")
    public static WebElement txtStateId;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[9]/p")
    public static WebElement txtInstructionalLevel;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[10]/p")
    public static WebElement txtCteCourse;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[11]/p")
    public static WebElement techPrepCourse;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[12]/p")
    public static WebElement txtCoursePrerequisites;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[13]/p")
    public static WebElement txtCourseCoRequisites;
    @FindBy(how = How.CLASS_NAME, using = "desc")
    public static WebElement txtName;
    @FindBy(how = How.CLASS_NAME, using = "data")
    public static WebElement txtNameData;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[2]/p")
    public static WebElement txtStandardCategory;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-content-container\"]/ul/li[2]/div")
    public static WebElement txtStandardCategoryData;
    @FindBy(how = How.ID, using = "content-wrapper")
    public static WebElement txtRecommendations;

    public CoursePage(WebDriver driver) {
        super(driver);
    }
}
