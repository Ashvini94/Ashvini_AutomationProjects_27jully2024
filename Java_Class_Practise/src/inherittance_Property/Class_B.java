package inherittance_Property;

public class Class_B extends Class_A{
	
	public void b()
	{
		System.out.println("This is method b of Class_B");
	}

	public static void main(String[] args) {
		
		Class_A aobj=new Class_B();
		
		System.out.println(aobj.l);//Class_A
		
		aobj.a();//Class_A
		
		print();//Class_A
		
		//aobj.b(); //error we can not call child class method with parent class ref variable
		
	}

}
