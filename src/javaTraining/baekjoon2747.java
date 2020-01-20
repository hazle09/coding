package javaTraining;

import java.util.Scanner;

public class baekjoon2747 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int a=0;
		int b=1;
		int tmp=0;
		for(int j=1;j<i;j++) {
			tmp=a+b;
			a=b;
			b=tmp;
			
		}
		System.out.println(tmp);
	}

}
