package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_002Afterannotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite method");
	
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before class method");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
  @Test
  public void text1() {
	  
	  System.out.println("This is test1 method");
  }
  @Test
  public void text2()
  {
	  System.out.println("This is test2 method");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("after method");
	  
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("after class");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("after test");
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("after suite");
  }
  
}
