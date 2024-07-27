package String;

public class StringPalindromeOrNot {

	public static void main(String[] args) {

		//string is palindrome or not
		
		String s="MADAM";
		String original_string =s;
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(original_string.equals(rev))
		{
			System.out.println(original_string+" is palindrome");
		}
		else
		{
			System.out.println(original_string+" is not palindrome");
		}
		

	}

}
