package testng;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import baseclass.BaseClass;

public class Listener_Amazon_url extends BaseClass implements ITestListener{
	
	

	@Override
	public void onTestStart(ITestResult result) {
		
		//use action class
		 act=new Actions(driver);
		 System.out.println("Action class is initialized");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			take_Screenshot(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(projectpath+"\\screenshot\\"+result.getMethod().getMethodName()+".png");
	}

	
	@Override
	public void onStart(ITestContext context) {
		
		create_Extent_Report("Amazon_Extent_Report", "Verify_Mouse_hover_in_Amazon", "Chrome");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
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

}
