package actions.Colleges;

import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Colleges.VisitsPage;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

import java.util.Map;

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

    public  void clickOnAddVisitLink() throws Exception {

        //VisitsPage.lnkAddVisit.click();
    }

    public  void enterVisitDetails(DataTable table) throws Exception {

        System.out.println(table);
        DataTable transposedTable = table.transpose();
        System.out.println(transposedTable);
        Map<String, String> m = transposedTable.asMap(String.class, String.class);
        System.out.println(m.get("College"));

        //sample usage
        //VisitsPage.maxAttendees.sendKeys(m.get("Registrations"));
    }

    public  void addVisit() throws Exception {

        //VisitsPage.btnAddVisit.click();
    }



}
