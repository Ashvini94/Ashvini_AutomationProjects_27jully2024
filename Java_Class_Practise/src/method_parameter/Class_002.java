package method_parameter;

public class Class_002 {
	
	int in;
    static byte by;
	short sh;
	long ln;
	float fl;
	double db;
	
	public void m1(int i)
	{
		in=i;
		System.out.println("This is m1 method");
	}
	
	public static void m2(byte b)
	{
		by=b;
		System.out.println("This is m2 method");
	}
	
	public void m3(int i,byte b)
	{
		in=i;
		by=b;
		System.out.println("This is m3 method");
	}
	public void m4(short s,long l)
	{
		sh=s;
		ln=l;
		System.out.println("This is m4 method");
	}
	
	public void m5(float f,double d)
	{
		fl=f;
		db=d;
		System.out.println("This is m5 method");
	}

	public static void main(String[] args) {
		
		Class_002 c2=new Class_002();
		
		c2.m1(100);//call m1 method
		
		m2((byte)125);//call m2 static method
		
		c2.m3(150, (byte)110);//call m3 method
		
		c2.m4((short)400, 1000);//call m4 method
		
		c2.m5((float)10.25, 2000);
		
		
		
	}

}
