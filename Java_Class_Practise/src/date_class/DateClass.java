package date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		//create object of date class
		//Date d=new Date();
		
		//String ab=d.toString();
		//System.out.println(ab);
		
		//suppose you want date in the format dd/MM/yyyy hh:mm:ss
		Date dt=new Date();
		SimpleDateFormat sdm=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdm.format(dt));
		
		
		
		

	}

}
