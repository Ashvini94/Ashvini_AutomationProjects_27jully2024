package day14;

public class PassingParameterToMainMethod {

	public static void main(String[] args) {


		//to find the length of String []args
		
		System.out.println(args.length);//0
		
		//to pass parameter in args click on run as-->click on run configuration-->click on argument-->pass parameter on program argument-->apply-->close
		//to run -->directlty run as-->java application or click on run as-->click on run configuration-->click on argument-->pass parameter on program argument-->run

		//exapmle -->pass argument--> welcome to java selenium (length is 4)
		
		//to print the data
		
		for(String value:args)
		{
			System.out.println(value);
		}
	}

}
