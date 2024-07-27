package inheritance_types;

public class Class_R extends Class_Q{
	
	public void r()
	{
		System.out.println("This is r method of Class_R");
	}

	public static void main(String[] args) {
		
		Class_R robj=new Class_R();
		
		System.out.println(robj.d);//class_P
		
		robj.p();
		robj.q();
		robj.r();

	}

}
