package day12;

public class Account {

	private int accno;
	private String name;
	private double amount;
	
	//setter getter 
	
	void setAccno(int accno)//set data into variable
	{
		this.accno=accno;
	}
	
	//get data from variable
	int getAccno()
	{
		return accno;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	double getAmount()
	{
		return amount;
	}
}
