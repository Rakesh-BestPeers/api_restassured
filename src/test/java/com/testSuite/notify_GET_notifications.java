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
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;

public class notify_GET_notifications extends TestBase {
	RequestFactory requests = new RequestFactory();
	Response response = null;
	ExtentTest log;
	boolean flag = false;

	@Test(priority = 0)
	@Owner("Automation Engineer : Rakesh Singh Thakur")
	@Severity(SeverityLevel.NORMAL)
	@Description("Admin Check API : notify_GET_notifications")
	@Feature("notify_GET_notifications")
	
	
	
	public void generateCard() throws JsonProcessingException {
		if (test == null) {
			test = extent.createTest("Grizzly Admin Should be able to get notification for user");
			extentTest.set(test);
			flag = true;
		}
		extentTest.get().log(Status.INFO, "Grizzly Admin Should be able to get notification  for user");
		response = (Response) requests.notifications_GET("/api/notify", extentTest.get());
		System.out.println(response.body().prettyPeek());
		
		

		log = extentTest.get().createNode("To Verify Status Code :: get notification");
		RestUtils.getStatusCode(response, log);

	}

	@AfterClass
	public void end() {
		if (flag)
			extent.flush();
	}
}
