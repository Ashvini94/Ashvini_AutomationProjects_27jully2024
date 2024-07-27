package inheritance2;

//IS-A relationship
public class Class_B extends Class_A{

	//instance method
	public void b()
	{
		System.out.println("This is child class method b");
	}
	
	public static void main(String[] args) {
		
		/* property 3 -->1.we can use parent class reference variable to hold child class object
						 2.It is possible only in IS-A relationship.
						 
						 */
		
		Class_A aobj=new Class_B();//parent class ref variable to hold child class object
	
		System.out.println(aobj.i);//call parent class variable i.e i
		
		aobj.a();//call parent class method i.e a()
		
		//aobj.b();//error -->we can not call child class method with parent class ref varaible
		
		/* property 4 -->we can not use child class reference variable to hold parent class object
		 * 
		 */
		
		//Class_B bobj = new Class_A(); //error
		
	
	}

}
