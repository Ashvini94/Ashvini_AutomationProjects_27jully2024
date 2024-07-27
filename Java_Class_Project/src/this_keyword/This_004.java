package this_keyword;

//example 2-->access parent class instance method in child class
public class This_004 extends This_003{
	
	long l=2000;
	
	public void verify()
	{
		this.get(90);
		System.out.println("This is verify method");
	}

	public static void main(String[] args) {
		
		This_004 t4=new This_004();
		t4.verify();

	}

}
