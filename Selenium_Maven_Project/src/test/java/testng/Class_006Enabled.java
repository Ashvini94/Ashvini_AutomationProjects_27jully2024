package testng;

import org.testng.annotations.Test;

public class Class_006Enabled {
  @Test(enabled=false)//bydefault its value is true
  public void a() {
	  System.out.println("this is a method");
	  
  }
  @Test
  public void b() {
	  
	  System.out.println("this is b method");
  }
}
