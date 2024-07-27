package this_keyword;

public class This_keywordwithCurrentClass {
	
	int i=100;
	
	//this keyword is used to invoke current class instance variable
	public void m1(int i)
	{
		this.i=i;
		System.out.println(i);
	}

	public static void main(String[] args) {
		This_keywordwithCurrentClass tk=new This_keywordwithCurrentClass();
		//tk.m1(100);
		
	}

}
