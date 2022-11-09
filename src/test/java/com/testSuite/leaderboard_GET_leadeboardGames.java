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
//public class leaderboard_GET_leadeboardGames extends TestBase {
//	RequestFactory requests = new RequestFactory();
//	Response response = null;
//	ExtentTest log;
//	boolean flag = false;
//
//	@Test(priority = 0)
//	public void userProfile() throws JsonProcessingException {
//		if (test == null) {
//			test = extent.createTest("Grizzly Admin Should be able to get leaderboard of groups of games");
//			extentTest.set(test);
//			flag = true;
//		}
//		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get leaderboard of groups of  games");
//		response = (Response) requests.leaderboard_GET(
//				"/api/groups/662ad7bf-d1b6-4fc4-9166-0941a4d53a1a/games/45559d07-88d9-4150-894d-d837e3a99f4b/leaderboard",
//				extentTest.get());
//		System.out.println(response.body().prettyPeek());
//
//		log = extentTest.get().createNode("To Verify Status Code :: leaderboard of groups of games");
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
