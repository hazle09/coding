package javaTraining;

import java.util.Scanner;

public class baekjoon10952 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int result=0;
		
		while(s.hasNextInt()) {
		int a=s.nextInt();
		int b=s.nextInt();
		result=a+b;
		if(a>0&&b<10&&a!=0&&b!=0)
			System.out.println(result);
		}
}
}
