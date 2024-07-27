package day5assignment;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//palindrome number
		int num=121;
		int original_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;//121
			num=num/10;//12 1 0
		}
		if(original_num==rev)//121==121
		{
			System.out.println("Number is palindrome: "+original_num);
		}
		else
		{
			System.out.println("Number is not palindrome: "+original_num);
		}
	}
	
}
