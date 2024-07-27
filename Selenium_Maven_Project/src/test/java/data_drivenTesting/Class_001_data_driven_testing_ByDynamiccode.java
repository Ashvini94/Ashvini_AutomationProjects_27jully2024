package data_drivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import baseclass.BaseClass_datadriven_Testing;

public class Class_001_data_driven_testing_ByDynamiccode extends BaseClass_datadriven_Testing{
	
	public static void main(String[] args) throws Exception{
		
		//fetch data to web application
		  
		  //launch browser
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  //navigate url
		  driver.get("https://www.facebook.com/");
		  
		  //locate element email and send data in it 
		  driver.findElement(By.id("email")).sendKeys(get_data_from_excel_by_column_number("C:\\Users\\vaibh\\OneDrive\\Desktop\\Automation_excelfile_for data_drivenTesting.xlsx","Login_01",1,1));
		  
		//locate element email and send data in it 
		  driver.findElement(By.id("pass")).sendKeys(get_data_from_excel_by_column_number("C:\\Users\\vaibh\\OneDrive\\Desktop\\Automation_excelfile_for data_drivenTesting.xlsx","Login_01",1,2));
		  
	}

	
	}


