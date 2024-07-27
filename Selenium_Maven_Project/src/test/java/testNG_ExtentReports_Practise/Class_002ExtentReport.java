package testNG_ExtentReports_Practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

public class Class_002ExtentReport extends BaseClass{

	//for projectpath
	public String projectpath = System.getProperty("user.dir");
	

	@Test
  public void create_Extentreport() {
	  
	  //create object of ExtentSparkReporter class
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\Extentreports\\ExtentReport_practise_002.html");
	  
	  //use cconfig method to give document name to report
	  report.config().setDocumentTitle("Automation Extent Report");
	  
	  //to give report name
	  report.config().setReportName("Integration testing");
	  
	  //to set theme
	  report.config().setTheme(Theme.DARK);
	  
	  //create object of ExtentReports class
	  ExtentReports r=new ExtentReports();
	  
	  //attach report variable
	  r.attachReporter(report);
	  
	  //give name of browser,name of OS,name of QA
	  r.setSystemInfo("OS", "Window");
	  r.setSystemInfo("QA", "Miss Ashvini Pofare");
	  r.setSystemInfo("Browser", "Chrome");
	  
	  //create test
	 ExtentTest test = r.createTest("Verify logn functionality");
	 
	 //description about test method
	 test.log(Status.INFO, "Opened chrome browser");
	 test.log(Status.INFO, "navigate facbook url");
	 
	 //show pass
	 test.log(Status.PASS, "pass");
	 
	 //launch browser
	 launchBrowser("Chrome");
	 navigateUrl("https://www.facebook.com");
	 
	 //to stop monitoring
	 r.flush();
	  
	  
	  

  }
}
