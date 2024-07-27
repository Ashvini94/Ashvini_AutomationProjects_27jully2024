package testng;

import org.testng.annotations.Test;

public class Class_005Description {
  @Test(description = "Verify user login",priority=1,invocationCount = 2)
  public void verify_login() {
	  
	  System.out.println("Verify login method");
  }
  
}
