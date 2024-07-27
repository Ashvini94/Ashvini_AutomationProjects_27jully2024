package this_keyword;

//example 2-->access all constructor with the help of highest parameterized constructor object
public class This_006 {

	public This_006()
	{
		System.out.println("This is constructor with no argument");
	}
	public This_006(int a)
	{
		this();
		System.out.println("This is constructor with one argument");
	}
	public This_006(int a,float f)
	{
		this(800);
		System.out.println("This is constructor with two argument");
	}
	public This_006(int a,float f,long l)
	{
		this(60,10.36f);
		System.out.println("This is constructor with three argument");
	}
	public This_006(String s,int a,float f,long l)
	{
		this(90,20.35f,300);
		System.out.println("This is constructor with four argument");
	}
	
	
	public static void main(String[] args) {
		
		This_006 t6=new This_006("ab",20,40.10f,4000);

	}

}
