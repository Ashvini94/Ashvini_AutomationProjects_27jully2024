package inheritance;

public class Class_D {

	public static void main(String[] args) {
		
		//HAS-A relationship
		
		Class_C cobj=new Class_C();
		
		System.out.println(cobj.j);//Class_C
		
		cobj.c();//Class_C
		
		//cobj.print();
		Class_C.print();//Class_C
		
		

	}

}
