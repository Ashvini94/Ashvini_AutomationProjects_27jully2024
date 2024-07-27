package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		//declration approach 1
		
		int a[][]=new int[3][2];
		
		//add elements in array
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;

		//declrartion approach 2
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		//find length of an array
		//for row
		//System.out.println(a.length);
		//for column
		//System.out.println(a[2].length);
		
		//read single value from array
		//System.out.println(a[1][0]);//300
		
		//read multiple value from array using normal for loop
		
	/*	for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
		}  */
		
		
		//using for each loop
/*		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
	}  */
	
		//object type of array
		
		Object obj[]= {100,25.45f,'a',"Welcome"};
		
		//by using normal for loop
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		
		//by using for each loop
		for(Object x:obj)
		{
			System.out.println(x);
		}
	

}
}
