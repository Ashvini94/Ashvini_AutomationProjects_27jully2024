package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;

public class Softassert extends BaseClass{
  @Test
  public void verify_textbox() {
	  
	  String expected_input="Shirts";
	  
	  //to locate searchbox element
	  WebElement searchbox=driver.findElement(By.xpath("(//input[@color='greyBase'])[1]"));
	  
	  //send input in it
	  searchbox.sendKeys("Shirt");
	  
	  //to capture input in console
	  String actual_input=searchbox.getAttribute("value");
	  
	  System.out.println("Input passed is: "+searchbox.getAttribute("value"));
	  
	  //create object of soft assert
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(expected_input, actual_input,"Both values are not same");
	  
	  //use action class
	  Actions act=new Actions(driver);
	  
	  //press enter
	  act.sendKeys(Keys.ENTER).build().perform();
	  
	  //to show falure message
	  s.assertAll();
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  launchBrowser("Chrome");
	  navigateUrl("https://www.meesho.com/");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
