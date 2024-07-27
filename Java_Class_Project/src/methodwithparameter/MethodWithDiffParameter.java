package methodwithparameter;

public class MethodWithDiffParameter {
	
	//instance variable
	String s;
	short sh;
	double d;
	char c;
	boolean bl;
	
	//static variable
	static long l;
	static byte b;
	static int i;
	static float f;  
	
	//instance method
	public void method1(String str,long ln,char ch)
	{
		s=str;
		l=ln;
		c=ch;
		System.out.println("value of s is: "+s);//Automation
		System.out.println("Value of l is: "+l);//1000
		System.out.println("value of c is:"+c);//h
	}
	
	
	//static method
	static public void method2(byte m)
	{
		b=m;
	
		System.out.println("value of b is:"+b);//125
	}
	   
	
	//instance method
		public void method3(short shr,int n,boolean bln)//120,300 true
		{
			sh=shr;
			i=n;
			bl=bln;
			System.out.println("Value of sh is:"+sh);//120
			System.out.println("Value of i is:"+i);//300
			System.out.println("value of bl is:"+bl);//true
		}   
		
		
	
	
	//static method	
	static public void method4(int x,float y,long z)
		{
			i=x;
			f=y;
			l=z;
			System.out.println("value of i is: "+i);//500
			System.out.println("value of f is: "+f);//40.2
			System.out.println("value of l is: "+l);//5879000
			
		}    
		
		
		//instance method
		public void method5(int p,double q,long r)
		{
			i=p;
			d=q;
			l=r;
			System.out.println("Value of i is: "+i);//350
			System.out.println("Value of i is: "+d);//45.980
			System.out.println("Value of i is: "+l);//48880
			
		}
		
		
		

	public static void main(String[] args) {

		//object
		MethodWithDiffParameter mp=new MethodWithDiffParameter();
		//call instance method
		mp.method1("Automation", 1000,'h');
		
		//we can print here also
		//System.out.println(mp.s);//Automation
		//System.out.println(mp.l);//1000
		
		//call static method
			method2((byte) 125);
		
		//call instance method
		mp.method3((short) 120, 300,true);
		
		//call static method
		method4(500,(float) 40.2,5879000);
		
		//call instance method
		mp.method5(350, 45.980, 48880);
	}

}
