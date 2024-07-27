package testng;

import org.testng.annotations.Test;

public class Class_008Group {
  @Test(groups = {"Regression testing"})
  public void a() {
	  
	  System.out.println("a method");
	  
  }
  
  @Test(groups = {"Regression testing"})
  public void b() {
	  System.out.println("b method");
	  
  }
  @Test(groups = {"Regression testing"})
  public void c() {
	  
	  System.out.println("c method");
  }
  @Test(groups = {"Regression testing"})
  public void d() {
	  
	  System.out.println("d method");
  }
  @Test(groups = {"Regression testing"})
  public void e() {
	  
	  System.out.println("e method");
  }
  @Test(groups = {"Smoke testing"})
  public void f() {
	  
	  System.out.println("f method"); 
  }
  @Test(groups = {"Smoke testing"})
  public void g() {
	  
	  System.out.println("g method");
  }
  @Test(groups = {"Smoke testing"})
  public void h() {
	  
	  System.out.println("h method");
  }
  @Test(groups = {"Smoke testing"})
  public void i() {
	  
	  System.out.println("i method");  
  }
  @Test(groups = {"Smoke testing"})
  public void j() {
	  
	  System.out.println("j method");  
  }
}
