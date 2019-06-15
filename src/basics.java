import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
			param("location","0").
			param("radius", "500").
			param("key","teste").
			when().
			get("")

	}

}
