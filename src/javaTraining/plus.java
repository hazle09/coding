package javaTraining;

import java.util.Scanner;

//���� 2439
public class plus {
	
		public static void main(String args[]) {
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			
			for(int i=0;i<a;i++) {
				for(int j=a-1;j>i;j--)
					System.out.printf(" ");
				for(int k=0;k<=i;k++)
					System.out.printf("*");
				System.out.println();
						
				}		
		}

	}



