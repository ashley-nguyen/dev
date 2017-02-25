package actions.TestPrep;

import java.util.List;
import java.util.Arrays;

import actions.Students.Groups;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.TestPrep.AssignStudyProgramsPage;
import pageObjects.TestPrep.TestPrepPage;
import reusableComponents.TagEditorComponent;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrep {
    public static WebDriver driver;
    public static String titlePage = "Assign Study Programs";
    public static String msgNewAssignedGroup = "1 student group has been successfully assigned study programs";
    public static String tblTestPrepHeader = "tr.ns-table__row";

    /**
     * Click on Naviance Test Prep Link from Quick Links
     */
    public static void clickTestPrepLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        SchoolPageHeader.lnkNavianceTestPrep.click();
    }

    /**
     * Click on Skip Walk Through page, when it is displayed.
     */
    public static void skipWalkThroughPage() {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (isWalkThroughPageLoaded()) {
            PageFactory.initElements(driver, TestPrepPage.class);
            TestPrepPage.gotItButton.click();
        }
    }

    /**
     * Verify if Walk Through page is displayed
     * @return True if the Page source contains the Walk Through text, False in othercase.
     */
    public static boolean isWalkThroughPageLoaded() {
        driver = Hooks.driver;
        String pageSource = driver.getPageSource();
        return pageSource.contains("Take a tour to discover all the changes we've made to simplify the setup process");
    }

    /**
     * Click on Assign Study Programs link from Test Prep Product page.
     */
    public static void ClickOnAssignStudyPrograms()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, TestPrepPage.class);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(titlePage)));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(TestPrepPage.linkAssignStudyPrograms));

        TestPrepPage.linkAssignStudyPrograms.click();
    }

    /**
     * Assign study Program(s) to a Student Group
     * <p>
     *     This method selects Study Program, instructor and Student Group
     * @param studyProgram The Study Program(s) list, i.e 'ACT Prep, SAT Prep'
     * @param instructorName The Study Program(s) list, i.e 'Sarita Moscoso, Nicolas Moscoso'
     * @param groupName The Student group name, this is an existing Student Group
     */
    public static void AssignStudyPrograms(String studyProgram, String instructorName, String groupName)
    {
        List<String> groupsName = Arrays.asList(groupName.split("\\s*,\\s*"));
        List<String> studyPrograms = Arrays.asList(studyProgram.split("\\s*,\\s*"));
        List<String> instructors = Arrays.asList(instructorName.split("\\s*,\\s*"));
        int groupCount = groupsName.size();
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(tblTestPrepHeader)));

        ClickOnAssignStudyPrograms();

        VerifyAssignStudyProgramsPageTitle();

        // Enter Study Program(s)
        WebElement studyProgramElement = AssignStudyProgramsPage.txtStudyProgramsToAssign;
        TagEditorComponent.selectOptionTagEditor(studyProgramElement, studyPrograms);

        // Enter Instructor(s)
        WebElement instructorElement = AssignStudyProgramsPage.txtInstructorsToAssign;
        TagEditorComponent.selectOptionTagEditor(instructorElement, instructors);

        // Enter Group(s)
        WebElement groupElement = AssignStudyProgramsPage.txtGroupsToAssign;
        TagEditorComponent.selectOptionTagEditor(groupElement, groupsName);

        // Click on Save
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AssignStudyProgramsPage.btnSave)).click();

        // Verify the group was assigned, verify number of groups assigned.
        WebElement message = AssignStudyProgramsPage.lblSuccessMessage;
        String msgManyAssignedGroups = groupCount + " student groups have been successfully assigned study programs";
        String successMessage = (groupCount == 1) ? msgNewAssignedGroup : msgManyAssignedGroups;
        assertTrue("The new groups was assigned to a Study Program." , (message.getText()).contains(successMessage));
    }

    /**
     * Verify Assign Study Programs page title
     */
    public static void VerifyAssignStudyProgramsPageTitle()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AssignStudyProgramsPage.class);
        String title = AssignStudyProgramsPage.titleAssignStudyProgran.getText();
        assertTrue("'Assign Study Programs' page is opened", title.contains(titlePage));

    }

    /**
     * Verify the new group was assigned to a Study Program and it is displayed in Test Prep group table
     * <p>
     *     This method first filters the Test Prep group table by study program and instructor
     * @param groupName The group name
     * @param instructorName The instuctor name to filter the table
     * @param studyProgram The study program to filter the table
     */
    public static void VerifyAssignedGroup(String groupName, String instructorName, String studyProgram)
    {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        FilterTestPrep(TestPrepPage.selInstructors, instructorName);
        FilterTestPrep(TestPrepPage.selStudyPrograms, studyProgram);
        By LocatorTestPrepGroupTable = By.cssSelector("div.ng-scope > table > tbody > tr");
        int row = Groups.GetRowIndexByValue(LocatorTestPrepGroupTable, groupName);
        assertTrue("New group '"+ groupName +"' was created correctly", row > -1);
    }

    /**
     * Verify the new group was assigned to a Study Program and it is displayed in Test Prep group table.
     * <p>
     *     This method first filter the Test Prep group table by study program and instructor.
     * @param element The Webelement of the dropdown
     * @param value The value to select in the dropdown
     */
    public static void FilterTestPrep(WebElement element, String value)
    {
        Select instructorDropdown = new Select(element);
        List <WebElement> elementCount = instructorDropdown.getOptions();
        int iSize = elementCount.size();
        for(int i = 0; i < iSize ; i++){
            String option = elementCount.get(i).getText();
            if(option.contains(value))
            {
                elementCount.get(i).click();
                break;
            }

        }
    }

}
