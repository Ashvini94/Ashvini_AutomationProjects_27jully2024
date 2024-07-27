package day12;

public class OverloadingMain {

	//we can overload main method
	
	void main()
	{
		System.out.println("Hello");
	}
	void main(String s)
	{
		System.out.println(s);
		
	}
	void main(int x)
	{
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {


		OverloadingMain ov=new OverloadingMain();
		ov.main();
		ov.main("marry");
		ov.main(100);
		

	}

}
