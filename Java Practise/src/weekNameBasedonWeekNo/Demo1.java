package weekNameBasedonWeekNo;

public class Demo1 {

	public static void main(String[] args) {

		//display week name based on week number using if else ladder
		
		int week_no=2;
		
		if(week_no==1)
		{
			System.out.println("Monday");
			
		}
		else if(week_no==2)
		{
			System.out.println("Tuesday");
		}
		else if(week_no==3)
		{
			System.out.println("Wensday");
		}
		else if(week_no==4)
		{
			System.out.println("Thursday");
		}
		else if(week_no==5)
		{
			System.out.println("Friday");
		}
		else if(week_no==6)
		{
			System.out.println("Saturday");
		}
		else if(week_no==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid");
		}
		


	}

}
