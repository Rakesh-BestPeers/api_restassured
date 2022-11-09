package com.listener;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.tests.TestBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends TestBase implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("*** RestAPI Test Suite " + context.getName() + " Started ***");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** RestAPI Test Suite " + context.getName() + " Ending ***"));
		if (extent != null) {
			extent.flush();
		}
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		test = extent.createTest(result.getTestClass().getName().replace("com.testSuite.release1.", "") + " :: "
				+ result.getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test Successfully...");
		String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Successful <b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		extentTest.get().log(Status.PASS, m);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Failed <b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		extentTest.get().log(Status.FAIL, m);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " Skipped...");
		String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Skipped <b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		extentTest.get().log(Status.SKIP, m);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("***  API Test failed but within percentage % " + result.getMethod().getMethodName());
	}
}
