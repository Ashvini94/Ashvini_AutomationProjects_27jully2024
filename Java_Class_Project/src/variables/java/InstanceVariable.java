package variables.java;

public class InstanceVariable {

	/* Instance variable-->1.Instance variable can be created by user according to the requirement
	 * 					   2.Instance variable can be written in class and outside of the method 
	 * 					   3.when we are creating instance variable in a class the colour of that variable will be blue
	 * 					   4.Instance variable can be identified by symbol triangle
	 */
	
	
	//instance variable 
	int i=200;
	byte b=125;
	short s=32546;
	
	//instance method
	public void sum()
	{
	
	//here we also print instance variable 
		System.out.println(i);
		System.out.println(b);
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {


		InstanceVariable iv= new InstanceVariable();
		iv.sum();
		//System.out.println(iv.i);//200
		//System.out.println(iv.b);//125
		//System.out.println(iv.s);//32546
		

	}

}
