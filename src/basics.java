import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://swapi.co/api/";
		
/*		https://swapi.co/api/planets/1/?format=wookiee
		The link above is the one you'll reach.
		The steps below you separate the request to hit and validate the response.
*/

		
/*		GIVEN
			Request headers
			Parameters
			request cookies
		WHEN
			get(resource)
			post(resource)
			put(resource)
		THEN
			assertions to make sure that things are tottaly correct
*/ 
		
		given().
			param("format","wookiee").
		when().
			get("planets/1/").
			then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
			body("waahrascwoaoworc",equalTo("10465"));

	}

}
