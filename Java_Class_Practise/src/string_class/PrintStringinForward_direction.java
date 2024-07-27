package string_class;

public class PrintStringinForward_direction {

	public static void main(String[] args) {
		
		String s="We are in practise batch";
		
		//print string in forward direction
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+"  ");
		}

		System.out.println();
		//print string in reverse direction
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.print(s.charAt(j)+ "  ");
		}
	}

}
