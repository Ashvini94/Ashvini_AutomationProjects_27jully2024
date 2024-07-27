package inheritance3;

public class Class_D extends Class_A {

	public static void main(String[] args) {
		
		Class_D dobj=new Class_D();
		
		System.out.println(dobj.i);//call parent class variable of Class_A
		
		dobj.a();//call parent class method of Class_A

	}

}
