package inheritance1;

//IS-A relationship
public class Class_B extends Class_A {
	
	double d=60.45;
	
	public void m2()
	{
		System.out.println("This is m2 method");
	}

	public static void main(String[] args) {
		
		/* property 1-->All the variables and methods are available to child class so,
		 * 			   with the help of reference variable of child class we can call parent class
		 * 			   methods and variables as well as child class methods and variables.
		 */
		
		//create object of child class 
		Class_B b=new Class_B();
		
		System.out.println(b.i);//call parent class varaible of Class_A
		b.m1();//call parent class method of Class_A

		System.out.println(b.d);//call child class variable i.e d variable
		b.m2();//call child class method i.e m2()
	}

}
