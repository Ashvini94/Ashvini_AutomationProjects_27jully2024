package abstraction;

public class Class_B extends Class_A {

	@Override
	public void m1() {
		System.out.println("This is m1 method of Class_B");

	}

	@Override
	public void ab() {
		System.out.println("This is ab method of Class_B");

	}

	public static void main(String[] args) {
		
		//child class object
		Class_B cb=new Class_B();
		//cb.m1();//call overrided child class method
		//cb.ab();//call overrided child class method
		//cb.get();//call instance method of abstract class
		//get_data();//directly call static method of abstract class 
		
		
		//we can not create the object of abstract class
		//Class_A ca=new Class_A();//error
		
		//we can use abstract class ref variable to hold child class object
		Class_A ca=new Class_B();
		ca.ab();//it shows parent class method behaviour at compile time but call child class overrided method
		ca.m1();//it shows parent class method behaviour at compile time but call child class overrided method
		ca.get();//call instance method of abstract class
		get_data();////directly call static method of abstract class
		

	}

}
