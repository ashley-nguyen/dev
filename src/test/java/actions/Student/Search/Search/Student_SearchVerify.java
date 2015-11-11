package actions.Student.Search.Search;

import org.openqa.selenium.By;

import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 11/6/2015.
 */
public class Student_SearchVerify {


    public static void verifyStudentData(String strData) throws Throwable {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains(strData));

    }
}
