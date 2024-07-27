package variables.java;

public class StaticVariable {

	/* static variable -->1.static variable can be created by user according to the requirement
	 * 					 2.whenever we are declare static variable we need to specify static keyword
	 * 					 3.static variable lie inside the class and outside the method i.e either main method,instance method or static method
	 * 					 4.there are 3 ways to access static variable--->
	 * 						a.by using reference variable we can access static variable
	 * 						b.by using classname we can access static variable
	 * 						c.we can directly call static method
	 */
	
	//static variable
	static int i=20;
	static byte b=30;
	static short s=2345;
	public static void main(String[] args) {

	//create object of class
	StaticVariable sv=new StaticVariable();
	
	//call static variable by using reference variable
	System.out.println(sv.i);//20
	
	//call static variable directly
	System.out.println(b);//30
	
	//call static variable by using classname
	System.out.println(StaticVariable.s);//2345
      

	}

}
