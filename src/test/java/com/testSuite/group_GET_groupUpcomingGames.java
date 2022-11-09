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

public class group_GET_groupUpcomingGames extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	public void gamecardProps() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get groups upcoming games list");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get groups upcoming games list");
		response = (Response) requests.getUsers(
				"/api/users/55727957-3c6d-4219-b67f-a730fbabd6d8/groups/662ad7bf-d1b6-4fc4-9166-0941a4d53a1a/games/upcoming",
				extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: groups upcoming games");
		RestUtils.verifyStatusCode(response, "200", log);

		log = extentTest.get().createNode("Response Data ::");
		RestUtils.getuserData(response, log);

		log = extentTest.get().createNode("Response Links ::");
		RestUtils.getuserDataLinks(response, log);

		log = extentTest.get().createNode("Response Meta ::");
		RestUtils.getuserMeta(response, log);

	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
