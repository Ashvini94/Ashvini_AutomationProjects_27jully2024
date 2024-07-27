package exception;

public class Class_003Customized_exception {
	
	public void m1()
	{
		int i=10;
		int j=i/0;
		
	//	throw new ArithmaticException("Number does not divide by zero");
	}

	public static void main(String[] args) {

		Class_003Customized_exception se=new Class_003Customized_exception();
		se.m1();
	}

}
