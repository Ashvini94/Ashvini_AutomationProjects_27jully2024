package day15;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}
class XYZ extends ABC
{
	void m1(int a)  // -->overrided method only implementation is change
	{
		System.out.println(a*a);
	}
	
	void m2(int b,int c) //-->overloaded method
	{
		System.out.println(b+c);
	}
}

public class OverridingOverloadingWithInheritance {
	
	public static void main(String[] args) {
		
		XYZ xyzobj = new XYZ();//create child class object
		
		xyzobj.m1(10);//call same child class overrided method m1 o/p is 100 i.e 10*10=100
		
		xyzobj.m2(10);//call parent class method m2 o/p is 10
		
		xyzobj.m2(20, 30);//call child class overloaded method m2 o/p is 50 i.e 20+30=50
		

	}

}
