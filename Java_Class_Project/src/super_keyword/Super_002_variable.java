package super_keyword;

public class Super_002_variable extends Super_001_variable {
	
	long l=3000;
	
	//instance method
	public void get()
	{
		System.out.println(super.f);
		//System.out.println(super.l);//error -->bec super keyword is used to invoke parent class instance variable not current class instance variable
	}

	public static void main(String[] args) {
		
		Super_002_variable s2=new Super_002_variable();
		s2.get();
	}

}
