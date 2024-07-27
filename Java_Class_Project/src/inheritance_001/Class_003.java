package inheritance_001;

public class Class_003 extends Class_002{
	
	public void get_data()
	{
		System.out.println("this is get_data method of child class class_003");
	}

	public static void main(String[] args) {
		
		Class_003 c3=new Class_003();
		c3.m1();
		c3.get();
		c3.get_data();
		
	}
}
