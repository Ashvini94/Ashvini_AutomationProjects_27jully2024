package day14;

//Hierarchy inheritance

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}

public class InheritanceType3 {

	public static void main(String[] args) {

		//create obj of child1 class
		
		Child1 ch=new Child1();
		
		ch.display(1000);
		ch.show(2000);
		
		//create obj of child2 class
		
		Child2 cd=new Child2();
		cd.display(5000);
		cd.print(8000);
		

	}

}
