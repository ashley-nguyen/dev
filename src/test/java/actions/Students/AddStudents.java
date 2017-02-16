package actions.Students;

import java.util.LinkedHashMap;
import java.util.Map;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.Student.AddStudents.AddStudentsPage;
import stepDefs.Hooks;

/**
 * Created by sahara.navia on 1/31/17.
 */

public class AddStudents {

    public static WebDriver driver;

    /**
     * Click on Add Students Link.
     */
    public static void ClickAddStudentsLink()  {
        ClickStudentsLink();
        PageFactory.initElements(driver, SchoolPageHeader.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Student")));
        SchoolPageHeader.lnkHeaderAddStudent.click();
    }

    /**
     * Click on Students Link.
     */
    public static void ClickStudentsLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Students")));
        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkHeaderStudents).build().perform();
    }

    /**
     * Add new Students.
     * @param studentInfo The new student information <Key, Value>
     *                    i.e Key: studentLastName, studentFirstName, studentClassYear, studentGender
     */
    public static void AddStudents(LinkedHashMap<String, String> studentInfo)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AddStudentsPage.class);
        String lastName = null;
        String firstName = null;
        for (Map.Entry data : studentInfo.entrySet()) {
            String fieldValue = (String) data.getValue();
            String fieldKey = (String) data.getKey();
            switch (fieldKey) {
                case "studentLastName":
                    lastName = fieldValue;
                    new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("last_name")));
                    AddStudentsPage.txtLastName.click();
                    AddStudentsPage.txtLastName.sendKeys(fieldValue);
                    break;
                case "studentFirstName":
                    firstName = fieldValue;
                    AddStudentsPage.txtFirstName.click();
                    AddStudentsPage.txtFirstName.sendKeys(fieldValue);
                    break;
                case "studentClassYear":
                    SelectClassYear(fieldValue);
                    break;
                case "studentGender":
                    SelectGender(fieldValue);
                    break;
            }

        }
        AddStudentsPage.btnAddStudent.click();
        String actualStudentName = AddStudentsPage.lblStudentName.getText();
        String expectedStudentName = firstName + " " + lastName;

        assertTrue("The student " + expectedStudentName + " was added correctly",
                   actualStudentName.contains(expectedStudentName));
    }

    /**
     * Select Class Year from Add Student page
     * @param classYear The Student's Class Year
     */
    public static void SelectClassYear(String classYear) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AddStudentsPage.class);
        Select dropdown = new Select(AddStudentsPage.selClassYear);
        dropdown.selectByValue(classYear);
    }

    /**
     * Select Gender from Add Student page
     * @param gender The student's gender, i.e F (female) or M (male)
     */
    public static void SelectGender(String gender) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AddStudentsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.tagName("option")));
        switch (gender) {
            case "F" : AddStudentsPage.radioGenderFemale.click();
                break;
            case "M" : AddStudentsPage.radioGenderMale.click();
                break;
        }
    }

    /**
     * Register the student to Family Connection entering user name and password.
     * @param studentFCUserName The student's user name
     * @param studentFCPassword The student's password
     */
    public static void RegisterStudentToFamilyConnection(String studentFCUserName, String studentFCPassword)
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, AddStudentsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(AddStudentsPage.lnkRegisterManually)).click();
        AddStudentsPage.txtStudentFCUserName.sendKeys(studentFCUserName);
        AddStudentsPage.txtStudentFCPassword.sendKeys(studentFCPassword);
        AddStudentsPage.btnSubmitFC.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("edit username")));
    }

}