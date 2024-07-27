package whileloop;

public class PrintOnetoTenNumber {

	public static void main(String[] args) {

		//print 1 to 10 number
		
	/*	int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}   
		
		*/
		
		//print even number between 1 to 10 
		
	//Approach 1 
		
	/*	int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
    
    */
		//Approach 2
/*		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
				
				
				*/
		
		//print 1 to 10 number with specify odd even
		
/*		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i+" Even");
			}
			else
			{
				System.out.println(i+" Odd");
			}
		i++;	
		}
		
		*/
		
		//print 10to 1 number in descending order
		
		int  i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
	}

}
