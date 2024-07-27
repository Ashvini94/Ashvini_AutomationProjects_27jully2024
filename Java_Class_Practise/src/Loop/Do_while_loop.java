package Loop;

public class Do_while_loop {
	
	int x=1;
	public void print()
	{
		do
		{
			System.out.println(x);
			x++;
		}while(x<=5);

	}

	public static void main(String[] args) {
		
		Do_while_loop loop=new Do_while_loop();
		
		loop.print();
		
		
		
		
	}

}
