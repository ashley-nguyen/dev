package actions.eDocs;

import junit.framework.AssertionFailedError;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Setup.SetupPage;
import pageObjects.Student.eDocsTab.eDocsTabPage;
import stepDefs.Hooks;

import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.SubjectTerm;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created franksejas on 07/22/2016.
 */
public class eDocsGeneral {
    public static WebDriver driver;
    private static String CHROME_FILE_NAME = "/Files/ReadMe.txt";
    private static String CHROME_FILE_NAME_BIG_SIZE = "/Files/FillTooBigPDF.pdf";
    private static String CHROME_FILE_NAME_PAGES_SIZE = "/Files/Doc21.pdf";
    private static String CHROME_INCORRECT_FORMAT_FILE = "/Files/index.html";


    public static void NavtoEdocsStudentTab() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.tabeDocs.click();
    }

    public static void ClickOnPrepareLink() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.lnkPrepare.click();
    }

    public static void ClickOnSendLink() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eDocsTabPage.lnkSend.click();
    }

    public static void ClickOnExpandAllButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("button[class='btn btn-primary ng-scope']"))));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("button[class='btn btn-small ng-scope']"))));
        eDocsTabPage.btnExpandAll.click();

    }

    public static void ClickOnAddButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("button.btn.btn-small.ng-scope"))));
        eDocsTabPage.btnAdd.click();
    }

    public static void ClickOnTranscriptAddButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-child(3) > div.ng-scope > div > div:nth-child(3) > h3 > button"))));
        eDocsTabPage.btnTranscriptAdd.click();
    }

    public static void ClickOnAddCounselorButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > h3 > button"))));
        eDocsTabPage.btnCounselorAdd.click();
    }

    public static void ClickOnReplaceButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("button[title=Replace]"))));
        eDocsTabPage.btnReplace.click();
    }

    public static void ClickOnDeleteButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("button[title=Delete]"))));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
        eDocsTabPage.btnDelete.click();
    }

    public static void ClickOnDeleteDocumentButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        eDocsTabPage.btnDeleteDocument.click();
    }

    public static void ClickOnUploadAFileButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.xpath("//button[contains(@class,'btn btn-upload-toggle span12 btn-primary') or contains(@class,'btn btn-upload-toggle span12')]"))));
        eDocsTabPage.btnUploadAFile.click();
    }

    public static void SelectApplication(String application) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("select[name=application_id_select]"))));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(eDocsTabPage.selApplication);
        select.selectByVisibleText(application);
    }

    public static void SelectType(String type) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("select#document_type"))));
        Select select = new Select(eDocsTabPage.selType);
        select.selectByVisibleText(type);
    }

    public static void ClickOnBrowseButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#transcript_upload_div > div:nth-child(6) > div > div > div.file-name-container"))));
        eDocsTabPage.btnBrowse.click();
    }

    public static void ClickOnTranscriptBrowseButton() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, eDocsTabPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#transcript_upload_div > div:nth-child(4) > div > div > div.file-name-container"))));
        eDocsTabPage.btnTranscriptBrowse.click();
    }


    public static void verifytext (String strData) throws Throwable {
        if (strData.contains("No active applications")) {
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='muted ng-scope']")));
        }
        else {
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(strData)));
        }

        String bodyText = Hooks.driver.findElement(By.tagName("body")).getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));
    }

    public static void verifyLorsText (String strData) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='form-checklist condensed ng-scope']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-child(3) > div.ng-scope > ng-include > div > div:nth-child(2) > div.checklist-header.ng-binding"))));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-child(3) > div.ng-scope > div > div:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(1)"))));
        String bodyText = eDocsTabPage.txtBody.getText();
        assertTrue("Text not found! "+strData, bodyText.contains(strData));
        if(strData.contains("Replace")){

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[title='Replace']")));
            String verifyReplaceText = eDocsTabPage.txtVerification.getText();
            assertTrue("Text not found! " + strData, verifyReplaceText.contains(strData));
        }

        if(strData.contains("Delete") ){

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[title='Delete']")));
            String verifyReplaceText = eDocsTabPage.btnDeleteTeacherDocument.getText();
            assertTrue("Text not found! "+strData, verifyReplaceText.contains(strData));
        }

        if(strData.contains("Initial Transcript")){
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='contents']")));
            String verifyReplaceText = eDocsTabPage.txtTranscriptTableVerification.getText();
            assertTrue("Text not found! " + strData, !verifyReplaceText.contains(strData));
        }
    }

    public static void verifyLorsMessagesText (String strData, String strMessage) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='form-checklist condensed ng-scope']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-child(3) > div.ng-scope > ng-include > div > div:nth-child(2) > div.checklist-header.ng-binding"))));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.cssSelector("#contents > div:nth-child(3) > div.ng-scope > div > div:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(1)"))));
        String bodyText = eDocsTabPage.txtBody.getText();
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='contents']")));
            String verifyReplaceText = eDocsTabPage.txtTranscriptTableVerification.getText();
            assertTrue("Text not found! "+ strMessage, verifyReplaceText.contains(strMessage));

    }

    public static void verifyLorsFieldsText (String type, String author, String size, String action) throws Throwable {

        Date date = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("MM/dd/yyyy");

        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='form-checklist condensed ng-scope']")));
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.className("ng-scope"))));
        String bodyText = eDocsTabPage.txtBody.getText();
        assertTrue("Text Type not found! "+ type, bodyText.contains(type));
        assertTrue("Text Author not found! "+ author, bodyText.contains(author));
        assertTrue("Text Date not found! "+ ft.format(date), bodyText.contains(ft.format(date)));
        assertTrue("Text Size not found! "+ size, bodyText.contains(size));
        assertTrue("Text Action not found! "+ action, bodyText.contains(action));
        if(type.contains("Replace") || type.contains("Delete") ){
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contents > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(1) > table")));
            String verifyReplaceText = eDocsTabPage.txtTableVerification.getText();
            assertTrue("Text not found! "+ type, !verifyReplaceText.contains(type));
        }
    }

    public static void verifyAvailableDocument (String type) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text()," + "\"" + type + "\")]")));
        assertTrue("The NACAC Fee Waiver listed as an available document" + type, driver.findElement(By.xpath("//*[contains(text()," + "\"" + type + "\")]")).isDisplayed());
    }

    public static void verifyInformation (String info, String action) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text()," + "\"" + info + "\")]")));
        assertTrue("The uploaded on (date) by (author) were displayed" + info, driver.findElement(By.xpath("//*[contains(text(), 'uploaded on')]")).isDisplayed());
        assertTrue("The uploaded on (date) by (author) were displayed" + info, driver.findElement(By.xpath("//*[contains(text()," + "\"" + info  + "\")]")).isDisplayed());
        if(action.contains("View")){
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-mini']")));

            assertTrue("Text not found! "+ action,  Hooks.driver.findElement(By.xpath("//button[@class='btn btn-mini']")).isDisplayed());
        }
    }

    public static void verifyButtons (String strData) throws Throwable {
        new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.className("ng-scope"))));
        if(strData.contains("Replace") || strData.contains("Delete") ){
            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contents > div:nth-of-type(2) > div:nth-of-type(2) > div")));
            String verifyReplaceText = eDocsTabPage.txtContentsVerification.getText();
            assertTrue("Text not found! "+strData, verifyReplaceText.contains(strData));
        }
    }


    public static void verifyFileBigMessage (String strMessage) throws Throwable {
        try{
        By byXpath = By.xpath("//*[contains(text(),'Selected file is more than 500KB')]");
        WebElement myDynamicElement = (new WebDriverWait(driver, 6000))
                .until(ExpectedConditions.presenceOfElementLocated(byXpath));

        } catch (NoSuchElementException e) {
             throw new AssertionFailedError("Upload File filed!!!!!");
         } catch (WebDriverException e) {
             throw new AssertionFailedError("Upload File filed!!!!!");
        }
    }

    public static void verifyIncorrectFormatMessage (String strMessage) throws Throwable {
        try{
            By byXpath = By.xpath("//*[contains(text(),'File type is not supported. Allowed file types')]");
            WebElement myDynamicElement = (new WebDriverWait(driver, 6000))
                    .until(ExpectedConditions.presenceOfElementLocated(byXpath));

        } catch (NoSuchElementException e) {
            throw new AssertionFailedError("Upload File filed!!!!!");
        } catch (WebDriverException e) {
            throw new AssertionFailedError("Upload File filed!!!!!");
        }
    }

    public static void WritePathFile(String filename) throws InterruptedException, AWTException {
        driver = Hooks.driver;
        PageFactory.initElements(driver, SetupPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Filename" + filename);
        if (filename.contains("ReadMe")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_FILE_NAME).getFile());
            System.out.println("File path" + filePathStudentImport);
            //Sleep time hardcoded to wait the external popup to upload file
            Thread.sleep(3000);
            StringSelection filePath = new StringSelection(filePathStudentImport.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#uploadModal > form > div.modal-footer > button")));
            SetupPage.btnUploadFile.click();
        }
        if (filename.contains("FillTooBigPDF")){

            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_FILE_NAME_BIG_SIZE).getFile());
            System.out.println("File path" + filePathStudentImport);

            //Sleep time hardcoded to wait the external popup to upload file
            Thread.sleep(9000);
            StringSelection filePath = new StringSelection(filePathStudentImport.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#uploadModal > form > div.modal-footer > button")));
            SetupPage.btnUploadFile.click();
        }

        if (filename.contains("index")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_INCORRECT_FORMAT_FILE).getFile());
            System.out.println("File path" + filePathStudentImport);
            //Sleep time hardcoded to wait the external popup to upload file
            Thread.sleep(3000);
            StringSelection filePath = new StringSelection(filePathStudentImport.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#uploadModal > form > div.modal-footer > button")));
            SetupPage.btnUploadFile.click();
        }

        if (filename.contains("Doc")){
            File filePathStudentImport = new File(Hooks.class.getResource(CHROME_FILE_NAME_PAGES_SIZE).getFile());
            System.out.println("File path" + filePathStudentImport);
            //Sleep time hardcoded to wait the external popup to upload file
            Thread.sleep(8000);
            StringSelection filePath = new StringSelection(filePathStudentImport.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

            new WebDriverWait(Hooks.driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#uploadModal > form > div.modal-footer > button")));
            SetupPage.btnUploadFile.click();
        }
    }

    public static void VerifyEmailDelivered(String subject) throws MessagingException, InterruptedException {

        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("naviance.test123@gmail.com", "naviance123");
                }
            });

            javax.mail.Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", "naviance.test123@gmail.com", "naviance123");
            javax.mail.Folder[] folders = store.getDefaultFolder().list("*");

            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);

            System.out.println("Total Message:" + folder.getMessageCount());
            System.out.println("Unread Message:" + folder.getUnreadMessageCount());

            Message[] messages = null;
            boolean isMailFound = false;
            Message mailFrom= null;

            //Search for mail
            for (int i = 0; i <= 5; i++) {
                messages = folder.search(new SubjectTerm(subject), folder.getMessages());
                //Wait for 10 seconds
                if (messages.length == 0) {
                    //Sleep time for external wait time in the email inbox
                    Thread.sleep(10000);
                }
            }

            //Search for unread mail from Request action
            for (Message mail : messages) {
                if (!mail.isSet(Flags.Flag.SEEN)) {
                    mailFrom = mail;
                    System.out.println("Message Count is: "
                            + mailFrom.getMessageNumber());
                    isMailFound = true;
                }
            }

            System.out.println("Email Found?" + isMailFound);
            assertTrue("Email was not found! ", isMailFound);



        } catch (MessagingException e) {
            System.out.println("No connections were done correctly!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ReplyEmailDirectly(String email, String password) throws MessagingException, InterruptedException {

        //Connection
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("naviance.test123@gmail.com", "naviance123");
                }
            });

            javax.mail.Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", email, password);

            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);

            Message[] messages = null;

            messages = folder.getMessages();
            if (messages.length != 0) {

                for (int i = 0, n = messages.length; i < n; i++) {
                    Message message = messages[i];

                    // Get all the information from the message
                    String from = InternetAddress.toString(message.getFrom());
                    if (from != null) {
                        System.out.println("From: " + from);
                    }
                    String replyTo = InternetAddress.toString(message
                            .getReplyTo());
                    if (replyTo != null) {
                        System.out.println("Reply-to: " + replyTo);
                    }
                    String to = InternetAddress.toString(message
                            .getRecipients(Message.RecipientType.TO));
                    if (to != null) {
                        System.out.println("To: " + to);
                    }

                    String subject = message.getSubject();
                    if (subject != null) {
                        System.out.println("Subject: " + subject);
                    }
                    Date sent = message.getSentDate();
                    if (sent != null) {
                        System.out.println("Sent: " + sent);
                    }

                    Object content = message.getContent();
                    if (content != null) {
                        System.out.println("Body: " + messages[i].getContent());
                    }


                    System.out.println("starting to Reply Email......");
                    Message replyMessage = new MimeMessage(session);
                    replyMessage = (MimeMessage) message.reply(false);
                    replyMessage.setFrom(new InternetAddress(to));
                    replyMessage.setText("Verify Reply");
                    replyMessage.setReplyTo(message.getReplyTo());

                    // SendTab the message by authenticating the SMTP server
                    // Create a Transport instance and call the sendMessage
                    Transport t = session.getTransport("smtps");
                    try {
                        //connect to the smpt server using transport instance
                        //change the user and password accordingly
                        t.connect("smtp.gmail.com",email, password);
                        t.sendMessage(replyMessage,
                                replyMessage.getAllRecipients());
                    }catch (MessagingException e){
                        System.out.println("message replied failed ....");
                    }
                    finally {
                        System.out.println("message replied successfully ....");
                        t.close();
                    }


                    // close the store and folder objects
                    folder.close(false);
                    store.close();

                }//end of for loop

            } else {
                System.out.println("There is no messages...");
            }

        } catch (MessagingException e) {
            System.out.println("Connections were done correctly, but knew library issue it's here!" + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void VerifyReplyDirectlyToStudent() {

        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props,new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("naviance.test123@gmail.com", "naviance123");
                }
            });

            javax.mail.Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", "naviance.test123@gmail.com", "naviance123");
            javax.mail.Folder[] folders = store.getDefaultFolder().list("*");

            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);

            Message[] messages = null;

            messages = folder.getMessages();
            if (messages.length != 0) {

                for (int i = 0, n = messages.length; i < n; i++) {
                    Message message = messages[i];
                    System.out.println("Messages : " + message.toString());

                    //Verify Content

                    Multipart multipart = (Multipart) messages[i].getContent();
                    System.out.println("Multipart : " + multipart);

                    for (int j = 0; j < multipart.getCount(); j++) {

                        BodyPart bodyPart = multipart.getBodyPart(j);

                        String disposition = bodyPart.getDisposition();

                        System.out.println("Body: "+bodyPart.getContent());
                        String content= bodyPart.getContent().toString();
                        System.out.println("Contentttttttt : " + content);

                        if (disposition != null && (disposition.equalsIgnoreCase("ATTACHMENT"))) { // BodyPart.ATTACHMENT doesn't work for gmail
                            System.out.println("Mail have some attachment");

                            DataHandler handler = bodyPart.getDataHandler();
                            System.out.println("file name : " + handler.getName());
                        }
                        else {
                            System.out.println("Body: "+bodyPart.getContent());
                            content= bodyPart.getContent().toString();
                            System.out.println("Contentttttttt : " + content);
                            if (content.contains("Verify Reply"))
                            {
                                assertTrue("Text found! "+ content, content.contains("Verify Reply"));
                                break;
                            }

                        }
                    }

                    // Get all the information from the message
                    String from = InternetAddress.toString(message.getFrom());
                    if (from != null) {
                        System.out.println("From: " + from);
                    }
                    String replyTo = InternetAddress.toString(message
                            .getReplyTo());
                    if (replyTo != null) {
                        System.out.println("Reply-to: " + replyTo);
                    }
                    String to = InternetAddress.toString(message
                            .getRecipients(Message.RecipientType.TO));
                    if (to != null) {
                        System.out.println("To: " + to);
                    }

                    String subject = message.getSubject();
                    if (subject != null) {
                        System.out.println("Subject: " + subject);
                    }
                    Date sent = message.getSentDate();
                    if (sent != null) {
                        System.out.println("Sent: " + sent);
                    }

                    System.out.println("starting to Reply Email......");
                    Message replyMessage = new MimeMessage(session);
                    replyMessage = (MimeMessage) message.reply(false);
                    replyMessage.setFrom(new InternetAddress(to));
                    replyMessage.setText("Verify Reply");
                    replyMessage.setReplyTo(message.getReplyTo());

                    // SendTab the message by authenticating the SMTP server
                    // Create a Transport instance and call the sendMessage
                    Transport t = session.getTransport("smtps");
                    try {
                        //connect to the smpt server using transport instance
                        //change the user and password accordingly
                        t.connect("smtp.gmail.com","naviance.test123@gmail.com", "naviance123");
                        System.out.println("Replayin =3 ....");
                        t.sendMessage(replyMessage,
                                replyMessage.getAllRecipients());
                    } finally {
                        t.close();
                    }

                    System.out.println("message replied successfully ....");

                    // close the store and folder objects
                    folder.close(false);
                    store.close();

                }//end of for loop

            } else {
                System.out.println("There is no msg....");
            }

        } catch (MessagingException e) {
            System.out.println("No connections were done correctly!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
