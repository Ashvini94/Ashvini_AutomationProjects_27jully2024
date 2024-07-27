package day12;

public class Adder {

	int a=10;
	int b=20;
	
	void sum()//method 1
	{
		System.out.println(a+b);//30
	}
	
	void sum(int x,int y)//method 2
	{
		System.out.println(x+y);
	}
	
	void sum(int x,double y)//method 3
	{
		System.out.println(x+y);
	}
	
	void sum(double x,int y)//method 4
	{
		System.out.println(x+y);
	}
	
	void sum(int x,int y,int z)//method 5
	{
		System.out.println(x+y+z);
	}
	
}
