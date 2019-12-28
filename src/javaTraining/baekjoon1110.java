package javaTraining;

import java.util.Scanner;

public class baekjoon1110 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		int m=num;
		int count=0;
		
		while(true) {
			int i=num/10; //십의자리
			int j=num%10; //일의자리
			int k=i+j;
			int l=k%10;
			num=j+l;
			if(m==num)
				break;
			else
				count++;
		}
		System.out.println(count);
		s.close();
	}

}
