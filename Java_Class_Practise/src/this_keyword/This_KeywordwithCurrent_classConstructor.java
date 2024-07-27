package this_keyword;

public class This_KeywordwithCurrent_classConstructor {
	
	//this keyword is used to invoke current class constructor
	public This_KeywordwithCurrent_classConstructor()
	{
		System.out.println("This is user defined constructor");
	}
	public This_KeywordwithCurrent_classConstructor(int i)
	{
		this();
		System.out.println("This is parameterized constructor");
		
	}
	

	public static void main(String[] args) {
		This_KeywordwithCurrent_classConstructor ts=new This_KeywordwithCurrent_classConstructor(100);

	}

}
