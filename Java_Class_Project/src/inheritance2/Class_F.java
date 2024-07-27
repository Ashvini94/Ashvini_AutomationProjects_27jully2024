package inheritance2;

import inheritance1.Class_E;//bec we are extending another package of Class_F to another package of Class_E

//single inheritance
public class Class_F extends Class_E{

	public static void main(String[] args) {
		
		//create obj of child class
		Class_F fobj=new Class_F();
		
		fobj.e();//Class_E method call
		
		print();//call static method directly which is present in Class_E
		

	}

}
