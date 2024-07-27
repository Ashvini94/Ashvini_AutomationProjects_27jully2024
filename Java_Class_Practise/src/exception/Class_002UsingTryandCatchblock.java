package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_002UsingTryandCatchblock {

	public static void main(String[] args) {

		try {
			FileInputStream fis=new FileInputStream("path of file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
