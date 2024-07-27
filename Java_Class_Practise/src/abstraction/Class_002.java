package abstraction;

public class Class_002 extends Class_001{
	
	@Override
	public void m1() {
		
		System.out.println("This is m1 method of child class");
	}

	public static void main(String[] args) {
		
		Class_002 c2=new Class_002();
		c2.m1();
		c2.get();
		get_data();
		
		Class_001 c1=new Class_002();
		c1.m1();
		c1.get();
		get_data();

	}

	

}
