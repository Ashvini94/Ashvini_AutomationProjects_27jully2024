package pattern;

public class Invert_Pyramid {

	public static void main(String[] args) {

		/*   * * * *
		 *   * * *      >invert pyramid
		 *   * *
		 *   *
		 * 
		 * 
		 * 
		 */
		
			for(int i=4;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
	}

}
