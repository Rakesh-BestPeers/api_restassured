package com.testSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.requests.RequestFactory;
import com.tests.TestBase;
import com.utils.RestUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;

public class version_GET_IOS extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	@Owner("Automation Engineer : Rakesh Singh Thakur")
	@Severity(SeverityLevel.NORMAL)
	@Description("Admin Check API : version_GET_IOS")

	public void IOSVersion() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get version_IOS");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get get version_IOS");
		response = (Response) requests.getUsers("/api/ios/version", extentTest.get());
	
		System.out.println(response.body().prettyPeek());

		log = extentTest.get().createNode("To Verify Status Code :: IOS version");
		RestUtils.verifyStatusCode(response, "200", log);
	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
