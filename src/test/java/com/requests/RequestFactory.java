package com.requests;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.cards_generateCards;
import com.pojo.games_gamsSorting;
import com.pojo.groups_gameIds;
import com.pojo.groups_groupIds;
import com.pojo.image_profileImage;
import com.pojo.notify_content;
import com.pojo.notify_root;
import com.pojo.poke_user;
import com.pojo.poke_users;
import com.pojo.promotions_refferalUsername;
import com.pojo.reviews_userReviews;
import com.pojo.token_fcmToken;
import com.pojo.trade_props;
import com.tests.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestFactory extends TestBase {
	RestClient restClient = new RestClient();

	// PUT_USER_PROMOTIONS
	public Response promotions_PUT_userPromotion(String url, ExtentTest test) throws JsonProcessingException {

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		Response response = RestClient.doPutWithoutBodyWithoutToken(url, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// TRADE_IN_PROPS
	public Response tradeInProps_PUT(String url, ExtentTest test) throws JsonProcessingException {
		List<Integer> pId = Arrays.asList(280801, 280802);
		trade_props root = new trade_props(pId);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPutWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// GENERATION CARDS
	public Response generateCards_POST(String url, ExtentTest test) throws JsonProcessingException {
		cards_generateCards root = new cards_generateCards(gameId, 1);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// FCM_TOKEN
	public Response token_FCM_POST(String url, ExtentTest test) throws JsonProcessingException {
		token_fcmToken root = new token_fcmToken(fcm_token);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// UPLOAD_PROFILE_IMAGE
	public Response uploadProfileImage_PUT(String url, ExtentTest test) throws JsonProcessingException {
		image_profileImage root = new image_profileImage(profile_image);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPutWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// UPDATE_GROUPS_WITH_GROUPID
	public Response updateGroup_PUT(String url, ExtentTest test) throws JsonProcessingException {

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		Response response = RestClient.doPutWithoutBodyWithoutToken(url, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		// response.

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// GAME_REPORTS
	// public Response gameReports_POST(String url, ExtentTest test) throws
	// JsonProcessingException {
	// reports_gameReport root = new reports_gameReport(email, gameId,
	// coin_in_wallet);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url,
	// ExtentColor.PINK));
	// System.out.println("API Url is :: " + RestAssured.baseURI + url);
	//
	// ObjectMapper objMap = new ObjectMapper();
	// String myData =
	// objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
	// System.out.println(myData);
	// extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is :
	// " + myData, ExtentColor.INDIGO));
	// Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response : " + response.body().asString(),
	// ExtentColor.BROWN));
	//
	// long responseTime1 = response.getTime();
	// System.out.println("Response time in ms using getTime():" + responseTime1);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response time in ms using getTime():" +
	// responseTime1, ExtentColor.GREY));
	//
	// long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
	// System.out.println("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds);
	// extentTest.get().log(Status.INFO, MarkupHelper
	// .createLabel("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds, ExtentColor.CYAN));
	//
	// return response;
	// }

	// GET_NOTIFICATIONS
	public Response notifications_GET(String url, ExtentTest test) throws JsonProcessingException {

		notify_content content = new notify_content("social",
				"{\"avatar_url\":null,\"username\":\"DeveStage\",\"settings\":{\"theme\":\"NBA\",\"bonusUpdatesNotification\":true,\"gamesUpdatesNotification\":true,\"sound\":true,\"vibrate\":true},\"groupId\":\"d167d1eb-571a-483e-aa8c-ad55471ee029\",\"groupName\":\"Afdf\"}",
				"DeveStage has made you an admin for Afdf");

		List<String> to = Arrays.asList("a101efcd-6994-4f51-b69e-f44485794089");

		notify_root root = new notify_root(1, content, "42819ddd-1ccb-4ed9-b74b-08b36348994b", true,
				"You're now a Group Admin", to);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doGettWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// LEADERBOARD
	// public Response leaderboard_GET(String url, ExtentTest test) throws
	// JsonProcessingException {
	//
	// List<Object> content = Arrays.asList("1");
	// leaderboard_gameGroup root = new leaderboard_gameGroup(to_userId, groupId,
	// coin_in_wallet_1, true, content,
	// grizzly_dev, gameId, coin_in_wallet);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url,
	// ExtentColor.PINK));
	// System.out.println("API Url is :: " + RestAssured.baseURI + url);
	//
	// ObjectMapper objMap = new ObjectMapper();
	// String myData =
	// objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
	// System.out.println(myData);
	// extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is :
	// " + myData, ExtentColor.INDIGO));
	// Response response = RestClient.doGettWithBodyWithoutToken(url, root, test);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response : " + response.body().asString(),
	// ExtentColor.BROWN));
	//
	// long responseTime1 = response.getTime();
	// System.out.println("Response time in ms using getTime():" + responseTime1);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response time in ms using getTime():" +
	// responseTime1, ExtentColor.GREY));
	//
	// long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
	// System.out.println("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds);
	// extentTest.get().log(Status.INFO, MarkupHelper
	// .createLabel("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds, ExtentColor.CYAN));
	//
	// return response;
	// }

	// POKE_USER
	public Response pokeUser_POST(String url, ExtentTest test) throws JsonProcessingException {
		poke_user root = new poke_user(userId, to_userId, gameId, groupId);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is :: " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response :: " + response.body().asString(), ExtentColor.BROWN));

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response headerName :: " + response.getHeaders(), ExtentColor.TEAL));

		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response HTTP_StatusLine :: " + response.getStatusLine(), ExtentColor.TRANSPARENT));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():: " + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():: " + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():: " + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel(
				"Response time in seconds using getTimeIn():: " + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// POKE_USERS
	public Response pokeUsers_POST(String url, ExtentTest test) throws JsonProcessingException {
		poke_users root = new poke_users("07eee545-b5f8-4188-8606-7ade299c141d", "1bf97bb9-c1f0-4248-971c-6a1b737a8639",
				"55727957-3c6d-4219-b67f-a730fbabd6d8");

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// ADD_COINS_IN_WALLET
	// public Response addCoins_POST(String url, ExtentTest test) throws
	// JsonProcessingException {
	// users_Wallet root = new users_Wallet(coin_in_wallet_1);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url,
	// ExtentColor.PINK));
	// System.out.println("API Url is :: " + RestAssured.baseURI + url);
	//
	// ObjectMapper objMap = new ObjectMapper();
	// String myData =
	// objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
	// System.out.println(myData);
	//
	// extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is :
	// " + myData, ExtentColor.INDIGO));
	// Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response : " + response.body().asString(),
	// ExtentColor.BROWN));
	//
	// long responseTime1 = response.getTime();
	// System.out.println("Response time in ms using getTime():" + responseTime1);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response time in ms using getTime():" +
	// responseTime1, ExtentColor.GREY));
	//
	// long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
	// System.out.println("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds);
	// extentTest.get().log(Status.INFO, MarkupHelper
	// .createLabel("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds, ExtentColor.CYAN));
	//
	// return response;
	// }

	// CLAIM_REWARDS
	// public Response claimRewards_POST(String url, ExtentTest test) throws
	// JsonProcessingException {
	// users_rewardClaim claim = new
	// users_rewardClaim(RandomStringUtils.randomAlphabetic(12));
	// users_rewardClaim_root root = new users_rewardClaim_root(coin_in_wallet_1,
	// claim);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url,
	// ExtentColor.PINK));
	// System.out.println("API Url is :: " + RestAssured.baseURI + url);
	//
	// ObjectMapper objMap = new ObjectMapper();
	// String myData =
	// objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
	// System.out.println(myData);
	//
	// extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is :
	// " + myData, ExtentColor.INDIGO));
	// Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
	//
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response : " + response.body().asString(),
	// ExtentColor.BROWN));
	//
	// long responseTime1 = response.getTime();
	// System.out.println("Response time in ms using getTime():" + responseTime1);
	// extentTest.get().log(Status.INFO,
	// MarkupHelper.createLabel("Response time in ms using getTime():" +
	// responseTime1, ExtentColor.GREY));
	//
	// long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
	// System.out.println("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds);
	// extentTest.get().log(Status.INFO, MarkupHelper
	// .createLabel("Response time in seconds using getTimeIn():" +
	// responseTimeInSeconds, ExtentColor.CYAN));
	//
	// return response;
	// }

	// REFERRAL
	public Response refferal_POST(String url, ExtentTest test) throws JsonProcessingException {
		promotions_refferalUsername root = new promotions_refferalUsername("YlUvbyMmOQ");

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// USER_REVIEWS
	public Response userReviews_POST(String url, ExtentTest test) throws JsonProcessingException {
		reviews_userReviews root = new reviews_userReviews("{'star':3,'comment':'test'}", "2021-08-08 09:47:28");

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// GET_API_DETAILS
	public Response getUsers(String url, ExtentTest test) {

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("REST_API Request_Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("REST_API Request_Url is :: " + RestAssured.baseURI + url);
		Response response = RestClient.doGetWithoutToken(url, test);

		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("REST_API Response ContentType : " + response.getContentType(), ExtentColor.BROWN));

		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("REST_API Response StatusLine : " + response.getStatusLine(), ExtentColor.BROWN));

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("REST_API Response Headers : " + response.getHeaders(), ExtentColor.BROWN));

		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("REST_API Response Body : " + response.body().prettyPrint(), ExtentColor.BROWN));

		extentTest.get().log(Status.INFO, MarkupHelper.createLabel(
				"REST_API Response getTime_MILLISECONDS : " + response.getTime() + " millseconds", ExtentColor.BROWN));

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel(
						"REST_API Response getTime_SECONDS : " + response.getTimeIn(TimeUnit.SECONDS) + " seconds",
						ExtentColor.BROWN));

		return response;
	}

	// GROUP_GAMES
	public Response groupGames_POST(String url, ExtentTest test) throws JsonProcessingException {
		List<String> gameId = Arrays.asList("45559d07-88d9-4150-894d-d837e3a99f4b");
		groups_gameIds root = new groups_gameIds(gameId);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// GAMES_SORTING
	public Response gamesSorting_GET(String url, ExtentTest test) throws JsonProcessingException {
		games_gamsSorting root = new games_gamsSorting("2022-04-28", "Asia/Kolkata", "asc",
				"fd560107-a85b-4388-ab0d-655ad022aff7", "44180e55-0f24-11e2-8525-18a905767e44");

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doGettWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// CARD_REMOVE
	public Response cardRemove_POST(String url, ExtentTest test) throws JsonProcessingException {
		List<String> gameId = Arrays.asList("662ad7bf-d1b6-4fc4-9166-0941a4d53a1a");
		groups_gameIds root = new groups_gameIds(gameId);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// ADD_GAME_IN_GROUPS
	public Response addGame_POST(String url, ExtentTest test) throws JsonProcessingException {
		groups_groupIds root = new groups_groupIds(groupId);

		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		ObjectMapper objMap = new ObjectMapper();
		String myData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(root);
		System.out.println(myData);
		extentTest.get().log(Status.INFO, MarkupHelper.createLabel("Request Body is : " + myData, ExtentColor.INDIGO));
		Response response = RestClient.doPostWithBodyWithoutToken(url, root, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));

		return response;
	}

	// GET_TRANSACTIONS
	public Response getTransactions(String url, ExtentTest test) {
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		Response response = RestClient.doGetWithoutToken(url, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));
		return response;
	}

	public Response doPostWithoutBodyWithoutToken(String url, ExtentTest test) {
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("API Url is :: " + RestAssured.baseURI + url, ExtentColor.PINK));
		System.out.println("API Url is :: " + RestAssured.baseURI + url);

		Response response = RestClient.doPostWithoutBodyWithoutToken(url, test);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response : " + response.body().asString(), ExtentColor.BROWN));

		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():" + responseTime1);
		extentTest.get().log(Status.INFO,
				MarkupHelper.createLabel("Response time in ms using getTime():" + responseTime1, ExtentColor.GREY));

		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():" + responseTimeInSeconds);
		extentTest.get().log(Status.INFO, MarkupHelper
				.createLabel("Response time in seconds using getTimeIn():" + responseTimeInSeconds, ExtentColor.CYAN));
		return response;
	}

}
