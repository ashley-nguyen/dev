package actions.Student.Search.Search;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class Student_SearchAction {
    public static WebDriver driver;

    public static void searchStudent(String strStudent)throws Throwable
    {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);

        try {
            //CLICK THE SEARCH ICON
            //WebElement lnkStudentSearch = Hooks.driver.findElement(By.id("search-for-student"));
            SchoolPageHeader.lnkStudentSearch.click();
            //ENTER STUDENT NAME
            //WebElement searchbox = Hooks.driver.findElement(By.id("student-search-prototype"));
            SchoolPageHeader.searchbox.sendKeys(strStudent);
            //CLICK ON STUDENT NAME AFTER WAITING FOR IT TO APPEAR FROM TYPED IN TEXT
            new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ui-active-menuitem']/span[1]/strong")));
            WebElement studentname = Hooks.driver.findElement(By.xpath("//*[@id='ui-active-menuitem']/span[1]/strong"));
            studentname.click();
        }
        catch (NoSuchElementException e)
        {
            throw new AssertionFailedError("!!!!! student " +strStudent +" not found !!!!!");
        }
        catch (WebDriverException e)
        {
            throw new AssertionFailedError("!!!!! student " +strStudent +" not found !!!!!");
        }

    }



}
