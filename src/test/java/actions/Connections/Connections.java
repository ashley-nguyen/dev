package actions.Connections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Connections.ConnectionsPage;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by franksejas on 1/28/2016.
 */
public class Connections {
    public static WebDriver driver;

    public static void ClickOnCheckStatusEmailLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ConnectionsPage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Connections")));
        ConnectionsPage.lnkConnections.click();
        Thread.sleep(3000);
        ConnectionsPage.lnkEmail.click();
        new WebDriverWait(Hooks.driver, 25).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Check status and view history of emails sent")));
        ConnectionsPage.lnkCheckStatusEmailSent.click();
    }

    public static void ClickOnFamilyConnectionLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Enter school site")));
        ConnectionsPage.lnkEnterSchoolSite.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Connections")));
        ConnectionsPage.lnkConnections.click();
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Family Connection")));
        ConnectionsPage.lnkFamilyConnection.click();
    }

    public static void verifyNoErrorsInCheckStatusEmail() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("ContextHeader")));
        String dataVerification = Hooks.driver.findElement(By.className("ContextHeader")).getText();
        assertTrue("Error Verification!", dataVerification.contains("E-mail Message History"));
    }

    public static void verifyNoErrorsInEmail() throws InterruptedException {
        assertTrue("Error Verification!", !Hooks.driver.getPageSource().contains("view_bounce.php"));
    }

    public static void verifyNoErrorsInConnections() throws InterruptedException {
        assertTrue("Error Verification!", !Hooks.driver.getPageSource().contains("Fatal error"));
    }

    public static void verifyNoErrorsInFamilyConnection() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("table-heading")));
        String dataVerification = Hooks.driver.findElement(By.className("table-heading")).getText();
        assertTrue("Error Verification!", dataVerification.contains("Family Connection"));
    }

    public static void clickOnConfigurationLink() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ConnectionsPage.linkFCconfiguration)).click();
    }

    public static void verifyText(String info) throws InterruptedException {

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[5]/td/table[3]/tbody/tr[9]/td[1]/a/img")));
        WebElement activeMatchElement =  ConnectionsPage.lnkActiveMatch;
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("cluetip-inner")));
        WebElement activeMatchSubElement = ConnectionsPage.idSubActiveMatch;
        Actions action = new Actions(driver);
        Actions hoverOverRegistrar = action.moveToElement(activeMatchElement);
        hoverOverRegistrar.clickAndHold(activeMatchElement).perform();
        String textVerification = activeMatchSubElement.getText();
        System.out.println("Active Match pop up verification" + textVerification);
        assertTrue("Error Verification Active Match Info!", textVerification.contains(info));
    }

    public static void verifyEnableGrade(int grade) throws InterruptedException {

        driver = Hooks.driver;
        PageFactory.initElements(driver, Connections.class);
        driver.findElements(By.xpath("//*[@id=\"activematch_events_on-9\"]")).get(0).click();
        driver.findElements(By.xpath("//*[@id=\"activematch_events_on-9\"]")).get(0).click();
        driver = Hooks.driver;
        PageFactory.initElements(driver, Connections.class);
        //new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.className("btn-container")));
        Boolean verifyAgreeButton = driver.findElement(By.xpath("//*[@id=\"active-match-events-modal\"]/div[3]/div")).isDisplayed();
        System.out.println("VaLOR" + verifyAgreeButton);
        assertTrue("Error Verification Buttons not found!", verifyAgreeButton);
    }

    public static void clickOnLettersOfRecommendation() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("letters of recommendation")));
        ConnectionsPage.lnkLettersOfRecommendation.click();
    }

    public static void defaultMessage() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("no-recommendations-header")));
        String dataVerification = ConnectionsPage.textDefaultMessage.getText();
        assertTrue("Error Verification!", dataVerification.contains("Your recommendation requests will show up here."));

    }

    public static void clickAddRequest() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Request")));
        ConnectionsPage.addRequestButton.click();
    }

    public static void selectTeacher(String item) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 9);
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(ConnectionsPage.divSelectTeacher));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
    }

    public static void selectCollege() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='fc-checkbox']")));
        ConnectionsPage.divSelectCollege.click();
    }

    public static void selectOptionForCollege() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='applications']")));
        ConnectionsPage.divSelectOptionCollege.click();
    }

    public static void clickSave() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='fc-button fc-button--primary']")));
        ConnectionsPage.divSaveButton.click();

    }

    public static void successMessage(String strText) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue("The confirmation message is correct", driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(), '" + strText + "')]")).isDisplayed());
    }

    public static void clickCancel() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions builder = new Actions(driver);
        builder.click(ConnectionsPage.divCancelButton).build().perform();
    }

    public static void clickConfirmCancel() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("recommendations-list__cancel-prompt-confirm")));
        ConnectionsPage.divConfirmCancelButton.click();
    }

    public static void cancelSuccessMessage(String info1, String info2) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("fc-alert--success")));
        String dataVerification = Hooks.driver.findElement(By.className("recommendations-list__status")).getText();
        assertTrue("LOR request cancelled", dataVerification.contains("Cancelled"));
        //Need to refactor this xpath
        String cancelMessage = Hooks.driver.findElement(By.xpath("/html/body/div/div/div/div/recommendations-container/div/ng-view/recommendations-list/table/tbody/tr[2]/td/div/span[3]")).getText();
        assertTrue("LOR cancellation message", cancelMessage.contains(info1));
        ConnectionsPage.divDisabledCancelIcon.click();
        String cancelTooltip = Hooks.driver.findElement(By.className("fc-tooltip__content")).getText();
        System.out.print("cancelTooltip" + cancelTooltip);
        assertTrue("LOR cancellation tooltip", cancelTooltip.contains(info2));
    }

}

