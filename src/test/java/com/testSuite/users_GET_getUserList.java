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

public class users_GET_getUserList extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	public void userList() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get all users List");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get all users List");
		response = (Response) requests.getUsers("/api/users", extentTest.get());
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code ::");
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
