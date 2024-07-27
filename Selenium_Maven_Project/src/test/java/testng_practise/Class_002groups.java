package testng_practise;

import org.testng.annotations.Test;

public class Class_002groups {
	@Test(groups = { "Regression testing" })
	public void a() {

		System.out.println("This is a method");
	}

	@Test(groups = { "Regression testing" })
	public void b() {

		System.out.println("This is b method");
	}

	@Test(groups = { "Regression testing" })
	public void c() {

		System.out.println("This is c method");
	}

	@Test(groups = { "Regression testing" })
	public void d() {

		System.out.println("This is d method");
	}

	@Test(groups = { "Regression testing" })
	public void e() {
		System.out.println("This is e method");

	}

	@Test(groups = { "Smoke testing" })
	public void f() {
		System.out.println("This is f method");

	}

	@Test(groups = { "Smoke testing" })
	public void g() {
		System.out.println("This is g method");

	}

	@Test(groups = { "Smoke testing" })
	public void h() {

		System.out.println("This is h method");
	}

	@Test(groups = { "Smoke testing" })
	public void i() {

		System.out.println("This is i method");
	}

	@Test(groups = { "Smoke testing" })
	public void j() {
		System.out.println("This is j method");

	}

}
