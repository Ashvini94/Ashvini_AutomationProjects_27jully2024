package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;


//initialize listeners
//@Listeners(Listeners_naukariurl.class)
public class ListenersExecution_naukariurl extends BaseClass {
	@Test(priority=1)
	public void verify_link_job() throws Exception {

		test = r.createTest("Verify link job");

		test.log(Status.INFO, "verify job link");

		// locate job url
		WebElement job_link = driver.findElement(By.xpath("//a[@title='Search Jobs']"));

		// perform mouse hover using action class
		act.moveToElement(job_link).build().perform();

		Thread.sleep(2000);

	}

	@Test(priority=2)
	public void verify_link_companies() throws Exception {

		test = r.createTest("Verify link companies");

		test.log(Status.INFO, "verify companies link");
		// locate companies url
		WebElement companies_link = driver
				.findElement(By.xpath("//a[@title='Explore top companies hiring on Naukri']"));

		// perform mouse hover using action class
		act.moveToElement(companies_link).build().perform();

		Thread.sleep(2000);
	}

	@Test(priority=3)
	public void verify_link_services() throws Exception {

		test = r.createTest("Verify link services");

		test.log(Status.INFO, "verify services link");
		// locate services url
		WebElement services_link = driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));

		// perform mouse hover using action class
		act.moveToElement(services_link).build().perform();

		Thread.sleep(2000);

	}

	@BeforeSuite
	public void beforeSuite() {
		launchBrowser("Chrome");
		navigateUrl("https://www.naukri.com/");
	}

	@AfterSuite
	public void afterSuite() {

		r.flush();

	}

}
