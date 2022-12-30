package com.testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.listener.Retry;
import com.requests.RequestFactory;
import com.tests.TestBase;
import com.utils.RestUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;

public class group_POST_groupGames extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(retryAnalyzer = Retry.class, priority = 0)
	@Owner("Automation Engineer : Rakesh Singh Thakur")
	@Severity(SeverityLevel.NORMAL)
	@Description("Admin Check API : group_POST_groupGames")

	public void gamecardProps() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to post all groups id games List");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to post all groups id games List");
		response = (Response) requests.groupGames_POST("/api/groups/662ad7bf-d1b6-4fc4-9166-0941a4d53a1a/games",
				extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: all groups id games List");
		RestUtils.getStatusCode(response, log);

	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
