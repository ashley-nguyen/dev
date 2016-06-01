package actions.Student.Search.Search;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.Student.StudentRosterPage;
import stepDefs.Hooks;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class Student_Search {
    public static WebDriver driver;

    public static void searchStudent(String strStudent) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            //CLICK THE SEARCH ICON
            SchoolPageHeader.lnkStudentSearch.click();
            //ENTER STUDENT NAME
            SchoolPageHeader.searchbox.sendKeys(strStudent);
            Thread.sleep(3000);
            //CLICK ON STUDENT NAME AFTER WAITING FOR IT TO APPEAR FROM TYPED IN TEXT
//            new WebDriverWait(Hooks.driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-active-menuitem']/span[1]/strong")));
            SchoolPageHeader.objStudentName.click();
        } catch (NoSuchElementException e) {
            throw new AssertionFailedError("!!!!! student " + strStudent + " not found !!!!!");
        } catch (WebDriverException e) {
            throw new AssertionFailedError("!!!!! student " + strStudent + " not found !!!!!");
        }

    }

    public static void studentRosterSearch(String strStudent, String strSearchBy) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Students")));
        SchoolPageHeader.lnkHeaderStudents.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("newclass")));

        PageFactory.initElements(driver, StudentRosterPage.class);

        switch (strSearchBy.toLowerCase()) {
            case "id":
                StudentRosterPage.txtStudentID.sendKeys(strStudent);
                StudentRosterPage.btnStudentIDSearch.click();
                break;
            case "name":

                break;

            case "email":

                break;
        }

        //ADD MORE WHEN NEEDED

        //wait for the student page to load.
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("primary")));

    }

    public static void verifyStudentData(String strData) throws Throwable {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        String bodyText = SchoolPageHeader.objBodyText.getText();
        assertTrue("Text not found!  "+strData, bodyText.contains(strData));
    }

}
