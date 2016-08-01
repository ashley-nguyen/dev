package pageObjects.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/13/2016.
 */
public class ReportsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Reports")
    public static WebElement Reports;

    @FindBy(how = How.LINK_TEXT, using = "Customize")
    public static WebElement Customize;

    @FindBy(how = How.XPATH, using = "//*[@id=\'customize-report\']/div[2]/input[2]")
    public static WebElement ViewReport;

    @FindBy(how = How.LINK_TEXT, using = "Usage")
    public static WebElement ViewUsageReport;

    @FindBy(how = How.LINK_TEXT, using = "Planning")
    public static WebElement ViewPlanningReport;

    @FindBy(how = How.LINK_TEXT, using = "Outcome")
    public static WebElement ViewOutcomeReport;

    @FindBy(how = How.LINK_TEXT, using = "Scholarship")
    public static WebElement ViewScholarshipReport;

    @FindBy(how = How.LINK_TEXT, using = "College")
    public static WebElement ViewCollegeReport;

    @FindBy(how = How.LINK_TEXT, using = "Score")
    public static WebElement ViewScoreReport;

    @FindBy(how = How.LINK_TEXT, using = "CTE")
    public static WebElement ViewCTEReport;

    @FindBy(how = How.LINK_TEXT, using = "Planner")
    public static WebElement ViewPlannerReport;

    @FindBy(how = How.LINK_TEXT, using = "course")
    public static WebElement ViewCourseReport;

    public ReportsPage(WebDriver driver) {
        super(driver);
    }
}
