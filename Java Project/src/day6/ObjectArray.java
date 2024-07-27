package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
	Object	a[]= {100,100.45,'a',"hello",true};

	//for read multiple data by using for each loop
	
/*	for(Object x:a)
	{
		System.out.println(x);//100,100.45,'a',"hello",true
	}
	
	*/
	
	//by using normal for loop
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	
	}

}
