package testng;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class Class_13MeshoUrl extends BaseClass {

	@BeforeSuite
	public void launch_browser() {
		launchBrowser("Chrome");
		navigateUrl("https://www.meesho.com/");

	}

	// for woman ethenic link
	@Test
	public void verify_functionality1() throws Exception {

	//locate women ethnic link
		WebElement link1=driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		
		//use action class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//move to element
		act.moveToElement(link1).build().perform();
		
	}
	
	//for home & kithen link
	@Test
	public void verify_functionality2() throws Exception {

	//locate  home & kithen link
		WebElement link2=driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		
		//use action class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//move to element
		act.moveToElement(link2).build().perform();
		
	}
	
	//for electronic link
	@Test
	public void verify_functionality3() throws Exception {

	//locate electronics link 
		WebElement link3=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		//use actuon class
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		//move to element
		act.moveToElement(link3).build().perform();
		
	}

}
