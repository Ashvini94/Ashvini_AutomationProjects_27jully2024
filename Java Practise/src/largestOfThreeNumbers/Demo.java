package largestOfThreeNumbers;

public class Demo {

	public static void main(String[] args) {

		//find largest of three numbers 
		
		int a=10,b=5000,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number: "+b);
		}
		else
		{
			System.out.println("c is largest number: "+c);
		}
	

	}

}
