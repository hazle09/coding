package javaTraining;

import java.util.Scanner;

public class baekjoon2884 {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int H=s.nextInt();
		int M=s.nextInt();
		
		
		if(M>=45) {
			M=M-45;
		}else{
        if(M<45) {
			if(H==0) {
				H=24;
			}
			H=H-1;
			M+=15;
		}}
		System.out.println(H+" "+M);
		s.close();
	}
	}
