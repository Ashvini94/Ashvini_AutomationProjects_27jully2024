package this_keyword;

public class This_KeywordwithCurrent_ClassMethod {

	//2.this keyword is used to invoke current class instance method
	public void m1()
	{
		System.out.println("This is m1 method");
	}
		/* public void m2(int i)
		{
			this.m1();
			System.out.println("This is m2 method");
		}*/
	
	public static void main(String[] args) {
		This_KeywordwithCurrent_ClassMethod tm=new This_KeywordwithCurrent_ClassMethod();
		
		//tm.m2(100);
		

	}

}
