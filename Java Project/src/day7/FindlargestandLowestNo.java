package day7;

public class FindlargestandLowestNo {

	public static void main(String[] args) {


		//find largest number in array
/*		int a[]= {10,5,20,50,400};
		int max=a[0];//here we take max no a[0]
		
		//so we start here for loopfrom 1 to max.length
		for(int i=1;i<a.length;i++)//1<5-->true
		{
			if(a[i]>max)//5>10-->false,20>10-->true,50>20-->true,400>50
			{
				max=a[i];//10//20//50//400
				
			}
		}
	System.out.println("Maximum number: "+max);//400
	
	*/
		
		//find lowest no in array
		int a[]= {10,5,20,50,400};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number: "+min);//5

	}

}
