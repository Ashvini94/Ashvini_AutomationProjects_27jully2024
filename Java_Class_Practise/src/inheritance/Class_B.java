package inheritance;

//IS-A relationship
public class Class_B extends Class_A {

	public static void main(String[] args) {
		
		Class_B bobj=new Class_B();
		
		System.out.println(bobj.i);//form Class_A
		
		bobj.a();//Class_A
		
		print();//Class_A
		
		
	}

}
