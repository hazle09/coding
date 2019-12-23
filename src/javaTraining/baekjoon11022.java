package javaTraining;

import java.util.Scanner;

public class baekjoon11022 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		int result=0;
		
		for(int i=1;i<=num;i++) {
		int a=s.nextInt();
		int b=s.nextInt();
		result=a+b;
		if(a>0&&b<10)
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+result);
		}
		
	}

}
