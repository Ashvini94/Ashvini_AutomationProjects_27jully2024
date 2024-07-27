package this_keyword;

public class This_KeywordwithParent_Classmethod  extends This_KeywordwithCurrent_ClassMethod{

	//3.this keyword is used to invoke parent class instance method
	public void m3()
	{
		this.m1();
		System.out.println("This is m3 method");
	}
	
	public static void main(String[] args) {
		This_KeywordwithParent_Classmethod pm=new This_KeywordwithParent_Classmethod();
		
		pm.m3();

	}

}
