package testNG_ExtentReports_Practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_007Extentreport_withDynamiccode extends BaseClass {
  @Test
  public void verify_email_textbox() throws Exception {
	  test=r.createTest("verify_email_textbox");
	  
	  //description
	  test.log(Status.INFO, "enter email in email textbox");
	  
	  //to locate email textbox
	  driver.findElement(By.cssSelector("input#email")).sendKeys("ashvinipofare01@gmail.com");
	  
	  //takescreenshot
	  take_Screenshot("After entering email in email textbox");
	  
	  //attach screenshot
	  test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering email in email textbox.png");
	  
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  create_Extent_Report("Automation extent report", "Sanity testing", "Chrome");
	  launchBrowser("Chrome");
	  navigateUrl("https://www.facebook.com/");
	  
  }

  @AfterSuite
  public void end_process() {
	  
	  r.flush();
  }

}
