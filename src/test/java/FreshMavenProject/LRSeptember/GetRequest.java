package FreshMavenProject.LRSeptember;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) 
	{
		Response res  = given().contentType(ContentType.JSON).when().get("http://restapi.demoqa.com/utilities/weather/city");
		
		System.out.println("Status code is::" +res.statusCode());
		System.out.println();

	}

}
