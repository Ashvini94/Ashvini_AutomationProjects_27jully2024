package day10;

//we can create main method here
public class Employee1Main {

	public static void main(String[] args) {

		//create object to operate Employee class
		Employee emp1=new Employee();
		
		//assign value to variable
		emp1.empid=102;
		emp1.empname="David";
		emp1.empjob="Tester";
		emp1.empsal=30000;
		
		
		//call method which is present in Employee class
		emp1.dispaly();

	}

}
