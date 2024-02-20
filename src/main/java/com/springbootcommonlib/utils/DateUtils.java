package com.springbootcommonlib.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	
	public static Date getTodayDate() throws ParseException {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date todayDate = (Date) formatter.parse(formatter.format(currentDate.getTime()));
		return todayDate;
	}
	
	public static String checkDtae(String date) {
		
		try {
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date todayDate = (Date) formatter.parse(formatter.format(currentDate.getTime()));
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "satyam";
		
	}
}
