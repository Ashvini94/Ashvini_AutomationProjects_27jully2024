package arrays;

public class FindNoOfRepetations {

	public static void main(String[] args) {

		//find no of repeations in array
		int a[]= {20,10,30,10,40,10,10,50};
		int num=10;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
