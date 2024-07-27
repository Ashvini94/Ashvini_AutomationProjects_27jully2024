package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_007Dependsonmethod {
  @Test(dependsOnMethods = {"print"})
  public void verify() {
	  
	  System.out.println("this is verify method");
  }
  @Test
  public void print()
  {
	  System.out.println("this is print method");
  }
  
  @Test(dependsOnMethods = {"function_verify"})
  public void function()
  {
	  System.out.println("this is function method");
  }
  
  @Test
  public void function_verify()
  {
	  System.out.println("this is function verify method");
  }
  
 /* @BeforeMethod
  public void c()
  {
	  System.out.println("this is before method");
  }
  @AfterMethod
  public void d()
  {
	  System.out.println("this is after method");
  }
  */
}
