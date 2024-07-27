package palindromeNo;

public class Demo {

	public static void main(String[] args) {

		//palindrome number 121
		
		int num= 121;
		int original_no=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original_no==rev)
		{
			System.out.println("Number is palindrome: "+original_no);
		}
		else
		{
			System.out.println("Number is not palindrome: "+original_no);
		}


	}

}
