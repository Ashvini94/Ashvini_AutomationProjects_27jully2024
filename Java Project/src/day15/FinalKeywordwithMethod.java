package day15;

//whenever you apply final keyword on method you can not override that method into child class
class Test1
{
	final void print()
	{
		System.out.println("This is print method of Test1 class");
	}
}
class Test2 extends Test1
{
/*  void print() //incoorect bec print method is final and you can not override final method into child class
	{
		System.out.println("THis is print method of Test2 class");
	}
	
	*/
}


public class FinalKeywordwithMethod {
	
	public static void main(String[] args) {



	}

}
