package arrays;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {

		//sorting the elements in array
		
		int a[]= {100,10,40,30,80,50,200};
		
/*		//before sorting
		System.out.println("Before sorting the elements");

		System.out.println(Arrays.toString(a));//[100,10,40,30,80,50,200]
	
		//after sorting
		System.out.println("After sorting the elements");
		
		Arrays.sort(a);
		
		//print the element
		System.out.println(Arrays.toString(a));//[10,30,40,50,80,100,200]
		
		*/
		
		//sorting elements using for loop
		System.out.println("Before sorting the elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
		//sort the elements
		Arrays.sort(a);
		
		//to print the sorted elements
		
		System.out.println("After sorting the elements");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
	
	}

}
