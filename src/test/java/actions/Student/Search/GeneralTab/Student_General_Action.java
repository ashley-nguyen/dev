package actions.Student.Search.GeneralTab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.GeneralTab.StudentGeneralTabPage;
import pageObjects.Student.Parent.ParentAddPage;
import stepDefs.Hooks;

import java.util.Set;

/**
 * Created by csackrider on 12/7/2015.
 */
public class Student_General_Action {

    public static WebDriver driver;


    public static void linkParent(String strParent) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, StudentGeneralTabPage.class);
        //click the add parent button
        StudentGeneralTabPage.btnAddParent.click();

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("parentName")));

        PageFactory.initElements(driver, ParentAddPage.class);
        //click the parent look up link which will open a new window.
        ParentAddPage.lnkParentLookup.click();
        //Thread.sleep(5000);
        //Handle the new parent search window
        String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for (String windowHandle  : handles)
        {
            if(!windowHandle.equals(parentWindow))
            {
                driver.switchTo().window(windowHandle);
                Thread.sleep(1000);
                WebElement lnkParent = Hooks.driver.findElement(By.linkText(strParent));
                lnkParent.click();
                    //driver.close(); //closing child window
                driver.switchTo().window(parentWindow); //cntrl to parent window
            }
        }
        //GIVES JAVA SCRIPT ERRORS
        //Actions actions = new Actions(driver);
        //actions.moveToElement(ParentAddPage.btnAddExistingParent).click();
        //actions.perform();

        //actions.clickAndHold(ParentAddPage.btnAddExistingParent).release().perform();
        //actions.click(ParentAddPage.btnAddExistingParent).perform();
        //THIS WORKS IN THE UI
        ParentAddPage.btnAddExistingParent.click();

        //GIVES JAVA SCRIPT ERRORS
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", ParentAddPage.btnAddExistingParent);
        //executor.executeScript("window.document.getElementById('addexistingparent').click()");


    }


    public static void unlinkParent(String strParent){



    }

}
