package actions.Salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Salesforce.SalesforcePage;
import stepDefs.Hooks;

/**
 * Created by franksejas on 1/19/2016.
 */

public class Salesforce_Action {
    public static WebDriver driver;

    public static void NavigateToSchoolAccount() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.School.click();
        SalesforcePage.SchoolAccount.click();
    }

    public static void NavigateToManageSubscriptions() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.ManageSubscriptions.click();
    }

    public static void ClickOnNextButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.Next.click();
    }

    public static void ClickOnSubmitButton() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.Submit.click();
    }

    public static void CheckOffProduct() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.Product.click();
    }

    public static void SelectFormOfPayment() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        Select select = new Select(SalesforcePage.FormPayment);
        select.selectByVisibleText("Purchase Order");
    }

    public static void SelectStartDate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        Select select = new Select(SalesforcePage.startDate);
        select.selectByIndex(1);
    }

    public static void SelectEndDate() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        Select select = new Select(SalesforcePage.EndDate);
        select.selectByIndex(1);
    }

    public static void WritePONumber() {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SalesforcePage.class);
        SalesforcePage.PONumber.sendKeys("1234567");
    }
}
