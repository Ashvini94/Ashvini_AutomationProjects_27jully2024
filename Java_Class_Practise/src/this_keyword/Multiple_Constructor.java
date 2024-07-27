package this_keyword;

public class Multiple_Constructor {
	
	public Multiple_Constructor()
	{
		System.out.println("This is no parameter constructor");
	}
	public Multiple_Constructor(int i)
	{
		this();
		System.out.println("This is one parameter constructor");
	}
	public Multiple_Constructor(int i,float f)
	{	this(200);
		System.out.println("This is two parameter constructor");
	}
	public Multiple_Constructor(int i,float f,double d)
	{
		this(100,20.60f);
		System.out.println("This is three parameter constructor");
	}
	public Multiple_Constructor(int i,float f,double d,String s)
	{
		this(100,30.45f,400.30);
		System.out.println("This is four parameter constructor");
	}

	public static void main(String[] args) {
		
		Multiple_Constructor ms=new Multiple_Constructor(100,20.45f,4000.20,"Ashvini");
		
	}

}
