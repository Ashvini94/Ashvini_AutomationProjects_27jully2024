package methods;

public class InstanceMethod {
	
	public static void main(String[] args) {
		
		//create object
		InstanceMethod im=new InstanceMethod(); //it is used to call instance method by using refernece variable im
		im.sum();//call method
		
		im.diff();//call method
		
		
	}

		/* method -->1.method is a block of code or collection of statements or set of code grouped together to perform certain task or operation
					 2.Method is used to verify some functionality  
					 3.method has two types */
	
	/*  main method -->1.main method is a starting point of execution 
	 * 				   2.without main method we can not execute the program
	 *                 3.to execute any class we have to specify main method and it must
	 */
		/* instance method -->instance method can be created by user according to his requirement
		 * 
		 * 				Syntax: access modifier return type name of method () //here acess modifier is bydefault public,return type is void
		 * 				{
		 * 					//block of code
		 * 
		 * 				}
		 * 
		 */
	
				//instance method
				public void sum()
				{
					byte b=125;
				//	System.out.println(b); //125
				}
				public void diff()
				{
					short s=3456;
					System.out.println(s);
				}

}
