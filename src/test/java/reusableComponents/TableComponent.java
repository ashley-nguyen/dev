package reusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sahara.navia on 2/22/17.
 */
public class TableComponent {
    static WebDriver driver;

    public TableComponent(){
       this.driver = Hooks.driver;
    }

    /**
     * Search the value in the table and return the row index.
     * @param locator The locator of the table, i.e By.Id(Id) or By.cssSelector(table.ns-table > tbody > tr)
     * @param value The value to search in the table
     * @return rowIndex, -1 if the value was not found in the table, > -1 otherwise.
     */
    public static Integer getRowIndexByValue(By locator, String value)
    {
        int row = -1;

        List<WebElement> tableData = refreshTableObj(locator);
        for(int index = 0; index < tableData.size(); index++)
        {
            if(tableData.get(index).getText().contains(value))
            {
                row = index;
                break;
            }
        }
        return row;
    }

    /**
     * Get Cell element by row index and column index
     * @param tableBodyElement The table Body web element,
     *                         WebElement element = driver.findElement(By.cssSelector(table.ns-table > tbody))
     * @param rowIndex The row index
     * @param columnIndex The column index
     * @return Cell Element
     */
    public static WebElement getCellElement(WebElement tableBodyElement, Integer rowIndex, Integer columnIndex)
    {
        WebElement cellElement;
        cellElement = tableBodyElement.findElement(By.cssSelector("tr:nth-child("+ (rowIndex + 1)+") > " +
                                                   "td:nth-child("+ columnIndex + ")"));
        return cellElement;
    }


    /**
     * Return the column values
     * @param tableBodyElement The table Body web element,
     *                          WebElement element = driver.findElement(By.cssSelector(table.ns-table > tbody))
     * @param columnIndex The column index
     * @return colValues, List of Column Values.
     */
    public static List<String> getColumnValues(WebElement tableBodyElement, Integer columnIndex)
    {
        List<WebElement> colValuesElem;
        List<String> colValues = new ArrayList<String>();
        colValuesElem = tableBodyElement.findElements(By.cssSelector("tr > td:nth-child("+ columnIndex+")"));

        for(int index = 0; index < colValuesElem.size(); index++)
        {
            colValues.add(colValuesElem.get(index).getText());
        }
        return colValues;
    }

    /**
     * Refresh the object when it was removed from the DOM.
     * @param locator The locator of the object, i.e By.Id(Id) or By.cssSelector(table.ns-table > tbody > tr)
     * @return WebElement of the object
     */
    public  static List<WebElement> refreshTableObj(By locator)
    { driver = Hooks.driver;
        try{
            return driver.findElements(locator);
        }
        catch(StaleElementReferenceException e)
        {
            return refreshTableObj(locator);
        }
    }
}
