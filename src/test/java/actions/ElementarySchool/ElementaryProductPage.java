package actions.ElementarySchool;

import static org.junit.Assert.assertTrue;

import actions.TestPrep.TestPrep;
import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import pageObjects.Header.SchoolPageHeader;
import reusableComponents.TableComponent;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sahara.navia on 2/16/17.
 */
public class ElementaryProductPage {

    public static WebDriver driver;
    static WebdriverComponents component = new WebdriverComponents();

    public static String expectedElemProductPageTitle = "Naviance for Elementary School";
    public static String expectedViewAllLessonTitle = "Lesson Plans";
    public static String expectedAssignLessonTitle = "Assign a Lesson Sequence";
    public static String expectedSchoolActivityTitle = "School Activity";
    public static String sequenceFilter = "Any Primary Sequence,Grade K Lessons Sequence,Grade 1 Lessons Sequence," +
            "Grade 2 Lessons Sequence,Grade 3 Lessons Sequence,Grade 4 Lessons Sequence,Grade 5 Lessons Sequence";

    public ElementaryProductPage()
    {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);

    }

    /**
     * Click on Naviance Elementary School Link from Quick Links
     */
    public static void clickElementarySchoolLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        PageFactory.initElements(driver, ElementaryPage.class);

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(SchoolPageHeader.lnkNavianceElementarySchool)).click();
        try {
            new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                    expectedElemProductPageTitle));
            String elementaryProductPageTitle = ElementaryPage.titleElementaryProductPage.getText();
            assertTrue("Naviance for Elementary School page is opened",
                       elementaryProductPageTitle.contains(expectedElemProductPageTitle));

        }catch (Exception e){
            assertTrue("Unable to find the link 'Naviance Elementary School'", false);
        }
    }

    /**
     * Click on View All Lesson Plans link from Product Page
     */
    public static void clickViewAllLessonPlansLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkViewAllLessonPlans.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(ElementaryPage.locatorPageTitle));
        String elementaryViewAllLessonTitle = ElementaryPage.titleElementaryProductPage.getText();
        assertTrue("View All Lesson Plans page is opened",
                elementaryViewAllLessonTitle.contains(expectedViewAllLessonTitle));
    }

    /**
     * Click on Assign a Lesson Sequence link from Product Page
     */
    public static void clickAssignALessonSequenceLink() throws InterruptedException{
        driver = Hooks.driver;
        String sequenceDropdown = "select.ns-select";
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkAssignALessonSequence.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sequenceDropdown)));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                expectedAssignLessonTitle));
    }

    /**
     * Click on School Activity link from Product Page
     */
    public static void clickSchoolActivityLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        ElementaryPage.lnkSchoolActivity.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                expectedSchoolActivityTitle));
    }

    /**
     * Verify Elementary Product Page
     */
    public static void verifyElementaryProductPage()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryPage.class);
        String instructorDropdown = "instructor-filter";
        String sequenceDropdown = "sequence-filter";
        By locatorElementaryGroupTable = By.cssSelector("table.ns-table");
        WebElement element = ElementaryPage.selElementarySequence;

        // Verify Instructor and Sequence dropdowns
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(instructorDropdown)));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(sequenceDropdown)));
        verifyElementaryFilterValues(element, sequenceFilter);

        // Verify Elementary Group table
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(locatorElementaryGroupTable));
    }

    /**
     * Verify Elementary filter options
     * @param element The WebElement of the dropdown
     * @param expectedValues The list of the expected values in the dropdown (string separated by commas ',')
     *                       i.e String A = "a1,a2,a3,a4"
     */
    public static void verifyElementaryFilterValues(WebElement element, String expectedValues)
    {
        List<String> currentFilter = new ArrayList<String>();

        List<String> expectedFilter = Arrays.asList(expectedValues.split("\\s*,\\s*"));

        Select eleDropdown = new Select(element);
        List<WebElement> elementCount = eleDropdown.getOptions();

        for (WebElement option:elementCount)
        {
            currentFilter.add(option.getText());
        }
        assertTrue("Elementary sequence filter displays all values", currentFilter.containsAll(expectedFilter) &&
                currentFilter.size() == expectedFilter.size());
    }

    /**
     * Filter the Elementary groups table
     * @param instructorName The instructor name
     * @param sequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void filterElementaryProductPage(String instructorName, String sequence)
    {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(ElementaryPage.locatorPageTitle));

        // Filter the Elementary groups table
        TestPrep.FilterTestPrep(ElementaryPage.selElementaryInstructor, instructorName);
        TestPrep.FilterTestPrep(ElementaryPage.selElementarySequence, sequence);
    }

    /**
     * Verify that a new lesson sequence was assigned to a group
     * @param groupName The group name
     * @param instructorName The instructor name
     * @param sequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void verifyAssignedLessonSequenceToAGroup(String groupName, String instructorName, String sequence)
    {
        // Filter the Elementary groups table
        filterElementaryProductPage(instructorName, sequence);

        // Verify if the group is present in the table
        int row = TableComponent.getRowIndexByValue(ElementaryPage.locatorElementaryGroupTable, groupName);
        assertTrue("New group '"+ groupName +"' was Not created correctly in Elementary", row > -1);
    }

    /**
     * Open the Elementary group
     * @param groupName The group name
     */
    public static void openElementaryGroup(String groupName)
    {
        int rowIndex = TableComponent.getRowIndexByValue(ElementaryPage.locatorElementaryGroupTable, groupName);
        assertTrue("The '"+ groupName +"' is present in Elementary groups table", rowIndex > -1);
        WebElement groupElem = TableComponent.getCellElement(ElementaryPage.tblElementaryTBodyGroups, rowIndex, 1);
        groupElem.findElement(By.linkText(groupName)).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.titleElementaryProductPage,
                          groupName));
    }

    /**
     * Verify the group information displayed in the Elementary groups table (Group name, Instructor, Lesson sequence)
     * @param groupName The group name
     * @param instructorName The instructor name
     * @param sequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void verifyGroupInformation(String groupName, String instructorName, String sequence)
    {
        List<String> expectedInsructor = Arrays.asList(instructorName.split("\\s*,\\s*"));
        int rowIndex = TableComponent.getRowIndexByValue(ElementaryPage.locatorElementaryGroupTable, groupName);
        assertTrue("The '"+ groupName +"' is present in Elementary groups table", rowIndex > -1);

        // Verify group information
        WebElement groupElem = TableComponent.getCellElement(ElementaryPage.tblElementaryTBodyGroups, rowIndex, 1);
        String title = groupElem.findElement(ElementaryPage.locatorGroupNameElemProdPage).getText();
        assertTrue("The '"+ groupName +"' is present in Elementary groups table", title.contains(groupName));
        String primarySequence = groupElem.findElement(ElementaryPage.locatorPrimarySeqElemProdPage).getText();
        assertTrue("The '"+ sequence +"' is displayed correctly in the group table", primarySequence.contains(sequence));
        String instructors = groupElem.findElement(ElementaryPage.locatorInstructorElemProdPage).getText();
        instructors = instructors.replace("Instructor(s): ", "");
        List<String> currentInsructor = Arrays.asList(instructors.split("\\s*,\\s*"));
        assertTrue("The '"+ instructors +"' is displayed correctly in the group table", currentInsructor.containsAll(expectedInsructor) &&
                currentInsructor.size() == expectedInsructor.size());
    }

    /**
     * Get the number of groups in Elementary groups table
     * @return number of groups
     */
    public static Integer getNumberOfGroups()
    {
        Integer groupsCount;
        String title;
        WebElement element = ElementaryPage.tblElementaryTHeadGroups;

        title = element.getText();
        groupsCount = Integer.parseInt(title.replaceAll("\\D+", ""));
        return groupsCount;
    }

    /**
     * Delete an Elementary group
     * @param groupName The group name
     * @param sequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void deleteElementaryGroup(String groupName, String sequence)
    {
        int rowIndex = TableComponent.getRowIndexByValue(ElementaryPage.locatorElementaryGroupTable, groupName);
        assertTrue("The group '"+ groupName +"' is Not present in Elementary groups table", rowIndex > -1);

        // Click on delete icon
        WebElement deleteIconElem = TableComponent.getCellElement(ElementaryPage.tblElementaryTBodyGroups, rowIndex, 2);
        deleteIconElem.click();

        // Verify Text of Removing group
        verifyRemovingGroupMessage(groupName, sequence);

        //Click on Remove group button
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ElementaryPage.btnRemoveGroup));
        ElementaryPage.btnRemoveGroup.click();

        // Verify message after removing the group
        verifyAfterRemovingGroupMessage(groupName);
    }

    /**
     * Verify a message is displayed after a Elementary group is removed
     * @param groupName The group name
     */
    public static void verifyAfterRemovingGroupMessage(String groupName)
    {

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(ElementaryPage.lblAfterRemoving));
        String message = ElementaryPage.lblAfterRemoving.getText();
        assertTrue("Message after removing group: '" + message + "'", message.contains(groupName));
    }

    /**
     * Verify message before group is removed
     * @param groupName The group name
     * @param sequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void verifyRemovingGroupMessage(String groupName, String sequence)
    {
        WebElement element = ElementaryPage.lblRemovingMessage;
        String message = element.getText();
        //Split the message by Break-line
        String[] lines = StringUtils.split(message, "\r\n");
        assertTrue("Group '" + groupName + "' is displayed in the Removing group message", lines[0].contains(groupName));
        assertTrue("Primary Sequence '" + sequence + "' is displayed in the Removing group message", lines[1].contains(sequence));

    }

    /**
     * Verify group is not displayed in the product page
     * @param groupName The group name
     */
    public static void verifyGroupIsNotDisplayedInProductPage(String groupName)
    {
        Boolean isMessagePresent = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(ElementaryPage.locatorSuccessMessage));
        if (isMessagePresent)
        {
            int rowIndex = TableComponent.getRowIndexByValue(ElementaryPage.locatorElementaryGroupTable, groupName);
            assertTrue("The group '" + groupName + "' is NOT present in Elementary groups table", rowIndex == -1);
        }
        else
        {
            assertTrue("The group '" + groupName + "' is present in Elementary groups table", false);
        }
    }
}