package day13;

public class StaticKeyword1 {
	
	int a=10;
	static int b=20;
	
	//static method can access only static stuff directly
		static void show()
		{
			System.out.println(b);//static variable
		}
		
	//non-static method can access everything directly
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}


	void print()
	{
		System.out.println(a);
		System.out.println(b);
		display();
		show();
		
	}
	

}
