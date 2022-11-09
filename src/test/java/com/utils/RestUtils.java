package com.utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.tests.TestBase;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.testng.Assert;

@SuppressWarnings("unused")
public class RestUtils extends TestBase {

	public static int i = 0;
	ExtentTest log;
	static int trueValueCount = 0;
	static int falseValueCount = 0;

	public static String getDataFromResponse(Response response, String xpath) {
		return response.getBody().jsonPath().get(xpath).toString();
	}

	public static void setResponseDetailInExtentReport(String responseKey, String responseValue, ExtentTest extentLog) {
		String keyValueStr = "<b> " + responseKey + "  ::" + "<b>" + responseValue;
		Markup color = MarkupHelper.createLabel(keyValueStr, ExtentColor.GREEN);
		extentLog.log(Status.INFO, color);
	}

	public static void setResponseDetailInExtentReport(String responseKey, Object responseValue, ExtentTest extentLog) {
		String keyValueStr = "<b> " + responseKey + "  ::" + "<b>" + responseValue;
		Markup color = MarkupHelper.createLabel(keyValueStr, ExtentColor.GREEN);
		extentLog.log(Status.INFO, color);
	}

	public static void setResponseDetailInExtentReport(String responseKey, Object responseValue, Object responseValue1,
			ExtentTest extentLog) {
		String keyValueStr = "<b> " + responseKey + "  ::" + "<b>" + responseValue;
		Markup color = MarkupHelper.createLabel(keyValueStr, ExtentColor.GREEN);
		extentLog.log(Status.INFO, color);
	}

	public static void setResponseDetailOfArrayInExtentReport(String responseKey, ArrayList responseValue,
			ExtentTest extentLog) {
		String keyValueStr = "<b> " + responseKey + "  ::" + "<b>" + responseValue;
		Markup color = MarkupHelper.createLabel(keyValueStr, ExtentColor.GREEN);
		extentLog.log(Status.INFO, color);
	}

	public static void setResponseDetailOfArrayInExtentReport(String responseKey, HashSet responseValue,
			ExtentTest extentLog) {
		String keyValueStr = "<b> " + responseKey + "  ::" + "<b>" + responseValue;
		Markup color = MarkupHelper.createLabel(keyValueStr, ExtentColor.GREEN);
		extentLog.log(Status.INFO, color);
	}

	public static void verifyActualExpectedResult(String expectedResult, String actualResult, String str,
			ExtentTest extentLog) {
		String actualExpectedLogStr = "<b> Expected/Actual:: " + expectedResult + "/" + actualResult + " <b>";
		if (expectedResult.equals(actualResult)) {
			passedLog(actualExpectedLogStr, "Successfully verify " + str + "", extentLog);
		} else {
			failedLog(actualExpectedLogStr, "Not able to verify " + str + "", extentLog);
		}

	}

	public static void verifyActualExpectedResultForUser(String expectedResult, String actualResult, String str,
			ExtentTest extentLog) {
		String actualExpectedLogStr = "<b> Expected/Actual:: " + expectedResult + "/" + actualResult + " <b>";
		if (!expectedResult.equals(actualResult)) {
			passedLog(actualExpectedLogStr, "Successfully verify " + str + "", extentLog);
		} else {
			failedLog(actualExpectedLogStr, "Not able to verify " + str + "", extentLog);
		}

	}

	public static void verifyActualExpectedwithIgnoreCaseResult(String expectedResult, String actualResult, String str,
			ExtentTest extentLog) {
		String actualExpectedLogStr = "<b> Expected/Actual:: " + expectedResult + "/" + actualResult + " <b>";
		if (expectedResult.equalsIgnoreCase(actualResult)) {
			passedLog(actualExpectedLogStr, "Successfully verify " + str + "", extentLog);
		} else {
			failedLog(actualExpectedLogStr, "Not able to verify " + str + "", extentLog);
		}
	}

	public static void verifyActualExpectedResult(String expectedResult, Object actualResult, String str,
			ExtentTest extentLog) {
		String actualExpectedLogStr = "<b> Expected/Actual:: " + expectedResult + "/" + actualResult + " <b>";
		if (expectedResult.equals(actualResult)) {
			passedLog(actualExpectedLogStr, "Successfully verify " + str + "", extentLog);
		} else {
			failedLog(actualExpectedLogStr, "Not able to verify " + str + "", extentLog);
		}
	}

	public static String getStatusCode(Response response) {
		int value = response.getStatusCode();
		String code = String.valueOf(value);
		return code;
	}

	public static void passedLog(String ActualvsExpectedLogText, String passedMessage, ExtentTest log) {
		Markup m = MarkupHelper.createLabel(ActualvsExpectedLogText, ExtentColor.GREEN);
		log.log(Status.INFO, m);
		log.log(Status.PASS, passedMessage);
	}

	public static void failedLog(String ActualvsExpectedLogText, String failedMessage, ExtentTest log) {
		Markup m = MarkupHelper.createLabel(ActualvsExpectedLogText, ExtentColor.RED);
		log.log(Status.INFO, m);
		log.log(Status.FAIL, failedMessage);
	}

	public static void verifyNode(Response response, String expectedNode, ExtentTest log) {

		String abcd = response.getBody().asString();
		boolean actualNode = abcd.contains(expectedNode);

		String logText = "To Verify ::" + expectedNode;
		if (actualNode == true) {
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			log.log(Status.PASS, m);
			log.log(Status.PASS, "Successfully verify Node ");
		} else {
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			log.log(Status.FAIL, m);
			log.log(Status.FAIL, " Node  not verified");
		}
	}

	public static String getuserId(Response response) {
		return response.getBody().jsonPath().getString("data[1].id");
	}

	public static void verifyStatusCode(Response response, String expectedResult, ExtentTest extentLog) {
		String actualStatusCode = getStatusCode(response);
		setResponseDetailInExtentReport("Get status code from response", actualStatusCode, extentLog);
		verifyActualExpectedResult(expectedResult, actualStatusCode, "status code is :: ", extentLog);
		System.out.println(actualStatusCode);
	}

	public static void getStatusCode(Response response, ExtentTest extentLog) {
		String actualStatusCode = getStatusCode(response);
		setResponseDetailInExtentReport("Get status code from response", actualStatusCode, extentLog);
		System.out.println(actualStatusCode);
	}

	public static void getPromotionsMessage(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "message");
		setResponseDetailInExtentReport("Promotion Message :: ", companyName, extentLog);
	}

	public static void getGroup(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "group");
		setResponseDetailInExtentReport("Groups :: ", companyName, extentLog);
	}
	
	public static void getFriends(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "friends");
		setResponseDetailInExtentReport("Friends :: ", companyName, extentLog);
	}

	public static void getGroupMembers(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "members");
		setResponseDetailInExtentReport("Group members :: ", companyName, extentLog);
	}

	public static void getClaimRewardCurrentTime(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "current_time");
		setResponseDetailInExtentReport("current_time :: ", companyName, extentLog);
	}

	public static void upcomingGamesList(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "upcoming");
		setResponseDetailInExtentReport("Upcoming Games List :: ", companyName, extentLog);
	}

	public static void featuredGamesList(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "featured");
		setResponseDetailInExtentReport("Featured Games List :: ", companyName, extentLog);
	}

	public static void hasClaimedPromotions(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "has_unclaimed_promotions");
		setResponseDetailInExtentReport("Has_Claimed_Promotions:: ", companyName, extentLog);
	}

	public static void reviewDisplay(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "review_display");
		setResponseDetailInExtentReport("Review_Display :: ", companyName, extentLog);
	}

	public static void rewardCoin1X(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "reward_coin_x1");
		setResponseDetailInExtentReport("Reward_Coin_x1 :: ", companyName, extentLog);
	}

	public static void rewardCoin2X(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "reward_coin_x2");
		setResponseDetailInExtentReport("Reward_Coin_x2 :: ", companyName, extentLog);
	}

	public static void rewardButtonDisableTime(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "reward_button_disable_time");
		setResponseDetailInExtentReport("Reward_Button_Disable_Time :: ", companyName, extentLog);
	}

	public static void coinsCount(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "coins");
		setResponseDetailInExtentReport("Coins :: ", companyName, extentLog);
	}

	public static void getuserData(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "data");
		setResponseDetailInExtentReport("User Data :: ", companyName, extentLog);
	}

	public static void getuserDataLinks(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "links");
		setResponseDetailInExtentReport("User Links :: ", companyName, extentLog);
	}

	public static void getuserMeta(Response response, ExtentTest extentLog) {
		String companyName = getDataFromResponse(response, "meta");
		setResponseDetailInExtentReport("User Meta :: ", companyName, extentLog);
	}

}