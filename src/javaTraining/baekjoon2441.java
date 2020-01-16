package javaTraining;

import java.util.Scanner;

public class baekjoon2441 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int k=0;k<num-i;k++) {
			System.out.printf(" ");
				}
			for(int j=i;j>0;j--) {
				System.out.printf("*");
			
			}
			System.out.println("");
		}
	}
}
