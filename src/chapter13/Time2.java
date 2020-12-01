package chapter13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		Calendar cal2 = new GregorianCalendar();
		System.out.println(cal2);
		
		int year = cal1.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal1.get(Calendar.MONTH);
		System.out.println(month);
		int date = cal1.get(Calendar.DATE);
		System.out.println(date);
		
		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 0); // 1월
		cal2.set(Calendar.DATE, 1);
		
		int day = cal1.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		int lastDay = cal2.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날 : " + lastDay);
	}

}
