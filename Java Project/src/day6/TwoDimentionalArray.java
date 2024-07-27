package day6;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		//multidimentional array -->here we have rows and column
		
		//Approach 1:
		//declaration 
		int a[][]=new int[3][2]; //here number of rows 3 and no of column 2
		//int[][]a=new int[3][2];
		//int[]a[]=new int[3][2];
		
		//how to add values in multidimentional array
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;   
		
		//approach 2:
		
	//	int a[][]= {{100,200},{300,400},{500,600}};
	/*	int a[][]= {{100,200},
				    {300,400},
				    {500,600}};      */
		
	//find length of array
		System.out.println("Length of row:"+a.length); //3
		System.out.println("length of column:"+a[0].length);//2

		
		//read single value from array
		
		//System.out.println(a[2][1]);//600
		
		
		//create empty array
		int x[][]= {{}};
		System.out.println("length of row:"+x.length);//1
		System.out.println("length of column:"+x[0].length);//0
		
		//read multiple value from array
		
		//by using normal for loop
		
	/*	for(int r=0;r<=2;r++)//0<2 -->true,1<2 -->true
		{
			for(int c=0;c<=1;c++)//0<1 -->true,1=1 -->true,2<0 -->false
			{
				System.out.print(a[r][c]+" ");//a[0][0]=100,a[0]a[1]=200,a[1][0]=300,...600
				
			}
			System.out.println();
		}
		
		*/
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.println(a[r][c]);
			}
		}  
		
		//for enhance for loop
		
	/*	for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		} */
		
		
	}

}
