package com.test9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Home1 {

	public static void main(String[] args) {
		String date1 = "2017/12/30 12:32:30";
		String date2 = "yyyy/MM/dd HH:mm:ss";
		String date3 = "yyyy年MM月dd日 HH点mm分ss秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(date2);
		SimpleDateFormat sdf2 = new SimpleDateFormat(date3);
		Date d = null;

		try {
			d = sdf1.parse(date1);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception

		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.set(Calendar.MONTH, 10);
		System.out.println(sdf2.format(c.getTime()));

	}

}
