package actions.AssignAndManage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AssignAndManage.AssignAndManagePage;
import pageObjects.ReusableComponents.webDriverComponentsPage;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;


import static org.junit.Assert.assertTrue;

/**
 * Created by Dayasagar on 24 Jan 2017
 */
public class AssignAndManage {

    WebDriver driver;
    WebdriverComponents driverComponents;

    public AssignAndManage(){
        this.driver = Hooks.driver;
        this.driverComponents = new WebdriverComponents();
        PageFactory.initElements(driver, AssignAndManagePage.class);
        PageFactory.initElements(driver, webDriverComponentsPage.class);
    }

    public  void NavigateToAssignAndManage() throws Exception {

        driverComponents.clickElement(webDriverComponentsPage.School);
        driverComponents.hoverAndClick(webDriverComponentsPage.Planner, webDriverComponentsPage.AssignAndManage);

    }

    public void verifyAssignAndManagePage() throws Exception {

        driverComponents.verifyTextPresent("Manage Student Plans from Advanced Search", AssignAndManagePage.headingOfPage);
    }
}
