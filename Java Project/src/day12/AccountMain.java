package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account();
		
		acc.setAccno(101);//set data into variable
		
		System.out.println(acc.getAccno());//read data from variable

		acc.setName("John");
		System.out.println(acc.getName());
		
		acc.setAmount(10000.28);
		System.out.println(acc.getAmount());
	}

}
