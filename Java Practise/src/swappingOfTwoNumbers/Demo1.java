package swappingOfTwoNumbers;

public class Demo1 {

	public static void main(String[] args) {

		//Approach 1 : swapping of two numbers by using third variable
		
		int a=10;
		int b=20;
		int c;
		
		
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		
		c=a;//10
		a=b;//20
		b=c;//10
		
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
		
		
		//Approach 2: by using arithmatic operation
		
		int x=50;
		int y=10;
		
		x=x+y;//60
		
		y=x-y;//60-10=50
		x=x-y;//60-50=10
		
		System.out.println("After swapping");
		System.out.println(y);
		System.out.println(x);

		
	}

}
