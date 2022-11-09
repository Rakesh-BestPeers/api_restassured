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
//public class leaderboard_GET_leadeboardGroup extends TestBase {
//	RequestFactory requests = new RequestFactory();
//	Response response = null;
//	ExtentTest log;
//	boolean flag = false;
//
//	@Test(priority = 0)
//	public void userProfile() throws JsonProcessingException {
//		if (test == null) {
//			test = extent.createTest("Grizzly Admin Should be able to get leaderboard of games");
//			extentTest.set(test);
//			flag = true;
//		}
//		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get leaderboard of games");
//		response = (Response) requests.leaderboard_GET("/api/groups/" + groupId + "/leaderboard", extentTest.get());
//		System.out.println(response.body().prettyPeek());
//
//		log = extentTest.get().createNode("To Verify Status Code :: leaderboard of games");
//		RestUtils.verifyStatusCode(response, "200", log);
//
//		log = extentTest.get().createNode("Response :: Groups");
//		RestUtils.getGroup(response, log);
//
//		log = extentTest.get().createNode("Response :: Group Members");
//		RestUtils.getGroupMembers(response, log);
//
//	}
//
//	@AfterClass
//	public void end() {
//		if (flag)
//			extent.flush();
//	}
//}
