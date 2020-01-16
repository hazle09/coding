package javaTraining;

import java.util.Scanner;

public class baekjoon2442 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=i;j>1;j--) {
				System.out.printf(" ");
			}
			for(int k=0;k<=((num-i)*2-1)+1;k++) {
			System.out.printf("*");
				}
			
			System.out.println("");
		}
	}
}
