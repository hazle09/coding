package javaTraining;

import java.util.Scanner;

public class baekjoon1712 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
	
		int result;
	
		if(B>C)
			result=-1;
		else result=A/(C-B)+1;
		
		System.out.println(result);
	}
}
