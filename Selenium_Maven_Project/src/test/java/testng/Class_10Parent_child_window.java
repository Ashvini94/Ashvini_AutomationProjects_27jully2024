package testng;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeTest;

public class Class_10Parent_child_window extends BaseClass {
	@Test
	public void switch_parent_to_child_window() throws Exception {

		// switch parent to child window
		switch_window(); //call method directly of base class
		
		Thread.sleep(2000);

		// capture title of child window in console
		System.out.println("Title of child window is: " + driver.getTitle());
		
		//capture current url of child window
		System.out.println("Current url of child window is: "+driver.getCurrentUrl());
		

		// switch child to parent window
		driver.switchTo().window(parent_window_id);

		// capture title of parent window in console
		System.out.println("Title of parent window is: " + driver.getTitle());

		// locate register button and click on it
		driver.findElement(By.cssSelector("a#register_Layer")).click();

	}

	@BeforeTest
	public void launchBrowser() {

		launchBrowser("Chrome");
		navigateUrl("https://www.naukri.com/");
		scroll_page(300);

		// locate MNC element and click on it
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
	}

}
