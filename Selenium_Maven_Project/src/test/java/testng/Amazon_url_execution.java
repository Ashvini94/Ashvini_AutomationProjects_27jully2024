package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

@Listeners(Listener_Amazon_url.class)
public class Amazon_url_execution extends BaseClass {
	@Test(priority = 1)
	public void verify_mousehover1_fresh_link() throws Exception {

		// create test
		 test = r.createTest("verify_mousehover1_fresh_link");
		// give description about test method
		test.log(Status.INFO, "Mouse hover is done on fresh link");

		// locate fresh link
		WebElement fresh_link = driver.findElement(By.linkText("Fresh"));
		act.moveToElement(fresh_link).build().perform();
		System.out.println("Mouse hover is done on fresh link");
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void verify_mousehover2_hello_signin_link() throws Exception {

		// create test
		 test = r.createTest("verify_mousehover2_hello_signin_link");
		// give description about test method
		test.log(Status.INFO, "Mouse hover is done on hello sign in link");

		act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
		System.out.println("Mouse hover is done on hello sign in link");
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void verify_mousehover3_EN_link() throws Exception {

		// create test
		test = r.createTest("verify_mousehover3_EN_link");
		// give description about test method
		test.log(Status.INFO, "Mouse hover is done on EN link");

		act.moveToElement(driver.findElement(By.xpath("//div[text()='EN']"))).build().perform();
		System.out.println("Mouse hover is done on EN link");
		Thread.sleep(3000);
	}

	@BeforeSuite
	public void launch_browser() {

		launchBrowser("Chrome");
		navigateUrl("https://www.amazon.in/");
	}

	@AfterSuite
	public void end_process() {
		
		r.flush();
	}

}
