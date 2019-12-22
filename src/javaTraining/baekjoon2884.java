package javaTraining;

import java.util.Scanner;

public class baekjoon2884 {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int H=s.nextInt();
		int M=s.nextInt();
		int nminute=0;
		int nhour = 0;
		
		if(M<45) {
			if(H==0) {
				nhour=24;
			}
			nhour=H-1;
			nminute=10+(60-45);
	}
		if(M>=45) {
			if(H==0)
				nhour=24;
			nminute=45-M;
		}
		System.out.println(nhour+" "+nminute);
		s.close();

	}
	}
