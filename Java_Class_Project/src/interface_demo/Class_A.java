package interface_demo;

public class Class_A implements Interface1, Interface2 {

	@Override
	public void yellow() {
		
		System.out.println("proceed with 30kmph");

	}

	@Override
	public void green() {
		
		System.out.println("proceed with 60kmph");
	}

	public static void main(String[] args) {

		Class_A ca=new Class_A();
		ca.yellow();
		ca.green();
		
	}

}
