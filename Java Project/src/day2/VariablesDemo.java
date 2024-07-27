package day2;

public class VariablesDemo {

	public static void main(String[] args) 
	{
		/* variable  --> 1.variable is a container which will store or hold the data 
		 * 				 2.to represnt data we need variables
		 *               3.variables always varry
		 *               4.when you create a variable you need to specify data types 
		 * 
		 */
		// how to decalre and assign variable
		
		int a; //declaration
		a=100; //assignmenet
		//int a=100;//error duplicate local variable
		
		System.out.println(a);	//100	
		
		int b=200; //decalration + assignment
		System.out.println(b);//200
		
		b=300;
		System.out.println(b);//300
		
		//Approach 1 -->if the variables belongs to diff data types
		int c= 10;
		int d= 20;
		int e= 30;
		System.out.println(c+" "+d+" "+e); //10 20 30
		
		//Approach 2 --> if variables belongs to same data type
		int f,g,h;
		f=40;
		g=50;
		h=60;
		System.out.println(f+" "+g+" "+h); // 40 50 60 
		
		//Approach 3 --> if variables belongs to same data type
		int i=70, j=80, k= 90;
		System.out.println(i+" "+j+" "+k); //70 80 90

	}

}
