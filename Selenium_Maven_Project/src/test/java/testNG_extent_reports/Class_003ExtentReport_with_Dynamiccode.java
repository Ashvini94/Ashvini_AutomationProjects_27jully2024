package testNG_extent_reports;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

public class Class_003ExtentReport_with_Dynamiccode extends BaseClass {

	@BeforeSuite
	 public void launch_browser()
	 {
		 create_Extent_Report("Extent_report_003","Sanity Testing","Edge");//call method of base class directly
		  launchBrowser("Edge");
		  navigateUrl("https://www.flipkart.com/");
	 }

	@Test
	public void create_Extentreport() throws Exception {

		// create test
		ExtentTest test = r.createTest("Verify searchbox functionality");

		// give description about test method
		test.log(Status.INFO, "Opened edge browser");

		test.log(Status.INFO, "Navigate flipkart url");

		test.log(Status.INFO, "Enter input in searchbox");

		// locate serachbox and pass input in it
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Recliner");
		
		//take screenshot
		take_Screenshot("After search the product");
		
		//attach screenshot
		test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After search the product.png");
		

	}

	@AfterSuite
	public void end_process() {
		// stop monitoring
		r.flush();
	}
}
