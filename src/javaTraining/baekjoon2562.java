package javaTraining;

import java.util.Scanner;

public class baekjoon2562 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int max=-1000000;
		int arr[]=new int[9];
		int i;
		
		for(i=0;i<9;i++) {
			arr[i]=s.nextInt();
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
		System.out.println(i-1);
		
		s.close();
	}

}
