package pageObjects.ElementarySchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 2/24/17.
 */
public class ElementaryGroupDetailPage extends BaseClass{

    @FindBy(how = How.CSS, using = "h1")
    public static WebElement titleElementaryGroupDetailPage;

    @FindBy(how = How.CSS, using = ".common-group__line > span:nth-child(2) > span:nth-child(1)")
    public static WebElement lblPrimarySequence;

    @FindBy(how = How.CSS, using = ".group-detail-edit__editable > span:nth-child(1)")
    public static WebElement lblInstructorName;

    @FindBy(how = How.CSS, using = "div.tabs__labels")
    public static WebElement lblElementaryGroupDetailTab;

    @FindBy(how = How.CSS, using = "table.ns-table > thead > tr > th:nth-child(1) > input")
    public static WebElement txtFilterByStudentName;

    @FindBy(how = How.CSS, using = "table.ns-table > thead > tr > th:nth-child(2) > input")
    public static WebElement txtFilterByStudentID;

    @FindBy(how = How.CSS, using = "table.ns-table > tbody")
    public static WebElement tblStudentsTBody;

    @FindBy(how = How.CSS, using = ".ns-alert--warning")
    public static WebElement lblEmptyGroupMessage;

    public static By locatorStudentsTableHead = By.cssSelector("table.ns-table > thead> tr> th");
    public static By locatorStudentsTable = By.cssSelector("table.ns-table > tbody > tr");
    public static By locatorStudentsPaginator = By.cssSelector("students__paginator");

    public ElementaryGroupDetailPage(WebDriver driver) {
        super(driver);
    }
}
