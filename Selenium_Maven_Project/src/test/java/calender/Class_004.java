package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Class_004 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBrowser("Chrome");
		navigateUrl("https://www.goibibo.com/");

		// close login popup
		WebElement popup = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));

		if (popup.isDisplayed()) {
			popup.click();
		}

		// locate roundtrip button and click on it
		driver.findElement(By.xpath("//span[@class='sc-12foipm-70 bWWMhV']")).click();

		WebElement popup2 = driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"));

		if (popup2.isDisplayed()) {
			popup2.click();
		}

		// from city

		// locate from city dropdown
		WebElement from_city_dropdown = driver.findElement(By.xpath("//p[text()='Enter city or airport']"));

		Actions act = new Actions(driver);

		act.moveToElement(from_city_dropdown).click().sendKeys("Pune").build().perform();

		// to locate list of options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));

		// to choose one option
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().contains("Pune, India")) {
				options.get(i).click();
			}
		}

		
		Thread.sleep(2000);
		
		// locate to city dropdown
		WebElement to_city_dropdown = driver.findElement(By.xpath("(//div[@class='sc-12foipm-2 eTBlJr fswFld ']/p)[3]"));

		
		act.moveToElement(to_city_dropdown).sendKeys("Mumbai").build().perform();

		// to locate list of options
		List<WebElement> options1 = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));

		// to choose one option
		for (int i = 0; i < options1.size(); i++) {
			if (options1.get(i).getText().contains("Nagpur, India")) {
				options1.get(i).click();
			}
		}

		/*
		 * //click it from_city_dropdown.click();
		 * 
		 * 
		 * 
		 * //send input from_city_dropdown.sendKeys("Pune");
		 * 
		 */

	}

}
