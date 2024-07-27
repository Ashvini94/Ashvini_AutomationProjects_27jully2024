package string1;

public class Reverse_String {

	public static void main(String[] args) {


		String s="Selenium";
		
		String rev="";
		
		
		//approach 1
/*		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is : "+rev);
		
		*/
		
		//approach 2
		//convert string array into character array
		
	/*	char a[]=s.toCharArray();
		
		for(int j=s.length()-1;j>=0;j--)
		{
			rev=rev+a[j];
		}
		System.out.println("Reverse string is: "+rev);
		
		*/
		
		//using string buffer and string builder
		
/*		StringBuffer sb=new StringBuffer("selenium");
		sb.reverse();
		System.out.println(sb);
		
		*/
		
		StringBuilder sbuild=new StringBuilder("selenium");
		
		sbuild.reverse();
		System.out.println(sbuild);

	}

}
