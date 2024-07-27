package java_decision_statement3;

public class SwitchStatement {

	public static void main(String[] args) {


		/*syntax -->
		 * 
		 * 	initialize variable;
		 * 
		 * 		switch(variable name)
		 * 		{
		 * 			case value 1: //block of code
		 * 							break;
		 * 
		 * 			case value 2: //block ofcode
		 * 							break;
		 * 			default: //block of code
		 * 						break;
		 * 
		 * }
		 * 
		 * 		}
		 * 
		 */
		
		
		int i=100;
		
		//switch statement
		
		switch(i)
		{
		case 200:
			System.out.println("value is 200");
			break;
		case 300:
			System.out.println("Value is 300");
			break;
		case 400:
			System.out.println("value is 400");
			break;
		case 100:
			System.out.println("value is 100");
			break;
		default:
			System.out.println("All values are invalid");
			break;
		
		
		}
		

	}

}
