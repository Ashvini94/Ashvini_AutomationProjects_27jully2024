package day12;

public class AdderMain {

	public static void main(String[] args) {

		Adder add=new Adder();
		
		add.sum();//call method 1
		add.sum(100, 200);//call method 2
		add.sum(50, 10.50);//call method 3
		add.sum(10.50, 300);//call method 4
		add.sum(100, 200, 300);//call method 5
		
	}

}
