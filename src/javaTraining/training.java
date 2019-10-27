package javaTraining;
import java.util.Scanner;

public class training {

	
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			
			int r1=a*(b%10/10);
			int r2=a*(b%100/100);
			int r3=a*(b%1000/1000);
			
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			System.out.println(r1+(r2*10)+(r3*100));
			
			
			

		}
	
	}


