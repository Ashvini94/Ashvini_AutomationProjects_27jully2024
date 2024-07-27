package reverseNo;

public class Demo {

	public static void main(String[] args) {
	
		//reverse a number 1234
		
		int num=1234;
		int rev=0;
		
		while(num!=0)//true
		{
			rev=rev*10+num%10;//0+4=4,40+3=43,430+2=432,4320+1=4321
			num=num/10;//123,12,1,0
		}
		System.out.println("reverse number: "+rev);
	}

}
