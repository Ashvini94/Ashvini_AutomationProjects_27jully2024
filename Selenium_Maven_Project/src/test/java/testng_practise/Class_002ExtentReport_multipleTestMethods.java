package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_002ExtentReport_multipleTestMethods extends BaseClass {
	@Test
	public void verify_email() throws Exception {

		test = r.createTest("verify_email");
		test.log(Status.INFO, "Entering email in email textbox");

		// locate email textbox
		driver.findElement(By.cssSelector("input#session_key")).sendKeys("ashvinipofare01@gmail.com");

		// take screenshot
		take_Screenshot("After entering email in email textbox");

		Thread.sleep(2000);

		// attach screenshot
		test.addScreenCaptureFromPath(projectpath +"\\screenshot\\After entering email in email textbox.png");

	}

	@Test
	public void verify_password() throws Exception {

		test = r.createTest("verify_password");
		test.log(Status.INFO, "Entering password in password textbox");
		
		 

		// locate password textbox
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("ashvini@1994");
		
		scroll_page(300);

		// take screenshot
		take_Screenshot("After entering password in password textbox");

		Thread.sleep(2000);

		// attach screenshot
		test.addScreenCaptureFromPath(projectpath +"\\screenshot\\After entering password in password textbox.png");
	}

	@BeforeSuite
	public void beforeSuite() {

		create_Extent_Report("ExtentReport_Linkedin", "Verify_linkedin_functionality", "Chrome");
		launchBrowser("Chrome");
		navigateUrl("https://www.linkedin.com/");
	}

	@AfterSuite
	public void end_process() {
		
		//flush report
		r.flush();
	}

}
