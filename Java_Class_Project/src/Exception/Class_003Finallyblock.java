package Exception;

public class Class_003Finallyblock {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}

}
