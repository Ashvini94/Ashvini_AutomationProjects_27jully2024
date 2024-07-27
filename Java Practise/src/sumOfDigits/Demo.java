package sumOfDigits;

public class Demo {

	public static void main(String[] args) {

		//sum of digits in number
		
		int num=1234;
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
