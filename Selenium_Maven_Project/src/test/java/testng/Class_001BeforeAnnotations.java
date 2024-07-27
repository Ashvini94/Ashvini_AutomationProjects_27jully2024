package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_001BeforeAnnotations {
  @Test
  public void f() {
	  
	  System.out.println("Hii testng");
  }
  @Test
  public void g()
  {
	  System.out.println("Hii testng how are you?");
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Before suite");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Before class");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before method");
  }
  
}
