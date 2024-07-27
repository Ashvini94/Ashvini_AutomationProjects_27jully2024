package inheritance3;

public class Class_C extends Class_A {

	public static void main(String[] args) {
		
		Class_C cobj=new Class_C();
		
		System.out.println(cobj.i);//call parent class variable from Class_A
		cobj.a();//call parent class method of class_A

	}

}
