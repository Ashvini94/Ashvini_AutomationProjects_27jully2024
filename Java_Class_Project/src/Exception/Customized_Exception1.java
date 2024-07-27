package Exception;

public class Customized_Exception1 {

	public void number ()
	{
		int i=20;
		int r=i/0;
		
		throw new ArithmeticException("Number cant divide by zero");
	}
	
	public static void main(String[] args) {
		
		Customized_Exception1 ce=new Customized_Exception1();
		ce.number();
		

	}

	
}
