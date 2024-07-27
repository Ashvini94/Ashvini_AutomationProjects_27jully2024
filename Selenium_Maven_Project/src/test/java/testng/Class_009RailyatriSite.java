package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class Class_009RailyatriSite extends BaseClass {

	public String month_year;

	// to launch browser
	@BeforeSuite
	public void browser() throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://www.railyatri.in/");

		Thread.sleep(2000);
		take_Screenshot("Railyatri_Homepage");
		scroll_page(280);

	}

	// from city
	@Test(priority = 1)
	public void from_City() {

		// to locate from city dropdown
		WebElement from_city_dropdown = driver.findElement(By.cssSelector("input#from_stn_input"));

		// to pass input in dropdown
		from_city_dropdown.sendKeys("Mumbai");

		// to locate all options list
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-5']//li"));

		// to choose one option from list
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("MUMBAI CHINCHPOKLI | CHG")) {
				options.get(i).click();
			}
		}

		// to capture selected option
		System.out.println("Selected from city is: " + from_city_dropdown.getAttribute("value"));

	}

	// to city
	@Test(priority = 2)
	public void to_city() {
		// to locate to city dropdown
		WebElement to_city_dropdown = driver.findElement(By.cssSelector("input#to_stn_input"));

		// to pass input in dropdown
		to_city_dropdown.sendKeys("Amravati");

		// to locate all options list
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-6']//li"));

		// to choose one option from list
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("NAVI AMRAVATI | NAVI")) {
				options.get(i).click();
			}
		}

		// to capture selected option
		System.out.println("Selected to city is: " + to_city_dropdown.getAttribute("value"));
	}

	// calender
	@Test(priority = 3)
	public void calender() throws Exception {

		// to locate calender dropdown
		WebElement calender_dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));

		// scroll page up
		scroll_page(-100);

		// click on calender
		calender_dropdown.click();

		while (true) {
			// to locate month and year and capture the text of it
			month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();

			Thread.sleep(1000);

			// compare onth year to our desired month year
			if (!(month_year.equalsIgnoreCase("October 2024"))) {
				// locate next button and click on it
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			} else {
				break;
			}
		}
		Thread.sleep(1000);

		// to locate date and click on it
		driver.findElement(By.xpath("//td[text()='10']")).click();

		// to print selected month year
		System.out.println("Selected month year is: " + month_year);

		// to print selected date is
		System.out.println("Selected date is: " + calender_dropdown.getAttribute("value"));

	}

	// search button
	@Test(priority = 4)
	public void search_button() throws Exception {
		// to locate search button and click on it
		driver.findElement(By.cssSelector("button#search_btn_dweb")).click();

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After click on search button");
	}

	// to book train
	@Test(priority = 5)
	public void book_now() throws Exception {
		// scroll the page
		scroll_page(300);
		
		//to locate train name and capture the name of it
		String train_name=driver.findElement(By.xpath("//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways css-1blvkmy']")).getText();

		System.out.println("Selected train is: "+train_name);
		
		// to locate book now button and click on it
		driver.findElement(By.xpath("(//button[text()='Book Now'])[2]")).click();

		Thread.sleep(2000);

		// take screenshot
		take_Screenshot("After click on book now button");

	}

	// for user details
	@Test(priority = 6)
	public void user_details() throws Exception {
		// to locate gender and click on it
		driver.findElement(By.xpath("(//label[@class='traverller_radioButton__MC7xe']//span)[2]")).click();

		// scroll the page down
		scroll_page(250);

		// to locate full name and send data in it
		driver.findElement(By.xpath("(//input[@name='fullname'])[1]")).sendKeys("Ashvini Pofare");

		// to locate age and send data in it
		driver.findElement(By.xpath("(//input[@name='fullname'])[2]")).sendKeys("29");

		// to locate birth dropdown and click on it
		driver.findElement(By.xpath("//input[@value='No berth']")).click();

		// to locate upper birth and click on it
		driver.findElement(By.xpath("//span[text()='Upper berth']")).click();

		// to locate add passenger button and click on it
		driver.findElement(By.xpath("//button[text()='ADD PASSENGER']")).click();
		
		Thread.sleep(2000);
		take_Screenshot("After click on add passenger button");
		
		scroll_page(300);
		
	}
	
	//for irctc details
	@Test(priority=7)
	public void irctc_details()
	{
		//to locate irctc user id and send data in it
		driver.findElement(By.xpath("//input[@name='irctcID']")).sendKeys("maheshkhere11");
	}

	//for contact details
	@Test(priority=8)
	public void contact_details() throws Exception
	{
		//to locate mobile no and send data in it
		driver.findElement(By.xpath("(//input[@name='fullname'])[1]")).sendKeys("9923681282");
		
		//to locate email id and send data in it
		driver.findElement(By.xpath("(//input[@name='fullname'])[2]")).sendKeys("ashvinipofare01@gmail.com");
		
		//scroll down page
		scroll_page(350);
		
		Thread.sleep(2000);
		
		//to locate continue button and click on it
		driver.findElement(By.xpath("//button[text()=' Continue']")).click();
		
		Thread.sleep(3000);
		
		//to capture screenshot
		take_Screenshot("After click on continue button");
	}
	
}
