package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_002UsingTryandCatch {
	
	//instance method
	public void java()
	{
		/* syntax--> try
		 * 			{
		 * 				statement throws exception
		 * 			}
		 * 			catch(Exception class)
		 * 			{
		 * 				//block of code
		 * 			}
		 * 
		 */
		//exception handle by using try and catch block
		try {
			FileInputStream fis=new FileInputStream("ab");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		//disadvantage of try and catch block -->if we use multiple exception statement then we have to metntion try and catch block multiple times
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
