package exception;

public class Class_004TryblockwithMultipleCatchBlock {

	public static void main(String[] args) {


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException np)
		{
			
		}
		catch(Exception e)
		{
			
		}

	}

}
