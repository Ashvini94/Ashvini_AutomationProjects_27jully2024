package day7;

public class FindNoOfRepetations {

	//find how many times no is repeated in array
	public static void main(String[] args) {

		int a[]= {10,20,10,10,10};
		int num=10;
		int count=0;
		
		//by using normal for loop
/*		for(int i=0;i<a.length;i++)//0<5-->true,1<5-->true,2<5-->true
		{
			if(a[i]==num)//10==10-->true,20==10-->false,10==10-->true
			{
				count++;//1,2...3..4
			}
		}
		System.out.println(count);//4
		
		*/
		
		
		//by using enhance for loop
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		System.out.println(count);//4

	}

}
