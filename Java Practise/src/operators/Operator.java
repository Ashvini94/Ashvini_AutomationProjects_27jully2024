package operators;

public class Operator {

	public static void main(String[] args) {
		
		//assignment opeartor
		int x=10;
		int y=20;
		
		int result=x+y;
		System.out.println(result);
		
		System.out.println(x+y);
		
		//increment decrement operator
		
		//case 1
		int a=10;
		a++;//11 or a=a+1;
		//System.out.println(a);//11
		
		//case 2
		int b=10;
		int res=b++;//here first assign the value to res then increment
		//System.out.println(res);
		
		//case 3
		int c=10;
		int res1=++c;
		System.out.println(res1);
		System.out.println(c);
		
		

	}

}
