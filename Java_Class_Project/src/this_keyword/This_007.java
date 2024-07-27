package this_keyword;

//example 3-->access all constructor with the help of user defined constructor object

public class This_007 {
	
	public This_007()
	{
		this(20);
		System.out.println("This is constructor with no argument");
	}
	public This_007(int a)
	{
		this(200,500000);
		System.out.println("This is constructor with one argument");
	}
	public This_007(int a,long l)
	{
		this(40,30.47,6000);
		System.out.println("This is constructor with two argument");
	}
	public This_007(int a,double d,long l)
	{
		this("xy",49,20.567,578970);
		System.out.println("This is constructor with three argument");
	}
	public This_007(String s,int x,double d,long l)
	{
		System.out.println("This is constructor with four argument");
	}

	public static void main(String[] args) {
		
		This_007 t7=new This_007();
		
	}

}
