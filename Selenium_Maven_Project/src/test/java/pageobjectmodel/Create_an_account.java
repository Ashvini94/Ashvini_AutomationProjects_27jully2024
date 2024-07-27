package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_an_account {

	// locate elements
	@FindBy(css = "input#id_gender2")
	WebElement radiobutton;
	@FindBy(css = "input#customer_firstname")
	WebElement firstname;
	@FindBy(css = "input#customer_lastname")
	WebElement lastname;
	@FindBy(css = "input#passwd")
	WebElement password;
	@FindBy(css = "select#days")
	WebElement days;
	@FindBy(css = "select#months")
	WebElement month;
	@FindBy(css = "select#years")
	WebElement year;
	@FindBy(css = "button#submitAccount")
	WebElement rgisterbutton;

	// to assign driver with the help of constructor
	public Create_an_account(WebDriver driver) {
		// initialize driver
		PageFactory.initElements(driver, this);
	}

	// create method to perform operation
	public void user_accountdetails() {
		// click on radiobutton
		radiobutton.click();

		// send data in firstname textbox
		firstname.sendKeys("Ashvini");

		// send data in lastname textbox
		lastname.sendKeys("Pofare");

		// send password in password textbox
		password.sendKeys("ashvini@4444");

		// to select days
		Select selectday = new Select(days);

		// use select by value
		selectday.selectByValue("5");

		// to select month
		Select selectmonth = new Select(month);

		// use select by value
		selectmonth.selectByValue("2");

		// to select days
		Select selectyear = new Select(year);

		// use select by value
		selectyear.selectByValue("2022");
		
		//click on register button
		rgisterbutton.click();

	}

}
