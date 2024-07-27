package day7;

public class SearchElement {

	public static void main(String[] args) {

		//search element in array like 30 search in array
/*		int a[]= {10,20,30,40,50,30};
		int search_element=30;//30 you have to search
		
		//for getting all array elements
		for(int i=0;i<a.length;i++)//i=0,0<5 -->true
		{
			if(a[i]==search_element)//a[0]==30 -->false...a[2]==30-->true
			{
				System.out.println("Element is found:"+a[i]);//30
				break;
			}
		}    */
		
		
		//for not found element
		int a[]= {10,20,30,40,50};
		int search_element=300;
		boolean status=false;//status=true -->found,status=false -->not found
	/*	for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element is found");
				status=true;//true
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element is not found");//element is not found
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
			System.out.println("Element is not found");
		}
	}

}
