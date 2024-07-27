package string1;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="welcome";
	    
		String org_string=s;
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(org_string.equals(rev))
		{
			System.out.println(org_string+" is a palindrome");
		}
		else
		{
			System.out.println(org_string+" is not palindrome");
		}
	}

}
