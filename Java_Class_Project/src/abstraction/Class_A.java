package abstraction;

//abstraction -->Abstraction is a process of hiding the implementation(internal work)from user and only providing functionality

public abstract class Class_A {
	
	//abstract method
	public abstract void m1();
	
	public abstract void ab();
	
	//instance method
	public void get()
	{
		System.out.println("This is get method from Class_A ");
	}
	
	//static method
	public static void get_data()
	{
		System.out.println("This is get_data method from Class_A");
	}

}
