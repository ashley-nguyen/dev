package pageObjects.Student.Groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 2/2/17.
 */
public class GroupsPage extends BaseClass {

    @FindBy(how = How.LINK_TEXT, using = "add new group")
    public static WebElement lnkAddNewGroup;

    @FindBy(how = How.NAME, using = "code")
    public static WebElement txtCode;

    @FindBy(how = How.ID, using = "name")
    public static WebElement txtName;

    @FindBy(how = How.ID, using = "addGroup")
    public static WebElement btnAddGroups;

    @FindBy(how =  How.CSS, using = "td.dark_textheader14 > table > tbody > tr:nth-child(3) > " +
            "td > table > tbody > tr > td > table > tbody")
    public static WebElement tblGroupBody;

    @FindBy(how = How.CLASS_NAME, using = "table-heading")
    public static WebElement titleGroupsPage;

    @FindBy(how = How.NAME, using = "newclass")
    public static WebElement selGradeClass;

    @FindBy(how = How.ID, using = "changeClass")
    public static WebElement btnChangeClass;


    @FindBy(how = How.NAME, using = "list1")
    public static WebElement selStudents;

    @FindBy(how = How.CSS, using = "input[name=\"right\"][value=\"Add >>\"]")
    public static WebElement btnAssignStudent;

    @FindBy(how = How.CSS, using = "input[value=\"Update Membership\"]")
    public static WebElement btnUpdateMembership;



    public GroupsPage(WebDriver driver) {
        super(driver);
    }
}
