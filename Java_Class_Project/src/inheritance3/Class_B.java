package inheritance3;

public class Class_B extends Class_A {

	public static void main(String[] args) {
		
		Class_B bobj=new Class_B();
		
		System.out.println(bobj.i);//from Class_A
		bobj.a();//from Class_A
	}

}
