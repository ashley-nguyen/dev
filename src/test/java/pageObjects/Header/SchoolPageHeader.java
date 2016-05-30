package pageObjects.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 11/6/2015.
 */
public class SchoolPageHeader extends BaseClass {

    //### OBJECTS USED FOR GLOBAL SEARCH ###
    @FindBy(how = How.ID, using = "search-for-student")
    public static WebElement lnkStudentSearch;
    @FindBy(how = How.ID, using = "student-search-prototype")
    public static WebElement searchbox;
    //### COLLEGE LINK ###
    @FindBy(how = How.LINK_TEXT, using = "Colleges")
    public static WebElement lnkColleges;
    @FindBy(how = How.LINK_TEXT, using = "College Search")
    public static WebElement lnkCollegeSearch;
    @FindBy(how = How.LINK_TEXT, using = "Find Colleges")
    public static WebElement lnkFindColleges;
    @FindBy(how = How.LINK_TEXT, using = "Visits")
    public static WebElement lnkCollegeVisits;
    @FindBy(how = How.LINK_TEXT, using = "Students")
    public static WebElement lnkHeaderStudents;
    @FindBy(how = How.LINK_TEXT, using = "A")
    public static WebElement lnkA;
    @FindBy(how = How.LINK_TEXT, using = "Naviance Curriculum")
    public static WebElement lnkNavianceCurriculum;
    @FindBy(how = How.XPATH, using = "//*[@id='ui-active-menuitem']/span[1]/strong")
    public static WebElement objStudentName;
    @FindBy(how = How.TAG_NAME, using = "body")
    public static WebElement objBodyText;

    public SchoolPageHeader(WebDriver driver) {
        super(driver);
    }


}
