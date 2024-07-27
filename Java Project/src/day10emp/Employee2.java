package day10emp;

import day10.Employee1;

//import pacakage of sub class i.e Employee1 class
import day10.Employee1;

public class Employee2 {

	public static void main(String[] args) {
		
		//create object to operate Employee class
				Employee1 emp1=new Employee1();
				
				//assign value to variable
				emp1.empid=102;
				emp1.empname="David";
				emp1.empjob="Tester";
				emp1.empsal=30000;
				
				
				//call method which is present in Employee class
				emp1.dispaly();


	}

}
