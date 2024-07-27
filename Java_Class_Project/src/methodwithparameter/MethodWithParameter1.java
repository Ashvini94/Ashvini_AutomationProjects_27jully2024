package methodwithparameter;

public class MethodWithParameter1 {

	//instance variable
	int a;
	
	//instance method
	public void method(int m)//100
	{
		a=m;//here assign value of m to a
		System.out.println("value of variable a is: "+a);//100
	}
	
	public static void main(String[] args) {

		MethodWithParameter1 mp=new MethodWithParameter1();
		
		//call instance method
		mp.method(100);

	}

}














