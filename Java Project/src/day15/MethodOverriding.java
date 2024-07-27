package day15;

class Bank
{
	double roi()
	{
		return 0;
	}
}
class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}
class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		//create child class object i.e ICICI class obj
		ICICI ic = new ICICI();
		
		System.out.println(ic.roi());//call same child class overrided method o/p is 10.5
		
		//create child class object i.e SBI class obj
		
		SBI sb = new SBI();
		
		System.out.println(sb.roi());//call same child class overrided method o/p is 11.5

		

	}

}
