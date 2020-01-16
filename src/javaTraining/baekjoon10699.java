package javaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class baekjoon10699 {
	public static void main(String args[]) {
		Date today=new Date();
		SimpleDateFormat date=new SimpleDateFormat ("yyyy-MM-dd");
		
		System.out.println(date.format(today));
	}

}
