package API.StudentGroups;

import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 12/10/2015.
 */
public class APIExample_Action {

    public static WebDriver driver;

    public static void DoGet()throws Throwable {
        driver = Hooks.driver;

        driver.get("http://imdbapi.poromenos.org/js/?name=firefly");
        String strText = "{\"Firefly\": {\"episodes\": [{\"season\": 1, \"name\": \"Ariel\", \"number\": 8}, {\"season\": 1, \"name\": \"Bushwhacked\", \"number\": 2}, {\"season\": 1, \"name\": \"Heart of Gold\", \"number\": 12}, {\"season\": 1, \"name\": \"Jaynestown\", \"number\": 4}, {\"season\": 1, \"name\": \"Objects in Space\", \"number\": 10}, {\"season\": 1, \"name\": \"Our Mrs. Reynolds\", \"number\": 3}, {\"season\": 1, \"name\": \"Out of Gas\", \"number\": 5}, {\"season\": 1, \"name\": \"Safe\", \"number\": 7}, {\"season\": 1, \"name\": \"Serenity\", \"number\": 11}, {\"season\": 1, \"name\": \"Serenity Pilot\", \"number\": 11}, {\"season\": 1, \"name\": \"Shindig\", \"number\": 6}, {\"season\": 1, \"name\": \"The Message\", \"number\": 14}, {\"season\": 1, \"name\": \"The Train Job\", \"number\": 1}, {\"season\": 1, \"name\": \"Trash\", \"number\": 13}, {\"season\": 1, \"name\": \"War Stories\", \"number\": 9}], \"year\": 2002}}";
        assertTrue("text not found: ", driver.getPageSource().contains(strText));



    }

}
