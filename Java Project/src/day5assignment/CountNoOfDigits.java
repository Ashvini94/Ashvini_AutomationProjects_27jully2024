package day5assignment;

public class CountNoOfDigits {

	public static void main(String[] args) {


		//count number of digits in a number 423424 -->o/p: 6
		
		int num=423424;
		int count=0;
		while(num!=0)//423424
		{
			num=num/10;//423424/10-->42342,4234,423,42,4,0
			count++;//1,2,3,4,5,6
		}
		System.out.println(count);
	}

}
