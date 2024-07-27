package testNG_extent_reports;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

public class Class_002CreateMultipleTest extends BaseClass {

	public ExtentReports r; // globally declare variable
	public ExtentTest test; // globally declare variable

	@Test(priority = 1)
	public void create_ExtentReport() {

		// 1.create object of ExtentSparkReporter class and pass projectpath and folder
		// name and report name with .html extension
		ExtentSparkReporter report = new ExtentSparkReporter(projectpath + "\\ExtentReports\\Extent_report_002.html");

		// 2.use configure method to give report title,report name,set theme(i.e dark or
		// standard)

		// title of document or report
		report.config().setDocumentTitle("Automation_Extent_reports");

		// name of report
		report.config().setReportName("Sanity testing");

		// set theme
		report.config().setTheme(Theme.DARK);

		// 3.Create object of ExtentReports class

		r = new ExtentReports();

		// attach report variable which hold the location of report in one folder
		r.attachReporter(report);

		// 4.give browser name,os(operating system) name,QA name

		// give os name
		r.setSystemInfo("OS", "Window");// -->name of operating system like window,linux etc.

		// give QA name
		r.setSystemInfo("QA", "Ashvini pofare");// -->give name of person who will generate the report

		// give browser name
		r.setSystemInfo("Browser", "Chrome");// like chrome,firefox,edge etc.

		// create test
		test = r.createTest("Verify facebook functionality");

		// give description about test method
		test.log(Status.INFO, "Opened chrome browser");

		test.log(Status.INFO, "Navigate facebook url");

	}

	@Test(priority = 2)
	public void verify_emailtextbox() throws Exception {

		// create test
		test = r.createTest("verify email_textbox");

		// description about test method
		test.log(Status.INFO, "Enter email in email textbox");

		// locate email textbox and send input in it
		driver.findElement(By.cssSelector("input#email")).sendKeys("ashvinipofare01@gmail.com");

		Thread.sleep(2000);

		// take screenshot after entering email
		take_Screenshot("After entering email");
		
		//attach scrrenshot in Extentreport
		
		test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering email.png");
		

	}

	@Test(priority = 3)
	public void verify_passwordtextbox() throws Exception {
		// create test
		test = r.createTest("verify pasword_textbox");

		// description about test method
		test.log(Status.INFO, "Enter password in password textbox");

		// locate password textbox and send input in it
		driver.findElement(By.cssSelector("input#pass")).sendKeys("ashvini@12345");

		Thread.sleep(2000);

		// take screenshot after entering email
		take_Screenshot("After entering password");
		
		//attach screenshot in ExtentReport
		test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering password.png");
	}

	@BeforeSuite
	public void launch_browser() {
		// launch browser
		launchBrowser("Chrome");

		// navigate url
		navigateUrl("https://www.facebook.com");

	}

	@AfterSuite
	public void end_process() {

		// stop monitoring
		r.flush();
	}

}
