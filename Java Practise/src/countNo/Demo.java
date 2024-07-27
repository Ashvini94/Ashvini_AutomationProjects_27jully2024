package countNo;

public class Demo {

	public static void main(String[] args) {

		//count no
		
		int num=423424;
		int count=0;
		while(num!=0)//true
		{
			num=num/10;//42342,4234,423,42,4,0
			count++;//1,2,3,4,5,6
		}
		System.out.println(count);

	}

}
