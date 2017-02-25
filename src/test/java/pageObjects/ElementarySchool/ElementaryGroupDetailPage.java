package pageObjects.ElementarySchool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by sahara.navia on 2/24/17.
 */
public class ElementaryGroupDetailPage extends BaseClass{

    @FindBy(how = How.CSS, using = "h1")
    public static WebElement titleElementaryGroupDetailPage;

    @FindBy(how = How.CSS, using = ".common-group__line > span:nth-child(2) > span:nth-child(1)")
    public static WebElement lblPrimarySequence;

    @FindBy(how = How.CSS, using = ".group-detail-edit__editable > span:nth-child(1)")
    public static WebElement lblInstructorName;

    public ElementaryGroupDetailPage(WebDriver driver) {
        super(driver);
    }
}
