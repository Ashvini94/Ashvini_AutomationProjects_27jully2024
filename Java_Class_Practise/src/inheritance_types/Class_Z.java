package inheritance_types;

public class Class_Z extends Class_X{
	
	public void z()
	{
		System.out.println("This is z method of Class_Z");
	}

	public static void main(String[] args) {
		
		Class_Z zobj=new Class_Z();
		System.out.println(zobj.i);
		zobj.x();
		zobj.z();
		//zobj.y();//error -->we can not access this

	}

}
