package chapter13;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.printf("���ش� %tY \n", cal);
		System.out.printf("��/���� %tY/%tm \n", cal, new Date());
		System.out.printf("��/��/���� %ty/%tm/%td \n", cal, cal, System.currentTimeMillis());
		System.out.println("------------------------");
		System.out.printf("������ %tA \n", cal);
		System.out.printf("������ %ta \n", cal);
		
		DecimalFormat df = new DecimalFormat("#000.00#");
		double a = 1.23;
		String aStr = df.format(a);
		System.out.println(aStr);
	}

}
