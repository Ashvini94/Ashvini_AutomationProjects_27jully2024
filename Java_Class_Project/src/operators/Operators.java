package operators;

public class Operators {

	public static void main(String[] args) {


		int i=70;
		int j=30;
		
		//1. Arithmatic operator --> it is used to perform mathematical operation
		//addition
		System.out.println(i+j);//100
		
		//substraction
		System.out.println(i-j);//40
		
		//multiplication
		System.out.println(i*j);//2100
		
		//divison
		System.out.println(i/j);//it will give quotient 2
		
		//modulus
		System.out.println(i%j);//it will give quotient 10
		
		//increment
		System.out.println(i++);//70
		System.out.println(++i);
	
		//decrement
		System.out.println(j--);//29
		
		System.out.println(--j);//29
		System.out.println();
		
		
		//2. assignment operator --> it is used to assign value to the variable
		
		int x=100;
		int y=x+200;
		System.out.println(y);//300
		
		//3. comparison operator --> 1.it is used to compare two values of variables
		// 							 2.It will return true value i.e either true or false
		
		//equals to
		System.out.println(x==y);//false
		
		//not equals to
		System.out.println(x!=y);//true
		
		//less than
		System.out.println(x<y);//true
		
		//less than equals to
		System.out.println(x<=y);//true
		
		//greater than
		System.out.println(x>y);//false
		
		//greater than equals to
		System.out.println(x>=y);//false
		
		//4. logical operator --> 1.it is used to determine logic between two variables
		//						  2.It will return boolean value i.e true or false
		//						  3.It will perform between two boolean values
		//						  4.it is done with only boolean type of data type
		
		//1.logical and (&&) --> It returns true if both the conditions are true otherwise it returns false
		
		int a=20;
		int b=50;
		System.out.println(a>10&&b<100);//true
		System.out.println(a<10&&b<100);//false
		System.out.println(a>10&&b>100);//false
		
		//2.Logical or (||) --> it return true value if any one condition is true
		
		System.out.println(a>15||b<100);//true
		System.out.println(a>50||b<100);//true
		System.out.println(a>50||b>100);//false
		
		//3.Not (!) --> it will give you reverse result i.e if condition is true result will be false and if condition is false 
		//				result will be true
		
		System.out.println("The result is:"+!(a>15||b<100));//false
		

	}

}
