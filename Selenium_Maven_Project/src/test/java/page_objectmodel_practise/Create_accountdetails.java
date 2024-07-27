package page_objectmodel_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//normal java class
public class Create_accountdetails {

	// locate elements
	@FindBy(css = "input#id_gender2")
	WebElement radiobutton;
	@FindBy(css = "input#customer_firstname")
	WebElement firstname;
	@FindBy(css = "input#customer_lastname")
	WebElement lastname;
	@FindBy(css = "input#email")
	WebElement email;
	@FindBy(css = "input#passwd")
	WebElement password;
	@FindBy(css = "select#days")
	WebElement days;
	@FindBy(css = "select#months")
	WebElement months;
	@FindBy(css = "select#years")
	WebElement years;
	@FindBy(css = "button#submitAccount")
	WebElement registerbutton;

	// assign driver with the help of constructor
	public Create_accountdetails(WebDriver driver) {
		// initialize object repository
		PageFactory.initElements(driver, this);
	}

	// to peform operation
	public void user_accountdetails() {
		// click on radio button
		radiobutton.click();

		// send data in firstname
		firstname.sendKeys("Ankit");

		// send data in lastname
		lastname.sendKeys("Virkhede");

		// send data in password
		password.sendKeys("ankit@1234");

		// Use select class to select date,month and year
		Select selectday = new Select(days);//select day

		selectday.selectByValue("5");

		Select selectmonth = new Select(months);//select month

		selectmonth.selectByValue("5");

		Select selectyear = new Select(years);//select year

		selectyear.selectByValue("2024");
		
		//to click on register button
		registerbutton.click();
		

	}

}
