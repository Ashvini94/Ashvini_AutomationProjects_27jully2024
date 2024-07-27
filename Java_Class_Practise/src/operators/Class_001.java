package operators;

public class Class_001 {

	public static void main(String[] args) {

		//Arithmatic operators
		
		int a=100;
		int b=50;
		System.out.println("Addition of a and b is: "+(a+b));
		System.out.println("Substraction of a and b is: "+(a-b));
		System.out.println("miultiplication of a and b is: "+(a*b));
		System.out.println("division of a and b is: "+(a/b));
		System.out.println("Modulo divison of a and b is: "+(a%b));
		
		//Assignment opearators
		int c=100;
		
		System.out.println(c);
		
		//comparison operator
		
		int i=10;
		int j=20;
		
		System.out.println(i<20);//true
		System.out.println(j>i);//true
		System.out.println(i<=10);//true
		System.out.println(j>=20);//true
		System.out.println(j==20);//true
		System.out.println(j!=20);//false
		
		//logical operator
		
		int x=100;
		int y=200;
		
		System.out.println(x<y && y>x);//true
		System.out.println(x>y ||y>x);//true
		System.out.println(!(x>y ||y>x));//false
		
	}

}
