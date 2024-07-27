package loop_statement;

public class InvertedHalfPyramid_Pattern {

	public static void main(String[] args) {

	/*	   *
		  **
		 ***
		****
		
		
		*/

		
		for(int i=1;i<=4;i++)//i=1,1<4-->true
		{
			for(int j=1;j<=4-i;j++)//j=1,1<3-->true,j=2,2<3-->true,j=3,3=3-->true
			{
				System.out.print(" ");//1st space print,2nd space print,3rd space print
			}
			for(int y=1;y<=i;y++)//y=1;1=1-->true
			{
				System.out.print("*");//1 * print
			}
			System.out.println();
		}

		

	}

}
