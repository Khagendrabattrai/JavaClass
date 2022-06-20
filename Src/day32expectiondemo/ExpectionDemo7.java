package day32expectiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpectionDemo7 {

	public static void main(String[] args) {
		/*
		 * Date now = new Date (); System.out.println("The current date is :"+now );
		 * SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a MM/dd/yy"); String
		 * currentDate =sdf.format(now );
		 * System.out.println("The current date is:"+currentDate); }
		 */}

	fromDateToString(new Date ());
String date  ="2011-10-12";
      try {
     fromStringToDate(date);
     }catch(parseException b) {
    	 b.printStackTrace();}
     }

	public static void fromDateToString(Date now) {
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm a MM//dd/yy");
		String currentDate = sdf.format(now);
		System.out.println(currentDate);
	}

	public static void fromstringToDate(String  now) throws parseException{
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Date currentDate = sdf.parse(now);
		System.out.println(currentDate);
	}
}
