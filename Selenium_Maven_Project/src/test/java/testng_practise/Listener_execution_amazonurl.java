package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

@Listeners(Listener_amazonurl.class)
public class Listener_execution_amazonurl extends BaseClass {

	@Test(priority = 1)
	public void verify_mousehover_fashion_link() throws Exception {

		//create test
		test = r.createTest("verify_mousehover_fashion_link");

		test.log(Status.INFO, "Mouse hover is done on fashion link");

		// locate element fashion link
		WebElement fashion_link = driver.findElement(By.linkText("Fashion"));

		act.moveToElement(fashion_link).build().perform();
		Thread.sleep(2000);
		System.out.println("Mouse hover is done on fashion link");
	}

	@Test(priority = 2)
	public void verify_mousehover_electronics_link() throws Exception {

		test = r.createTest("verify_mousehover_electronics_link");

		test.log(Status.INFO, "Mouse hover is done on electronics link");

		// locate element electronics link
		WebElement electronics_link = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(electronics_link).build().perform();
		Thread.sleep(2000);
		System.out.println("Mouse hover is done on electronics link");

	}

	@Test(priority = 3)
	public void verify_mousehover_jewellery_link() throws Exception {

		test = r.createTest("verify_mousehover_jewellery_link");

		test.log(Status.INFO, "Mouse hover is done on jewellery link");

		// locate jewellery link
		WebElement jewellery_link = driver.findElement(By.linkText("Jewellery"));
		act.moveToElement(jewellery_link).build().perform();
		Thread.sleep(2000);
		System.out.println("Mouse hover is done on jewellery link");

	}

	@BeforeSuite
	public void beforeSuite() {

		launchBrowser("Chrome");
		navigateUrl("https://www.jiomart.com/");
	}

	@AfterSuite
	public void end_process() {
		
		r.flush();
	}

}
