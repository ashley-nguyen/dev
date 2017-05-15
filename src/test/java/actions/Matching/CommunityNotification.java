package actions.Matching;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Colleges.VisitsPage;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.TableComponent;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Dayasagar on 20 May 2017
 */
public class CommunityNotification {

    WebDriver driver;
    WebdriverComponents driverComponents;
    String firstCollege = "";
    int visitRows;

    public CommunityNotification() {
        this.driver = Hooks.driver;
        this.driverComponents = new WebdriverComponents();
        PageFactory.initElements(driver, ReusableComponentsPage.class);
    }

    /**
     *Verify Community icon
     * @param verify : "present" if need to verify its present
     *               "notPresent" if need to verify if its not present
     * @throws Exception
     */
    public void verifyCommunityNotificationIcon(String verify) throws Exception {

        switch (verify){
            case "present":
                if (driverComponents.verifyElementPresent(ReusableComponentsPage.communityNotification)){
                    System.out.println("Community Notification seen");
                }
                else {
                    fail("Community Notification is not seen");
                }
            case "notPresent":
                if (driverComponents.verifyElementNotPresent(ReusableComponentsPage.communityNotification)){
                    System.out.println("Community Notification is not seen");
                }
                else {
                    fail("Community Notification seen");
                }
        }

    }
}

