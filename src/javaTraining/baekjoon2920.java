package javaTraining;

import java.util.Scanner;

public class baekjoon2920 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String asc="1 2 3 4 5 6 7 8";
		String des="8 7 6 5 4 3 2 1";
		
		
		String input=s.nextLine();
		
		
		if(input.contentEquals(asc)) 
			System.out.println("ascending");
		else if(input.contentEquals(des))
			System.out.println("descending");
		else System.out.println("mixed");
		
		s.close();
		}
	}


