package testng;

import org.testng.annotations.Test;

public class Class_003Priority {
  @Test(priority=2)
  public void a() {
	  System.out.println("this is a method");
  }
  @Test(priority=1)
  public void c() {
	  System.out.println("this is c method");
  }
  @Test(priority=3)
  public void b() {
	  System.out.println("this is b method");
  }
  @Test(priority=4)
  public void d() {
	  System.out.println("this is d method");
  }
  
  
  
}
