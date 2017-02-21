package actions.SuccessPlanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AssignAndManage.AssignAndManagePage;
import pageObjects.ReusableComponents.webDriverComponentsPage;
import pageObjects.SuccessPlanner.TasksPage;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

/**
 * Created by sangeetha.munuswamy on 2/20/2017.
 */
public class Tasks {

    WebDriver driver;
    WebdriverComponents driverComponents;

    public Tasks(){
        this.driver = Hooks.driver;
        this.driverComponents = new WebdriverComponents();
        PageFactory.initElements(driver, TasksPage.class);
        PageFactory.initElements(driver, webDriverComponentsPage.class);
    }

    public  void NavigateToTasks() throws Exception {

        //driverComponents.clickElement(webDriverComponentsPage.School);
        driverComponents.hoverAndClick(webDriverComponentsPage.Planner, webDriverComponentsPage.Tasks);

    }

    public void verifyTasksPage() throws Exception {

        driverComponents.verifyTextPresent("TASK LIBRARY", TasksPage.headingOfPage);
    }
}
