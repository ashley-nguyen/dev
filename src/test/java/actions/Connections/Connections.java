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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("E-mail")));
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
        String dataVerification = ConnectionsPage.classHeaderName.getText();
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
        String dataVerification = ConnectionsPage.classTableHeading.getText();
        assertTrue("Error Verification!", dataVerification.contains("Family Connection"));
    }

    public static void clickOnConfigurationLink() throws InterruptedException {
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(ConnectionsPage.linkFCconfiguration)).click();
    }

    public static void verifyText(String info) throws InterruptedException {

        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("html > body > div:nth-of-type(1) > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > table > tbody > tr:nth-of-type(3) > td > table > tbody > tr > td > table > tbody > tr:nth-of-type(5) > td > table:nth-of-type(3) > tbody > tr:nth-of-type(9) > td:nth-of-type(1) > a > img")));
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
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#activematch_events_on-9")));
        ConnectionsPage.activeMatchEvents.click();
        ConnectionsPage.activeMatchEvents.click();
        driver = Hooks.driver;
        PageFactory.initElements(driver, Connections.class);
        Boolean verifyAgreeButton = ConnectionsPage.agreeButton.isDisplayed();
        assertTrue("Error Verification Buttons not found!", verifyAgreeButton);
    }

    // LOR Feature methods

    public static void clickOnLettersOfRecommendation() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("letters of recommendation")));
        ConnectionsPage.lnkLettersOfRecommendation.click();
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
        WebElement selectElement = new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.visibilityOf(ConnectionsPage.divSelectTeacher));
        Select select = new Select(selectElement);
        select.selectByVisibleText(item);
    };

    public static void selectCollege() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.fc-checkbox")));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='fc-button fc-button--primary']")));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[class='fc-checkbox']")));
        ConnectionsPage.divSelectCollege.click();
    }

    public static void selectSpecificCollege() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='applications']")));
        ConnectionsPage.divSpecificCollege.click();
    };

    public static void selectAllApplications() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='all-applications']")));
        ConnectionsPage.divAllApplications.click();
    }

    public static void clickSave() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.fc-button.fc-button--primary")));
        ConnectionsPage.divSaveButton.click();

    }

    public static void successMessage(String strSuccessMessage) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("ng-binding")));
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='fc-button fc-button--primary']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='fc-alert fc-alert--success fc-alert--margin-top-hug ng-scope']")));
        assertTrue("The confirmation message is correct", driver.findElement(By.xpath("//span[@class='ng-binding'][contains(text(), '" + strSuccessMessage + "')]")).isDisplayed());
    }

    public static void duplicateTeacherRequestErrorMessage(String strErrorMessageText) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("add-request__duplicate-teacher-message")));
        String dataVerification = ConnectionsPage.divDuplicateTeacherRequest.getText();
        assertTrue("Error Verification!", dataVerification.contains(strErrorMessageText));
    }

    public static void sameStaffErrorMessage(String strErrorMessageText) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("add-request__disabled-message")));
        String dataVerification = ConnectionsPage.divDuplicateSpecificCollegeTeacherRequest.getText();
        assertTrue("Error Verification!", dataVerification.contains(strErrorMessageText));
    }

    public static void clickAllApplicationsTooltip() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("add-request__info-tooltip-icon")));
        ConnectionsPage.allApplicationsInfoIcon.click();
    }

    public static void allApplicationsInfoMessage(String strTooltipTextPart1, String strTooltipTextPart2) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("add-request__info-tooltip-content")));
        String dataVerification = ConnectionsPage.allApplicationsInfoContent.getText();
        assertTrue("Message Verification!", dataVerification.contains(strTooltipTextPart1));
        assertTrue("Message Verification!", dataVerification.contains(strTooltipTextPart2));
    }

    public static void clickCancel() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg[class='fc-icon recommendations-list__cancel--enabled ng-scope']")));
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

    public static void cancelSuccessMessage(String strCancelSuccessMessageText) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("fc-alert--success")));
        String dataVerification = Hooks.driver.findElement(By.className("fc-alert--normal-text")).getText();
        assertTrue("LOR request cancelled", dataVerification.contains(strCancelSuccessMessageText));
    }

    public static void submitVerification(String text) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tr[class='fc-table__row recommendations-list__table-row ng-scope']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[class='ng-binding']")));
        String dataVerification = ConnectionsPage.classSubmitted.getText();
        assertTrue("LOR Submitted", dataVerification.contains(text));
    }

    public static void clickOnSubmittedLink() throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[class='recommendations-list__status ng-binding']")));
        ConnectionsPage.spanSubmittedLink.click();
    }

    public static void submitTextVerification(String text) throws InterruptedException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, ConnectionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='recommendations-list__tooltip-container']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='fc-tooltip__title recommendations-list__tooltip-timestamp']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='ng-binding ng-scope']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='fc-tooltip__content ng-binding']")));
        WebElement submittedTextElement = ConnectionsPage.divSubmittedText;
        if (text.contains("Date"))
        {
            Actions action = new Actions(driver);
            Actions hoverOverRegistrar = action.moveToElement(submittedTextElement);
            hoverOverRegistrar.clickAndHold(submittedTextElement).perform();
            String textVerification = submittedTextElement.getText().substring(0, 30);
            Boolean dateStringExists = textVerification.matches(".*\\w{3}\\s\\d{2}\\s\\d{4}.*");
            assertTrue("Error Verification for Submitted text contents!", dateStringExists);
        }
        else
        {
            Actions action = new Actions(driver);
            Actions hoverOverRegistrar = action.moveToElement(submittedTextElement);
            hoverOverRegistrar.clickAndHold(submittedTextElement).perform();
            String textVerification = submittedTextElement.getText();
            assertTrue("Error Verification for Submitted text contents!", textVerification.contains(text));
        }
    }

}

