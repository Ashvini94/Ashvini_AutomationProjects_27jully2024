package method_parameter;

public class Class_001 {

	int i;
	static double d;
	static long l;
	float f;
	byte b;
	short s;
	char c;
	boolean bln;
	
	//instance method
	public void print(int a)
	{
		i=a;
		System.out.println(i);//100
	}
	public void check(int x,byte bt,short sh,long lng)
	{
		i=x;
		b=bt;
		s=sh;
		l=lng;
		System.out.println(i);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
	}
	
	//static method
	static public void verify(double db,long ln)
	{
		d=db;
		l=ln;
		System.out.println(d);
		System.out.println(l);
	}
	
	public static void main(String[] args) {

		Class_001 cs=new Class_001();
		cs.print(100);//call instance method
		
		verify(25.5679,30000);//call static method
		
		cs.check(200,(byte)125,(short)20067,35000);
		
		

	}

}
