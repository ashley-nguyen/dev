package pageObjects.Student.eDocsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jbarnard on 12/9/2015.
 */
public class eDocsTabPage extends BaseClass  {

        @FindBy(how = How.XPATH, using = "(//a[contains(text(),'eDocs')])")
        public static WebElement tabeDocs;

        @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Prepare")
        public static WebElement lnkPrepare;

        @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Send")
        public static WebElement lnkSend;

        @FindBy(how = How.XPATH, using = "//button[@class='btn btn-small ng-scope']")
        public static WebElement btnExpandAll;

        @FindBy(how = How.XPATH, using = "//button[@class='btn btn-small ng-scope']")
        public static WebElement btnAdd;

        @FindBy(how = How.TAG_NAME, using = "body")
        public static WebElement txtBody;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div/div[2]")
        public static WebElement txtVerification;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div")
        public static WebElement txtContentsVerification;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div/div[1]/table")
        public static WebElement txtTableVerification;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div/div[2]/h3/button")
        public static WebElement btnCounselorAdd;

        @FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-upload-toggle span12 btn-primary') or contains(@class,'btn btn-upload-toggle span12')]")
        public static WebElement btnUploadAFile;

        @FindBy(how = How.XPATH, using = "//select[@name='application_id_select']")
        public static WebElement selApplication;

        @FindBy(how = How.XPATH, using = "//select[@id='document_type']")
        public static WebElement selType;

        @FindBy(how = How.XPATH, using = "//*[@id=\"transcript_upload_div\"]/div[3]/div/div/div[2]/input")
        public static WebElement btnBrowse;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div/button[1]")
        public static WebElement btnReplace;

        @FindBy(how = How.XPATH, using = "//*[@id=\"contents\"]/div[2]/div[2]/div/div[2]/table/tbody/tr/td[5]/div/button[2]")
        public static WebElement btnDelete;

        @FindBy(how = How.XPATH, using = "//*[@id=\"deleteModal\"]/div[3]/div/button[2]")
        public static WebElement btnDeleteDocument;

        public eDocsTabPage(WebDriver driver) {
        super(driver);
    }}
