package day7;

public class MissingNumber {

	public static void main(String[] args) {

		int a[]= {1,3,4,5,6};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++)//0<5-->true..5<5-->false
		{
			sum1=sum1+a[i];//0+1=1,1+3=4,4+4=8,8+5=13,13+6=19
		}
		System.out.println(sum1);//19
		
		for(int i=1;i<=6;i++)//1,1<6-->true,2<6-->true,3<6,4<6,5<6,6=6
		{
			sum2=sum2+i;//0+1=1,1+2=3,3+3=6,6+4=10,10+5=15,15+6=21
		}

		System.out.println(sum2);
		System.out.println("Missing number is:"+(sum2-sum1));//2
	}

}
