package actions.Colleges;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Colleges.CollegePage;
import pageObjects.Colleges.VisitsPage;
import pageObjects.Header.SchoolPageHeader;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.TableComponent;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Dayasagar on 18 April 2017
 */
public class Visits {

    WebDriver driver;
    WebdriverComponents driverComponents;

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

        Actions action = new Actions(driver);
        action.moveToElement(SchoolPageHeader.lnkColleges).build().perform();
        SchoolPageHeader.lnkCollegeVisits.click();

    }

    /**
     * Click on the add new visit link
     * @throws Exception
     */
    public  void clickOnAddVisitLink() throws Exception {

        VisitsPage.lnkAddVisit.click();
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
        VisitsPage.lnkCollegePicker.click();
        for (String newWindow : driver.getWindowHandles()) {
            driver.switchTo().window(newWindow);
        }
        VisitsPage.searchCollege.sendKeys(m.get("College"));
        VisitsPage.btnGoSearchCollege.click();
        driverComponents.getElementByLinkText(m.get("College")).click();

        driver.switchTo().window(mainWindow);
        assertEquals(m.get("College"),VisitsPage.textCollege.getAttribute("value"));

        //entering visit details
        VisitsPage.textDate.sendKeys(m.get("Date"));
        VisitsPage.maxAttendees.click();
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

        driverComponents.getInputElementByValue(text).click();

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
     * Verify Is Table is Present and "College" , "Representative", "Date", "Time" , "Registrations",
     * "Registration Status" These elements are in heading
     * @throws Exception
     */
    public void viewHeadingOfVisitTable() throws Exception {

    //verify table is Present
    driverComponents.verifyElementPresent(VisitsPage.visitTable);

    //Verify All the Heading Element in Table
        String[] list = {"College" , "Representative", "Date", "Time" , "Registrations", "Registration Status"};
            for(int i=0; i<list.length;i++){
                WebElement headingRowElement = driver.findElement(By.cssSelector("tr:nth-of-type(1)>td[class=category11]:nth-of-type("+(i+1)+")"));
                driverComponents.verifyTextPresent(list[i], headingRowElement);
            }
    }

    /**
     * Verify Is Table is Present and "College" , "Representative", "Date", "Time" , "Registrations",
     * "Registration Status" These elements are in heading
     * @throws Exception
     */
    public void verifyViewEditupdateLinkPresent() throws Exception {

        //verify table is Present
        driverComponents.verifyElementPresent(VisitsPage.visitTable);
        //MATWIP  need to add element as in visit page
        List<WebElement> numberOfColleges = driver.findElements(By.cssSelector("table[class=bg2]>tbody>tr>td>table>tbody>tr"));
        int numberOfRows = numberOfColleges.size();

        for( int i =1;i<numberOfRows; i++) {
        WebElement element = TableComponent.getCellElement(VisitsPage.tableBodyVisits,i,7);
        driverComponents.verifyTextPresent("view |  edit |  delete", element);
        }

    }


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
            System.out.println("Exception occured during clicking on '"+action+"' for '"+collegeName+"'. ");
        }
    }

    /**
     * Click on delete on first visit
     */
    public String clickOnDelLinkOfFirstVisit()
    {
        try {
            WebElement element = VisitsPage.firstRowDel;
            driverComponents.clickElement(element);
            driverComponents.clickElement(VisitsPage.btnDeleteVisit);

        } catch (Exception ex) {
            System.out.println("Exception occured during Deleting the First Visit");
        }
        return VisitsPage.firstRowCollegelink.getText();
    }

    /**
     * Verify Deleted Visit Should Not Present
     */
    public void verifyDeletedVisitNotPresent()
    {
        try {
            String Text = clickOnDelLinkOfFirstVisit();
            driverComponents.verifyTextNotPresent(Text, VisitsPage.firstRowCollegelink);

        } catch (Exception ex) {
            System.out.println("Exception occured While Verifying the Deleted Visit was present");
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
        requiredAction.click();
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

        VisitsPage.maxAttendees.clear();
        VisitsPage.maxAttendees.sendKeys(m.get("Registrations"));

        VisitsPage.representative.clear();
        VisitsPage.representative.sendKeys(m.get("Representative"));
        //we can add more fields here as needed

    }

    /**
     * verify the details displayed on Visits page for an edited visit
     * @param table datatable from cucumber scenario
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
}
