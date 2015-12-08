package pageObjects.Student.Parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by csackrider on 12/7/2015.
 */
public class ParentAddPage extends BaseClass {


    @FindBy(how = How.LINK_TEXT, using = "lookup")
    public static WebElement lnkParentLookup;

    @FindBy(how = How.ID, using = "addexistingparent")
    public static WebElement btnAddExistingParent;

    public ParentAddPage(WebDriver driver) {
        super(driver);
    }
}
