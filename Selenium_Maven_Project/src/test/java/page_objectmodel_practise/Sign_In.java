package page_objectmodel_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//normal java class
public class Sign_In {

	//locate elements
	@FindBy(xpath="//a[@title='Log in to your customer account']")WebElement signinbutton;
	@FindBy(css="input#email_create")WebElement emailtextbox;
	@FindBy(css="button#SubmitCreate")WebElement createanaccount;
	
	//initialize driver
	public Sign_In(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//to perform operation
	public void User_signin()
	{
		signinbutton.click();
		emailtextbox.sendKeys("surekhapofare28@gmail.com");
		createanaccount.click();
	}
	
}
