package day15;

/* final keyword -->1.final keyword is applicable for class,variable and method
 * 					2.when we want to secure class,varaible and method then use final keyword
 * 
 * 
 */

//whenever you apply final keyword on varaible you can not change the value of those variable it is constant

class Test
{
	 final int x=100;
}




public class FinalKeywordwithVariable {

	public static void main(String[] args) {

		Test t = new Test();
		//t.x=200;  -->incorrect bec x is a final variable so its value is fixed or constant you can not changed the value of var x
		
		System.out.println(t.x);//200
		
		
		
		
		
		

	}

}
