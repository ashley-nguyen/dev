package pageObjects.ManageRolesAndRights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 6/20/2016.
 */
public class ManageRolesAndRightsPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "User Admin")
    public static WebElement lnkUserAdmin;

    @FindBy(how = How.LINK_TEXT, using = "Manage Roles And Rights")
    public static WebElement lnkManageRolesAndRights;

    @FindBy(how = How.LINK_TEXT, using = "manage")
    public static WebElement lnkManage;

    @FindBy(how = How.LINK_TEXT, using = "Modify Permissions")
    public static WebElement lnkModifyPermissions;

    @FindBy(how = How.NAME, using = "role_rights[302]")
    public static WebElement chkViewAllTeacherRecForm;

    @FindBy(how = How.NAME, using = "role_rights[542]")
    public static WebElement chkPrepareMyTeacherRecForm;

    @FindBy(how = How.ID, using = "button")
    public static WebElement btnSubmit;

    public ManageRolesAndRightsPage(WebDriver driver) {
        super(driver);
    }
}
