package super_keyword;

public class Super_006_constructor extends Super_005_constructor{

	public Super_006_constructor()
	{
		super();
		System.out.println("This is constructor of child class");
	}
	
	public Super_006_constructor(long l)
	{
		super(10);
		System.out.println("This is parameterized constructor with one argument of child class");
	}
	
	public static void main(String[] args) {
		Super_006_constructor s6=new Super_006_constructor();
		
		Super_006_constructor sc=new Super_006_constructor(2000);
		

	}

}
