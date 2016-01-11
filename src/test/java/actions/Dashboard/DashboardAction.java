package actions.Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Dashboard.DashboardPage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 12/22/2015.
 */
public class DashboardAction {
    public static WebDriver driver;

    public static void NavigateToDashboard() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, DashboardPage.class);
        System.out.println(driver.getPageSource());
        System.out.println("url:"+driver.getCurrentUrl());

        DashboardPage.School.click();
        DashboardPage.Planner.click();
    }
}
