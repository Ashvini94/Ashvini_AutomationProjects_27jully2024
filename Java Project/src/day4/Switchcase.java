package day4;

public class Switchcase {

	public static void main(String[] args) {
		
		/* syntax --> switch(variables)
		 * 				{
		 * 				case value1:statements;
		 * 				case value2:statements;
		 * 				case value3:statements;
		 * 				dafault:statements;
		 * 				}
		 */
			
		//dispaly week name based on week no
		
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
		case 6:System.out.println("saturday");
				break;
		case 7:System.out.println("Sunday");
				break;
		default:System.out.println("Invalid");
		
		}
	}

}
