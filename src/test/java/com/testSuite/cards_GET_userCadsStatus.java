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

public class cards_GET_userCadsStatus extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	public void upcomingGamsStatus() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get user cards status upcoming");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get user cards status upcoming");
		response = (Response) requests.getUsers("api/users/55727957-3c6d-4219-b67f-a730fbabd6d8/cards?status=upcoming",
				extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: user cards status upcoming");
		RestUtils.getStatusCode(response, log);

	}

	@Test(priority = 1)
	public void pastGamesStatus() throws JsonProcessingException {
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get user cards status past");
		response = (Response) requests.getUsers("api/users/55727957-3c6d-4219-b67f-a730fbabd6d8/cards?status=past",
				extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: user cards status past");
		RestUtils.getStatusCode(response, log);

	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
