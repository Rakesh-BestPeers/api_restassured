//package com.testSuite;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.requests.RequestFactory;
//import com.tests.TestBase;
//import com.utils.RestUtils;
//
//import io.restassured.response.Response;
//
//public class purchases_POST_validateApplePurchase extends TestBase {
//	RequestFactory requests = new RequestFactory();
//	Response response = null;
//	ExtentTest log;
//	boolean flag = false;
//
//	@Test(priority = 0)
//	public void generateCard() throws JsonProcessingException {
//		if (test == null) {
//			test = extent.createTest("Grizzly Admin Should be able to validate Apple purchase");
//			extentTest.set(test);
//			flag = true;
//		}
//		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to validate Apple purchase");
//		response = (Response) requests.addCoins_POST("/api/users/" + userId + "/apple/purchase/validate",
//				extentTest.get());
//		System.out.println(response.body().prettyPeek());
//
//		log = extentTest.get().createNode("To Verify Status Code :: validate Apple purchase");
//		RestUtils.getStatusCode(response,log);
//
//	}
//
//	@AfterClass
//	public void end() {
//		if (flag)
//			extent.flush();
//	}
//}
