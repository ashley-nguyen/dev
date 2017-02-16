package pageObjects.TestPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by sangeetha.munuswamy on 12/7/2016.
 */
public class TestPrepPage {
    @FindBy(how = How.CLASS_NAME, using = "ns-button")
    public static WebElement gotItButton;

    @FindBy(how = How.LINK_TEXT, using = "Assign Study Programs")
    public static WebElement linkAssignStudyPrograms;

    @FindBy(how = How.CSS, using = "div.ns-grid__row > div > select")
    public static WebElement selInstructors;

    @FindBy(how = How.CSS, using = "div.ns-grid__row > div > select:nth-child(4)")
    public static WebElement selStudyPrograms;


}
