package day14;
//single inheritance

class A //class A is parent class
{
	int a=100;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A //class B is child class
{
	int b=200;
	
	void show()
	{
		System.out.println(b);
	}
}

public class InheritanceType1 {

	public static void main(String[] args) {

		//object of parent class
		A aobj=new A();
		System.out.println(aobj.a);//100
		aobj.display();//100
		
		
		//we can not access child class stuff through obj of parent class 
		//System.out.println(aobj.b);  //cant access
		//aobj.show(); //cant access
		
		
		
		//object of child class
		B bobj=new B();
		
		//we can acess parent class stuff as well as child class stuff through child class object
		System.out.println(bobj.a);//100
		System.out.println(bobj.b);//200
		
		bobj.display();
		bobj.show();
		
		
		

	}

}
