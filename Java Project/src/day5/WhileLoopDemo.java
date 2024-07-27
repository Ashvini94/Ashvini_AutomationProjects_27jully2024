package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

//   while loop --> syntax:
		/*  
		 * 		initialization;
		 * 		while(condition)
		 * 		{
		 * 			Statements;
		 * 			increment/decrement;
		 * 
		 * 		}
		 */
		
		// example 1 : print 1 to 10 number 
		
	/*	int i=1; //i=1
		while(i<=10) //1<10 -->true ...11<10 -->false it will come out from the loop execution will be stop
		{
			System.out.println(i); //1 ....10
			i++; //or i=i+1; //2
		}    */
		
		// example 2 : print hello message 10 times
		
	/*	int i= 1;  //i=1
		while(i<=10) //1<10 --> true ..11<10 -->false execution will be stop
		{
			System.out.println("Hello"); //hello
			i++; //2
		}     */
		
		//example 3 : print even number between 1 to 10 ---> 2,4,6,8,10
		 
		//Approach 1
		
/*		int i = 2;  //2
		while(i<=10) //2<10 -->true ..11<10 -->false execution will be stop
		{
			//System.out.println(i); //2
		    i+=2;  //i=i+2;  //2+2=4
		}
		
		//Approach 2 
		
		int num=1; //1
		while(num<=10) //1<10 -->true ,2<10 -->true ..11<10 -->false
		{
			if (num%2==0) //1%2 == 1 -->false, 2%2 == 0 -->true
			{
				System.out.println(num); //2 4 6 8 10 
			}
			num++; //2
				
		}   */
		
		// example 4 : print 1 to 10 number and specify odd and even
			
/*		int i=1; //1
		while(i<=10) //1<10 -->true
		{
			if(i%2==0)//1%2 == 1 -->false so else part is execute first, 2%2==0 -->true
			{
				System.out.println(i +" "+"Even"); //2 Even
			}
			else
			{
				System.out.println(i+" "+"Odd"); //1 odd
			}
			i++; //2
		}     */
		
		// example 5 : print no between 10 to 1 in descending order
		
		int i=10; //10
		while(i>=1) //10>1 --> true ...1=1 ,0>=1 -->false stop execution
		{
			System.out.println(i); //10..1
			i--; //9...1,0
		}
	}

}
