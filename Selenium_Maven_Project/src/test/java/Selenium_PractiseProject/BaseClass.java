package Selenium_PractiseProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	
	//dynamic code for launch browser
	public static void launch_browser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	//dynamic code for navigate url
	public static void navigate_url(String url)
	{
		//to open url
		driver.get(url);
		
		//to print the url in console
		System.out.println("Opened url is: "+url);
		
		//to get title of url
		System.out.println("Title of url is: "+driver.getTitle());
		
		
		
	}
	
	//dynamic code for take screenshot
	public static void takes_screenshot(String screenshotname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		
		File target_file=new File(projectpath+"\\screenshot\\"+screenshotname+".png");
		
		FileHandler.copy(source_file, target_file);
	}
	
	//dynamic code for scroll page
	public static void scroll_page(int ypoint)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down the page
		js.executeScript("window.scrollBy(0,"+ypoint+")");
	}
}
