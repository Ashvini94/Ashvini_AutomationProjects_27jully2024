package date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass_001 {

	public static void main(String[] args) {

		Date d = new Date();

		// String date=d.toString();
		// System.out.println(date);
		System.out.println(d.toString());

		SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		System.out.println(simpledate.format(d));
	}

}
