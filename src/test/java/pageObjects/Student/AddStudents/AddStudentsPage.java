package pageObjects.Student.AddStudents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 1/31/17.
 */
public class AddStudentsPage extends BaseClass {

    @FindBy(how = How.NAME, using = "last_name")
    public static WebElement txtLastName;

    @FindBy(how = How.NAME, using = "first_name")
    public static WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "class_year")
    public static WebElement selClassYear;

    @FindBy(how = How.CSS, using = "input[name=\"gender\"][value=\"M\"]")
    public static WebElement radioGenderMale;

    @FindBy(how = How.CSS, using = "input[name=\"gender\"][value=\"F\"]")
    public static WebElement radioGenderFemale;

    @FindBy(how = How.ID, using = "addStudent")
    public static WebElement btnAddStudent;

    @FindBy(how = How.LINK_TEXT, using = "register manually")
    public static WebElement lnkRegisterManually;

    @FindBy(how = How.NAME, using = "student_fc_username")
    public static WebElement txtStudentFCUserName;

    @FindBy(how = How.NAME, using = "student_fc_password")
    public static WebElement txtStudentFCPassword;

    @FindBy(how = How.ID, using = "updateFC")
    public static WebElement btnSubmitFC;

    @FindBy(how = How.CSS, using = "td.dark_textheader16:nth-child(1)")
    public static WebElement lblStudentName;


    public AddStudentsPage(WebDriver driver) {
        super(driver);
    }
}