package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass_properties_file {

	public static WebDriver driver;// we have to use static variable of driver

	public static String projectpath = System.getProperty("user.dir");

	public static FileInputStream fis;// globally declare variable
	public static Properties uatprop;// globally declare variable
	public static Properties dataprop; // globally declare variable
	public static Properties locatorprop;// globally declare variable

	// initialize all properties file to fetch data
	public static void initialize_properties_file() throws Exception {
		// to insert external file create object of FileinputStream class and pass
		// location of UAT properties file in it
		fis = new FileInputStream(projectpath + "\\resources\\UAT.properties");

		// create object of Properties class
		uatprop = new Properties();

		// to load file
		uatprop.load(fis);

		// to insert external file create object of FileinputStream class and pass
		// location of data properties file in it
		fis = new FileInputStream(projectpath + "\\resources\\data.properties");

		// create object of Properties class
		dataprop = new Properties();

		// to load file
		dataprop.load(fis);

		// to insert external file create object of FileinputStream class and pass
		// location of locator properties file in it
		fis = new FileInputStream(projectpath + "\\resources\\locators.properties");

		// create object of Properties class
		locatorprop = new Properties();

		// to load file
		locatorprop.load(fis);

	}
	
	//to launch browser
	public static void open_browser(String browserkey)
	{
		if(uatprop.getProperty(browserkey).equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(uatprop.getProperty(browserkey).equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		else if(uatprop.getProperty(browserkey).equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Opened browser is: "+uatprop.getProperty(browserkey));
	}
	
	//to navigate url
	public static void navigate_url(String urlkey)
	{
		driver.get(uatprop.getProperty(urlkey));
		
		//to capture title of url
		System.out.println("title of url is: "+driver.getTitle());
		
		//to print url in console
		System.out.println("Opened url is: "+uatprop.getProperty(urlkey));
	
	}
}
