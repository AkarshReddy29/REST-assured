package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutAndPatchAndDelete {
	
	@Test
	public void getPut() {
		JSONObject request=new JSONObject();
		request.put("name", "Akarsh");
		request.put("Job", "Automation");
		System.out.println(request);
		
		baseURI="https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	public void getPatch() {
		JSONObject request=new JSONObject();
		request.put("name", "Akarsh");
		request.put("Job", "Automation");
		System.out.println(request);
		
		baseURI="https://reqres.in";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	public void getDelete() {
			
		baseURI="https://reqres.in";
		
		when().
			put("/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
}
