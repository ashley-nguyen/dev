package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;



/**
 * Created by Dayasagar on 24 Jan 2017
 */
public class WebdriverComponents {
    public int waitTime = 30;
    WebDriver driver;

    public WebdriverComponents(){
        this.driver = Hooks.driver;
    }

    /**
     * Method to check element is present within specific time
     *
     * @param element
     * @return
     */
    public boolean waitForElementPresent(int timeout, WebElement element) {

        boolean elementPresent = false;
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

        try {
            elementPresent = element.isDisplayed();
        } catch (Exception ex) {
            System.out.println("Exception occured while finding element, Element is not found");
        }

        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        return elementPresent;
    }

    /**
     * Method to click element within within 60 sec
     *
     * @param element
     */
    public void clickElement(WebElement element) {

        if (waitForElementPresent(60, element)) {

            element.click();

        }
    }

    /**
     * Method to hover on specified flyout and click on element in Flyout
     *
     * @param parentElement where you want to hover
     * @param childElement where you want to click
     * @throws Exception
     */
    public void hoverAndClick(WebElement parentElement, WebElement childElement) throws Exception {

        try {

            Actions action = new Actions(driver);
            action.moveToElement(parentElement);
            action.perform();
            action.moveToElement(childElement);
            action.perform();
            clickElement(childElement);

        } catch (Exception ex) {

            System.out.println("Exception occured during hover and click");
        }
    }

    /**
     * Method to hover on specified flyout and click on element in Flyout
     *
     * @param Element where you want to hover
     * @throws Exception
     */
    public void hover(WebElement Element) throws Exception {

        try {

            Actions action = new Actions(driver);
            action.moveToElement(Element);
            action.perform();

        } catch (Exception ex) {

            System.out.println("Exception occured during hover");
        }
    }

    /**
     * Method to Verify Text Present
     *
     * @param text Text which u need to verify if it is present
     * @throws Exception
     */
    public void verifyTextPresent(String text, WebElement Element) throws Exception {

        try {

            String textFromPage = Element.getText();
            assertTrue("Verify '" +text+ "' Data!", textFromPage.contains(text));

        } catch (Exception ex) {

            System.out.println("Exception occured during assertion");
        }
    }

    /**
     * Method to Verify Text Not Present
     *
     * @param text Text which u need to verify if text not present
     * @throws Exception
     */
    public void verifyTextNotPresent(String text, WebElement Element) throws Exception {

        try {

            String textFromPage = Element.getText();
            assertTrue("Verify '" +text+ "' Data!", !textFromPage.contains(text));

        } catch (Exception ex) {

            System.out.println("Exception occured during assertion");
        }
    }

    /**
     * Method to Verify That an Element is not Present
     *
     * @param Element The element that should not be present
     * @throws Exception
     */
    public boolean verifyElementNotPresent(WebElement Element) {
        boolean result;
        try {
            Element.isDisplayed();
            result = false;
        } catch (NoSuchElementException e) {
            result = true;
        }
        return result;
    }

    /**
     * returns a WebElement having the link text as provided
     * @param text the linktext of the element
     * @return WebElement
     * @throws Exception
     */
    public WebElement getElementByLinkText(String text) throws Exception {

        WebElement element = driver.findElement(By.linkText(text));
        return  element;

    }

    /**
     * Returns a WebElement of Input type with the text provided(Eg: an element with css=input[value='Cancel'])
     * @param text text on the input tag
     * @return WebElement
     * @throws Exception
     */
    public WebElement getInputElementByValue(String text) throws Exception {

        String cssSelectorValue = "input[value='"+text+"']";
        WebElement element = driver.findElement(By.cssSelector(cssSelectorValue));
        return  element;

    }
}
