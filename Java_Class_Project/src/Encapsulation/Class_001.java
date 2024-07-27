package Encapsulation;

public class Class_001 {
	
	private int i=200;//declare variable as private
	
	private void m1(int a)
	{
		i=a;
		System.out.println(i);
	}

	public static void main(String[] args) {
		Class_001 c1=new Class_001();
		
		c1.m1(1000);

	}

}
