package polymorphisam;

public class Method_Overriding_002 extends Method_Overriding_001{

	public void go(String s)
	{
		System.out.println("This is go() method of child class with string type argument: "+s);
	}
	
	
	public static void main(String[] args) {
		
		//Method_Overriding_002 moobj=new Method_Overriding_002();
		
		//moobj.go("Ash");//call child class overrided method
		
		
	
		//here compliler takes place parent class behaviour at comile time but at run time it will takes place child class overrided behaviour
		Method_Overriding_001 moobj=new Method_Overriding_002();
		
		//moobj.go("Xyz");//call child class overrided method
		moobj.go("Ash");
	}

}
