package this_keyword;

//example 2-->access instance variable of parent class
public class This_002 extends This_001 {
	
	//instance variable
	long l=5000;
	
	public void print()
	{
		System.out.println(this.s);//from This_001
		System.out.println(this.l);//from THis_002
	}

	public static void main(String[] args) {
		
		This_002 t2=new This_002();
		
		t2.print();
	}

}
