package Loop;

public class While_loop {
	
	int i=1;
	
	public void print()
	{
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
	
		While_loop loop=new While_loop();
		
		loop.print();
		
		
		
		
	}

}
