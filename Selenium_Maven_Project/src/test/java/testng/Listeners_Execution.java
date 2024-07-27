package testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_001.class)
public class Listeners_Execution {
  @Test
  public void f() {
	  
	  System.out.println("this is f method");
  }
  
  @Test
  public void g()
  {
	  System.out.println("this is g method");
  }
}

