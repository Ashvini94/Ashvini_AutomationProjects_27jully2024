package defaultvalues_Ofdatatypes;

public class Class_001 {

	byte b;
	short sh;
	int a;
	long l;
	float f;
	double d;
	char ch;
	boolean bl;

	public void verify_default() {
		System.out.println(b);
		System.out.println(sh);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bl);
	}

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.verify_default();

	}

}
