package polymorphisam;

public class Method_Overloading_001 {

	public void b() {
		System.out.println("This is b() method");
	}

	public void b(int x) {
		System.out.println("This is b method with one parameter");
	}

	public void b(float f) {
		System.out.println("This is b method with float parameter");
	}

	public void b(String s) {
		System.out.println("This is b method with string parameter");
	}

	public static void main(String[] args) {

		Method_Overloading_001 mo = new Method_Overloading_001();

		mo.b();// call b method without prameter
		mo.b(100);// call b method with int parameter
		mo.b(10.25f);// call b method with float parameter
		mo.b("Ankit");// call b method with string parameter
	}

}
