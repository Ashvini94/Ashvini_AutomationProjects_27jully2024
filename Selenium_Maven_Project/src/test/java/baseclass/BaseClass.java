package baseclass;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	// dynamic code of launch browser and get url, take screenshot,scroll the
	// page,switch parent to child window,select options in dropdown

	public static WebDriver driver;// we have to use static variable of driver

	public static String projectpath = System.getProperty("user.dir");

	public static String parent_window_id;

	public static String child_window_id;
	public static ExtentReports r;
	public static ExtentTest test;
	public static Actions act;

	// dynamic code to launch browser

	public static void launchBrowser(String browser) {
		// to handle browser notification popup
		ChromeOptions options = new ChromeOptions();

		options.addArguments("disable-notifications");

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}

		// to maximize browser
		driver.manage().window().maximize();

		// to give implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// to print browser name
		System.out.println("Launch browser is: " + browser);

	}

	// dynamic code to open url
	public static void navigateUrl(String url) {
		// to open url
		driver.get(url);

		// to print url name
		System.out.println("navigate url is: " + url);

		// to get title of webpage
		System.out.println("Title of webpage is: " + driver.getTitle());
	}

	// dynamic code to take scrrenshot
	public static void take_Screenshot(String screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File target_file = ts.getScreenshotAs(OutputType.FILE);

		File source_file = new File(projectpath + "\\screenshot\\" + screenshotname + ".png");

		FileHandler.copy(target_file, source_file);
	}

	// dynamic code for scroll the page using javascript executor

	public static void scroll_page(int ypoint) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0," + ypoint + ")");//here upto window.scrollBy(0," is a commom part so this will take in "" then concat ypoint and round bracket is also common that will take in also "" and then end the method
		
		
	}

	// dynamic code for switch parent window to child window

	public static void switch_window() {
		// to capture window tab id
		Set<String> window_id = driver.getWindowHandles();

		// to pull window id
		Iterator<String> it = window_id.iterator();

		// to shift parent window id
		parent_window_id = it.next();

		// to shift child window id
		child_window_id = it.next();

		// to capture parent window id in console
		System.out.println("Parent window id is: " + parent_window_id);

		// to capture child window id in console
		System.out.println("Child window id is: " + child_window_id);

		// switch parent to child window
		driver.switchTo().window(child_window_id);
	}

	// dynamic code for select option from dropdown by using select class
	public static void choose_option_by_select_class(WebElement dropdown,String option_name) {

		// use select class to select options from dropdown
		Select s = new Select(dropdown);
		
		//select option by select by visible text
		s.selectByVisibleText(option_name);
	}
	
	//dynamic code for Extent report
	public static void create_Extent_Report(String reportname,String setreportname,String browser)
	{
		ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\ExtentReports\\"+reportname+".html");
		report.config().setDocumentTitle("Automation_Extent_reports");
		report.config().setReportName(setreportname);
		report.config().setTheme(Theme.DARK);
		r = new ExtentReports();
		r.attachReporter(report);
		r.setSystemInfo("OS", "Window");
		r.setSystemInfo("QA", "Ashvini pofare");
		r.setSystemInfo("Browser", browser);
	
	
	}

}
