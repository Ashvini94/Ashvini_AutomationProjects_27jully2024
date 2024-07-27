package variables;

public class Class_001 {

	//instance variable
	int a=15;
	
	//static variable
	static int b=25;
	
	
	public static void main(String[] args) {

		//local variable 
		int c=500;
		
		//call directly to local variable
		System.out.println(c);//500
		
		//create object
		Class_001 cs=new Class_001();
		
		//call instance variable
		System.out.println(cs.a);//15
		
		//call static variable
		System.out.println(b);//25
		
		

	}

}
