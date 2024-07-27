package inheritance_types;


//single inheritance
public class Class_B extends Class_A{

	public static void main(String[] args) {
		
		Class_B bobj=new Class_B();
		
		System.out.println(bobj.l);//Class_A
		bobj.a();//Class_A
		print();//Class_A
		
	}

}
