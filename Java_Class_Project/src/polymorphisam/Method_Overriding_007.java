package polymorphisam;

public class Method_Overriding_007 {

	/* rule 3-->a)return type -->return type of child class and parent class should be same
	 * 
	 */
	
	public long get(long l)
	{
		System.out.println("This is get method from class Method_Overriding_007");
		return l;
	}
	
	
	/*b)if return type is class type i.e integer,number,arrays,string,object etc then child class
	 *  method return type is same or sub class it cannot be super class 
	 */
	
	public Number get_data(int a)
	{
		System.out.println("This is get_data method from class Method_Overriding_007");
		return a;
	}
	
	//Number class can hold int,byte,short,long,float,double data type
	public Number print(int b)
	{
		System.out.println("This is print method from class Method_Overriding_007");
		return b;
	}
	
	public Integer verify(int x)
	{
		System.out.println("This is verify method from class Method_Overriding_007");
		return x;
	}
	
	
	public static void main(String[] args) {
		

	}

}
