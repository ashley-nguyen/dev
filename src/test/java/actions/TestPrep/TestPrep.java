package actions.TestPrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Header.SchoolPageHeader;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrep {
    public static WebDriver driver;

    public static void clickTestPrepLink() throws InterruptedException{
        driver = Hooks.driver;
        PageFactory.initElements(driver, SchoolPageHeader.class);
        SchoolPageHeader.lnkNavianceTestPrep.click();
           }

    public static void skipWalkThroughPage() throws InterruptedException{
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (isWalkThroughPageLoaded()) {
            PageFactory.initElements(driver, pageObjects.TestPrep.TestPrepPage.class);
            pageObjects.TestPrep.TestPrepPage.gotItButton.click();
        }
    }

    public static boolean isWalkThroughPageLoaded() {
        driver = Hooks.driver;
        String pageSource = driver.getPageSource();
        return pageSource.contains("Take a tour to discover all the changes we've made to simplify the setup process");
    }
}
