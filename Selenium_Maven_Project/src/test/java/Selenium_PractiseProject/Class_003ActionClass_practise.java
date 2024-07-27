package Selenium_PractiseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_003ActionClass_practise extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("Chrome");
		navigate_url("https://www.amazon.in/");

		// locate amazon miniTV link and click on it
		WebElement amazon_miniTV_link = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));

		// use action class
		Actions act = new Actions(driver);

		// click on link
		act.click(amazon_miniTV_link).build().perform();
		
		Thread.sleep(2000);
		
		//nvaigate back
		driver.navigate().back();

		// locate fresh link
		WebElement fresh_link = driver.findElement(By.xpath("//span[text()='Fresh']"));

		// mouse hover on link
		act.moveToElement(fresh_link).build().perform();
		
		Thread.sleep(2000);

		// locate prime link
		WebElement prime_link = driver.findElement(By.xpath("//span[text()='Prime']"));

		// right click on link
		act.moveToElement(prime_link).contextClick().build().perform();
		
		//locate element searchbox 
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Bhagwatgeeta book");
		
		//double click
		act.doubleClick(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).build().perform();

	}

}
