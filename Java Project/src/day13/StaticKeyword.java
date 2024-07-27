package day13;

public class StaticKeyword {
	
	
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
	

	public static void main(String[] args) {

		//static method can access static stuff directly
		
		System.out.println(b);
		show();
		
		
		//System.out.println(a); //error
		//dispaly(); //error
		
		//static method can access non static stuff through object
		
		StaticKeyword st=new StaticKeyword();
		st.display();
		
		
		
	}

}
