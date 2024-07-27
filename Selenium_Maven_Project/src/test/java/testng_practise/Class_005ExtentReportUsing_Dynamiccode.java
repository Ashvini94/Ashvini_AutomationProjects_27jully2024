package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_005ExtentReportUsing_Dynamiccode extends BaseClass {
	@Test(priority=1)
	public void verify_emailtextbox_functionality() throws Exception {
		test = r.createTest("Verify email textbox functionality");

		test.log(Status.INFO, "Entering email in email textbox");

		// locate email textbox and send data in it
		driver.findElement(By.cssSelector("input#username")).sendKeys("ashvinipofare01@gmail.com");

		// take screenshot
		take_Screenshot("after entering email in email textbox functionality");

		test.addScreenCaptureFromPath(
				projectpath + "\\screenshot\\after entering email in email textbox functionality.png");

	}

	@Test(priority=2)
	public void verify_passwordtextbox_functionality() throws Exception {

		test = r.createTest("Verify password textbox functionality");

		test.log(Status.INFO, "Entering password in password textbox");

		// locate email textbox and send data in it
		driver.findElement(By.cssSelector("input#password")).sendKeys("ashvinipofare01@gmail.com");

		// take screenshot
		take_Screenshot("after entering password in password textbox functionality");

		test.addScreenCaptureFromPath(
				projectpath + "\\screenshot\\after entering password in password textbox functionality.png");

	}

	@BeforeSuite
	public void beforeSuite() {

		launchBrowser("Edge");
		navigateUrl("https://www.linkedin.com/uas/login");
		create_Extent_Report("ExtentReport_Class005_LinkendinDynamicCode", "Sanity testing", "Edge");
	}

	@AfterSuite
	public void afterSuite() {
		
		r.flush();
	}

}
