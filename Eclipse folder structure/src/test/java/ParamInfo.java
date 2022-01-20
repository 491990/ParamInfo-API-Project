import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import NewPojo.Root;


public class ParamInfo {

	
	@Test(priority=1)
	public void getStatusCode() {
		
		RestAssured.baseURI = "https://api.intigral-ott.net";
		
		given().log().all().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzNDdUyZ")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions")
		.then().assertThat().statusCode(200);		
	}
	
	
	@Test(priority=2)
    public void getJsonBodyDetails()
    {
        RestAssured.baseURI = "https://api.intigral-ott.net";
		
        //access details via "Root" Pojo class
		Root root = given().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzNDdUyZ")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions").as(Root.class);
		//System.out.println(root.getPromotionId());
		
		//print promotionId from 1st promotion
		System.out.println(root.getPromotions().get(0).getPromotionId());
		//print promotionId from 2nd promotion
		System.out.println(root.getPromotions().get(1).getPromotionId());	
		
    }
	
	
	@Test(priority=3)
	public void validateHeader() {
		
     RestAssured.baseURI = "https://api.intigral-ott.net";
		
		given().log().all().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzNDdUyZ")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions")
		.then().assertThat().header("Content-Type", "application/json;charset=utf-8");	
	}
	
	
	@Test(priority=4)
	public void validatePromotionID() {
		
     RestAssured.baseURI = "https://api.intigral-ott.net";
		
     String response = 
		given().log().all().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzNDdUyZ")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions")
		.then().log().all().assertThat().statusCode(200).header("Content-Type", "application/json;charset=utf-8")
		.extract().response().asString();
     
     System.out.println(response);
     JsonPath js = new JsonPath(response);
     String promotionID = js.get("promotionID");
     System.out.println(promotionID);
     
     Assert.assertEquals(promotionID, "sabe movie for b2b", "Correct promotionID name received in the Response");
	}
	
	
	@Test(priority=5)
	public void validateStatusCodeforInvalidKey() {
		
		RestAssured.baseURI = "https://api.intigral-ott.net";
		
		
		 given().log().all().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzN")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions")
		.then().assertThat().statusCode(403);
		
	}

	
	@Test(priority=6)
	public void validateMessageforInvalidKey() {
		
		RestAssured.baseURI = "https://api.intigral-ott.net";
		
		Response res= 
		(Response) given().log().all().queryParam("apikey", "webB2BGDMSTGExy0sVDlZMzN")
		.when().get("popcorn-api-rs-7.9.17/v1/promotions")
		.then().statusCode(403)
	     .log().body()
	     .extract().response();
		
		String jsonString=res.asString();
		Assert.assertEquals(jsonString.contains("invalid api key"), true);
		
	}
}
