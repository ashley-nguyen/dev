package pageObjects.FamilyConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mbhangu on 5/1/2017.
 */
public class FCHubsInternationalWebLinksTabPage {
    @FindBy(how = How.CSS, using ="[ng-click=\"vm.toggleCommunicate()\"]")
    public static WebElement topButtonIntCommunicate;

    @FindBy(how = How.CSS, using = "[ng-if=\"vm.requestInfo\"]")
    public static WebElement buttonIntRequestInfo;

    @FindBy(how = How.CSS, using = ".fc-button.masthead-dropdown-menu__button[ng-class=\"{ 'fc-button--primary' : " +
            "vm.expandLearnMore }\"]")
    public static WebElement LearnMoreLinks;

    @FindBy(how = How.CSS, using = ".fc-dropdown.fc-dropdown--columns.fc-dropdown--with-header.learn-more-dropdown.fc-dropdown--active li:nth-of-type(3) a")
    public static WebElement  LinkLearnAdmissionsRequirements;
}
