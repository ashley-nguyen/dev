package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;
import java.util.List;

/**
 * Created by sahara.navia on 2/20/17.
 */
public class TagEditorComponent {
    WebDriver driver;

    public TagEditorComponent(){
        this.driver = Hooks.driver;
    }

    /**
     * Enter and select the option from textbox wit tag editor.
     * @param element The WebElement of the field, where the value will be selected
     * @param options The option to select in the field, i.e Assign study programs, instructors, groups of NTP/Elementary
     */
    public static void selectOptionTagEditor(WebElement element, List<String> options)
    {
        for(String option : options) {
            element.click();
            element.sendKeys(option);
            try {
                new WebDriverWait(Hooks.driver, 10).until(ExpectedConditions.elementToBeClickable(By.linkText(option))).click();
            }catch (Exception e){
                assertTrue("Unable to find the element '" + option + "'", false);
            }
        }
    }
}
