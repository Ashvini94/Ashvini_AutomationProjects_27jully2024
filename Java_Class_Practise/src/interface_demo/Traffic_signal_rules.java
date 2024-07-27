package interface_demo;

public class Traffic_signal_rules implements Traffic_Signal {
	
	@Override
	public void green() {
		System.out.println("go with 60kmph");
		
	}

	@Override
	public void red() {
		System.out.println("stop");
		
	}

	@Override
	public void yellow() {
		System.out.println("go with slow");
		
	}

	public static void main(String[] args) {
		
		Traffic_signal_rules tsr=new Traffic_signal_rules();
		
		tsr.green();
		tsr.red();
		tsr.yellow();
		
		Traffic_Signal ts=new Traffic_signal_rules();
		ts.green();
		ts.red();
		ts.yellow();

	}

	

}
