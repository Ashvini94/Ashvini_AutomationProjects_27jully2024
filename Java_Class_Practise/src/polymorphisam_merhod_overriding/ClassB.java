package polymorphisam_merhod_overriding;

public class ClassB extends ClassA{
	
	public void get()
	{
		System.out.println("This is get method of classB");
	}
	
	public static void main(String[] args) {
		
		//create object of child class
		
		ClassB b=new ClassB();
		//b.get();
		
		ClassA a=new ClassB();
		a.get();
		
		//to call parent class method
		ClassA a1=new ClassA();
		a1.get();

	}

}
