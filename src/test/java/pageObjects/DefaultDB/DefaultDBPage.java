package pageObjects.DefaultDB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/20/2016.
 */
public class DefaultDBPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Enter school site")
    public static WebElement School;
    @FindBy(how = How.LINK_TEXT, using = "Courses")
    public static WebElement Courses;
    @FindBy(how = How.LINK_TEXT, using = "Course Catalog")
    public static WebElement CourseCatalog;
    @FindBy(how = How.LINK_TEXT, using = "Reports")
    public static WebElement lnkReports;
    @FindBy(how = How.LINK_TEXT, using = "Planner")
    public static WebElement lnkPlanner;
    @FindBy(how = How.LINK_TEXT, using = "Courses")
    public static WebElement lnkCourses;
    @FindBy(how = How.LINK_TEXT, using = "Scholarships")
    public static WebElement lnkScholarships;
    @FindBy(how = How.LINK_TEXT, using = "Colleges")
    public static WebElement lnkColleges;
    @FindBy(how = How.LINK_TEXT, using = "Connections")
    public static WebElement lnkConnections;
    @FindBy(how = How.CLASS_NAME, using = "main-navigation")
    public static WebElement txtErrorsMessage;
    @FindBy(how = How.ID, using = " main-content-container")
    public static WebElement txtMessage;




    public DefaultDBPage(WebDriver driver) {
        super(driver);
    }
}
