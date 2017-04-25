package pageObjects.Colleges;

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

    @FindBy(how = How.LINK_TEXT, using = "college picker")
    public static WebElement lnkCollegePicker;

    //From College Picker Window
    @FindBy(how = How.NAME, using = "collegename")
    public static WebElement searchCollege;

    //From College Picker Window
    @FindBy(how = How.NAME, using = "namesearch")
    public static WebElement btnGoSearchCollege;

    //need custom methods for findby with linktext/anylocator

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-trigger")
    public static WebElement imgCalendar;

    //need calendar handling custom methods

    //OR

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

    @FindBy(how = How.CSS, using = "input[value=Cancel]")
    public static WebElement btnCancelAddVisit;

    @FindBy(how = How.CSS, using = "input[value=Add Visit]")
    public static WebElement btnAddVisit;

    @FindBy(how = How.CSS, using = "input[value=Add Visit and Send Email Notification]")
    public static WebElement btnAddVisitAndEmail;

    @FindBy(how = How.CSS, using = ".bg2 table")
    public static WebElement tableVisits;

    @FindBy(how = How.CSS, using = ".bg2 table>tbody")
    public static WebElement tableBodyVisits;

    //access above table for visit details and view, edit, delete links

    @FindBy(how = How.LINK_TEXT, using = "schedule visit ")
    public static WebElement lnkScheduleVisit;

    //visit view ?

    /**
     *
     * Try using same elements for edit visit page as used in add visit page
     */

   /* @FindBy(how = How.ID, using = "college")
    public static WebElement editCollege;

    @FindBy(how = How.ID, using = "date")
    public static WebElement editDate;

    @FindBy(how = How.NAME, using = "time_hour")
    public static WebElement editHour;

    @FindBy(how = How.NAME, using = "time_minute")
    public static WebElement editMinute;*/

    @FindBy(how = How.CSS, using = "input[value=Update Visit]")
    public static WebElement btnUpdateVisit;

    @FindBy(how = How.CSS, using = "input[value=Update Visit and Send Email Notification]")
    public static WebElement btnUpdateVisitAndEmail;

    @FindBy(how = How.LINK_TEXT, using = "Cancel")
    public static WebElement btnCancelDeleteVisit;

    @FindBy(how = How.ID, using = "deleteVisit2")
    public static WebElement btnDeleteVisit;

    @FindBy(how = How.CLASS_NAME, using = "bg2")
    public static WebElement visitTable;

    @FindBy(how = How.CSS, using = "tr:nth-child(2) > td:nth-child(7)>a:nth-child(3)")
    public static WebElement firstRowDel;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(2)>td[class=category11]")
    public static WebElement firstRowCollegelink;
















    public VisitsPage(WebDriver driver) {
        super(driver);
    }
}
