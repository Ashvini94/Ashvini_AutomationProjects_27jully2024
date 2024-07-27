package wrapper_class;

public class Wrapper_class_002 {

	public static void main(String[] args) {
		
		//convert wrapper class to primitive type
		Integer i=new Integer(2000);
		int in=i.intValue();
		System.out.println(in);
		
		Byte b= new Byte((byte) 125);
		byte by=b.byteValue();
		System.out.println(by);
		
		Short s=new Short((short)2500);
		short sh=s.shortValue();
		System.out.println(sh);
		
		Long l=new Long(3000);
		long ln=l.longValue();
		System.out.println(ln);
		
		Float f=new Float(200.45f);
		float fl=f.floatValue();
		System.out.println(fl);
		
		Double d=new Double(300.2345);
		double dl=d.doubleValue();
		System.out.println(dl);
		
		Character c=new Character('A');
		char ch=c.charValue();
		System.out.println(ch);
		
		Boolean bl=new Boolean(true);
		boolean bln=bl.booleanValue();
		System.out.println(bln);
		

	}

}
