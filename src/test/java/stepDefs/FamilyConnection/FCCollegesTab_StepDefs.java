package stepDefs.FamilyConnection;

import actions.FamilyConnection.FCCollegesTab;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCCollegesTab_StepDefs {


    @When("^I click in the college match link$")
    public void I_click_on_the_college_match_link() throws Throwable {
        FCCollegesTab.ClickCollegeMatchLink();
    }
    @Then("^The college match list should not be displayed$")
    public static void The_college_match_should_not_be_displayed() throws InterruptedException {
        Boolean verification;
        for (int second = 0;; second++) {
            try {
                WebElement matchList = Hooks.driver.findElement(By.xpath("//table[@class = 'standard']/caption[contains" +
                        "(text(), 'Colleges Looking For Students Like You')]"));
            } catch (Exception e) {
                verification = true;
                break;
            }
            if (second>=60) {
                verification = false;
            }
        }
        assertTrue("The match list is not present", verification);
    }
}