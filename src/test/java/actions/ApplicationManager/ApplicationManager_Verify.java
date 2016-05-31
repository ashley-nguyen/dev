package actions.ApplicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ApplicationManager.ApplicationManagerPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by franksejas on 1/29/2016.
 */
public class ApplicationManager_Verify {
    public static WebDriver driver;

    public static void verifyApplicationManager() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("img[src=\"../../images/processapps/apps_pending_tab_on.gif\"]")).click();
    }

    public static void SelectFormOfPayment(String item) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ApplicationManagerPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("class")));
        Select select = new Select(ApplicationManagerPage.selClass);
        select.selectByVisibleText(item);
        ApplicationManagerPage.formNameTable.isDisplayed();
    }
}
