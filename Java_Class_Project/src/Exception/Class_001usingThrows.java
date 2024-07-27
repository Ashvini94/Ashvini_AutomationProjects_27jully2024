package Exception;

public class Class_001usingThrows {

	//exception handle by using throws keyword
	/*public static void main(String[] args) throws InterruptedException   {
		
		Thread.sleep(1000);
	}
	
	*/
	
	//here we can use parent class exception class
	/*public static void main(String[] args) throws Exception{
		
		Thread.sleep(3000);
	}
	
	*/
	
	//here we can use grandparent exception class
	public static void main(String[] args) throws Throwable {
		
		//advantage of throws keyword-->if we use multiple time exception statement then it will be handle by throws keyword by one time we no need to mention multiple throws keyword
		Thread.sleep(3000);
		Thread.sleep(3000);
	}

}
