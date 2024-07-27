package wrapper_class;

import string_class.String_Class_Method1;

public class Wrapper_Class {

	public static void main(String[] args) {
		//convert primitive type to wrapper class
		
		byte b=110;
		Byte bt=Byte.valueOf(b);
		System.out.println(bt);
		
		short s=300;
		Short sh=Short.valueOf(s);
		System.out.println(sh);
		
		int i=2000;
		Integer ab=Integer.valueOf(i);
		System.out.println(ab);
		
		long l=2000;
		Long ln=Long.valueOf(l);
		System.out.println(ln);
		
		float f=34.3579f;
		Float cd=Float.valueOf(f);
		System.out.println(cd);
		
		double d=1000.30;
		Double dlb=Double.valueOf(d);
		System.out.println(dlb);
		
		
		
		//convert wrapper class to primitive type
		
	/*	Byte by=new Byte((byte) 80);
		byte byt=by.byteValue();
		System.out.println(byt);
		
		Short sht=new Short((short)300);
		short sh=sht.shortValue();
		System.out.println(sh);
		
		
		Integer in=new Integer(8000);
		int value=in.intValue();
		System.out.println(value);
		
		Long l=new Long(3000);
		long ln=l.longValue();
		System.out.println(ln);
		
		Float f=new Float((float)10.45f);
		float fl=f.floatValue();
		System.out.println(fl);
		
		Double dl=new Double(5000);
		double dbl=dl.doubleValue();
		System.out.println(dbl);
		
		*/
	}

}
