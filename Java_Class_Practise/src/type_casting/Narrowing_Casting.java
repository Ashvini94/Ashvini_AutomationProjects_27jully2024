package type_casting;

public class Narrowing_Casting {

	public static void main(String[] args) {
		
		
		//converting larger size type to smaller size type
		long l=2500;
		int a=(int)l;
		System.out.println(l);
		System.out.println(a);
		
		long lng=2000;
		//short s=(short)l; //not taking
		//System.out.println(s);
		
		
				
		
		double d=4500.30;
		int b=(int)d;
		System.out.println(d);
		System.out.println(b);
		
		double d1=4500.30;
		float f=(float)d1;
		System.out.println(f);
		
		double db=45000.35;
		long ln=(long)db;
		System.out.println(ln);
		
		double db1=25000;
		short sh=(short)db1;
		System.out.println(sh);
		
		double db2=45000;
		byte by=(byte)db2;
		System.out.println(by);
		
				

	}

}
