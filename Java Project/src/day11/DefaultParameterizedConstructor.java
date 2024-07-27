package day11;

public class DefaultParameterizedConstructor {

int x,y;
	
	//dafault constructor
	DefaultParameterizedConstructor()
	{
	 x=100;
	 y=200;
	}
	
	//parameterized constructor
	DefaultParameterizedConstructor(int a,int b)
	{
		x=a;
		y=b;
	}
	//method 
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {

		//call default constructor
		DefaultParameterizedConstructor dpc1=new DefaultParameterizedConstructor();
				
				//call method
				dpc1.sum();
				
		//call parameterized constructor
		DefaultParameterizedConstructor dpc2=new DefaultParameterizedConstructor(10,20);
		
		dpc2.sum();
	}

}
