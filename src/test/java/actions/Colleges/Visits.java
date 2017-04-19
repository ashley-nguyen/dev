package actions.Colleges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Colleges.VisitsPage;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

/**
 * Created by Dayasagar on 18 April 2017
 */
public class Visits {

    WebDriver driver;
    WebdriverComponents driverComponents;

    public Visits(){
        this.driver = Hooks.driver;
        this.driverComponents = new WebdriverComponents();
        PageFactory.initElements(driver, VisitsPage.class);
        PageFactory.initElements(driver, ReusableComponentsPage.class);
    }



}
