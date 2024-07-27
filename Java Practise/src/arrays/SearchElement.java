package arrays;

public class SearchElement {

	public static void main(String[] args) {

//search an element in array
		int a[]= {10,20,30,40,50,30};
		
		int search_element=30;
		boolean status=false;
		
		//element is found
/*		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
		}
		
		//element is not found
		if(status==false)
		{
			System.out.println("Element is not found");
		}   
		*/
		
		//by using enhance for loop
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element is not found ");
		}

	}

}
