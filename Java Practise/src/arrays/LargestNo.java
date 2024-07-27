package arrays;

public class LargestNo {

	public static void main(String[] args) {

		//find largest number in array
/*		int a[]= {10,30,50,20,100};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
     System.out.println("Largest number is: "+max);   


*/
		
		//find smallest number in array
		
		int a[]= {30,10,50,20,100};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}

		System.out.println("Smallest number is: "+min);
	}
	
	
	
	

}
