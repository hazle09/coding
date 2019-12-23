package javaTraining;

import java.util.Scanner;

public class baekjoon8393 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int result=0;
		int a=s.nextInt();
		
		for(int i=1;i<=a;i++) {
			result+=i;
		}
		System.out.println(result);
	}

}
