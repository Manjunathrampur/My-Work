package Scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import Generic.Spec_Builder_api;
import io.restassured.response.Response;

public class Gherkin1 
{
public static void main(String[] args) throws IOException {
	
	Response res = given().spec(Spec_Builder_api.req_builder()).when().get("/api/users/2")
			.then().spec(Spec_Builder_api.res_builder(200)).extract().response();
	System.out.println(res.prettyPrint());
}
}
