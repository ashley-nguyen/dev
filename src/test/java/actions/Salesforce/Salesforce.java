package actions.Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Salesforce.SalesforcePage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/19/2016.
 */

public class Salesforce {
    public static WebDriver driver;

    public static void NavigateToSchoolAccount() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.School.click();
        SalesforcePage.SchoolAccount.click();
    }

    public static void NavigateToManageSubscriptions() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.ManageSubscriptions.click();
    }

    public static void ClickOnNextButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.Next.click();
    }

    public static void ClickOnSubmitButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.Submit.click();
    }

    public static void CheckOffProduct() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.Product.click();
    }

    public static void SelectFormOfPayment() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(SalesforcePage.FormPayment);
        select.selectByVisibleText("Purchase Order");
    }

    public static void SelectStartDate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(SalesforcePage.startDate);
        select.selectByIndex(1);
    }

    public static void SelectEndDate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(SalesforcePage.EndDate);
        select.selectByIndex(1);
    }

    public static void WritePONumber() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SalesforcePage.PONumber.sendKeys("1234567");
    }

    public static void verifyAPICall() throws InterruptedException {
        String dataverification = SalesforcePage.txtDataVerification.getText();
        assertTrue("Verify Data!", dataverification.contains("Confirmation"));
    }
}
