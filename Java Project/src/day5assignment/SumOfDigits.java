package day5assignment;

public class SumOfDigits {

	public static void main(String[] args) {

		//sum of digits input 1234 output 10
		
		int num=1234;
		int sum=0;
		
		while(num!=0)//1234!=0 -->true,123!=0 -->true
		{
			sum=sum+num%10;//0+4=4,4+3=7,7+2=9,9+1=10
			num=num/10;//123,12,1,0
		}
		System.out.println("Sum of digits: "+sum);
	}

}
