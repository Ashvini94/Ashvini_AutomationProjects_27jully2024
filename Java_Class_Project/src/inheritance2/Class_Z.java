package inheritance2;

//multi-level inheritance
public class Class_Z extends Class_Y{
	
	int j=500;
	public void z()
	{
		System.out.println("This is method z of child class Z");
	}

	public static void main(String[] args) {
		
		//create child class object
		Class_Z zobj=new Class_Z();
		
		System.out.println(zobj.i);//call parent class variable i.e i
		
		zobj.x();//call from Class_X
		
		zobj.y();//call from Class_Y
		
	    System.out.println(zobj.j);//500 call from Class_Z
	    
	    zobj.z();//call from Class_Z
		
	}

}
