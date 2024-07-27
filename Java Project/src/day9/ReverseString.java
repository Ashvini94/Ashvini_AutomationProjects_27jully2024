package day9;

public class ReverseString {

	public static void main(String[] args) {

//		String s="Automation";
		
//		String rev="";
		
/*		//reverse string
		
		//approach 1
		
		
		
		//use for loop
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is:"+rev);//noitamotuA    */
		
		
		//approach 2
		
	/*	//convert string into character array
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string is: "+rev);    */
		
		//approach 3
		
		//by using StringBuffer and StringBuilder 
		
		StringBuffer sb=new StringBuffer("welcome");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbild=new StringBuilder("Testing");
		System.out.println(sbild.reverse());
		
	}

}
