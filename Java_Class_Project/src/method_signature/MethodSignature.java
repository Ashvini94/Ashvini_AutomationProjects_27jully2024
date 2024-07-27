package method_signature;

//Method signature -->it is a method name followed by parameter type

/*   eg: public void print(int i)
    	{
    		
     	}
     	
     	signature --> print(int)
     
     */

	public class MethodSignature {
	
		//no return type and no parameter
		
		public void get()
		{
			System.out.println("This is get method");
		}
		
		//no return type and with parameter
		
		public void get(int i)
		{
			System.out.println("This is parameterized method");
		}
		
		//no parameter and with return type
		
		public void get_data()
		{
			System.out.println("This is get_data method");
			return;
		}
		
		//return type and  with parameter
		
		public int get_data(int a)
		{
			System.out.println("This is parameterized method with return type");
			return a;
		}
		
		public int add(int x)
		{
			System.out.println("This is static method");
			return 10;
		}
		
		public static String print(String name)
		{
			System.out.println("Your name is: "+name);
			return name;
		}
		public static Integer method1(Integer i)
		{
			System.out.println("THis is method1: "+i);
			return i;
		}
		public static Object method2(Object o)
		{
			System.out.println("This is method2: "+o);
			return o;
		}
		public static Number method3(Number n)
		{
			System.out.println("This is method3: "+n);
			return n;
		}
	

	public static void main(String[] args) {

		print("Ashvini");//call static method
		
		MethodSignature ms= new MethodSignature();
		ms.get();//call get method with no parameter and no return value
		ms.get(100);//call get method with parameter and no return value
		ms.get_data();//call get_data method with return type and no parameter
		ms.get_data(200);//call get_data method with return type and with parameter
		method1(1000);//call static method with return type and with parameter
		method2('A');//call static method with return type and with parameter-->object type of variable can take any type of data like string,no,char etc
		method3(500);
		
		
		
		
	}

}
