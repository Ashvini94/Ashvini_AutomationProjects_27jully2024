package variables.java;

public class Variable_001 {

	//instance variable 
	int i=100;
	
	//static variable
	
	static short s=23456;
	
	public static void main(String[] args) {
		
		//create object
		Variable_001 v=new Variable_001();
		System.out.println(v.i);//100
		
		//directly call static variable
		System.out.println(s);//23456
		
		
		//call static variable by using classname
		System.out.println(Variable_001.s);
		
		//call static variable by using ref variable
		System.out.println(v.s);
		
		//loacl variable
		boolean b=true;
		System.out.println(b);//true

		
	}

}
