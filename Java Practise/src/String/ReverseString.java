package String;

public class ReverseString {

	public static void main(String[] args) {

		//reverse a string
		
		String s="Annotation";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		System.out.println("Reverse a string is: "+rev);
	}

}
