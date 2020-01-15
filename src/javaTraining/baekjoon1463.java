package javaTraining;

import java.util.Scanner;

public class baekjoon1463 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		
		while(x!=1) {
			if(x%3==0) {
				x=x/3;
				count++;
			}
			else if(x%2==0&&x%3==1) {
				x-=1;
				count++;
			}
			else if(x%2==0){
				x=x/2;
				count++;
		}
			else {
				x-=1;
				count++;
			}
			
	}System.out.println(count);
			sc.close();

}
}