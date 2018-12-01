package com.practise;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePrac {
	public static void main(String [] args) throws Exception {
	      /* SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
	       Date date = parseFormat.parse("12:17 AM");
	       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));*/
	       
		SimpleDateFormat displayFormat = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat parseFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = parseFormat.parse("12-11-2017");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(displayFormat.format(date));
	       
		/*String s= "abc;;kl";
		String[] str = s.split(";");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);*/
		
		
		/* Format formatter = new SimpleDateFormat("dd-MMM-yy");
		    String s = formatter.format(new Date());
		    System.out.println(s);*/
	   }

}
