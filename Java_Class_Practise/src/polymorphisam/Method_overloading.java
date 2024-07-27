package polymorphisam;

public class Method_overloading {

	// method overloading
	public void m1() {
		System.out.println("This is m1 method with no parameter");
	}

	public void m1(int a) {
		System.out.println("This is m1 method with one parameter");
	}

	public void m1(int a, float f) {
		System.out.println("This is m1 method with two parameter");
	}

	public void m1(float f, int a) {
		System.out.println("This is m1 method with two float and int parameter");
	}

	public void m1(int a, float f, double d) {
		System.out.println("This is m1 method with three parameter");
	}

	public static void main(String[] args) {
		Method_overloading mo=new Method_overloading();
		
		mo.m1();
		mo.m1(100);
		mo.m1(20, 100.290f);
		mo.m1(300.450f, 40);
		mo.m1(3000, 50.45f, 5000.560);

	}

}
