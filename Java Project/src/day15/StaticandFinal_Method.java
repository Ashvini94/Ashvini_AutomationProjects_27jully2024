package day15;

//static keyword is use with only variable and method
//final keyword is use with variable,method and class

class Method1
{
	static void print()
	{
		System.out.println("This is static method");
	}
}

class Method2
{
	static void print()
	{
		System.out.println("This is static method of class Method2");
	}
}
public class StaticandFinal_Method {
	
	static int x=100;
	
	final int y=200;
	
	
	
	public static void main(String[] args) {

		x=200;
		
		System.out.println(x);//200
		
		//y=300;//incoorect bec you cannot change the value of final variable
		
		//to call parent class static method
		
		Method1 m1=new Method1();
		m1.print();
		
		//to call child class static method
		
		Method2 m2=new Method2();
		m2.print();
		
	
	}

}
