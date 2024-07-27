package testng_practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import baseclass.BaseClass;

public class Listener_reliancedigital extends BaseClass implements ITestListener {
	
	

	@Override
	public void onTestStart(ITestResult result) {
		
		//initialize action class
		act=new Actions(driver);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//take screenshot
		try {
			take_Screenshot(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(projectpath+"\\screenshot\\"+result.getMethod().getMethodName()+".png");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		create_Extent_Report("ExtentReport_reliancedigital", "Verify_mousehover_reliancedigitalurl", "Chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	
	

}
