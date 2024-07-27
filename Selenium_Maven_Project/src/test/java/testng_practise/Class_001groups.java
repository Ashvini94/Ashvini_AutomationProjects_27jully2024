package testng_practise;

import org.testng.annotations.Test;

import baseclass.BaseClass;

public class Class_001groups extends BaseClass{
  @Test(groups= {"Regression testing"})
  public void a() {
	  
	  System.out.println("this is a method");
  }
  
  @Test(groups= {"Regression testing"})
  public void b() {
	  
	  System.out.println("this is b method");
  }
  @Test(groups= {"Regression testing"})
  public void c() {
	  
	  System.out.println("this is c method");
  }
  @Test(groups= {"Smoke testing"})
  public void d() {
	  
	  System.out.println("this is d method");
  }
  @Test(groups= {"Smoke testing"})
  public void e() {
	  
	  System.out.println("this is e method");
  }
}
