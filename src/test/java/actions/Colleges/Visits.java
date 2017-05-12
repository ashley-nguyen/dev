package actions.Colleges;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Colleges.VisitsPage;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.TableComponent;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Dayasagar on 18 April 2017
 */
public class Visits {

    WebDriver driver;
    WebdriverComponents driverComponents;
    String firstCollege = "";
    int visitRows;

    public Visits(){
        this.driver = Hooks.driver;
        this.driverComponents = new WebdriverComponents();
        PageFactory.initElements(driver, VisitsPage.class);
        PageFactory.initElements(driver, ReusableComponentsPage.class);
        PageFactory.initElements(driver, SchoolPageHeader.class);
    }

    /**
     * Navigate to College Visits page
     */
    public void goToVisits() {

        driver.get("https://localhost/main/dashboards/dashboard.php");

        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        driverComponents.clickElement(SchoolPageHeader.lnkCollegeVisits);

    }

    /**
     * Click on the add new visit link
     * @throws Exception
     */
    public  void clickOnAddVisitLink() throws Exception {

        driverComponents.clickElement(VisitsPage.lnkAddVisit);

    }


    /**
     * enter all details to add a new visit
     * @param table the datatable from cucumber feature file
     * @throws Exception
     */
    public  void enterVisitDetails(DataTable table) throws Exception {

        //handling DataTable
        DataTable transposedTable = table.transpose();
        Map<String, String> m = transposedTable.asMap(String.class, String.class);

        //handling College Picker Window
        String  mainWindow = driver.getWindowHandle();
        driverComponents.clickElement(VisitsPage.lnkCollegePicker);
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        VisitsPage.searchCollege.sendKeys(m.get("College"));
        driverComponents.clickElement(VisitsPage.btnGoSearchCollege);
        driverComponents.clickElement(driverComponents.getElementByLinkText(m.get("College")));

        driver.switchTo().window(mainWindow);
        assertEquals(m.get("College"),VisitsPage.textCollege.getAttribute("value"));

        //entering visit details
        VisitsPage.textDate.sendKeys(m.get("Date"));
        driverComponents.clickElement(VisitsPage.maxAttendees);
        VisitsPage.maxAttendees.sendKeys(m.get("Registrations"));
        Select hour = new Select(VisitsPage.timeHour);
        hour.selectByVisibleText(m.get("Time"));
        VisitsPage.location.sendKeys(m.get("Location"));
        VisitsPage.commentsStudents.sendKeys(m.get("Comments"));
        VisitsPage.representative.sendKeys(m.get("Representative"));
        if (m.get("Deadline Hours")!= null) VisitsPage.deadlineHours.sendKeys(m.get("Deadline Hours"));
        if (m.get("Deadline Days")!= null) VisitsPage.deadlineDays.sendKeys(m.get("Deadline Days"));

    }

    /**
     * Click on a button on the page with the given text
     * @param text text on the button / HTML attribute value='text'
     * @throws Exception
     */
    public  void clickButton(String text) throws Exception {

        driverComponents.clickElement(driverComponents.getInputElementByValue(text));

    }

    /**
     * verify the details displayed on Visits page for a newly added visit
     * @param table the datatable from cucumber feature file
     * @throws Exception
     */
    public  void verifyAddedVisit(DataTable table) throws Exception {

        //handling DataTable
        DataTable transposedTable = table.transpose();
        Map<String, String> m = transposedTable.asMap(String.class, String.class);

        //get row index of newly added visit
        int rowIndex = TableComponent.getRowIndexByValue(VisitsPage.tableRowVisits,m.get("College"));

        //compare the details
        String[] values = m.values().toArray(new String[0]);
        for(int colIndex =1;colIndex<7; colIndex++) {
            assertEquals(TableComponent.getCellElement(VisitsPage.tableVisits,rowIndex, colIndex).getText(),values[colIndex-1]);
        }
    }


    /**
     * Verify if Table is Present and "College" , "Representative", "Date", "Time" , "Registrations",
     * "Registration Status" These elements are in heading
     * @throws Exception
     */
    public void verifyHeadersOfVisitTable(List<String> headers) throws Exception {

        //verify table is Present
        driverComponents.verifyElementPresent(VisitsPage.visitTable);

        //Verify All the Heading Element in Table
        for(int i=0; i<headers.size() ;i++){
            WebElement headerRowElement = TableComponent.getCellElement(VisitsPage.tableVisits, 0, i+1);
            driverComponents.verifyTextPresent(headers.get(i), headerRowElement);
        }
    }

    /**
     * Verify if Table is Present and "College" , "Representative", "Date", "Time" , "Registrations",
     * "Registration Status" These elements are in heading and Verify View Edit and update Link are enabled.
     * @throws Exception
     */
    public void verifyViewEditDeleteLinkPresent(List<String> links) throws Exception {

        //verify table is Present
        driverComponents.verifyElementPresent(VisitsPage.visitTable);
        //Get the number of rows
        List<WebElement> numberOfColleges = driver.findElements(VisitsPage.tableRowVisits);
        int numberOfRows = numberOfColleges.size();

        //use number of rows and verify each row has view edit and delete
        for( int i =1;i<numberOfRows; i++) {
        WebElement element = TableComponent.getCellElement(VisitsPage.tableBodyVisits,i,7);
        driverComponents.verifyTextPresent("view |  edit |  delete", element);
        //to check if element is enabled
            for (int j=0 ; j< 2 ;j++) {
                element.findElement(By.linkText(links.get(j))).isEnabled();
            }

        }

    }

    //WIP
    //write a common method to check view,edit,delete links

    /**
     * Click and Verify link is Edit, View, and Update present
     * @param collegeName : Name of the College you want to Perform Action Eg : Adelphi University
     * @param action : Perform Edit, Delete, View Eg : edit
     */
    public void clickOnVisitActionByCollege(String collegeName, String action)
    {
        try {
            WebElement element = driver.findElement(By.xpath("//tr[td[a[text() = '"+collegeName+"']]]//td[@class='bodytext']/a[text()='"+action+"']"));
            driverComponents.clickElement(element);

        } catch (Exception ex) {
            System.out.println("Exception occured while clicking on '"+action+"' for '"+collegeName+"'. ");
        }
    }

    /**
     * Click on delete on selected visit
     * @param rowIndex index of the row from table that needs to be deleted
     */
    public void deleteCollegeVisitByRow(int rowIndex)
    {
        //Save first college name as class variable
        firstCollege = VisitsPage.firstRowCollegelink.getText();

        visitRows= driver.findElements(VisitsPage.tableRowVisits).size();
        try {
            clickOnVisitActionByIndex("delete", rowIndex);

        } catch (Exception ex) {
            System.out.println("Exception occured while deleting the selected Visit");
        }

    }

    /**
     * Verify Deleted Visit Should Not Present
     */
    public void verifyDeletedVisitNotPresent() {
        try {
            assertEquals(visitRows-1,driver.findElements(VisitsPage.tableRowVisits).size());
            driverComponents.verifyTextNotPresent(firstCollege, VisitsPage.firstRowCollegelink);

        } catch (Exception ex) {
            System.out.println("Exception occured While verifying the absence of a Deleted Visit");
        }
    }
      
    /**
     * clicks on the required action of a visit based on the row index provided
     * @param action edit, view or delete action to be done on a visit
     * @param index row index of the visits table( 0 corresponds to header)
     * @throws Exception
     */
    public void clickOnVisitActionByIndex(String action, int index) throws Exception {

        WebElement mainElement = TableComponent.getCellElement(VisitsPage.tableVisits,index,7);
        WebElement requiredAction = mainElement.findElement(By.xpath("a[text()='"+action+"']"));
        driverComponents.clickElement(requiredAction);
    }

    /**
     * edit a particular visit with data from datatable
     * @param table datatable from cucumber scenario
     * @throws Exception
     */
    public  void updateVisitDetails(DataTable table) throws Exception {

        //handling DataTable
        DataTable transposedTable = table.transpose();
        Map<String, String> m = transposedTable.asMap(String.class, String.class);

        driverComponents.clearAndSendText(VisitsPage.maxAttendees,m.get("Registrations"));
        driverComponents.clearAndSendText(VisitsPage.representative,m.get("Representative"));
        //we can add more fields here as needed

    }

    /**
     * verify the details displayed on Visits page for an edited visit
     * @param table datatable from cucumber scenario
     * @param rowIndex index of the row that needs to be verified
     * @throws Exception
     */
    public  void verifyUpdatedVisit(DataTable table, int rowIndex) throws Exception {

        //handling DataTable
        DataTable transposedTable = table.transpose();
        Map<String, String> m = transposedTable.asMap(String.class, String.class);

        assertEquals(TableComponent.getCellElement(VisitsPage.tableVisits,rowIndex, 2).getText(),m.get("Representative"));
        assertEquals(TableComponent.getCellElement(VisitsPage.tableVisits,rowIndex, 5).getText(),m.get("Registrations"));
        //can add more fields with logic as in verifyAddedVisit method

    }

    public void verifyVisitsManagementLinksDisabled() throws Exception {

        driverComponents.assertElementNotPresent(VisitsPage.lnkAddVisit);
        driverComponents.assertElementNotPresent(VisitsPage.lnkColleges);
        driverComponents.assertElementNotPresent(VisitsPage.lnkVisitSettings);
    }

    public void verifyEditDeleteLinkNotPresent() throws Exception {

        //verify table is Present
        driverComponents.verifyElementPresent(VisitsPage.visitTable);
        //Get the number of rows
        List<WebElement> numberOfColleges = driver.findElements(VisitsPage.tableRowVisits);
        int numberOfRows = numberOfColleges.size();

        //use number of rows and verify each row has view only and not edit and delete
        for( int i =1;i<numberOfRows; i++) {
            WebElement element = TableComponent.getCellElement(VisitsPage.tableBodyVisits,i,7);
            assertTrue(element.findElement(By.linkText("view")).isEnabled());
        }
        driverComponents.assertLinkNotPresent("edit");
        driverComponents.assertLinkNotPresent("delete");

    }

    public void verifyEditVisitLinkNotPresent() throws Exception {

        clickOnVisitActionByIndex("view",1);
        driverComponents.verifyElementNotPresent(VisitsPage.lnkEditVisit);

    }
}
