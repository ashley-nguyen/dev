package actions.Colleges;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Colleges.VisitsPage;
import pageObjects.ReusableComponents.ReusableComponentsPage;
import reusableComponents.TableComponent;
import reusableComponents.WebdriverComponents;
import stepDefs.Hooks;

import java.util.List;
import java.util.Map;

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
    }

    public  void clickOnAddVisitLink() throws Exception {

        //VisitsPage.lnkAddVisit.click();
    }

    public  void enterVisitDetails(DataTable table) throws Exception {

        System.out.println(table);
        DataTable transposedTable = table.transpose();
        System.out.println(transposedTable);
        Map<String, String> m = transposedTable.asMap(String.class, String.class);
        System.out.println(m.get("College"));

        //sample usage
        //VisitsPage.maxAttendees.sendKeys(m.get("Registrations"));
    }

    public  void addVisit() throws Exception {

        //VisitsPage.btnAddVisit.click();
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
    }
}
