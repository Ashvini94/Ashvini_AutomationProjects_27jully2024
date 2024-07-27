package weekNameBasedonWeekNo;

public class Demo2 {

	public static void main(String[] args) {

		//display week name by using week no using switch case 
		
		int week_no=1;
		
		switch(week_no)
		{
		case 1:System.out.println("Monday");
				break;
		case 2:System.out.println("Tuesday");
				break;
		case 3:System.out.println("Wensday");
		       break;
		case 4:System.out.println("Thursday");
		 	   break;
		case 5:System.out.println("Friday"); 	
			  break;
		case 6:System.out.println("Saturday");		  
			  break;
		case 7:System.out.println("Sunday");
		      break;
		default:System.out.println("Invalid");      
		
		
		}
		
// display week no by using week name using switch case
		
		String week_name="Thursday";
		
		switch(week_name)
		{
		case "Monday":System.out.println(1);
			break;
		case "Tuesday":System.out.println(2);	
			break;
		case "Wensday":System.out.println(3);
			break;
		case "Thursday":System.out.println(4);	
			break;
		case "Friday":System.out.println(5);
			break;
		case "Saturday":System.out.println(6);	
			break;
		case "Sunday":System.out.println(7);
			break;
		default:System.out.println("Invalid");	
		}
	}

}
