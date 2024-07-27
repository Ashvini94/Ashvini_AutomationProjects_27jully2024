package testNG_ExtentReports_Practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class Class_003_CreateMultipleTest extends BaseClass {
	
	public String projectpath=System.getProperty("user.dir");
	public ExtentReports r;
	public ExtentTest test;
	
	

  @Test(priority=1)
  public void create_ExtentReport() {
	  
	  //create object of ExtentSparkReporter class
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\ExtentReports\\ExtentReport_practise_003.html");
	  
	  //give title of report
	  report.config().setDocumentTitle("Automation extent report");
	  
	  //give report name
	  report.config().setReportName("Smoke Testing");
	  
	  //set theme
	  report.config().setTheme(Theme.STANDARD);
	  
	  //create object of ExtentReports class
	   r=new ExtentReports();
	  
	  //attach report variable
	  r.attachReporter(report);
	  
	  //give OS name,browser name,QA name
	  r.setSystemInfo("OS", "Window");
	  r.setSystemInfo("OA", "Ashvini Pofare");
	  r.setSystemInfo("Browser", "Chrome");
	  
	  //create test
	   test = r.createTest("Verify jeevansathi application functionality");
	  
	  //description about test method
	  test.log(Status.INFO,"Opened chrome browser");
	  test.log(Status.INFO,"Navigate jeevansathi url");
	  
	  
  }
  
  @Test(priority=2)
  public void verify_emailtextbox() throws Exception
  {
	  //create test
	  test=r.createTest("Verify emailtextbox");
	  
	  //description about test method
	  test.log(Status.INFO,"Enter email in email textbox");
	  
	  //locate email textbox and send input in it
	  driver.findElement(By.cssSelector("input#reg_email")).sendKeys("ankit.virkhede@gmail.com");
	  
	  Thread.sleep(2000);
	  
	  //take screenshot
	  take_Screenshot("After entering email in email textbox");
	  
	  //attach screenshot
	  test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering email in email textbox.png");
	 
	  
	  
  }
  
  @Test(priority=3)
  public void verify_passwordtextbox() throws Exception
  {
	  //create test
	  test=r.createTest("Verify passwordtextbox");
	  
	  //description about test method
	  test.log(Status.INFO,"Enter password in password textbox");
	  
	  //locate password textbox and send input in it
	  driver.findElement(By.cssSelector("input#reg_password")).sendKeys("ankit@880056");
	  
	  Thread.sleep(2000);
	  
	  //take screenshot
	  take_Screenshot("After entering password in password textbox");
	  
	  //attach screenshot
	  test.addScreenCaptureFromPath(projectpath+"\\screenshot\\After entering password in password textbox.png");
	 
	  
	  
  }
  
  
  @BeforeSuite
  public void launch_browser() {
	  
	  launchBrowser("Firefox");
	  navigateUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
  
  
  }

  @AfterSuite
  public void end_Process() {
	  
	  //stop monitoring
	  r.flush();
  }

}
