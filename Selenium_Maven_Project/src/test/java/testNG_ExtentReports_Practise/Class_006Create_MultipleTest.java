package testNG_ExtentReports_Practise;

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

public class Class_006Create_MultipleTest extends BaseClass{
	
	public ExtentTest test;
	public ExtentReports r;
	
    public String projectpath=System.getProperty("user.dir");
  @Test(priority=1)
  public void create_ExtentReport() {
	  
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\ExtentReports\\Extent_report_006.html");
	  
	  report.config().setDocumentTitle("Automation extent report");
	  report.config().setReportName("Smoke testing");
	  report.config().setTheme(Theme.DARK);
	  
	  r=new ExtentReports();
	  
	  r.attachReporter(report);
	  
	  //set os name, browser name,QA name
	  r.setSystemInfo("OS", "Window");
	  r.setSystemInfo("OA", "Ashvini Pofare");
	  r.setSystemInfo("Browsername", "Chrome");
	  
	  //create test
	  test=r.createTest("Verify facbook functionality");
	  
	  //give description
	  test.log(Status.INFO,"Chrome browser is opened");
	  test.log(Status.INFO,"Navigate facebook url");
	  
	  
  }
  @Test(priority=2)
  public void verify_emailtextbox() throws Exception {
	  
	  //create test
	  test=r.createTest("verify verify_emailtextbox");
	  
	  test.log(Status.INFO, "enter email in email textbox");
	  //loacte email textbox
	  driver.findElement(By.cssSelector("input#email")).sendKeys("ankitvirkhede01gmail.com");
	  
	  Thread.sleep(3000);
	  
	  //take screenshot
	  take_Screenshot("After entering email in email textbox");
	  
	  //attach screenshot
	  test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering email in email textbox.png");
	  
  }
  @Test(priority=3)
  public void verify_passwordtextbox() throws Exception {
	  
	//create test
	  test=r.createTest("verify verify_passwordtextbox");
	  
	  test.log(Status.INFO, "enter password in password textbox");
	  //loacte email textbox
	  driver.findElement(By.cssSelector("input#pass")).sendKeys("ankit@1994");
	  
	  Thread.sleep(3000);
	  
	//take screenshot
	  take_Screenshot("After entering password in password textbox");
	  
	  //attach screenshot
	  test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering password in password textbox");
  }
  @BeforeSuite
  public void beforeSuite() {
	  launchBrowser("Chrome");
	  navigateUrl("https://www.facebook.com/");
  }

  @AfterSuite
  public void end_process() {
	  
	  r.flush();
  }

}
