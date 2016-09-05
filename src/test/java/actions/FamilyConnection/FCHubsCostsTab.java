package actions.FamilyConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.FamilyConnection.FCHubsCostsTabPage;
import stepDefs.Hooks;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by jorgemaguina on 9/5/2016.
 */
public class FCHubsCostsTab {
    public static WebDriver driver;

    public static void VerifyStudentFacultyRatioStudiesCostsTopBar(String income, String avgTotalCost) {
        driver = Hooks.driver;
        Select incomeDropDown = new Select(driver.findElement(By.xpath("//span[contains(text(), 'Income')]" +
                "/following-sibling::select[1]")));
        incomeDropDown.selectByVisibleText(income);
        assertTrue("The Average Total Cost is not correct", driver.findElement(By.xpath("//span[contains(text(), " +
                "'Income')]/ancestor::div/div[contains(text(), '" + avgTotalCost + "')]")).isDisplayed());
    }

    public static void VerifyAidPercent(String aidPercent, String typeOfAid) {
        driver = Hooks.driver;
        Select typeOfAidDropDown = new Select(driver.findElement(By.xpath(" //span[contains(text(), 'Type of Aid')]" +
                "/following-sibling::select[1]")));
        typeOfAidDropDown.selectByVisibleText(typeOfAid);
        assertTrue("The Aid Percent is not correct", driver.findElement(By.xpath("//span[contains(text(), " +
                "'Type of Aid')]/ancestor::div/div[contains(text(), '" + aidPercent + "')]")).isDisplayed());
    }

    public static void VerifyTipicalMonthlyLoanPayment(String loanPayment) {
        driver = Hooks.driver;
        PageFactory.initElements(driver, FCHubsCostsTabPage.class);
        System.out.println("aqui " + FCHubsCostsTabPage.labelTypicalMonthlyLoanPayment.getText());
        assertTrue("The Typical Monthly Loan Payment number is not correct",
                FCHubsCostsTabPage.labelTypicalMonthlyLoanPayment.getText().equals(loanPayment));
    }

    public static void VerifyDateLabelsInCostsTopBar(String dateLabel, List<String> sections) {
        driver = Hooks.driver;
        boolean result = false;
        for(int i = 0; i < sections.size(); i++) {
            if(driver.findElement(
                    By.xpath("//div[text() = '" + sections.get(i) + "']/../div[text() = '" + dateLabel + "']")).isDisplayed()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertTrue("The date label is not present or it displays incorrect data", result);
    }
}