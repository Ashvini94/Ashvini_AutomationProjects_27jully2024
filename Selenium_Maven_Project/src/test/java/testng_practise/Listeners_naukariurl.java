package testng_practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import baseclass.BaseClass;

public class Listeners_naukariurl extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	 act=new Actions(driver);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			take_Screenshot(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//attach screenshot
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
		
		
		//initialize extent report
		create_Extent_Report("ExtentReport_naukariurl","Smoke testing", "Chrome");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		driver.close();
	}

}
