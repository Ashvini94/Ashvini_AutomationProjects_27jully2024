package day13;

public class ThisKeyword {
	
	int x;
	int y;
	
	ThisKeyword(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
/*	void display(int x,int y)
	{
		this.x=x; //this keyword refers to the class/object
		this.y=y;
		
	}  */
	
	void print()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyword th=new ThisKeyword(100,200);
		
		//th.display(100, 200);
		th.print();
		

	}

}
