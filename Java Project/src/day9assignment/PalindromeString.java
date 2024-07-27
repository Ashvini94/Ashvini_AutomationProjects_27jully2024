package day9assignment;

public class PalindromeString {

	public static void main(String[] args) {


		String s="MADAM";
		String original_str=s;
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(original_str.equals(rev))
		{
			System.out.println(original_str+" is palindrome");
		}
		else
		{
			System.out.println(original_str+"is not palindrome");
		}

	}

}
