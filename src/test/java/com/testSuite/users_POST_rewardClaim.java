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
//public class users_POST_rewardClaim extends TestBase {
//	RequestFactory requests = new RequestFactory();
//	Response response = null;
//	ExtentTest log;
//	boolean flag = false;
//
//	@Test(priority = 0)
//	public void generateCard() throws JsonProcessingException {
//		if (test == null) {
//			test = extent.createTest("Grizzly Admin Should be able to claim reward");
//			extentTest.set(test);
//			flag = true;
//		}
//		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to claim reward");
//		response = (Response) requests.claimRewards_POST("/api/users/" + userId + "/reward_claim", extentTest.get());
//		System.out.println(response.body().prettyPeek());
//
//		log = extentTest.get().createNode("To Verify Status Code :: claim reward");
//		RestUtils.verifyStatusCode(response, "200", log);
//		
//		log = extentTest.get().createNode("Response Current_Time :: claim reward");
//		RestUtils.getClaimRewardCurrentTime(response, log);
//
//	}
//
//	@AfterClass
//	public void end() {
//		if (flag)
//			extent.flush();
//	}
//}
