package operators;

public class Class_003 {

	public static void main(String[] args) {

		int x=200;
		int y=100;
		
		//Arithmatic operator
		System.out.println("Addition of x and y is: "+(x+y));
		System.out.println("Substaraction of x and y is: "+(x-y));
		System.out.println("Multiplication of x and y is: "+(x*y));
		System.out.println("Division of x and y is: "+(x/y));
		System.out.println("Modulus divison of x and y is: "+(x%y));
		
		//assignment operator
		
		int a=200;
		int b=a+100;
		System.out.println(b);//300
		
		//Comparison operator
		
		int i=100;
		int j=200;
		
		System.out.println(i<j);//true
		System.out.println(i<=100);//true
		System.out.println(j>i);//true
		System.out.println(j>=200);//true
		System.out.println(i==100);//true
		System.out.println(i!=100);//false
		
		//logical operator
		
		int m=100;
		int n=200;
		
		System.out.println(m<n && n>m);//true
		System.out.println(m>n && n>m);//false
		System.out.println(m<n || n<m);//true
		System.out.println(!(m<n && n>m));//false
		
		
	}

}
