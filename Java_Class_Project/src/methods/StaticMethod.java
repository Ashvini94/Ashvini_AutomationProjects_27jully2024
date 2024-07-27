package methods;

public class StaticMethod {

	/* static method -->1.static method can be created by user according to the requirement
	 * 					2.For using static method we need to specify or use static keyword
	 * 					3.Static method can be written in outside of the main method
	 * 					4.There are 3ways of calling static method -->
	 *                    a.By creating a object by using reference variable we can call static method
	 *                    b.we can call static method directly without creating a object
	 *                    c.we can call static method directly by using class name 
	 *                    
	 *                    //syntax --> access modifier static keyword return type name of method()
	 *                    			   {
	 *                    
	 *                    					//block of code
	 *                   			   }
	 */

	//static method
	public static void sum()
	{
		int a=1000;
		int b=2000;
		
		System.out.println(a);//1000
		System.out.println(b);//2000
		//System.out.println("sum of a and b is:"+(a+b));//3000
		
	}
	
	public static void main(String[] args) {

		//create object for calling the method -->1 way
		
		//StaticMethod sm=new StaticMethod();
		//sm.sum();//call sum method
		
		//directly call the method -->2nd way
		//sum();
		
		//call the method by using classname
		StaticMethod.sum();
		
	}

}
