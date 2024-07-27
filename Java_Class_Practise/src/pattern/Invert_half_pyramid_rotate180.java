package pattern;

public class Invert_half_pyramid_rotate180 {

	public static void main(String[] args) {

		/*       *
		 *     * *
		 *   * * *
		 * * * * *
		 *    
		 */

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int x=1;x<=i;x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
