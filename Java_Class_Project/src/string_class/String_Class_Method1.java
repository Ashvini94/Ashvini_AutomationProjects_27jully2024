package string_class;

public class String_Class_Method1 {

	public static void main(String[] args) {
		
		String s="we are in practise batch";
		
		//to find length
		//System.out.println(s.length());//24
		
		//to print each character of string in forward direction
		
/*		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		System.out.println();
		//to print string in reverse direction
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.print(s.charAt(j)+" ");
		}
		
		*/
		
		//to break or split string
		String str="Print character";
		
		//1.split string by using space
		String []ab=str.split(" ");
		
		//to print string value
	//	System.out.println(ab[0]);//Print
	//	System.out.println(ab[1]);//character
		
		String st="To-print-character-of-string-in-reverse direction";
		String[] cd=st.split("-");
		
		//to print all values using for each loop
	/*	for(String strn:cd)
		{
			System.out.println(strn);
		}
		
		*/
		
		//or using normal for loop
	/*	for(int i=0;i<=6;i++)//here index count like as array index 
		{
			System.out.println(cd[i]);
		}
		
		*/
		
		//break string with character
		String sn="Character";
		
		String[] xy=sn.split("c");
		
		//to print all values 
		for(String pq:xy)
		{
			System.out.println(pq);
		}
		
		
		
		
	}

}
