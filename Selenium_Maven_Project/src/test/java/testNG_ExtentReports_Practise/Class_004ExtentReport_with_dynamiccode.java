package testNG_ExtentReports_Practise;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

public class Class_004ExtentReport_with_dynamiccode extends BaseClass {

	@BeforeSuite
	public void launch_browser() {
		create_Extent_Report("Extent_reportPractise_004", "Smoke testing", "Firefox");// call method of base class directly
																						 
		launchBrowser("Firefox");
		navigateUrl(
				"https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");

	}

	@Test(priority = 1)
	public void verify_emailtextbox() throws Exception {

		// create test
		ExtentTest test = r.createTest("Verify email textbox");

		// discription
		test.log(Status.INFO, "Enter email in email textbox");

		// locate email textbox and send input in it
		driver.findElement(By.cssSelector("input#reg_email")).sendKeys("ankit.virkhede@gmail.com");

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After entering email in email textbox");

		// attach screenshot to extent report
		test.addScreenCaptureFromPath(projectpath + "\\screenshot\\After entering email in email textbox.png");

	}

	@Test(priority = 2)
	public void verify_passwordtextbox() throws Exception {
		// create test
		ExtentTest test = r.createTest("Verify passwordtextbox");

		// description about test method
		test.log(Status.INFO, "Enter password in password textbox");

		// locate password textbox and send input in it
		driver.findElement(By.cssSelector("input#reg_password")).sendKeys("ankit@880056");

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After entering password in password textbox");

		// attach screenshot
		test.addScreenCaptureFromPath(projectpath + "//screenshot//After entering password in password textbox.png");
	}

	@AfterSuite
	public void end_process() {
		// stop monitoring
		r.flush();
	}
}
