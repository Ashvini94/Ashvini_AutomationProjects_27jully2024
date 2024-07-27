package wrapper_class;

public class Wrapper_Class_001 {

	public static void main(String[] args) {
		
		//convert primitive type to wrapper class
		
		int i=200;
		int in=Integer.valueOf(i);
		System.out.println(in);
		
		short s=300;
		Short sh=Short.valueOf(s);
		System.out.println(sh);
		
		byte b=125;
		byte by=Byte.valueOf(b);
		System.out.println(by);
		
		long l=3000;
		long ln=Long.valueOf(l);
		System.out.println(ln);
		
		float f=200.24f;
		float fl=Float.valueOf(f);
		System.out.println(fl);
		
		double d=3000.456;
		double db=Double.valueOf(d);
		System.out.println(db);
		
		char c='A';
		Character ch=Character.valueOf(c);
		System.out.println(ch);
		
		boolean bl=true;
		Boolean bln=Boolean.valueOf(bl);
		System.out.println(bln);
		
	}

}
