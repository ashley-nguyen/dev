package API.StudentGroups;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import stepDefs.Hooks;

import javax.security.sasl.AuthenticationException;
import javax.ws.rs.core.UriBuilder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by csackrider on 12/10/2015.
 * Updated by franksejas on 08/23/2016.
 */
public class APIExample_Action {

    public static WebDriver driver;

    public static void DoGet()throws Throwable {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://imdbapi.poromenos.org/js/?name=firefly");
//        String strText = "{\"Firefly\": {\"episodes\": [{\"season\": 1, \"name\": \"Ariel\", \"number\": 8}, {\"season\": 1, \"name\": \"Bushwhacked\", \"number\": 2}, {\"season\": 1, \"name\": \"Heart of Gold\", \"number\": 12}, {\"season\": 1, \"name\": \"Jaynestown\", \"number\": 4}, {\"season\": 1, \"name\": \"Objects in Space\", \"number\": 10}, {\"season\": 1, \"name\": \"Our Mrs. Reynolds\", \"number\": 3}, {\"season\": 1, \"name\": \"Out of Gas\", \"number\": 5}, {\"season\": 1, \"name\": \"Safe\", \"number\": 7}, {\"season\": 1, \"name\": \"Serenity\", \"number\": 11}, {\"season\": 1, \"name\": \"Serenity Pilot\", \"number\": 11}, {\"season\": 1, \"name\": \"Shindig\", \"number\": 6}, {\"season\": 1, \"name\": \"The Message\", \"number\": 14}, {\"season\": 1, \"name\": \"The Train Job\", \"number\": 1}, {\"season\": 1, \"name\": \"Trash\", \"number\": 13}, {\"season\": 1, \"name\": \"War Stories\", \"number\": 9}], \"year\": 2002}}";
//        assertTrue("text not found: ", driver.getPageSource().contains(strText));

        URL url = new URL(
                "http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");


        if (conn.getResponseCode() != 200) {
            throw new RuntimeException(" HTTP error code : "
                    + conn.getResponseCode());
        }

        Scanner scan = new Scanner(url.openStream());
        String entireResponse = new String();
        while (scan.hasNext())
            entireResponse += scan.nextLine();

        System.out.println("Response : "+entireResponse);

        scan.close();

        JSONObject obj = new JSONObject(entireResponse );
        String responseCode = obj.getString("status");
        System.out.println("status : " + responseCode);

        JSONArray arr = obj.getJSONArray("results");
        for (int i = 0; i < arr.length(); i++) {
            String placeid = arr.getJSONObject(i).getString("place_id");
            System.out.println("Place id : " + placeid);
            String formatAddress = arr.getJSONObject(i).getString(
                    "formatted_address");
            System.out.println("Address : " + formatAddress);

            //validating Address as per the requirement
            if(formatAddress.equalsIgnoreCase("Chicago, IL, USA"))
            {
                System.out.println("Address is as Expected");
            }
            else
            {
                System.out.println("Address is not as Expected");
            }
        }

    }

    public static void GetLorRequests(String token, String url, String param)throws Throwable {
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String authToken = token;

        try {

            Client client = Client.create();
            WebResource webResource = client
                        .resource(UriBuilder.fromUri(url)
                        .queryParam("query", URLEncoder.encode(param))
                        .build());
            ClientResponse response = webResource
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("Authorization", "Bearer " + authToken)
                .type("application/json")
                .accept("application/json")
                .get(ClientResponse.class);


            int statusCode = response.getStatus();
            if (statusCode == 401) {
               throw new AuthenticationException("Invalid Username or Password");
            }
            if (statusCode != 200)
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

            String responseEntity = response.getEntity(String.class);

            assertTrue("text found: ", responseEntity.contains("CANCELLED"));

            //Sample Response Parsing
            JSONObject json = new JSONObject(responseEntity);
            assertTrue("text found: ",  json.getJSONObject("_embedded").
                                        getJSONArray("lorRequestEventRepresentationList").
                                        getString(0).contains("REQUESTEDD"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
