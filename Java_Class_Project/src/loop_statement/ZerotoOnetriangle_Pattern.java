package loop_statement;

public class ZerotoOnetriangle_Pattern {

	public static void main(String[] args) {
		
		
		//1
		//0 1   -->  row +column matrix =even print 1 and 
		//1 0 1      row +colum matrix=odd print 0
		//0 1 0 1
		//1 0 1 0 1
		
		for(int i=1;i<=5;i++)//i=1,1<5-->true,1=2,2<5-->true
		{
			for(int j=1;j<=i;j++)//j=1,1=1-->true,1<2-->true
			{
				int sum=i+j;//1+1=2,2+1=3
				
				if(sum%2==0)//2%2==0-->true ,cond false
				{
					System.out.print(" 1 ");//print 1
				}
				else
				{
					System.out.print(" 0 ");//print 0
				}
			}
			System.out.println();
		}

	}

}
