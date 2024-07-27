package this_keyword;

public class ThisKeyword_ParentClass extends This_keywordwithCurrentClass {

	double d=500.20;
	
	//this keyword is used to invoke parent class instance variable
	public void get()
	{
		System.out.println(this.i);
		System.out.println(this.d);
	}
	
	public static void main(String[] args) {
		ThisKeyword_ParentClass tp=new ThisKeyword_ParentClass();
		tp.get();

	}

}
