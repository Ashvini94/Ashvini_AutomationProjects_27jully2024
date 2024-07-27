package testng;

import org.testng.annotations.Test;

public class Class_004Invocation_count {
  @Test(invocationCount = 3)
  public void f() {
	  System.out.println("This is f method");
	  
  }
}
