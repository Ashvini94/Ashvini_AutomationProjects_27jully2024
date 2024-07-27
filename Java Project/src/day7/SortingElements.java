package day7;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {


		//sorting elements in array means sort element in ascending order or in descending order
		
	//	int a[]= {100,600,200,400,500};
		
		//by using normal for loop
	
		//before sorting
/*		System.out.println("Before sorting the elements:");
			for(int i=0;i<a.length;i++)
			{
			
				System.out.println(a[i]);	//100 600 200 400 500
			}  
			
			//After sorting 
			Arrays.sort(a);//[100 200 400 500 600]
			
			System.out.println("After sorting the elements:");
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[j]);
			}
			
			*/
			
			
			
/*		//before sorting
		System.out.println("Before sorting the elements:");
		System.out.println(Arrays.toString(a));//it is used for printing the array elements[100,600,200,400,500]
		
		//after sorting the elements
		System.out.println("After sorting the elements:");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));//[100 200 400 500 600]   */
	
		//sorting string in array 
		String s[]= {"dog","cat","tiger","rabbit","women","man"};
		
		//before sorting the string 
		System.out.println("Before sorting the string:");
		System.out.println(Arrays.toString(s));
		
		//after sorting the string
		Arrays.sort(s);
		System.out.println("After sorting the string:");
		System.out.println(Arrays.toString(s));
	
	}

}
