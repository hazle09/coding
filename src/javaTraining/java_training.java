package javaTraining;
import java.util.Scanner;

public class java_training {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int i=0;
		for(i=0;i<10;i++) {
			System.out.printf("%d * %d =%d\n",a,i,a*i);
		}
		
	}
}
