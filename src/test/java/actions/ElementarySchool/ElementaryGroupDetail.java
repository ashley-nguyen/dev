package actions.ElementarySchool;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryGroupDetailPage;
import pageObjects.ElementarySchool.ElementaryPage;
import reusableComponents.TableComponent;
import stepDefs.Hooks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Calendar;
import java.util.Objects;

import static org.junit.Assert.assertTrue;


/**
 * Created by sahara.navia on 2/24/17.
 */
public class ElementaryGroupDetail {

    public static WebDriver driver;

    /**
     * Verify the group information displayed in the Elementary group detail page (Group name, Instructor, Primary sequence)
     * @param groupName The group name
     * @param instructorName The instructor name
     * @param primarySequence The Lesson sequence, i.e Grade K Lessons
     */
    public static void verifyGroupInGroupDetailPage(String groupName, String instructorName, String primarySequence)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ElementaryGroupDetailPage.class);
        List<String> expectedInsructor = Arrays.asList(instructorName.split("\\s*,\\s*"));

        // Verify Group name
        new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.textToBePresentInElement(ElementaryGroupDetailPage.titleElementaryGroupDetailPage,
                groupName));

        // Verify Primary Sequence
        String sequence = ElementaryGroupDetailPage.lblPrimarySequence.getText();
        assertTrue("The '"+ sequence +"' is displayed correctly in the group detail page", primarySequence.contains(sequence));

        // Verify Instructor
        String instructors = ElementaryGroupDetailPage.lblInstructorName.getText();
        instructors = instructors.replace("Instructor(s): ", "");
        List<String> currentInsructor = Arrays.asList(instructors.split("\\s*,\\s*"));
        assertTrue("The '"+ instructors +"' is displayed correctly in the group table", currentInsructor.containsAll(expectedInsructor) &&
                currentInsructor.size() == expectedInsructor.size());
    }

    /**
     * Click on tabs of Elementary Group detail page
     * @param tabLabel tab label, i.e "Students", "Activity", "Grade X Lesson Plans"
     */
    public static void clickOnElementaryGroupDetailTab(String tabLabel)
    {
        driver = Hooks.driver;
        boolean tabExists = false;
        PageFactory.initElements(driver, ElementaryGroupDetailPage.class);
        List<WebElement> eleTabs = ElementaryGroupDetailPage.lblElementaryGroupDetailTab.findElements(By.xpath(".//span"));

        for (WebElement tab : eleTabs) {
            if(tabLabel.contains(tab.getText()))
            {   tabExists = true;
                tab.click();
                break;
            }
        }
        assertTrue("'"+ tabLabel+"' tab is Not Displayed on Elementary group detail page.", tabExists);
    }

    /**
     * Get place holder of the Student Filter text box
     * @param element TextBox Web element
     * @return  Placeholder value
     */
    public static String getStudentsFilterPlaceHolder(WebElement element)
    {   By filterLocator =  By.cssSelector("input");
        WebElement studentsFilter = new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.visibilityOf(element.findElement(filterLocator)));
        return studentsFilter.getAttribute("placeholder");
    }

    /**
     * Verify Sort icon of Students table columns and the filter fields
     *  Student column should has Ascending order by default and it should has filter field
     *  Student ID and Class/Grade columns should not be ordered by default and only Student ID should has filter field
     */
    public static void verifyStudentsColumnSortIconAndFilterFields() {
        driver = Hooks.driver;
        List<WebElement> columnsElement = (driver.findElements(ElementaryGroupDetailPage.locatorStudentsTableHead));
        for (WebElement element : columnsElement) {
            if (!element.getText().isEmpty()) {
                String order = element.findElement(By.cssSelector("div > i")).getAttribute("class");
                String column = element.getText();
                switch (column) {
                    case "Students":
                        assertTrue("Students column does not have Ascending order by default", order.contains("ns-icon--sort-up"));
                        String studentsPlaceholder = getStudentsFilterPlaceHolder(element);
                        assertTrue("The placeholder of 'Students' column is Not correct", studentsPlaceholder.contains("Find students by name"));
                        break;
                    case "Student ID":
                        assertTrue("Student ID column is ordered by default", order.contains("ns-icon--sort"));
                        String studentIdPlaceholder = getStudentsFilterPlaceHolder(element);
                        assertTrue("The placeholder of 'Student ID' column is Not correct", studentIdPlaceholder.contains("Find students by ID"));
                        break;
                    case "Class/Grade":
                        assertTrue("Class/Grade column is ordered by default", order.contains("ns-icon--sort"));
                        List<WebElement> classGradeFilter = element.findElements(By.cssSelector("input"));
                        assertTrue("Filter field is displayed on 'Class/Grade' column", classGradeFilter.size()==0);
                        break;
                }
            }
        }
    }

    /**
     * Verify the Students tab in group detail page, verify the columns of the table
     */
    public static void verifyStudentsTableElementaryGroupDetail()
    {
        String columns = "Students, Student ID, Class/Grade";
        List<String> expectedTableColumns = Arrays.asList(columns.split("\\s*,\\s*"));
        clickOnElementaryGroupDetailTab("Students");

        // Verify columns on the Students table
        List<String> tableColumns = TableComponent.getRowValues(ElementaryGroupDetailPage.locatorStudentsTableHead);
        tableColumns.removeAll(Collections.singleton(""));
        assertTrue("Students table columns label are not correct", tableColumns.containsAll(expectedTableColumns) &&
                   tableColumns.size() == expectedTableColumns.size());

        // Verify Students column icons and filter fields
        verifyStudentsColumnSortIconAndFilterFields();
    }

    /**
     * Filter the Students table by Student Name or Student ID
     * @param filterBy Filter textBox; i.e "studentName", "studentID"
     * @param value Value to Filter the Students table
     */
    public static void filterStudentsTable(String filterBy, String value)
    {   WebElement element;
        switch (filterBy) {
            case "studentName":
                element = ElementaryGroupDetailPage.txtFilterByStudentName;
                //element.click();
                //element.sendKeys(value);
                break;
            case "studentID":
                element = ElementaryGroupDetailPage.txtFilterByStudentName;
                //element.click();
                //element.sendKeys(value);
                break;
            default: element = null;
                assertTrue("'"+ filterBy + "' is Not a valid filter option", false);
                break;
        }
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    /**
     * Get Student Class(Grade) value
     * i.e 2017 (Grade 12); 2016 (ALUMNI)
     * @param classYear Student class year; i.e 2017
     * @return class grade value
     */
    public static String getStudentClassGrade(String classYear)
    {
        String classGrade;
        classGrade = "Invalid Class Year";
        int studentClassYear = Integer.parseInt(classYear);
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int diffYears = studentClassYear - currentYear;
        if(studentClassYear > 2000 && diffYears <= 12) {
            if (studentClassYear >= currentYear) {
                int grade = 12 - diffYears;
                String gradeVal = (grade > 0) ? Integer.toString(grade) : "K";
                classGrade = studentClassYear + " (Grade " + gradeVal + ")";
            } else {
                classGrade = studentClassYear + " (ALUMNI)";
            }
        }
        else {
            assertTrue("'" + studentClassYear + "' is Not a valid Class Year, it should be greater than 2000.", false);
        }
        return classGrade;
    }

    /**
     * Verify student displayed on Students table
     * @param studentName Student Name; 'Last Name, First Name'
     * @param studentClassYear Student Class Year; i.e '2017'
     * @param studentId Student Id
     */
    public static void verifyStudentsDisplayedOnStudentsTab(String studentName, String studentClassYear,
                                                            String studentId) throws InterruptedException
    {
        // Filter the Students table by Student Name
        filterStudentsTable("studentName", studentName);

        // Verify Student is displayed
        int rowIndex = TableComponent.getRowIndexByValue(ElementaryGroupDetailPage.locatorStudentsTable, studentName);
        assertTrue("The Student '" + studentName + "' is Not displayed on Students tab", rowIndex > -1);

        // Verify Student ID
        WebElement studentIDCellElement = TableComponent.getCellElement(ElementaryGroupDetailPage.tblStudentsTBody, rowIndex, 2);
        String actualStudentID = studentIDCellElement.getText();
        assertTrue("The Student ID of '" + studentName + "' is incorrect on Students tab", studentId.compareTo(actualStudentID) == 0);

        // Verify Student Class Grade
        WebElement studentGradeCellElement = TableComponent.getCellElement(ElementaryGroupDetailPage.tblStudentsTBody, rowIndex, 3);
        String actualStudentGrade = studentGradeCellElement.getText();
        String expectedStudentGrade = getStudentClassGrade(studentClassYear);
        assertTrue("The Student Class/Grade of '" + studentName + "' is incorrect on Students tab", expectedStudentGrade.compareTo(actualStudentGrade) == 0);
    }

}
