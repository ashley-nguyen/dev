package pageObjects.Colleges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by Dayasagar on 18 April 2017
 */
public class VisitsPage extends BaseClass {

    @FindBy(how = How.LINK_TEXT, using = "Colleges")
    public static WebElement lnkColleges;

    @FindBy(how = How.LINK_TEXT, using = "Visits")
    public static WebElement lnkCollegeVisits;

    @FindBy(how = How.LINK_TEXT, using = "add new visit")
    public static WebElement lnkAddVisit;

    @FindBy(how = How.NAME, using = "college")
    public static WebElement textCollege;

    @FindBy(how = How.LINK_TEXT, using = "college picker")
    public static WebElement lnkCollegePicker;

    //From College Picker Window
    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement searchCollege;

    //From College Picker Window
    @FindBy(how = How.NAME, using = "nameSearch")
    public static WebElement btnGoSearchCollege;

    @FindBy(how = How.ID, using = "date")
    public static WebElement textDate;

    @FindBy(how = How.NAME, using = "time_hour")
    public static WebElement timeHour;

    @FindBy(how = How.NAME, using = "time_minute")
    public static WebElement timeMinute;

    @FindBy(how = How.ID, using = "location")
    public static WebElement location;

    @FindBy(how = How.NAME, using = "representative")
    public static WebElement representative;

    @FindBy(how = How.NAME, using = "fc_comments")
    public static WebElement commentsStudents;

    @FindBy(how = How.NAME, using = "comments")
    public static WebElement privateNotes;

    @FindBy(how = How.ID, using = "max_attendees")
    public static WebElement maxAttendees;

    @FindBy(how = How.ID, using = "registration_cutoff_hours")
    public static WebElement deadlineHours;

    @FindBy(how = How.ID, using = "registration_cutoff_days")
    public static WebElement deadlineDays;

    @FindBy(how = How.CSS, using = ".bg2 table")
    public static WebElement tableVisits;

    @FindBy(how = How.CSS, using = ".bg2 table>tbody")
    public static WebElement tableBodyVisits;

    @FindBy(how = How.LINK_TEXT, using = "schedule visit")
    public static WebElement lnkScheduleVisit;

    @FindBy(how = How.LINK_TEXT, using = "visit settings")
    public static WebElement lnkVisitSettings;

    @FindBy(how = How.LINK_TEXT, using = "edit visit")
    public static WebElement lnkEditVisit;

    @FindBy(how = How.LINK_TEXT, using = "Cancel")
    public static WebElement btnCancelDeleteVisit;

    @FindBy(how = How.ID, using = "deleteVisit2")
    public static WebElement btnDeleteVisit;

    @FindBy(how = How.CLASS_NAME, using = "bg2")
    public static WebElement visitTable;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(2)>td[class=category11]")
    public static WebElement firstRowCollegelink;

    @FindBy(how = How.CSS, using = "td.message-wrapper")
    public static WebElement msgRepVisits;

    public static By tableRowVisits = By.cssSelector(".bg2 table tr");
















    public VisitsPage(WebDriver driver) {
        super(driver);
    }
}
