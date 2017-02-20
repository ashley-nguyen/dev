package actions.Students;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.Student.Groups.GroupsPage;
import stepDefs.Hooks;


/**
 * Created by sahara.navia on 2/2/17.
 */
public class Groups {
    public static WebDriver driver;

    public static String tblGroup = "td.dark_textheader14 > table > tbody > tr:nth-child(3) > " +
            "td > table > tbody > tr > td > table > tbody > tr";

    /**
     * Click on Groups link.
     */
    public static void ClickGroupsLink() {
        AddStudents.ClickStudentsLink();
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Groups")));
        SchoolPageHeader.lnkHeaderGroups.click();
    }

    /**
     * Click on Add New Group link.
     */
    public static void ClickAddNewGroup() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, GroupsPage.class);
        GroupsPage.lnkAddNewGroup.click();
        String title = GroupsPage.titleGroupsPage.getText();
        assertTrue("'Add Student Group' page is opened", title.contains("Add Student Group"));
    }

    /**
     * Add Student Group.
     * @param code The group's code
     * @param groupName The name of the new group
     */
    public static void AddStudentGroup(String code, String groupName) {
        ClickAddNewGroup();
        GroupsPage.txtCode.sendKeys(code);
        GroupsPage.txtName.sendKeys(groupName);
        GroupsPage.btnAddGroups.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("add new group")));

        VerifyStudentGroupIsCreated(groupName);
    }

    /**
     * Verify the new Student Group was created.
     * @param groupName The name of the new group
     */
    public static void VerifyStudentGroupIsCreated(String groupName){
        PageFactory.initElements(driver, GroupsPage.class);
        String title = GroupsPage.titleGroupsPage.getText();
        assertTrue("'Student Group' page is opened", title.contains("Student Groups"));

        By locatorTlbGroup = By.cssSelector(tblGroup);

        int row = GetRowIndexByValue(locatorTlbGroup, groupName);
        assertTrue("New group '"+ groupName +"' was created correctly", row > -1);
    }


    /**
     * Search the value in the table and return the row index.
     * @param locator The locator of the table, i.e By.Id(Id)
     * @param value The value to search in the table
     * @return rowIndex, -1 if the value was not found in the table, > -1 otherwise.
     */
    public static Integer GetRowIndexByValue(By locator, String value)
    {
        driver = Hooks.driver;
        int row = -1;

        List<WebElement> tableData = RefreshObj(locator);
        for(int index = 0; index < tableData.size(); index++)
        {
            if(tableData.get(index).getText().contains(value))
            {
                row = index;
                break;
            }
        }
        return row;
    }

    /**
     * Refresh the object when it was removed from the DOM.
     * @param locator The locator of the object, i.e By.Id(Id)
     * @return WebElement of the object
     */
    public static List<WebElement> RefreshObj(By locator)
    {
        driver = Hooks.driver;
        try{
            return driver.findElements(locator);
        }
        catch(StaleElementReferenceException e)
        {
            return RefreshObj(locator);
        }
    }

    /**
     * Select Grade Year of Assign Students to a Group page.
     * @param classYear The student's class year
     */
    public static void SelectGradeYear(String classYear)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, GroupsPage.class);
        Select dropdown = new Select(GroupsPage.selGradeClass);
        dropdown.selectByValue(classYear);
    }

    /**
     * Assign students to a Student group
     * <p>
     *     This method first search the group and click on Edit Members links, select class year, search the students
     *     and then click on Assign button.
     * @param studentInfo The Student last and first name, i.e Last Name, First Name
     * @param groupName The group name
     * @param classYear The student's class year
     */
    public static void AssignStudentsToAGroup(List<String> studentInfo, String groupName, String classYear)
    {
        ClickEditMembers(groupName);
        driver = Hooks.driver;
        PageFactory.initElements(driver, GroupsPage.class);

        SelectGradeYear(classYear);

        GroupsPage.btnChangeClass.click();

        Select studentList = new Select(GroupsPage.selStudents);
        for(String student : studentInfo) {
            studentList.selectByVisibleText(student);
            GroupsPage.btnAssignStudent.click();
        }

        GroupsPage.btnUpdateMembership.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("add new group")));

    }

    /**
     * Search the group and click on Edit Members link (next to the group name)
     * @param groupName The group name
     */
    public static void ClickEditMembers(String groupName)
    {
        driver = Hooks.driver;
        By locatorGroupTable = By.cssSelector(tblGroup);

        int rowIndex = GetRowIndexByValue(locatorGroupTable, groupName);
        assertTrue("New group '"+ groupName +"' was found in the Group list", rowIndex > -1);

        WebElement element = GetGroupCellElement(rowIndex, 3);
        element.findElement(By.linkText("edit members")).click();

        String title = GroupsPage.titleGroupsPage.getText();
        assertTrue("'Edit Members' page is opened", title.contains(groupName));
    }

    /**
     * Get the group cell element , searching it by Row index and column index
     * @param rowIndex The group row index
     * @param rowIndex The group column index
     * @return WebElement, cell element
     */
    public static WebElement GetGroupCellElement(Integer rowIndex, Integer columnIndex)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, GroupsPage.class);

        WebElement groupElement = GroupsPage.tblGroupBody.findElement(By.cssSelector("tr:nth-child(" + (rowIndex + 1)
                                  + ") > td:nth-child("+ columnIndex +")"));
        return groupElement;
    }

}
