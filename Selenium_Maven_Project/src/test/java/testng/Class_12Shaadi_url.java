package testng;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

public class Class_12Shaadi_url extends BaseClass {
  @Test
  public void verify_looking_dropdwon() throws Exception {
	  
	  
	  //scroll the page
	  scroll_page(300);
	  
	  Thread.sleep(2000);
	  
	  //locate dropdown  and click on it
	  driver.findElement(By.xpath("//div[@class='Dropdown-control']")).click();
	  
	  Thread.sleep(2000);
	  
	  //to locate option man and click on it
	  driver.findElement(By.xpath("//div[text()='Woman']")).click();
	  
  }
  
  
  @BeforeSuite
  public void launchBrowser() {
	  
	  launchBrowser("Chrome");
	  navigateUrl("https://www.shaadi.com/");
	  
  }

}
