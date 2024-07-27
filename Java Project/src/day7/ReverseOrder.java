package day7;

public class ReverseOrder {

	public static void main(String[] args) {
		
		//print arrays elements in reverse order
		int a[]= {100,200,300,400,500};
		
		//by using normal for loop
		for(int i=a.length-1;i>=0;i--)//4>0-->true,...0=0-->true
		{
			System.out.println(a[i]);//500 400 300 200 100
		}

	}

}
