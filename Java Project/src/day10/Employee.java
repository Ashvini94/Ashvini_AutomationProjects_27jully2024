package day10;

public class Employee {
	
	//class variable or instance variable or global variable
			int empid;
			String empname;
			String empjob;
			int empsal;
	
			
			//method
			void dispaly()
			{
				System.out.println(empid);
				System.out.println(empname);
				System.out.println(empjob);
				System.out.println(empsal);
			}
	
	public static void main(String[] args) {

		//create object of class
		Employee emp1=new Employee();
		
		//assign data to variables
		emp1.empid=101;
		emp1.empname="John";
		emp1.empjob="Manager";
		emp1.empsal=30000;
		
		//call method 
		emp1.dispaly();
		
		
		

	}

}
