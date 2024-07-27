package array;

public class Two_dimensional_array {

	public static void main(String[] args) {
		
		/* two dimensioanl array-->1.it is useful when we want to store the data in the form of rows and column
		 * 						   2.It is an arrays of array
		 * 
		 */
		
		//1.declration by alloacting memory
		//syntax--> datatype[] []arrayname = new datatype[row size][column size];

		// 10 20 30
		// 40 50 60
		// 70 80 90
		
		int number[][]=new int[3][3];
		
		//to insert element in array
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		number[1][0]=40;
		number[1][1]=50;
		number[1][2]=60;
		number[2][0]=70;
		number[2][1]=80;
		number[2][2]=90;
		
		//to print array element
		//System.out.println(number[1][2]);//60
		
		//to print all array elements using nested for loop
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
		//2.declration by without allocating memory
		
		/* syntax --> datatype[][]arrayname ={{row-0 col-0,row-0 col-1,row-0 col-2},{row-1 col-0,row-1 col-1,row-1 col-2},
		 * 										{row-2 col-0,row-2 col-1,row-2 col-2}}
		 * 
		 */
		
		// a b c
		// d e f
		// g h i
		
		//declarartion of array
		
		char[][] ch= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		//to print the array
		System.out.println(ch[2][2]);//i
		
		//to print all array element using nested for loop
		
	/*	for(int i=0;i<=2;i++)
		 {
			for(int j=0;j<=2;j++)
			{
				System.out.print(ch[i][j]+ " ");
			}
			System.out.println();
		} 
		*/
		
		//to print all array element using enhance for loop
		
		for(char cha1[]: ch)
		{
			for(char cha2: cha1)
			{
				System.out.print(cha2 +" ");
			}
			System.out.println();
		}
		
		
	}

}
