package actions.eDocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Student.GeneralTab.StudentGeneralTabPage;
import pageObjects.Student.Parent.ParentAddPage;
import pageObjects.Student.eDocsTab.eDocsTabPage;
import stepDefs.Hooks;

import java.util.Set;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsGeneralActions {
    public static WebDriver driver;


    public static void NavtoEdocsStudentTab() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        eDocsTabPage.tabeDocs.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".checklist-block")));

    }
}
