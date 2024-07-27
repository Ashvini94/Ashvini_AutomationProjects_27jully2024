package testNG_ExtentReports_Practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

public class Class_005ExtentReport extends BaseClass{
	
	public String projectpath=System.getProperty("user.dir");
 
	@Test
  public void create_extent_report() {
	  
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\ExtentReports\\extent_report_005.html");
	  
	  //use config method
	  
	  report.config().setDocumentTitle("Automation extent report");
	  
	  report.config().setReportName("Sanity testing");
	  
	  report.config().setTheme(Theme.STANDARD);
	  
	  ExtentReports r=new ExtentReports();
	  
	  //attach report
	  r.attachReporter(report);
	  
	  //set os name,browser name,QA name
	  r.setSystemInfo("OS", "Window");
	  r.setSystemInfo("QA", "Ashvini Pofare");
	  r.setSystemInfo("Browser name", "Firefox");
	  
	  //crete test
	 ExtentTest test= r.createTest("Verify facebook functionality");
	 
	 //give description about test method
	 test.log(Status.INFO, "Firefox browser is opened");
	 test.log(Status.INFO, "Navigate facebook url");
	 
	 //to show pass
	 test.log(Status.PASS, "pass");
	 
	 //launch browser
	 launchBrowser("Firefox");
	 navigateUrl("https://www.facebook.com/");
	 
	 //flush report
	 r.flush();
	  
  }
}
