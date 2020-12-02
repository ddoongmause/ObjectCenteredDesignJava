package chapter13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		Date date = new Date();
		String str = sdf.format(date);
		System.out.println(str);
	}

}
