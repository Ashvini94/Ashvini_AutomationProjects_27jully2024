package day5;

public class JumpingStatement {

	public static void main(String[] args) {

		//There are two types of jumping statement 1.break 2.continue
		//1.break -->1. use in switch case or conditional statement
		//			 2.After break you cannot write another statement 
		//2.continue --> use in looping statement
		
		
		//use of break 
		for (int i=1;i<=10;i++)//1,1<10 -->true
		{
			//System.out.println(i);//1 2 3 4 5
			
			if(i==5) //1==5 -->false ,5==5 -->true
			{
				break; //break means control will come out from the loop means stop execution
				//System.out.println(i); //syntax error unreachable code bec after break you cannot write another or any statement
			}
			//System.out.println(i);// 1 2 3 4
		}    
		
		// use of continue
		
		for(int num=1;num<=10;num++)//num=1,1<10 -->true
		{
			if(num==5) //1==5 -->false
			{
				continue; //here 5 is skip bec of continue 
			}
			System.out.println(num);//1 2 3 4 6 7 8 9 10
		}
		
		// skip 3 5 and 9 number 
		
		for(int a=1;a<=10;a++) 
		{
			if(a==3 || a==5 || a==9)
			{
				continue;
			}
			System.out.println(" " +a);//1 2 4 6 7 8 10
		}

	}

}
