package Exception;

public class trycatchblockInsideCatch_Block {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			//try catch block inside catch block
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}
		System.out.println("Hello");

	}

}
