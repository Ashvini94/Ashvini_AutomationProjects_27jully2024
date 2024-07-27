package super_keyword;

public class super_KeywordwithVariable1 extends Super_keywordwithVariable{
	
	int i=200;
	
	public void m1()
	{
		System.out.println(super.i);
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		super_KeywordwithVariable1 sk=new super_KeywordwithVariable1();
		sk.m1();

	}

}
