package com.requests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tests.TestBase;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import java.io.File;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class RestClient extends TestBase {

	public Response doGetRequest(String requestPath) {
		Response response = given().when().get(requestPath);
		return response;
	}

	public Response doPostRequest(String uri, Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).post(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON);
		return response;
	}

	public static Response doPostImageUpload(String uri, String token, ExtentTest test) {
		File avatarFile = new File("./src/test/resources/imageUpload/uploadFile.jpg");

		Response response = given().header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).multiPart(avatarFile)
				.when().post(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPutWithBodyWithToken(String res, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).put(res);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doGetWithBodyWithToken(String res, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).get(res);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPostWithBodyWithToken(String uri, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).post(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPostWithBodyWithoutToken(String uri, Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).post(uri);
		return response;
	}
	
	public static Response doPostWithBodyWithoutTokenWithoutUri(Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).post();
		return response;
	}
	
	public static Response doGettWithBodyWithoutToken(String uri, Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).get(uri);
		return response;
	}

	public static Response doPutWithBodyWithoutToken(String uri, Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).put(uri);
		return response;
	}
	
	public static Response doPutWithoutBodyWithoutToken(String uri, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().put(uri);
		return response;
	}

	public static Response doPostWithoutBodyWithoutToken(String uri, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().post(uri);
		return response;
	}

	public static Response doPostWithoutBodyWithToken(String uri, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().post(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPatchWithoutBodyWithToken(String uri, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().patch(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doDeleteWithBodyWithToken(String uri, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).delete(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPostWithToken(String uri, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().post(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public Response doGetRequestWithQueryParam(String url, String token, Map<String, String> params, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).queryParams(params).when().get(url);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public Response doGetRequestWithHeader(String res, Map<String, String> headers, ExtentTest test) {
		Response response = given().headers(headers).when().get(res);
		return response;
	}

	public Response doPutRequest(String res, Object body, ExtentTest test) {
		Response response = given().when().body(body).put(res);
		return response;
	}

	public Response doPatchRequest(String res, Object body, ExtentTest test) {
		Response response = given().when().body(body).patch(res);
		return response;
	}

	public Response doDeleteRequest(String res, ExtentTest test) {
		Response response = given().when().delete(res);
		return response;

	}

	public static Response doGetWithToken(String url, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().get(url);
		return response;
	}

	public static Response doGetWithoutToken(String url, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().get(url);
		return response;
	}

	public static Response doGetWithoutBodyWithToken(String res, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().get(res);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doDeleteWithToken(String res, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().delete(res);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPatchWithBodyWithToken(String uri, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).patch(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

	public static Response doPatchWithBodyWithoutToken(String uri, Object body, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON).when().body(body).patch(uri);
		return response;
	}

	public static Response doputWithBodyWithToken(String uri, Object body, String token, ExtentTest test) {
		Response response = given().contentType(ContentType.JSON)
				.header(new Header("IDEXX-USER-TOKEN", "Bearer " + token)).when().body(body).put(uri);
		test.log(Status.INFO, "Headers are :: " + ContentType.JSON + "," + "IDEXX-USER-TOKEN :: " + "Bearer " + token);
		return response;
	}

}
