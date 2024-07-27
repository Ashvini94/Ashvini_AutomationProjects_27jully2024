package day6;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		//1.single dimentional array --> in this we have only rows i.e called single dimentional
		
		//declare single dimentional array -->approach 1
		
	/*	int i[]=new int[5]; //declaration
		
		//add values into array
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;     */
		
		//approach 2
		
	//	int i[]= {10,20,30,40,50};//declration and assignment
		
		//find length or size of an array
	//	System.out.println("length of array is:" +i.length);//5 -->here length is a keyword which is used to find length of array
		
		
		//read single value from an array
	//	System.out.println(i[3]); //40
		
		// empty array
	//	int a[]= {};
	//	System.out.println("length of empty array: "+a.length);//0
		
		//read multiple value from array-->
			//by using normal for loop
			//by using enhance for loop or for..each loop
		
		//by using normal for loop
		
		int a[]= {100,200,300,400,500};
		
/*		for(int i=0;i<=4;i++)//0,0<4-->true,..5<=4-->false stop execution
		{
			System.out.println(a[i]);//a[0]=100..a[4]=500
		}
	  */
		
/*		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		*/
		
/*		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}   
		*/
		
	 // by using enhance for loop
		
		for(int x:a)
		{
			System.out.println(x); //100 200 300 400 500
		}
		
	}	
		
}
