package variables.java;

public class variables {

	//instance variable
	String s="welcome";
	
	//static variable 
	static char c='A';
	
	//instance method
	public void sum()
	{
		//local variable
		int i=200;
		//call local variable
		System.out.println(i);//200
		
		//call instance variable
		System.out.println(s);//welcome
		
		//call static variable 
		System.out.println(c);//A
	}
	
	//static method
	 public static void diff()
	{
		 //local variable
		byte b=125;
		
		//access local variable directly 
		System.out.println(b);//125
		 
		 //to access instance variable 
		//System.out.println(v.s);//we can not access instance variable directly in static method
		
		//create object
		variables v=new variables();
			
		//to access instance variable by using ref variable
		System.out.println(v.s);//
		
		//to access static variable directly
		System.out.println(c);//A
	
	}  
	
	public static void main(String[] args) {
		//create object of class
		variables v=new variables();
		//System.out.println(v.s);//to access instance variable by using reference variable
		
		//to access instance method by using reference variable
		 v.sum();
	
		//to access static method directly
		 diff();
		
		
	}
	
}
