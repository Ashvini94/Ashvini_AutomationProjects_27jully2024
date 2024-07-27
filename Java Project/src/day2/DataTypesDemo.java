package day2;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		/* Data types -->1.data types represts the data 
		 *               2.data type represents what type of data you have to store into the variables 
		 * a. primitive data types
		 * 1.Numeric data types --> byte ,short, int, long 
		 * 2.decimal numbers --> float, double
		 * 3.single cahracter --> char
		 * 4.True or false --> boolean
		 * 
		 * b.Non- primitive data types
		 * 1.ArrayList
		 * 2.Hashmap
		 * 3.HashSet
		 * 5.String --> collection of character
		 */
		
		//a.Primitive data types --> 1.Numeric data types
		 int a=10,b=20,c=30;
		 System.out.println(a+" "+b+" "+c); // 10 20 30
		 
		 byte x=125;
		 System.out.println(x); //125
		 
		 short y= 32765;
		 System.out.println(y); //32765
		 
		 long z= 23444567674545l; // here l is a literal we can use L or l 
		 System.out.println(z); //23444567674545l
		 
		 //2.Decimal number
		 float f=345.2345678f; // here f is a literal we can use F or f
		 System.out.println(f); //345.34567896
		 
		 double d= 34.345678934567894;
		 System.out.println(d); //34.345678934567894
		 
		 //3.character
		 char ch= 'A';
		 System.out.println(ch); //A
		 
		// char cha="A"; // invalid
		// char cha='ABC'; //inavlid
		 
		 //4.Boolean
		 
		boolean bl=true;
		System.out.println(bl); //true
		
		//boolean blo='true'; //invalid
		//boolean blo="true"; //inavlid
		
		//b.Non- primitive data types --> 1.String
		
		String sr="JOHN";
		System.out.println(sr); // JOHN
		
		//String st= 'JOHN'; // invalid
		String st="A"; //valid
		
		final int s= 1000; // final is keyword and we can not changed the value of a it is fixed now or constant 
		//s=500; //invalid
		System.out.println(s); //1000
		
		// in Variable you keep changing the value of variable but in constant you are not able to change the value of varibale 
		
		
		//java is statically typed programming language
		
		// eg:
		 int in=250;
		//in ="Ashvini"; //invalid --> means once you create a variable with one data type you can not store that variable with another data type hence java is called statically typed programming language 
		
		
		
		
		
		
		
		
		 
		 
	}

}
