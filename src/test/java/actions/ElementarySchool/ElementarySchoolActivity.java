package actions.ElementarySchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ElementarySchool.ElementaryPage;
import stepDefs.Hooks;

/**
 * Created by sahara.navia on 2/20/17.
 */
public class ElementarySchoolActivity {
    public static WebDriver driver;
    public static String activityDateFilter = "Today,Last Week,Last Two Weeks,Last 30 Days,Date Range";
    public static String downloadCSVLabel = "Download CSV";
    /**
     * Verify School Activity Page
     */
    public static void verifySchoolActivityPage()
    {
        driver = Hooks.driver;
        By activityDropdown = By.cssSelector("select.ns-select");
        PageFactory.initElements(driver, ElementaryPage.class);
        WebElement elementActivityDate = ElementaryPage.selActivityDate;

        // Verify Activity Date dropdwon
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(activityDropdown));
        ElementaryProductPage.verifyElementaryFilterValues(elementActivityDate, activityDateFilter);

        // Verify Download CSV icon
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.textToBePresentInElement(ElementaryPage.icDownloadCSV,
                                                  downloadCSVLabel));


    }
}
