package super_keyword;

public class Super_KeywordwithMethod1 extends Super_KeywordwithMethod{
	
	public void m1()
	{
		super.m1();
		System.out.println("This is m1 method of child class");
	}

	public static void main(String[] args) {
		Super_KeywordwithMethod1 sk=new Super_KeywordwithMethod1();
		sk.m1();

	}

}
