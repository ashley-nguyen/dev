package actions.Students;

import actions.Student.Search.Search.Student_Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.DeleteStudentPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by sahara.navia on 3/23/17.
 */
public class DeleteStudent {
    public static WebDriver driver;

    /**
     * Click on Delete Student link of Student Folder
     */
    public static void clickOnDeleteStudentLink()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DeleteStudentPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(DeleteStudentPage.lnkDeleteStudent)).click();
    }

    /**
     * Click on Delete button of Delete Studnet page
     */
    public static void clickOnDeleteStudent()
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DeleteStudentPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(DeleteStudentPage.btnDeleteStudent)).click();
    }

    /**
     * Delete student, this method first search the student and then delete it.
     * @param strStudent Student information to search in Student Roster
     * @param strSearchBy Search the student by: "id", "name"
     * @throws InterruptedException
     */
    public static void deleteStudent(String strStudent, String strSearchBy)throws InterruptedException
    {
        Student_Search.studentRosterSearch(strStudent, strSearchBy);
        DeleteStudent.clickOnDeleteStudentLink();
        DeleteStudent.clickOnDeleteStudent();

    }
}
