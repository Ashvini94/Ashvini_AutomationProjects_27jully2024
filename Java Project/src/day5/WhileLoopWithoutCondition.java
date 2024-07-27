package day5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		
		//while loop without condition
		
/*		int i=10;
		while(true)
		{
			System.out.println("Hello");
			i++;
		}
		
		*/
  
		//print hello message in 10 times
		
		int i=1;
		while(true) //true
		{
			System.out.println("Hello"); //hello
			i++;//2
			
			if(i==10)//2==10-->false...10==10 then loop will be terminate or break
			{
				break;
			}
		}
		
	}

}
