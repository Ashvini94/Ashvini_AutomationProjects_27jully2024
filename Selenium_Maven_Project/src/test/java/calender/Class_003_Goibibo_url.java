package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Class_003_Goibibo_url extends BaseClass{
	
	

	public static void main(String[] args) throws Exception {
		
		launchBrowser("Chrome");
		navigateUrl("https://www.goibibo.com/");
		
		//close login popup
		 WebElement popup=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		 
		 if(popup.isDisplayed())
		 {
			 popup.click();
		 }
		 
		 //locate roundtrip button and click on it
		 driver.findElement(By.xpath("//span[@class='sc-12foipm-70 bWWMhV']")).click();
		 
		 //locate departure dropdown and click on it
		 driver.findElement(By.xpath("//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']")).click();
		
		 
		 while(true)
		 {
			//to locate month year
			 String month_year=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div")).getText();
			 
			 
			 //compare month year with desired month and year
			 if(!(month_year.equalsIgnoreCase("August 2024")))
			 {
				 //locate next button and click on it
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			 }
			 else
			 {
				 break;
			 }
		 }
		 
		 //locate particular date and click on it
		 driver.findElement(By.xpath("//p[text()='15']")).click();
		

		 //locate return dropdown and click on it
		// driver.findElement(By.xpath("//p[text()='Click to add a return flight for better discounts']")).click();
		 
		 
		 
		 
		
		

		 
		 
		 

		
	}

}
