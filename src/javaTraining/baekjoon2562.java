package javaTraining;

import java.util.Scanner;

public class baekjoon2562 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int max=0;
		int max_loc=0;
		int i;
		
		for(i=1;i<=9;i++) {
			int num=s.nextInt();
			if(max<num) {
				max=num;
				max_loc=i;
			}
		}
		System.out.println(max);
		System.out.println(max_loc);
		
		s.close();
	}

}
