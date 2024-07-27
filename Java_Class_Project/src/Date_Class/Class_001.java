package Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_001 {

	public static void main(String[] args) {
		
		//to print current date and current time
		Date d=new Date();
		
		String date=d.toString();
		System.out.println(date);
		
		//to print date and time in dd/mm/yyyy hh:mm:ss format
		
		Date d1=new Date();
		
		SimpleDateFormat smf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat smf1=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		System.out.println(smf.format(d1));
		System.out.println(smf1.format(d1));
	}

}
