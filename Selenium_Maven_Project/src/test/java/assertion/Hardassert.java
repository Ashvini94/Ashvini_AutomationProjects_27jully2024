package assertion;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Hardassert extends BaseClass {
  @Test
  public void men_link_mousehover() {
	  
	  String expected_link_name="Men";
	  
	  //locate men link store it in one variable of string type
	  String actual_link_name=driver.findElement(By.xpath("//span[text()='Men']")).getText();
	 // System.out.println(actual_link);
	  
	  //verify expected and actual link name
	 //Assert.assertEquals(expected_link_name,actual_link_name);//both values will be true 
	 // System.out.println("Verified expected link name and actual link name using assertion");
	  
	 // Assert.assertNotEquals(expected_link_name,actual_link_name,"Both link are not same");//both values will not be true then only returns true
	  
	  Assert.assertTrue(expected_link_name.equals(actual_link_name),"Both link are not same");//here we can use contains method and equal ignorecase method also
	  
	  
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
