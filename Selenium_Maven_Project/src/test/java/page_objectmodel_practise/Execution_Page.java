package page_objectmodel_practise;

import org.testng.annotations.Test;

import baseclass.BaseClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution_Page extends BaseClass {
	public Sign_In s;

	@Test(priority=1)
	public void verify_user_signin() {

		s = new Sign_In(driver);
		s.User_signin();
	}
	
	@Test(priority=2)
	public void verify_user_credentials()
	{
		//scroll the page
		scroll_page(400);
		
		Create_accountdetails actdetails=new Create_accountdetails(driver);
		actdetails.user_accountdetails();
	}

	@BeforeSuite
	public void beforeSuite() {

		launchBrowser("Chrome");
		navigateUrl("http://www.automationpractice.pl/");
	}

	

}
