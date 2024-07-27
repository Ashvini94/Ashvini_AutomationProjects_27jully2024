package this_keyword;
/* this keywoerd is used to refer current class instance members like variable,method and constructor
 * a.This keyword is used to call instance variable 
 *  we can call instance variable of cureent class 
 *  and instance variable of parent class in child class
 *  
 */

//example 1-->access of instance variable in current class
public class This_001 {
	
	//instance variable 
	String s="cd";
	int i;
	
	public void get(int a)
	{
		System.out.println(this.s);
		this.i=a;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		This_001 t1=new This_001();
		t1.get(20);
		
	}

}
