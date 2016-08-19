package pageObjects.FamilyConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jorgemaguina on 5/25/2016.
 */
public class FCHubsPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//div[@class='hub-beta-bar']/a")
    public static WebElement buttonFeedback;
    @FindBy(how = How.XPATH, using = "//span[@class='fc-tooltip__title'][contains(text(),'Favorite this college')]/../div/div[contains(text(),'Next')]")
    public static WebElement linkNextFirstDialog;
    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'How I compare')]/div[contains(text(), 'Next')]")
    public static WebElement linkNextSecondDialog;
    @FindBy(how = How.XPATH, using = "//div[@class='fc-grid__row fc-grid__row--xs-center fc-grid__row--lg-start " +
            "fc-grid__row--xs-middle']/div/div/a")
    public static WebElement linkURLIdentifierModule;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Request info')]")
    public static WebElement buttonRequestInfo;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Apply online')]")
    public static WebElement buttonApplyOnline;
    @FindBy(how = How.XPATH, using = "//div[contains (text( ),'Learn More')]")
    public static WebElement buttonLearnMore;
    @FindBy(how = How.XPATH, using = "//div[@class='scroll right']")
    public static WebElement buttonRightArrow;
    @FindBy(how = How.XPATH, using = "//div[@class='webtourLightboxClose']")
    public static WebElement buttonX;
    @FindBy(how = How.XPATH, using = "//input[@id='subject']")
    public static WebElement textBoxSubjectField;
    @FindBy(how = How.XPATH, using = "//textarea[@name='message']")
    public static WebElement textBoxMessageField;
    @FindBy(how = How.XPATH, using = "//input[@id='sendEmail']")
    public static WebElement buttonSendMail;
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public static WebElement textBoxEmail;
    @FindBy(how = How.XPATH, using = "//input[@id='phone']")
    public static WebElement textBoxPhone;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Favorite this college')]/../span[@role='button']")
    public static WebElement buttonXOnFirstTutorial;
    @FindBy(how = How.XPATH, using ="//span[contains(text(),'Tell us what you think!')]/../span[@role='button']")
    public static WebElement buttonXOnSecondTutorial;
    @FindBy(how = How.XPATH, using = "//div[@class = 'fc-grid__col fc-grid__col--core-width']/div/div/span" +
            "[contains(text(), 'Studies')]")
    public static WebElement tabStudies;
    @FindBy(how = How.XPATH, using = "//div[@class = 'fc-grid__col fc-grid__col--core-width']/div/div/span" +
            "[contains(text(), 'Admissions')]")
    public static WebElement tabAdmissions;
    @FindBy(how = How.XPATH, using = "//div[@class = 'fc-grid__col fc-grid__col--core-width']/div/div/div/div/span" +
            "[contains(text(), 'Student Life')]")
    public static WebElement tabStudentLife;

    public FCHubsPage(WebDriver driver) {
        super(driver);
    }

}



