package testng;

import org.testng.annotations.Test;

public class Class_007_dependsonmethods {
  @Test
  public void a() {
	  
	  
  }
  @Test(dependsOnMethods = {"b"})
  public void c() {
	  
	  
  }
  @Test
  public void d() {
	  
	  
  }
  @Test
  public void e() {
	  
	  
  }
    
  
	  
  @Test
  public void f() {
	
  
}
  
  @Test(dependsOnMethods = {"a"})
  public void b() {
	
  
}
}
