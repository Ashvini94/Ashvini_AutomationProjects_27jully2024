package testNG_extent_reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;

public class Class_001 extends BaseClass {

	// for project path -->declare variable globally
	public String projectpath = System.getProperty("user.dir");

	@Test
	public void create_Extent_report() {

		//1.create object of ExtentSparkReporter class and pass projectpath and folder name and report name with .html extension
		ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\ExtentReports\\Extent_report.html");
		
		//2.use configure method to give report title,report name,set theme(i.e dark or standard)
		
		//title of document or report
		report.config().setDocumentTitle("Automation_Extent_reports");
		
		//name of report
		report.config().setReportName("Sanity testing");
		
		//set theme
		report.config().setTheme(Theme.DARK);
		
		//3.Create object of ExtentReports class
		
		ExtentReports r=new ExtentReports();
		
		//attach report variable which hold the location of report in one folder
		r.attachReporter(report);
		
		//4.give browser name,os(operating system) name,QA name
		
		//give os name
		r.setSystemInfo("OS", "Window");//-->name of operating system like window,linux etc.
		
		//give QA name
		r.setSystemInfo("QA", "Ashvini pofare");//-->give name of person who will generate the report
		
		//give browser name
		r.setSystemInfo("Browser", "Chrome");//like chrome,firefox,edge etc.
		
		//create test
		ExtentTest test=r.createTest("Verify facebook functionality");
		
		//give description about test method
		test.log(Status.INFO, "Opened chrome browser");
		
		test.log(Status.INFO,"Navigate facebook url");
		
		test.log(Status.INFO,"Passed input in email textbox");
		
		//show pass 
		test.log(Status.PASS, "pass");
		
		//launch browser
		launchBrowser("Chrome");
		
		//navigate url
		navigateUrl("https://www.facebook.com");
		
		//to stop monitoring
		r.flush();
		
		
		
		

	}

	

}
