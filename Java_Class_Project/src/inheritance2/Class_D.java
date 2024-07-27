package inheritance2;

//single inheritance
public class Class_D extends Class_C{
	
	public static void main(String[] args) {
		
		Class_D dobj=new Class_D();//create child class object
		
		dobj.c();//call parent class c method
		
		print();//call static method directly of parent class
		
		
		
	}

}
