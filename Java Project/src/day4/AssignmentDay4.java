package day4;

public class AssignmentDay4 {

	public static void main(String[] args) {

		//print week number based on week name
		
		String week_name="monday";
		
		switch(week_name)
		{
		case "monday":System.out.println(1); //1
		break;
		case "tuesday":System.out.println(2);
		break;
		case "wensday":System.out.println(3);
		break;
		case "thursday":System.out.println(4);
		break;
		case "friday":System.out.println(5);
		break;
		case "saturday":System.out.println(6);
		break;
		case "sunday":System.out.println(7);
		break;
		default:System.out.println("invalid");
		
		}

	}

}
