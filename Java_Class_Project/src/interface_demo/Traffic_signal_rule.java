package interface_demo;

public class Traffic_signal_rule implements Traffic_signal{

	@Override
	public void green() {
		
		System.out.println("Proceed with 60kmph");
	}

	@Override
	public void yellow() {
		
		System.out.println("Proceed with 30kmph");
	}

	@Override
	public void red() {
		
		System.out.println("Stop");
	}

	public static void main(String[] args) {
		
		//create object of class
	//	Traffic_signal_rule tsr=new Traffic_signal_rule();
		
	//	tsr.green();
	//	tsr.yellow();
	//	tsr.red();
		
		//we can not create object of interface
		//Traffic_signal ts=new Traffic_signal();//error
		
		//but we can use interface reference variable to hold current class object
		Traffic_signal ts=new Traffic_signal_rule();
		ts.green();//it shows parent class method  behaviour at compile time but run child class overrided method
		ts.red();
		ts.yellow();
	}

	

}
