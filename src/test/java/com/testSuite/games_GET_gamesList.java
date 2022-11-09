package com.testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.requests.RequestFactory;
import com.tests.TestBase;
import com.utils.RestUtils;

import io.restassured.response.Response;

public class games_GET_gamesList extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	public void gamesList() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get games list");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get games list");
		response = (Response) requests.getUsers("/api/users/" + userId + "/dashboard", extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: games list");
		RestUtils.verifyStatusCode(response, "200", log);

		log = extentTest.get().createNode("Response of upcoming Games List");
		RestUtils.upcomingGamesList(response, log);

		log = extentTest.get().createNode("Response of featured Games List");
		RestUtils.featuredGamesList(response, log);

		log = extentTest.get().createNode("Response of has Claimed Promotions");
		RestUtils.hasClaimedPromotions(response, log);

		log = extentTest.get().createNode("Response of review Display");
		RestUtils.reviewDisplay(response, log);

		log = extentTest.get().createNode("Response of reward Coin 1X");
		RestUtils.rewardCoin1X(response, log);

		log = extentTest.get().createNode("Response of reward Coin 2X");
		RestUtils.rewardCoin2X(response, log);

		log = extentTest.get().createNode("Response of reward Button Disable Time");
		RestUtils.rewardButtonDisableTime(response, log);

		log = extentTest.get().createNode("Response of coins Count");
		RestUtils.coinsCount(response, log);

	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
