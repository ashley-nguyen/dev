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

    @FindBy(how = How.CSS, using = "img[src=\"../images/delete_orb.gif\"]")
    public static WebElement lnkParent;

    @FindBy(how = How.ID, using = "addexistingparent")
    public static WebElement btnAddExistingParent;

    @FindBy(how = How.ID, using = "deleteParent")
    public static WebElement btnDeleteParent;

    public ParentAddPage(WebDriver driver) {
        super(driver);
    }
}
