package actions.Student.Search.GeneralTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 12/7/2015.
 */
public class Student_General_Verify {

    public static WebDriver driver;

    public static void verifyParent(String strData) throws Throwable {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found!", bodyText.contains(strData));

    }
}
