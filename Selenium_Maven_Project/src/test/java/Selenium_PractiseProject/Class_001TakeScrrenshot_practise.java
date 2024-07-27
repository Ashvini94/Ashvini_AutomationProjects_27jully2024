package Selenium_PractiseProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import baseclass.BaseClass;

public class Class_001TakeScrrenshot_practise {

	public static void main(String[] args) throws Exception {

		// launch browser
		WebDriver driver = new ChromeDriver();

		// navigate url
		driver.get("https://www.jiomart.com/");

		// maximize browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// to get project path
		String projectpath = System.getProperty("user.dir");

		// to print project path
		System.out.println(projectpath);

		// to take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		Thread.sleep(2000);

		File source_file = ts.getScreenshotAs(OutputType.FILE);

		// create object of file class
		File target_file = new File(projectpath + "\\screenshot\\Jiomart_homepage.png");

		FileHandler.copy(source_file, target_file);

	}

}
