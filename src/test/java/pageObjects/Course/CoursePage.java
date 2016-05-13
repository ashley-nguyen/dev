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

    public CoursePage(WebDriver driver) {
        super(driver);
    }
}
