package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_004ExtentReport_multipleTestMethods extends BaseClass {

	public String projectpath = System.getProperty("user.dir");

	@Test(priority = 1)
	public void create_extentreport() {

		ExtentSparkReporter report = new ExtentSparkReporter(
				projectpath + "\\ExtentReports\\ExtentReportPractise_004Linkendin.html");

		report.config().setDocumentTitle("Automation extent report");
		report.config().setReportName("Sanity testing");
		report.config().setTheme(Theme.STANDARD);

		r = new ExtentReports();
		r.attachReporter(report);

		r.setSystemInfo("OA", "Ashvini pofare");
		r.setSystemInfo("OS", "Window");
		r.setSystemInfo("Browser", "Firefox");

		test = r.createTest("Verify linkedin functionality");

		test.log(Status.INFO, "Open firefox browser");
		test.log(Status.INFO, "Navigate linkedin url");

	}

	@Test(priority = 2)
	public void verify_emailtextbox() throws Exception {

		test = r.createTest("Verify email textbox functionality");

		test.log(Status.INFO, "Entering email in email textbox");

		// locate email textbox and pass input in it
		driver.findElement(By.cssSelector("input#username")).sendKeys("ashvinipofare01@gmail.com");

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("after entering email in email textbox functionality");

		test.addScreenCaptureFromPath(
				projectpath + "\\screenshot\\after entering email in email textbox functionality.png");

	}

	@Test(priority = 3)
	public void verify_passwordtextbox() throws Exception {

		test = r.createTest("Verify password textbox functionality");

		test.log(Status.INFO, "Entering password in password textbox");

		// locate password textbox and send data in it
		driver.findElement(By.cssSelector("input#password")).sendKeys("ashvini@1994");

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("after entering password in password textbox functionality");

		test.addScreenCaptureFromPath(
				projectpath + "\\screenshot\\after entering password in password textbox functionality.png");
	}

	@BeforeSuite
	public void beforeSuite() {

		launchBrowser("Firefox");
		navigateUrl("https://www.linkedin.com/uas/login");
	}

	@AfterSuite
	public void afterSuite() {

		r.flush();
		// driver.close();
	}

}
