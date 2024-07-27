package this_keyword;
/*b. this keyword is used to call instance method-->
 * 	 we can call instance method of current class and
 *   we can call instance method of parent class in child class
 *  
 * 
 */
//example 1-->access current class instance method
public class This_003 {
	
	String s="cd";
	int i;
	
	//instance method
	public void get(int a)
	{
		System.out.println(this.s);
		this.i=a;
		System.out.println(i);
	}
	
	//instance method
/*	public void java()
	{
		this.get(200);
		System.out.println("This is java method");
	}
	*/
	
	
	

	public static void main(String[] args) {
		
		This_003 t3=new This_003();
		t3.get(30);
		//t3.java();

	}

}
