package testng_practise;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;

//initialize Listeners_Listener_reliancedigital class

public class Listener_Execution_reliancedigital extends BaseClass{
  @Test(priority=1)
  public void verify_mousehover_mobileandtablets() throws Exception {
	  
	  
	  //create test
	  test=r.createTest("verify_mousehover_mobileandtablets");
	  test.log(Status.INFO,"Mouse hover is done on mobile and tablets link");
	  
	  //locate mobile and tablets element
	  WebElement mobileandtablet_link=driver.findElement(By.xpath("//div[text()='Mobiles & Tablets']"));
	  act.moveToElement(mobileandtablet_link).build().perform();
	  
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=2)
  public void verify_mousehover_audio() throws Exception {
	  
	//create test
	  test=r.createTest("verify_mousehover_audio");
	  test.log(Status.INFO,"Mouse hover is done on audio link");
	  
	//locate audio element
	  WebElement audio_link=driver.findElement(By.xpath("//div[text()='Audio']"));
	  act.moveToElement(audio_link).build().perform();
	  
	  Thread.sleep(2000);
  }
  
  @Test(priority=3)
  public void verify_mousehover_cameras() throws Exception {
	  
	//create test
	  test=r.createTest("verify_mousehover_cameras");
	  test.log(Status.INFO,"Mouse hover is done on cameras link");
	  
	//locate cameras element
	 WebElement cameras_link= driver.findElement(By.xpath("//div[text()='Cameras']"));
	 act.moveToElement(cameras_link).build().perform();
	 
	 Thread.sleep(2000);
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  launchBrowser("Chrome");
	  navigateUrl("https://www.reliancedigital.in/");
  }

  @AfterSuite
  public void end_process() {
	  
	  r.flush();
  }

}
