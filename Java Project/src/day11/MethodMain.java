package day11;

public class MethodMain {

	public static void main(String[] args) {

		//object of class Method
		Methods m=new Methods();
		
		//call method m1
		 m.m1();
		 
		 //call method m2
		 String str= m.m2();
		 System.out.println(str);
		// System.out.println(m.m2());
		 
		 //call method m3
		 m.m3("John");
		 
		 //call method m4
		String s= m.m4("david");
		System.out.println(s);
	}

}
