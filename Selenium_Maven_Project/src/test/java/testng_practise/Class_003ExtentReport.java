package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

public class Class_003ExtentReport extends BaseClass {
	
	String projectpath=System.getProperty("user.dir");
  @Test
  public void create_extentreport() {
	  
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\ExtentReports\\ExtentReport_002Practise.html");
	  
	  report.config().setDocumentTitle("Automation extent report");
	  report.config().setReportName("Smoke testing");
	  report.config().setTheme(Theme.DARK);
	  
	  ExtentReports r=new ExtentReports();
	  
	  r.attachReporter(report);
	  
	  r.setSystemInfo("QA","Ashvini pofare");
	  r.setSystemInfo("OS", "Window");
	  r.setSystemInfo("Browser", "Chrome");
	  
	  ExtentTest test = r.createTest("Verify linkedin functionality");
	  
	  test.log(Status.INFO,"Open chrome browser");
	  test.log(Status.INFO,"Navigate linkenin url");
	  test.log(Status.PASS, "pass");
	  
	  launchBrowser("Chrome");
	  navigateUrl("https://www.linkedin.com/");
	  
	  r.flush();
  }
}
