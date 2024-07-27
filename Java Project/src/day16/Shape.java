package day16;

 interface Shape {

	int width=10;//bydefault final and static variable
	int length=20;//bydefault final and static variable
	
	void circle();//abstract method
	
	default void square()
	{
		System.out.println("This is square");
	}
	
	static void reactangle()
	{
		System.out.println("This is rectangle");
	}
	
	public class InterfaceDemo implements Shape
	{

		@Override
		public void circle() {
			System.out.println("This is circle");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//create child class object -->approach 1
		InterfaceDemo iobj = new InterfaceDemo();
		
		iobj.circle();//abstract method call
		iobj.square();//default method call
		Shape.reactangle();//static method call directly using interface
		
		
		//create child class obj and hold that obj into inerface type variable
		 
	                   Shape sh = new InterfaceDemo();
	                   
	                   sh.circle();//call abstract method
	                   sh.square();//call default method
	                   Shape.reactangle();//call static method directly using interface
	                   
		
	}
}
