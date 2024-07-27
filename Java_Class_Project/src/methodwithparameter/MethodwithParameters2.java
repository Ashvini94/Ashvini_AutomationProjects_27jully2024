package methodwithparameter;

public class MethodwithParameters2 {

	//instance variable
	int i;
	int j;
	
	//instance method
	public void print(int a)
	{
		i=a;
		
	}
	
	//instance method
	public void verify(int b)
	{
		j=b;
	}
	//instance method
	public void check()
	{
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
	}
	
	public static void main(String[] args) {

		MethodwithParameters2 mp=new MethodwithParameters2 ();
		mp.print(20);
		mp.verify(50);
		mp.check();


	}

}
