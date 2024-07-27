package day5assignment;

public class ReverseNumber {

	public static void main(String[] args) {

    //reverse number 
		int num=1234;
		int rev=0;
		while(num!=0)//1234!=0 -->true,123!=0 -->true,12!=0 -->true,1!=0 -->true
		{
			rev=rev*10+num%10; //0+4=4,40+4=43,430+2=432,4320+1=4321
			num=num/10;//1234/10 -->123 ,123/10 -->12,12/10 -->1,0
		}
		System.out.println("Reverse number:"+" "+rev);//4321
	}

}
