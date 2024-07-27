package day14;

//multi-level inheritance

//you can not use same class name in one package while all the class are diff name

class Add
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}

class Build extends Add
{
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}

class C extends Build
{
	int c;
	
	void print()
	{
		System.out.println(c);
	}
}

public class InheritanceType2 {

	public static void main(String[] args) {


		//create object of child class C to access parent class stuff and child B class stuff as well as child C class stuff
		
		C cobj=new C();
		
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
		

	}

}
