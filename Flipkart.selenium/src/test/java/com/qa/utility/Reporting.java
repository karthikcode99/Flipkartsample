package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports xReports;
	public ExtentTest xTest;

	public void onStart(ITestContext testContext) {
		// String dateTime= new SimpleDateFormat("yyyy.MM.ss.HH.mm.ss").format(new Date());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String repName="Test-Automation.html";

		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Flipkart automation report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		xReports=new ExtentReports();
		xReports.attachReporter(htmlReporter);
		xReports.setSystemInfo("QAname","karthik v");
		xReports.setSystemInfo("hostname","local host");
		xReports.setSystemInfo("platform","WINDOWS 10");
	}


	public void onFinish(ITestContext testContext) {
		xReports.flush();
	}


	public void onTestSuccess(ITestResult tr) {
		xTest=xReports.createTest(tr.getName());
		xTest.log(Status.PASS,"Test is passed");
		xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}


	public void onTestFailure(ITestResult tr) {
		xTest=xReports.createTest(tr.getName());
		xTest.log(Status.FAIL,"Test is Failed");
		xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

		xTest.log(Status.FAIL,tr.getThrowable());

		String ssPath=System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
		File file=new File(ssPath);
		if(file.exists()) {
			try {
				xTest.fail("Screenshot of the failed test is :"+xTest.addScreenCaptureFromPath(ssPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public void onTestSkipped(ITestResult tr) {
		xTest=xReports.createTest(tr.getName());
		xTest.log(Status.SKIP,"Test is skipped");
		xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
		xTest.log(Status.SKIP,tr.getThrowable());
	}                                  


}
