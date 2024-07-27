package Jump_Statement;

public class Break_Statement {

	public static void main(String[] args) {


		/* syntax -->  for(initialize variable;condition;inc/dec)
		 * 				
		 * 			  {
		 * 				//block of code;
		 * 				
		 * 				if(condition)//this condition is responsible for break the loop.if this con is true then loop will be break
		 * 					{
		 * 						break;
		 * 					}
		 * 
		 * 			  }
		 * 
		 */
		
			for(int i=1;i<=10;i++)//i=1;1<10-->true...5<10-->true
			{
				System.out.println(i);//1,....5
				if(i==5)//1==5-->false,...5==5-->true
				{
					break;//above cond(5==5) is true so loop will be break here
				}
			}

	}

}
