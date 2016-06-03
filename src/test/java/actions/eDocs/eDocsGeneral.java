package actions.eDocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.eDocsTab.eDocsTabPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsGeneral {
    public static WebDriver driver;


    public static void NavtoEdocsStudentTab() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.tabeDocs.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".checklist-block")));

    }

    public static void verifytext (String strData) throws Throwable {
        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));

    }
}
