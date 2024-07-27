package pageobjectmodel;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution_page extends BaseClass {

	public Sign_in s;// globally declare variable
	public Create_an_account caccount;// globally declare variable

	@Test(priority=1)
	public void verify_user_signin() {

		// create object of Sign_In class
		s = new Sign_in(driver);//by this constructor will be call automatically
		
		//call user_sign_in method
		s.user_sign_in();
	}
	
	@Test(priority=2)
	public void verify_user_accountdetails()
	{
		 caccount=new Create_an_account(driver);//by this constructor will be call automatically
		 
		 //scroll the page
		 scroll_page(500);//call method from base class
		
		//call user_accountdetails method
		caccount.user_accountdetails();
		
	}

	@BeforeSuite
	public void beforeSuite() {
		launchBrowser("Chrome");
		navigateUrl("http://www.automationpractice.pl/index.php");

	}

	

}
