package com.extent;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;
import java.util.Date;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null)
			createInstance();
		return extent;
	}

	// Create an extent report instance
	public static ExtentReports createInstance() {
		String fileName = getReportFileName();
		String directory = System.getProperty("user.dir") + "/Reports/";
		new File(directory).mkdir();
		String path = directory + fileName;
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle("REST_API Automation Report");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("REST_APIs Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.setAnalysisStrategy(AnalysisStrategy.TEST);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		extent = new ExtentReports();
		extent.setSystemInfo("Organization : ", "Bestpeers Infotech");
		extent.setSystemInfo("Application : ", "RESTApi_Testing");
		extent.setSystemInfo("Automation Engineer : ", "Rakesh Singh Thakur");
		extent.attachReporter(htmlReporter);

		return extent;
	}

	public static String getReportFileName() {
		Date d = new Date();
		String fileName = "REST_API_Report_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

		return fileName;
	}

}
