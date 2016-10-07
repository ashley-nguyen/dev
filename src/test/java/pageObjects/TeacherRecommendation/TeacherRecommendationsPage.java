package pageObjects.TeacherRecommendation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 6/20/2016.
 */
public class TeacherRecommendationsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Teacher Recommendations")
    public static WebElement lnkTeacherRecommendations;

    @FindBy(how = How.CSS, using = "img[src=\'../../images/transcripts/transcripts_requests_tab_on.gif\']")
    public static WebElement tabRequests;

    @FindBy(how = How.CSS, using = "img[src=\'../../images/transcripts/transcripts_settings_tab.gif\']")
    public static WebElement tabSettings;

    @FindBy(how = How.XPATH, using = "//input[@name='can_request_recommendations']")
    public static WebElement rbRecommendationDoNotRequireApproval;

    @FindBy(how = How.CSS, using = "img[src=\'../../images/processapps/apps_summary_tab.gif\']")
    public static WebElement tabSummary;

    @FindBy(how = How.XPATH, using = "//*[@id=\"class\"]")
    public static WebElement selClass;

    @FindBy(how = How.XPATH, using = "//select[@name='status']")
    public static WebElement selList;

    @FindBy(how = How.NAME, using = "processing")
    public static WebElement formNameTable;

    @FindBy(how = How.ID, using = "selected_list")
    public static WebElement tableId;

    @FindBy(how = How.XPATH, using = "//select[@name='start_year']")
    public static WebElement selStartYear;

    @FindBy(how = How.XPATH, using = "//select[@name='end_year']")
    public static WebElement selEndYear;

    @FindBy(how = How.XPATH, using = "//*[@id=\"goList\"]")
    public static WebElement btnGo;

    @FindBy(how = How.XPATH, using = "//input[@name='updateSettings']")
    public static WebElement btn_save_setting;

    @FindBy(how = How.XPATH, using = "//input[@name='changeRange']")
    public static WebElement btn_go_summary;

    public TeacherRecommendationsPage(WebDriver driver) {
        super(driver);
    }
}
