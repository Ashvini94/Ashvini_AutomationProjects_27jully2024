package Type_casting;

public class Class_001 {

	public static void main(String[] args) {
		//type casting -->type casting is when you assign one primitive type to another type
		//				  It has two types
		
		//1.widening casting -->1.converting smaller type to larger type
		//					    2.widening casting is done automatically when passing smaller size type to larger size type
	/*	
		int i=200;
		long l=i;
		System.out.println(l);//200
		
		int j=5000;
		double d=j;
		System.out.println(d);//5000.0
		
		byte b =120;
		short s=b;
		System.out.println(s);
		
		byte b1=125;
		int in=b1;
		System.out.println(in);
		
		byte b2=125;
		long ln=b1;
		System.out.println(ln);
		
		byte b3=125;
		float fl=b3;
		System.out.println(fl);
		
		byte b4=125;
		double dl=b4;
		System.out.println(dl);
		
		
		*/
				
		
		
		//Narrowing casting -->1.converting larger type to smaller type
		//					   2.It is must be done manually by placing type in parenthesis in front of the value  
		
		long ln=2000;
		int x=(int)ln;
		System.out.println(x);//2000
		
		float f=34.3000f;
		long lng=(long)f;
		System.out.println(lng);//34
		
		double db=4000.50;
		long l=(long)db;
		System.out.println(l);
		
		double db1=4000.50;
		long l1=(long)db1;
		System.out.println(l1);
		
		double db2=2000;
		short l2=(short)db2;
		System.out.println(l2);
		
		double db3=124;
		byte l3=(byte)db3;
		System.out.println(l3);
		
		

	}

}
