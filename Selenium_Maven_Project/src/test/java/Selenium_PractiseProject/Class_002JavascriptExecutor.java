package Selenium_PractiseProject;

import org.openqa.selenium.JavascriptExecutor;

public class Class_002JavascriptExecutor extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_browser("Chrome");
		navigate_url("https://www.amazon.in/");
		
		//use JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//to scroll down the page
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(2000);
		
		//to scroll up the page
		js.executeScript("window.scrollBy(0,-2000)");
		
		Thread.sleep(2000);
		
		//scroll page upto end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		//navigate back
		js.executeScript("window.history.back()");
		
		Thread.sleep(2000);
		
		//navigate forward
		js.executeScript("window.history.forward()");
		
		Thread.sleep(2000);
		
		//refresh the page
		js.executeScript("window.history.go(0)");
		
		

	}

}
