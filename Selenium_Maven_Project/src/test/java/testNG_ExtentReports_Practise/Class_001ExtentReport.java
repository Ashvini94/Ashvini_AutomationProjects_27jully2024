package testNG_ExtentReports_Practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.BaseClass;

public class Class_001ExtentReport  extends BaseClass{
	
	//for project path
	public String projectpath=System.getProperty("user.dir");
  @Test
  public void create_ExtentReport() {
	  
	  //1.create object of ExtentSparkReporter class and pass projectpath and location of folder with report name .html extension
	  ExtentSparkReporter report=new ExtentSparkReporter(projectpath+"\\ExtentReports\\Extent_Report001.html");
	  
	  //2.use configure method to set title of report,name of report,set theme
	  
	  //set title of report
	  report.config().setDocumentTitle("Automation Extent Report");
	  
	  //set report name
	  report.config().setReportName("Regression Testing");
	  
	  //set theme
	  report.config().setTheme(Theme.STANDARD);
	  
	  //3.create object of ExtentReport class
	  ExtentReports r=new ExtentReports();
	  
	  //4.attach report varaible
	  r.attachReporter(report);
	  
	  //5. give OS name,browser name,QA name
	  
	  //give OS name
	  r.setSystemInfo("OS", "Window");
	  
	  //give QA name
	  r.setSystemInfo("QA", "Ashvini Pofare");
	  
	  //give browse name
	  r.setSystemInfo("Browser", "Firefox");
	  
	  //6.create test
	  ExtentTest test = r.createTest("Verify Login Functionality");
	  
	  //7.give discription about test
	  test.log(Status.INFO,"Opened firefox browser");
	  
	  test.log(Status.INFO, "Navigate amazon url");
	  
	  test.log(Status.INFO, "Search product in search textbox");
	  
	  //8.show pass
	  test.log(Status.PASS, "pass");
	  
	  //launch browser
	  launchBrowser("Firefox");
	  
	  //navigate url
	  navigateUrl("https://www.amazon.in/");
	  
	  //9.stop monitoring
	  r.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
