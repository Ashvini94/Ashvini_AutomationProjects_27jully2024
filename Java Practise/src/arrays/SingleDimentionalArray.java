package arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) {

		//declaration  approach 1
		int a[]=new int[4];
		
		//add values in array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
		//declaration approach 2
		
		int b[]= {100,200,300,400};
		
		//find size of an array
		System.out.println(a.length);
		
		//read single value from an array
		System.out.println(a[2]);
		
		//read multiple value from an array
		
		//normal for loop
		
	/*	for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		*/
		
		//enhance for loop or for each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		//create empty array
		int x[]= {};
		System.out.println(x.length);

		
	}

}
