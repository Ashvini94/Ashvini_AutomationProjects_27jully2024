package properties_file;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import baseclass.Baseclass_properties_file;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;

public class P_001 extends Baseclass_properties_file {

	@Test
	public void f() throws Exception {

		initialize_properties_file();
		// System.out.println(uatprop.getProperty("chromebrowser"));//get value of it
		// System.out.println(dataprop.getProperty("username"));//get value of it
		open_browser("chromebrowser");// to luanch browser
		navigate_url("facebookurl");// to open url

		// to locate email texbox and send data in it
		driver.findElement(By.cssSelector(locatorprop.getProperty("email_css"))).sendKeys("ashvinipofare01@gmail.com");

		// to locate password texbox and send data in it
		driver.findElement(By.cssSelector(locatorprop.getProperty("password_css"))).sendKeys("ashvini@1994");

	}

}
