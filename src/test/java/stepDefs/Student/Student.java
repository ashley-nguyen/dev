package stepDefs.Student;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import javax.jws.WebMethod;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 9/22/2015.
 */
public class Student {

    public static void searchStudent(String strStudent)throws Throwable
    {
        try {
            //CLICK THE SEARCH ICON
            WebElement lnkStudentSearch = Hooks.driver.findElement(By.id("search-for-student"));
            lnkStudentSearch.click();
            //ENTER STUDENT NAME
            WebElement searchbox = Hooks.driver.findElement(By.id("student-search-prototype"));
            searchbox.sendKeys(strStudent);
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


    public static void verifyStudentData(String strData)throws Throwable
    {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains(strData));

    }


}



