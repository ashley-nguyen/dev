package pageObjects.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by franksejas on 1/29/2016.
 */
public class SetupPage extends BaseClass {
    @FindBy(how = How.LINK_TEXT, using = "Data Export")
    public static WebElement lnkDataExport;

    @FindBy(how = How.LINK_TEXT, using = "Data Import")
    public static WebElement lnkDataImport;

    @FindBy(how = How.LINK_TEXT, using = "Add new student records")
    public static WebElement lnkAddNewStudentRecords;

    @FindBy(how = How.XPATH, using = "//input[@name='datafile']")
    public static WebElement btnChooseFile;

    @FindBy(how = How.XPATH, using = "//input[@name='uploadFile']")
    public static WebElement btnContinue;

    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    public static WebElement btnContinueDataImport;

    @FindBy(how = How.XPATH, using = "//input[@name='submitMapping']")
    public static WebElement btnContinueMatchFields;

    public SetupPage(WebDriver driver) {
        super(driver);
    }
}
