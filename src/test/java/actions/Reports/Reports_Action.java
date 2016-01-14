package actions.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Reports.ReportsPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/13/2015.
 */
public class Reports_Action {
    public static WebDriver driver;

    public static void NavigateToReports() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        ReportsPage.Reports.click();
    }

    public static void ClickOnCustomizeLink() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        ReportsPage.Customize.click();
    }

    public static void ClickOnViewReportButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ReportsPage.class);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='customize-report']/div[2]/input[2]")));
        ReportsPage.ViewReport.click();
    }
}
