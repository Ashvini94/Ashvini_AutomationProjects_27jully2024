package Exception;

public class Try_blockwithMultiple_Catch_Block {
	
	public static void main(String[] args) {
		
		//try block with multiple catch block
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException n)
		{
			
		}
		catch(Exception e)
		{
			
		}
	}

}
