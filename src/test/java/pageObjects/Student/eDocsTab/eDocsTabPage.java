package pageObjects.Student.eDocsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageObjects.BaseClass;

/**
 * Created by jbarnard on 12/9/2015.
 * Updated by Frank Sejas on 11/09/2016
 */
public class eDocsTabPage extends BaseClass  {

        @FindBy(how = How.LINK_TEXT, using = "eDocs")
        public static WebElement tabeDocs;

        @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Prepare")
        public static WebElement lnkPrepare;

        @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Send")
        public static WebElement lnkSend;

        @FindBy(how = How.CSS, using = "button.btn.btn-small.ng-scope")
        public static WebElement btnExpandAll;

        @FindBy(how = How.CSS, using = "button.btn.btn-small.ng-scope")
        public static WebElement btnAdd;

        @FindBy(how = How.TAG_NAME, using = "body")
        public static WebElement txtBody;

        @FindBy(how = How.CSS, using = "#contents > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2)")
        public static WebElement txtVerification;


        @FindBy(how = How.CSS, using = "#contents > div:nth-of-type(2) > div:nth-of-type(2) > div")
        public static WebElement txtContentsVerification;

        @FindBy(how = How.CSS, using = "#contents > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(1) > table")
        public static WebElement txtTableVerification;

        @FindBy(how = How.CSS, using = "#contents > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > h3 > button")
        public static WebElement btnCounselorAdd;

        @FindBy(how = How.XPATH, using = "//button[contains(@class,'btn btn-upload-toggle span12 btn-primary') or contains(@class,'btn btn-upload-toggle span12')]")
        public static WebElement btnUploadAFile;

        @FindBy(how = How.CSS, using = "select[name=application_id_select]")
        public static WebElement selApplication;

        @FindBy(how = How.CSS, using = "select#document_type")
        public static WebElement selType;

        @FindBy(how = How.CSS, using = "#transcript_upload_div > div:nth-child(6) > div > div > div.file-name-container")
        public static WebElement btnBrowse;

        @FindBy(how = How.CSS, using = "button[title=Replace]")
        public static WebElement btnReplace;

        @FindBy(how = How.CSS, using = "#deleteModal > div.modal-footer > div > button.btn.btn-primary.add-delete-document-btn.close")
        public static WebElement btnDelete;

        @FindBy(how = How.CSS, using = "#deleteModal > div:nth-of-type(3) > div > button:nth-of-type(2)")
        public static WebElement btnDeleteDocument;

        public eDocsTabPage(WebDriver driver) {
        super(driver);
    }}
