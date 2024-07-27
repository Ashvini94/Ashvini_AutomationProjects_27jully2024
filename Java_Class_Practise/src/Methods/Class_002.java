package Methods;

public class Class_002 {

	
	//instance method
			public void method1()
			{
				System.out.println("Hello is a instance method");
			}
	
   //static method
			static public void verify()
			{
				System.out.println("Hello is a static method");
			}
			
			public static void main(String[] args) {

			//create object of class
			Class_002 cs=new Class_002();
			cs.method1();
			
			//in 3 way we can call static method
			cs.verify();//with the help of ref variable call static method
			
			Class_002.verify();//with the help of class name 
			
			verify();//directly call static method
			
		

	}

}
