package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {

	// locate elements
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	WebElement signinbutton;// these variables are also called as object repository and these are instance
							// members
	@FindBy(css = "input#email_create")
	WebElement emailaddress;
	@FindBy(css = "button#SubmitCreate")
	WebElement createanaccountbutton;

	// to assign driver with the help of constructor
	public Sign_in(WebDriver driver) 
	{
		//initialize driver
		PageFactory.initElements(driver,this);

	}
	
	//create method to perform operation it
	public void user_sign_in()
	{
		//to click on sign in button
		signinbutton.click();
		
		//to send data in email textbox
		emailaddress.sendKeys("surekhapofare01@gmail.com");
		
		//to click on create acoount button
		createanaccountbutton.click();
	}
}
