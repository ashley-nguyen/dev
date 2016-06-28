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

    @FindBy(how = How.XPATH, using = "//*[@id=\"class\"]")
    public static WebElement selClass;

    @FindBy(how = How.XPATH, using = "//*[@id=\"current_table\"]/table/tbody/tr[3]/td[2]/select")
    public static WebElement selList;

    @FindBy(how = How.NAME, using = "quicklist")
    public static WebElement formNameTable;

    @FindBy(how = How.XPATH, using = "//*[@id=\"goList\"]")
    public static WebElement btnGo;

    public TeacherRecommendationsPage(WebDriver driver) {
        super(driver);
    }
}
