package API.StudentGroups;

import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 12/10/2015.
 */

//method to get
public class StudentGroups {
    public static WebDriver driver;
    public static void DoGet()throws Throwable {
        driver = Hooks.driver;

        driver.get("http://localhost:8727/groups");
        Thread.sleep(5000);
        String strText = "{\"groups\":[{\"name\":\"qa\",\"id\":1,\"tenantId\":\"1\"},{\"name\":\"dev\",\"id\":2,\"tenantId\":null},{\"name\":null,\"id\":3,\"tenantId\":\"3\"},{\"name\":\"!@#$%\",\"id\":5,\"tenantId\":\"5\"},{\"name\":\" \",\"id\":6,\"tenantId\":\"6\"},{\"name\":\"architect\",\"id\":7,\"tenantId\":\"qwe!@\"},{\"name\":\"ops\",\"id\":8,\"tenantId\":\" \"},{\"name\":\"ops\",\"id\":10,\"tenantId\":\"6\"},{\"name\":\"qa\",\"id\":11,\"tenantId\":\"1\"}],\"count\":9}";
        assertTrue("text not found: ", driver.getPageSource().contains(strText));

    }
}
    //method for add
    //method for read group


    //method for update


    //method for delete

