package com.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.extent.ExtentManager;
import com.utils.PropertyReader;
import io.restassured.RestAssured;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.*;

public class TestBase {
	@BeforeClass

	public static void initUrl() throws InterruptedException {
		Thread.sleep(1000);
		prop = PropertyReader.getInstance();

		RestAssured.baseURI = grizzly_dev;
		System.out.println("DEV_Environment URI is :: " + RestAssured.baseURI);

	}

	public static String grizzly_dev = "http://dev.sportsbingo.com";

	public static final String userId = "00c299cf-48a2-430c-b428-e767eb9c855e";
	public static final String gameId = "062466a9-94a9-44db-89af-7e5e323c941c";
	public static final String to_userId = "55727957-3c6d-4219-b67f-a730fbabd6d8";
	public static final String groupId = "07eee545-b5f8-4188-8606-7ade299c141d";
	public static final String login_user_id = "55727957-3c6d-4219-b67f-a730fbabd6d8";

	public static final String email = "Rst" + RandomStringUtils.randomNumeric(10) + "@mailnesia.com";

	public static String fcm_token = "dQyMIwMrI03Wi5xCcU00Wz:APA91bGnqrkESvt9e7D-_S_itzI8Ext7mcnmlxVr8bOdFhcApm93SUqZHkDQhQLcKDzaw0Dk7RPBXBCoDMxhkRJjJ_iDuSYp4_O6lM9oCEchbBh1HIqdkCheJT4m8rYTOqdS1UHo8T8p";

	//public static String coin_in_wallet = JavaUtility.generateRandomNumber(4);
	//public static Integer coin_in_wallet_1 = Integer.parseInt(coin_in_wallet);

	public static PropertyReader prop = PropertyReader.getInstance();
	public static ExtentReports extent = ExtentManager.createInstance();
	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	public static ExtentTest test;

}
