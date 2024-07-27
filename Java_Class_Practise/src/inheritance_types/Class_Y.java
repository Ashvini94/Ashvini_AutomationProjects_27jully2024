package inheritance_types;

public class Class_Y extends Class_X {
	
	public void y()
	{
		System.out.println("This is y method of class_Y");
	}

	public static void main(String[] args) {
		Class_Y yobj=new Class_Y();
		
		System.out.println(yobj.i);
		yobj.x();
		yobj.y();
		

	}

}
