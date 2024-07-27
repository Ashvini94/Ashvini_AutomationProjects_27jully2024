package Selenium_PractiseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Class_004Keyboard_Actions_Practise extends BaseClass {

	public static void main(String[] args) {

		launch_browser("Chrome");
		navigate_url("https://www.facebook.com/");

		// use action class
		Actions act = new Actions(driver);

		// page down
		// act.sendKeys(Keys.PAGE_DOWN).build().perform();

		// page up
		// act.sendKeys(Keys.PAGE_UP).build().perform();

		// locate email textbox
		WebElement email_textbox = driver.findElement(By.cssSelector("input#email"));

		/*
		 * // send data in email textbox
		 * act.sendKeys("ashvinipofare").build().perform();
		 * 
		 * // press enter act.keyDown(Keys.ENTER).build().perform();
		 * 
		 * // locate password textbox WebElement password_textbox =
		 * driver.findElement(By.cssSelector("input#pass"));
		 * 
		 * // send data in password textbox
		 * act.sendKeys("ashvini@1994").build().perform();
		 * 
		 * // use tab // act.keyDown(email_textbox, Keys.TAB).build().perform();
		 * 
		 * 
		 */

		/*
		 * //send data in uppercase in email textbox
		 * act.keyDown(Keys.SHIFT).sendKeys("ashvini").build().perform();
		 * 
		 * //use tab act.keyDown(Keys.ENTER).build().perform();
		 * 
		 */

		// send data in email textbox
		act.sendKeys(email_textbox, "ashvinipofare").build().perform();

		// control a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// control c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		// press tab
		act.keyDown(Keys.TAB).build().perform();

		// locate password textbox WebElement password_textbox =
		WebElement password = driver.findElement(By.cssSelector("input#pass"));

		// move to element
		act.moveToElement(password).build().perform();

		// control v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
