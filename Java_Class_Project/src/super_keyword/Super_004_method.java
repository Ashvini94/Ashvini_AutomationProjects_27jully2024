package super_keyword;

public class Super_004_method extends Super_003_method{
	
	public void get_data()
	{
		super.get();
		System.out.println("This is get_data method of child class");
	}

	public static void main(String[] args) {
		
		Super_004_method s4=new Super_004_method();
		s4.get_data();

	}

}
