package inheritance1;

public class Class_D {
	
	//instance method
	public void get_data()
	{
		System.out.println("This is get_data method");
	}
	
	public static void main(String[] args) {
		
		/* property 2 -->To access parent class variables and methods we can create parent class object in child class
		 * 
		 */
		
		//HAS-A relationship
		
		//create parent class object -->HAS-A relationship
		Class_C c=new Class_C();
		
		//get();//error -->here we can not call static method directly bec it is present in another class
		
		c.get();//call static method with the help of ref variable of patrent class
	
		//Class_C.get();//here static method call by using classname
		
		c.print();//call instance method which is presnet in class_c
	
		//c.get_data(); //error -->bec we can not call child class method by using parent class refernce variable
	}

}
