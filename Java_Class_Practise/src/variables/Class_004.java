package variables;

public class Class_004 {

	//instance variable
	
	int i =10;
	
	//static variable
	static int j=20;
	
	public static void main(String[] args) {
		
		int x=100;
		
		System.out.println(x);//call local variable directly
		
		Class_004 c4=new Class_004();
		
		System.out.println(c4.i);//call instance variable
		
		System.out.println(j);//call static varaible directly
		
		System.out.println(c4.j);//call static variable with the help of ref variable
		
		System.out.println(Class_004.j);//call static variable with the help of classname
		
	}

}
