package testng;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Class_11Selectoption_dropdown_JeevansathiUrl extends BaseClass{
  @Test
  public void select_dropdown_option() throws Exception {
	  
	  //locate dropdown create profile for 
	  WebElement dropdown = driver.findElement(By.cssSelector("select#reg_relationship"));
	  
	  Thread.sleep(2000);
	  
	  //click on it
	  dropdown.click();
	  
	 
	  
	  //choose one option 
	  choose_option_by_select_class(dropdown, "Daughter");//call method directly from base class
  }
  @BeforeSuite
  public void launch_Browser() {
	  
	  launchBrowser("Chrome");
	  navigateUrl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
  }
  
  @AfterSuite
  public void close_window()
  {
	 //to close window 
	  driver.close();//
  }

}
