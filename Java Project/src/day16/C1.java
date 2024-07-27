package day16;

public class C1 extends C2 implements I1,I2{

	
	@Override
	public void m2() {
		System.out.println("THis is m2");
		
	}

	@Override
	public void m1() {
		System.out.println("This is m1");
		
	}
	
	public static void main(String[] args) {
		
		C1 cobj = new C1();
		
		cobj.m1();
		cobj.m2();
		cobj.m3();
		
	}

}
